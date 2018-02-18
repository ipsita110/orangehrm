package kl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Orangehrm {
	WebDriver driver;
	
	 
	  @BeforeClass
	  
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest() {
	 
	
	 
		  // Here I am setting up the path for my IEDriver
		  System.setProperty("webdriver.chrome.driver","E:\\Testingproject\\chromedriver.exe");
			driver=new ChromeDriver();
		
	 
	  } 
@BeforeGroups
public void f() throws InterruptedException
{
	
			driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	Thread.sleep(5000);
	
}
@Test(priority=1,enabled=false)
public void f2() throws InterruptedException
{driver.findElement(By.xpath("//*[text()='Admin']")).click();
Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='searchSystemUser_employeeName_empName']")).sendKeys("John ",Keys.DOWN,Keys.ENTER);
	driver.findElement(By.id("searchBtn")).click();
	Thread.sleep(5000);
	String ex=driver.findElement(By.xpath("//*[@id='searchSystemUser_employeeName_empName']")).getAttribute("value");
	System.out.println(ex);
	WebElement tbl=driver.findElement(By.xpath("//*[@id='resultTable']"));
	List<WebElement> wb=tbl.findElements(By.tagName("tr"));
	int x=wb.size();
	System.out.println(x);
	
		
for(int i=1;i<=x;i++)
{
		String act = driver.findElement(By.xpath("//*[@id='tableWrapper']/table[@id='resultTable']/tbody/tr["+i+"]/td["+4+"]")).getText();              
		System.out.print(act);
		Assert.assertEquals(act, ex);
		
		break;
		
}
			}
@Test(priority=0,enabled=false)
public void f3()
{
	WebElement e=driver.findElement(By.xpath("//*[@id='menu_admin_Job']"));
	Actions a=new Actions(driver);
	a.moveToElement(e).build().perform();
	WebElement countryUL= driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/ul/li[1]/ul/li[2]/ul"));
	List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
	for (WebElement li : countriesList) {
	if(li.getText().equals("Job Titles"))
	     li.click();
	   }
	}
@Test(priority=3,groups={"leave"})
public void f12() throws InterruptedException{
	driver.findElement(By.xpath("//*[text()='Leave']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='frmFilterLeave']/fieldset/ol/li[1]/img")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement e=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]"));
	e.click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Select s=new Select(e);
	s.selectByVisibleText("1992");
	WebElement e2=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
	e2.click();
	Select s2=new Select(e2);
	s2.selectByIndex(3);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='leaveList_chkSearchFilter_-1']")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	boolean e4=driver.findElement(By.xpath("//*[@id='leaveList_chkSearchFilter_-1']")).isSelected();
	if(e4==true)
	{
		System.out.println("reject option is selected");
	}
	else{
		System.out.println("reject option is deselected");
	}
	WebElement f=driver.findElement(By.xpath("//*[@id='leaveList_cmbSubunit']"));
	Select sw=new Select(f);
	sw.selectByIndex(4);
	
}
@Test(groups={"addemployee"})
public void functionl()
{
	
}

}
