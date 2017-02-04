package com.selenium.takeScreenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener {
     //public void getscreenshot() throws Exception{
		
	//File src= ((TakesScreenshot)WD).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("C:\\Users\\ankit\\Pictures\\ankit.png"));
	//}

	@Override
	public void onFinish(ITestContext arg0) {}

	@Override
	public void onStart(ITestContext arg0) {}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("***** Error "+result.getName()+" test has failed *****");
    //	String methodName=result.getName().toString().trim();
		try {
			ScreenShotOnFail.getscreenshot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {}

	@Override
	public void onTestStart(ITestResult arg0) {}

	@Override
	public void onTestSuccess(ITestResult arg0) {}


}
