package javaPractice;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class testClass {

	static String Platform=null;

	public static String getPlatform() {
		return Platform;
	}

	public static void setPlatform(String platform) {
		Platform = platform;
	}

	@Test(expectedExceptions=NoSuchElementException.class)
	public void test1()
	{
		setPlatform("abc");
	}

	@Test
	public void test2()
	{
		setPlatform("xyz");
	}
	
	@Test
	public void test3()
	{
		setPlatform("abc");
	}
	
	@Test
	public void test4()
	{
		setPlatform("uvw");
	}
	
	@Test
	public void test5()
	{
		setPlatform("def");
	}


}
