package javaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class waits {

public static WebDriver driver=null;

	@BeforeClass
	public void setup()
	{
		String ProxyAddress=null;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\megha.sharma\\uvo-automation\\KMAPhase3\\DemoKMA\\projectJARS\\browserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		Proxy proxy=new Proxy();
		proxy.setHttpProxy(ProxyAddress).setFtpProxy(ProxyAddress);
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.PROXY, ProxyAddress);
		
		driver.get("https://google.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement element=driver.findElement(By.xpath("//*[@id='thygv']"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	Wait<WebDriver> wait2=new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(20, TimeUnit.SECONDS);
	
			
		
	}
	
	
	
	@Test
	public void test1()
	{
	
	}

	//WebDriver driver=null;
	public static void waitForVisibleByXpath(WebDriver driver)
	{




	}

}
