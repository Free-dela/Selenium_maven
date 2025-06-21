package Vizza;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class InsuranceFlow {
	 private WebDriver driver;

	 private void setup() {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\freed\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();  driver.manage().window().maximize(); }

	    private void teardown() { driver.quit(); }
	    
	    private void pause(long millis) { try {Thread.sleep(millis);} 
	    catch (InterruptedException e) { e.printStackTrace(); } }
	    
	    private void scrollPage(Keys direction, int times) {
	    for (int i = 0; i < times; ++i) {driver.findElement(By.tagName("html")).sendKeys(direction);} }
	    
	    private void clickElement(By locator) { driver.findElement(locator).click(); }
	    
	    private void fillInput(By locator, String text) { driver.findElement(locator).sendKeys(text); }
	    
	    private void login() {
	        driver.get("https://vizzainsurance.com/home");pause(7000);
	        clickElement(By.xpath("//span[text()='Policy Login']"));pause(1000);
	        fillInput(By.id("mat-input-0"), "6382228561");
	        fillInput(By.id("mat-input-1"), "Sakthi@1602");
	        clickElement(By.xpath("//span[text()='Login']"));pause(1000); }
	    
	    private void fillForm() {
	        Actions actions = new Actions(driver);
	        WebElement hover = driver.findElement(By.xpath("//span[text()='Online Insurance']"));
	        actions.moveToElement(hover).perform();
	        clickElement(By.xpath("//span[text()='Health Insurance']"));pause(5000);
	        fillInput(By.id("mat-input-4"), "Star");
	        fillInput(By.id("mat-input-5"), "Assure");
	        fillInput(By.id("mat-input-6"), "freedela0912@gmail.com");pause(2000);scrollPage(Keys.ARROW_DOWN, 10);
	        fillInput(By.id("mat-input-7"), "8531913069");
	        clickElement(By.xpath("//span[text()='Next']")); }
	    
	    private void FamilySize1() { scrollPage(Keys.ARROW_UP, 5); fillInput(By.id("mat-input-19"), "40");}
	    private void FamilySize2() { fillInput(By.id("mat-input-21"), "38");}
	    private void FamilySize3() { fillInput(By.id("mat-input-23"), "17");}
	    private void FamilySize4() { fillInput(By.id("mat-input-25"), "15");}
	    private void Proceed() { scrollPage(Keys.ARROW_DOWN, 5); fillInput(By.id("mat-input-8"), "600012");
	    clickElement(By.xpath("//span[text()='Proceed']")); }
	    
	    private void ProductPage() {pause(15000);
	    clickElement(By.id("mat-select-value-5")); clickElement(By.id("mat-checkbox-9"));
	    clickElement(By.id("mat-option-3"));pause(10000); clickElement(By.xpath("/html/body/div[4]/div[1]"));  }
	    
	    private void selectPremium(String premiumValue) { scrollPage(Keys.ARROW_DOWN, 5);
	    clickElement(By.xpath("//span[text()='" + premiumValue + "']")); clickElement(By.xpath("//span[text()='Ok']"));
	    pause(3000); }
	    private void Premium1A() { selectPremium("₹ 9159"); }
	    private void Premium1B() { selectPremium("₹ 15303"); }
	    private void Premium1C() { selectPremium("₹ 18708"); }
	    private void Premium1D() { selectPremium("₹ 22110"); }
	    private void Premium2A() { selectPremium("₹ 10291"); }
	    private void Premium2B() { selectPremium("₹ 15446"); }
	    private void Premium2C() { selectPremium("₹ 18275"); }
	    private void Premium2D() { selectPremium("₹ 20913"); }
	    private void Premium3A() { selectPremium("₹ 10808"); }
	    private void Premium3B() { selectPremium("₹ 16537"); }
	    private void Premium3C() { selectPremium("₹ 10808"); }
	    private void Premium3D() { selectPremium("₹ 10808"); }

	    
	    private void ProposerPage(String title, String dob, String occupation,int Scroll, String addressLine, String area, 
	            String postalCode, String taluk,int Scroll1, String city, String nextStepDate) {
	pause(2000);

	clickElement(By.id("mat-select-value-23"));
	clickElement(By.xpath("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" + title.toLowerCase() + "')]"));

	fillInput(By.id("mat-input-37"), dob);

	clickElement(By.id("mat-select-value-27"));
	clickElement(By.xpath("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" + occupation.toLowerCase() + "')]"));

	scrollPage(Keys.ARROW_DOWN, Scroll);

	fillInput(By.id("mat-input-45"), addressLine);
	fillInput(By.id("mat-input-46"), area);
	fillInput(By.id("mat-input-47"), postalCode);

	pause(2000);

	clickElement(By.id("mat-select-value-31"));
	pause(2000);
	clickElement(By.xpath("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" + taluk.toLowerCase() + "')]"));
	scrollPage(Keys.ARROW_DOWN, 10);

	scrollPage(Keys.ARROW_DOWN, Scroll1);

	clickElement(By.id("mat-select-value-33")); pause(2000);
	clickElement(By.xpath("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" + city.toLowerCase() + "')]"));
	scrollPage(Keys.ARROW_DOWN, 15); pause(1000);

	fillInput(By.id("mat-input-53"), nextStepDate);

	clickElement(By.xpath("//span[text()='Next']"));
	}
	   private void ProposerCommon() {
		   ProposerPage( "Mr", "09121990", "business/traders", 10,"No.45", "Guindy", "600119", "Sholinganallur Taluk",
				          5," Sholinganallur ", "30062025" );
	   }
	   private void ProposerWomensCare() {
		   ProposerPage(  " Ms ", "09121990", "business/traders", 10,"No.45", "Guindy", "600119", "Sholinganallur Taluk",
				          5," Sholinganallur ", "30062025" );
	   }

	    private void selectCkycOption(String radioId, String inputId, String inputValue) { clickElement(By.id(radioId));
	    fillInput(By.id(inputId), inputValue); }
	    private void Ckyc1A() { selectCkycOption("mat-radio-37", "mat-input-89", "gjkpm0846p"); }
	    private void Ckyc1B() { selectCkycOption("mat-radio-52", "mat-input-97", "gjkpm0846p"); }
	    private void Ckyc1C() { selectCkycOption("mat-radio-67", "mat-input-105", "gjkpm0846p"); }
	    private void Ckyc1D() { selectCkycOption("mat-radio-82", "mat-input-113", "gjkpm0846p"); }
	    private void Ckyc2A() { selectCkycOption("mat-radio-61", "mat-input-89", "gjkpm0846p"); }
	    private void Ckyc2B() { selectCkycOption("mat-radio-100", "mat-input-97", "gjkpm0846p"); }
	    private void Ckyc2C() { selectCkycOption("mat-radio-139", "mat-input-105", "gjkpm0846p"); }
	    private void Ckyc2D() { selectCkycOption("mat-radio-178", "mat-input-113", "gjkpm0846p"); }
	    private void Ckyc3A() { selectCkycOption("mat-radio-43", "mat-input-89", "gjkpm0846p"); }
	    private void Ckyc3B() { selectCkycOption("mat-radio-64", "mat-input-97", "gjkpm0846p"); }
	    private void Ckyc3C() { selectCkycOption("mat-radio-43", "mat-input-89", "gjkpm0846p"); }
	    private void Ckyc3D() { selectCkycOption("mat-radio-43", "mat-input-89", "gjkpm0846p"); }


	    private void DocFlow() {
	        clickElement(By.xpath("//span[text()='Submit']"));scrollPage(Keys.ARROW_DOWN, 10);pause(5000);
	        fillInput(By.id("file1"), "C:\\Users\\freed\\OneDrive\\Desktop\\All Docs\\Aadhaar.jpg");pause(1000);
	        fillInput(By.id("file2"), "C:\\Users\\freed\\OneDrive\\Desktop\\All Docs\\Aadhaar.jpg");pause(1000);
	        fillInput(By.id("file3"), "C:\\Users\\freed\\OneDrive\\Desktop\\All Docs\\Aadhaar.jpg");scrollPage(Keys.ARROW_DOWN, 5);
	        clickElement(By.xpath("(//span[text()='Same as Communication Address'])[2]"));
	        clickElement(By.xpath("//span[text()='Submit']")); }
	    
	    private void selectPersonalCom(int radioId) { clickElement(By.id("mat-radio-" + radioId));
	        scrollPage(Keys.ARROW_DOWN, 10); }
	    private void PersonalCom2A() { selectPersonalCom(27); }
	    private void PersonalCom2B() { selectPersonalCom(30); }
	    private void PersonalCom2C() { selectPersonalCom(33); }
	    private void PersonalCom2D() { selectPersonalCom(36); }

	    private void InsurerFlow(String Xpath1,String matId1,String relation,
	    		String matId2,String dob,String matSelectValue1,String Xpath2,String matId3,String height,
	    		String matId4,String weight,String matSelectValue2,String Xpath3,String matSelectValue3,
	    		String Xpath4,String Scroll) {
	    	
	      if (Xpath1 != null) { clickElement(By.xpath(Xpath1)); }
	      if (matId1 != null && relation != null) { fillInput(By.id("mat-input-" + matId1), relation); }
	      if (matId2 != null && dob != null) { fillInput(By.id("mat-input-" + matId2), dob); }
	      if (matSelectValue1 != null) { clickElement(By.id("mat-select-value-" + matSelectValue1)); }
	      if (Xpath2 != null) { clickElement(By.xpath("//span[text()='" + Xpath2 + "']")); }
	      if (matId3 != null && height != null) { fillInput(By.id("mat-input-" + matId3), height); }
	      if (matId4 != null && weight != null) { fillInput(By.id("mat-input-" + matId4), weight); }
	      if (matSelectValue2 != null) { clickElement(By.id("mat-select-value-" + matSelectValue2)); }
	      if (Xpath3 != null) { clickElement(By.xpath("//span[text()='" + Xpath3 + "']")); }
	      if (matSelectValue3 != null) { clickElement(By.id("mat-select-value-" + matSelectValue3)); }
	      if (Xpath4 != null) { clickElement(By.xpath("//span[text()='" + Xpath4 + "']")); }
	      if (Scroll != null) {scrollPage(Keys.ARROW_DOWN, 10);} }
	    
	    private void Insurer1() {pause(3000);
	    InsurerFlow("(//strong[text()='Same as proposer'])[1]",null,null,null,null,
	    null,null, "76", "170", "77", "70", null, null, null, null,null);
	    scrollPage(Keys.ARROW_DOWN, 5); }
	    
	    private void Insurer2() {pause(3000);
	    InsurerFlow(null, "78", "Spouse", "79",
	    "09121990","65"," Female ","80","160","81","60","55"," HOUSEWIVES ","67"," SPOUSE ",null); }
	    
	    private void Insurer2s() {pause(3000);
	    InsurerFlow(null, "78", "Spouse", "79","09121990","61"," Female ","80","160","81","60","55",
	    " HOUSEWIVES ","63"," SPOUSE ",null); scrollPage(Keys.ARROW_DOWN, 5); }
	    
	    private void Insurer2s1() {pause(3000);
	    InsurerFlow(null, "78", "Spouse", "79","09121990","63",
	    " Female ","80","160","81","60","55"," HOUSEWIVES ","65"," SPOUSE ","0");scrollPage(Keys.ARROW_DOWN, 5);
	    TabOpener("mat-content ng-tns-c265-192"); }
	    
	    private void Insurer3() {pause(3000);scrollPage(Keys.ARROW_DOWN, 5);
	    InsurerFlow(null, "82", "Son", "83","09122009","69"," Male ",
	    "84","160","85","60","57"," STUDENTS-SCHOOL AND COLLEGE ","71"," DEPENDENT CHILD ",null); }
	    
	    private void Insurer3s() {pause(3000);
	    InsurerFlow(null, "82", "Son", "83","09122009","67"," Male ","84","160","85","60","57",
	    " STUDENTS-SCHOOL AND COLLEGE ","69"," DEPENDENT CHILD ",null); }
	    
	    private void Insurer4() {pause(3000);scrollPage(Keys.ARROW_UP, 5);
	    InsurerFlow(null, "86", "Son", "87","09122015","73"," Male ","88","160","89","60","59",
	    " STUDENTS-SCHOOL AND COLLEGE ","75"," DEPENDENT CHILD ",null);
	    scrollPage(Keys.ARROW_DOWN, 5); }
	    
	    private void TabOpener(String Open) { clickElement(By.xpath("//span[@class='" + Open + "']"));
	    }
	    
	    private void fillNomineeDetails(String nomineeId, String ageId, String relationshipSelectId, String shareId) {
	        clickElement(By.xpath("(//span[text()='Next'])[2]"));pause(2000);
	        fillInput(By.id(nomineeId), "Nominee");
	        fillInput(By.id(ageId), "35");
	        clickElement(By.id(relationshipSelectId));
	        clickElement(By.xpath("//span[text()=' Sister ']"));pause(2000);
	        fillInput(By.id(shareId), "100");
	        clickElement(By.xpath("(//span[text()='Next'])[3]"));pause(17000); }
	    
	    private void fillNomineeDetails1() { fillNomineeDetails("mat-input-78", "mat-input-79", "mat-select-value-59", "mat-input-80"); }
	    private void fillNomineeDetails2() { fillNomineeDetails("mat-input-82", "mat-input-83", "mat-select-value-65", "mat-input-84"); }
	    private void fillNomineeDetails3() { fillNomineeDetails("mat-input-86", "mat-input-87", "mat-select-value-71", "mat-input-88"); }
	    private void fillNomineeDetails4() { fillNomineeDetails("mat-input-90", "mat-input-91", "mat-select-value-77", "mat-input-92"); }

	        @BeforeMethod
	        public void beforeTest() { setup(); login(); fillForm(); }

	        @AfterMethod
	        public void afterTest() {
	        	scrollPage(Keys.ARROW_DOWN, 15);pause(3000);
	        	scrollPage(Keys.ARROW_DOWN, 15);pause(3000);
	        	scrollPage(Keys.ARROW_DOWN, 10);
//	        	teardown();
	        	}

	        @Test
	        public void Assure_1A() { FamilySize1(); Proceed(); ProductPage(); Premium1A();
	        ProposerCommon(); Ckyc1A(); DocFlow(); Insurer1(); fillNomineeDetails1(); }

	        @Test
	        public void Assure_1B() { FamilySize1(); FamilySize2(); Proceed(); ProductPage();  Premium1B();  ProposerCommon();
	        Ckyc1B(); DocFlow(); Insurer1(); TabOpener("mat-content ng-tns-c265-184"); Insurer2s(); fillNomineeDetails2(); }

	        @Test
	        public void Assure_1C() { FamilySize1(); FamilySize2(); FamilySize3(); Proceed(); ProductPage(); Premium1C();
	        ProposerCommon(); Ckyc1C(); DocFlow(); Insurer1(); TabOpener("mat-content ng-tns-c265-184"); Insurer2s1();
	        Insurer3s(); fillNomineeDetails3(); }

	        @Test
	        public void Assure_1D() { FamilySize1(); FamilySize2(); FamilySize3(); FamilySize4(); Proceed(); ProductPage();
	        Premium1D();  ProposerCommon(); Ckyc1D(); DocFlow(); Insurer1(); TabOpener("mat-content ng-tns-c265-184");Insurer2(); 
	        TabOpener("mat-content ng-tns-c265-192"); Insurer3(); TabOpener("mat-content ng-tns-c265-200");
	        Insurer4(); fillNomineeDetails4(); }

	        @Test
	        public void Comprehensive_2A() { FamilySize1(); Proceed(); ProductPage(); Premium2A();  ProposerCommon(); Ckyc2A(); 
	        DocFlow(); Insurer1(); PersonalCom2A(); fillNomineeDetails1(); }

	        @Test
	        public void Comprehensive_2B() { FamilySize1(); FamilySize2(); Proceed(); ProductPage(); Premium2B();  ProposerCommon();
	        Ckyc2B(); DocFlow();Insurer1();PersonalCom2B();TabOpener("mat-content ng-tns-c265-184");scrollPage(Keys.ARROW_UP, 8);
	        Insurer2s();fillNomineeDetails2(); }

	        @Test
	        public void Comprehensive_2C() { FamilySize1(); FamilySize2(); FamilySize3(); Proceed(); ProductPage(); Premium2C();
	        ProposerCommon(); Ckyc2C(); DocFlow(); Insurer1(); PersonalCom2C(); TabOpener("mat-content ng-tns-c265-184");
	        scrollPage(Keys.ARROW_UP, 8); Insurer2s1(); scrollPage(Keys.ARROW_UP, 10); Insurer3s();
	        scrollPage(Keys.ARROW_DOWN, 15); fillNomineeDetails3(); }

	        @Test
	        public void Comprehensive_2D() { FamilySize1(); FamilySize2(); FamilySize3(); FamilySize4(); Proceed(); ProductPage();
	        Premium2D();  ProposerCommon(); Ckyc2D(); DocFlow(); Insurer1(); PersonalCom2D(); TabOpener("mat-content ng-tns-c265-184");
	        scrollPage(Keys.ARROW_UP, 8); Insurer2(); scrollPage(Keys.ARROW_DOWN, 10); TabOpener("mat-content ng-tns-c265-192");
	        scrollPage(Keys.ARROW_UP, 10); Insurer3(); scrollPage(Keys.ARROW_DOWN, 12); TabOpener("mat-content ng-tns-c265-200");
	        Insurer4();fillNomineeDetails4();pause(3000); scrollPage(Keys.ARROW_DOWN, 15); }
	        
	        @Test
	        public void WomensCare_3A() { FamilySize1(); Proceed(); ProductPage(); Premium3A();
	        ProposerWomensCare(); Ckyc3A(); DocFlow(); Insurer1(); fillNomineeDetails1(); }

	        @Test
	        public void WomensCare_3B() { FamilySize1(); FamilySize2(); Proceed(); ProductPage();  Premium3B();  ProposerWomensCare();
	        Ckyc3B(); DocFlow(); Insurer1();pause(2000);
	        scrollPage(Keys.ARROW_DOWN, 1);
	        clickElement(By.xpath("//mat-panel-title[text()='2.INSURED DETAILS']"));
//	        TabOpener("mat-content ng-tns-c265-184");
	        Insurer2s(); fillNomineeDetails2(); }

	        @Test
	        public void WomensCare_3C() { FamilySize1(); FamilySize2(); FamilySize3(); Proceed(); ProductPage(); Premium3C();
	        ProposerWomensCare(); Ckyc3C(); DocFlow(); Insurer1(); TabOpener("mat-content ng-tns-c265-184"); Insurer2s1();
	        Insurer3s(); fillNomineeDetails3(); }

	        @Test
	        public void WomensCare_3D() { FamilySize1(); FamilySize2(); FamilySize3(); FamilySize4(); Proceed(); ProductPage();
	        Premium3D();  ProposerWomensCare(); Ckyc3D(); DocFlow(); Insurer1(); TabOpener("mat-content ng-tns-c265-184");Insurer2(); 
	        TabOpener("mat-content ng-tns-c265-192"); Insurer3(); TabOpener("mat-content ng-tns-c265-200");
	        Insurer4(); fillNomineeDetails4(); }

}
