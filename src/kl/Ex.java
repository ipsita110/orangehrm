package kl;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex {
	@Test
	public void start() {
	System.out.println("Starting the server");
	}
	@Test(dependsOnMethods = { "start" })
	public void init() {
	System.out.println("Initializing the data for processing!");
	}
	@Test(dependsOnMethods = { "start", "init" })
	public void process() {
	System.out.println("Processing the data!");
	}
	@Test(priority=0,dependsOnMethods = { "process" })
	public void stop() {
	System.out.println("Stopping the server");
	}
}
