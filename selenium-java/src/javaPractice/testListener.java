package javaPractice;

import java.util.Hashtable;
import java.util.Map.Entry;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testListener implements ITestListener{


	@Override
	public void onTestSuccess(ITestResult result) {
		//hashtable.add( result.getMethod().getMethodName(),testClass.getPlatform());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//hashtable.add( result.getMethod().getMethodName(),testClass.getPlatform());


	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//hashtable.add( result.getMethod().getMethodName(),testClass.getPlatform());

	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {


		Hashtable<String,String> hm=hashtable.h;
		for(Entry<String, String> m:hm.entrySet()){

			System.out.println("Hash is: "+m.getValue()+" "+m.getKey());
		}

	}



}
