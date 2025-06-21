package Vizza;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lms_Flow {


	private WebDriver driver;
	// TODO Auto-generated method stub
	private void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\freed\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();  
		driver.manage().window().maximize(); 
	}

	private void login() {
		driver.get("https://lms.vintek.in/");
	}


	private void pause(long millis) { try {Thread.sleep(millis);} 
	catch (InterruptedException e) { e.printStackTrace(); } }

	private void scrollPage(Keys direction, int times) {
		for (int i = 0; i < times; ++i) {driver.findElement(By.tagName("html")).sendKeys(direction);} }

	private void clickElement(By locator) { driver.findElement(locator).click(); }

	private void fillInput(By locator, String text) { driver.findElement(locator).sendKeys(text); }


	private void TestCaller() {pause(5000);
	fillInput(By.id("username"), "testvpe@gmail.com");
	fillInput(By.id("password"), "admin1");scrollPage(Keys.ARROW_DOWN , 10);
	clickElement(By.xpath("//span[text()=' Sign in ']"));pause(2000);
	clickElement(By.xpath("//span[text()=' Leads ']"));pause(2000);
	//		        clickElement(By.xpath("//span[text()='Add Lead']"));
	//		        fillInput(By.id("mat-input-3"), "Test");pause(1000);
	//		    	fillInput(By.id("mat-input-4"), "8531913067");
	//		    	clickElement(By.id("mat-select-value-11"));
	//		        clickElement(By.xpath("//span[text()=' Test Product ']"));
	//		        clickElement(By.id("mat-select-value-13"));pause(2000);
	//		        clickElement(By.xpath("//span[contains(text(),'Star Health and Allied')]"));pause(2000);
	//		        scrollPage(Keys.ARROW_DOWN , 15);
	//		        clickElement(By.xpath("//span[text()=' Create ']"));pause(3000);
	clickElement(By.xpath("/html/body/app-root/layout/modern-layout/div/div[1]/div[2]/user/button/span[1]/span/img"));
	clickElement(By.xpath("//span[text()='Sign out']"));pause(5000);
	}

	private void TestManager() {pause(5000);
	fillInput(By.id("username"), "testmanager@gmail.com");
	fillInput(By.id("password"), "admin1");scrollPage(Keys.ARROW_DOWN , 10);
	clickElement(By.xpath("//span[text()=' Sign in ']"));pause(4000);
	clickElement(By.xpath("//span[text()=' Leads ']"));pause(2000);
	clickElement(By.xpath("//span[text()='Add Lead']"));
	fillInput(By.id("mat-input-3"), "Test");
	fillInput(By.id("mat-input-4"), "8531913067");
	clickElement(By.id("mat-select-value-11"));
	clickElement(By.xpath("//span[text()=' Test Product ']"));
	clickElement(By.id("mat-select-value-13"));pause(2000);
	clickElement(By.xpath("//span[contains(text(),'Star Health and Allied')]"));pause(2000);
	scrollPage(Keys.ARROW_DOWN , 15);
	clickElement(By.xpath("//span[text()=' Create ']"));

	}

	private void TestRelationshipManager() {pause(5000);
	fillInput(By.id("username"), "testrelationshipmanager@gmail.com");
	fillInput(By.id("password"), "admin1");scrollPage(Keys.ARROW_DOWN , 10);
	clickElement(By.xpath("//span[text()=' Sign in ']"));pause(2000);
	clickElement(By.xpath("//span[text()=' Leads ']"));pause(2000);
	clickElement(By.xpath("//span[text()='Add Lead']"));pause(2000);
	fillInput(By.id("mat-input-3"), "Test");
	fillInput(By.id("mat-input-53"), "8531913067");
	clickElement(By.id("mat-select-value-53"));
	clickElement(By.xpath("//span[text()=' Test Product ']"));

	}

	@Test
	public void LMS() {
		setup();login();TestCaller();TestManager();TestRelationshipManager();
	}
}




