package kl;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(kl.Listner.class)
public class Newclass2 {
	WebDriver driver;
	@BeforeTest
	public void me()
	{
		System.out.print("beforetest");
				
	}
	
	@BeforeMethod
	public void f3() throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver","E:\\Testingproject\\chromedriver.exe");
			driver=new ChromeDriver();
				driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}


	  @Test(dataProvider="abc",dataProviderClass=Data.class)

	  public void f3( String user,String pass) throws InterruptedException
	  {
		  System.out.print("print");
		
		  driver.findElement(By.xpath("//*[@id='email']")).sendKeys(user);
		  driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(pass); 
		  driver.findElement(By.xpath("//*[@id='u_0_a']")).click();
		  Thread.sleep(5000);
		
		
	}
	  @AfterTest
		public void fh()
		{
			System.out.print("Aftertest");
		}
	  @AfterMethod
	  public void kj()
	  {
		  driver.close();
		  
	  }
	 
		


	    
}
