package kl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener { 
	WebDriver driver;
	 @Override		
	    public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub
		  System.out.print("hi finished");
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub	
	    	System.out.print("hi start");
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub	
	    	System.out.print("hi faile");
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult arg0) {					
	        // TODO Auto-generated method stub		
	    	System.out.print("hi test fail");
	    	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(srcFile, new File("./Screenshot"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        		
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub	
	    	System.out.print("hi test skipped");
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	        // TODO Auto-generated method stub	
	    	System.out.print("hi tsest start");
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	        // TODO Auto-generated method stub	
	    	System.out.print("hi test success");
	    }

}
