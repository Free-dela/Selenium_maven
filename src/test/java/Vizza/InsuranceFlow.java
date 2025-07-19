package Vizza;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class InsuranceFlow {
	 private WebDriver driver;

private void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\freed\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();  driver.manage().window().maximize(); }

	    private void teardown() { driver.quit(); }
	    private void W(int seconds){try {Thread.sleep(seconds * 1000L);} catch (InterruptedException e) { e.printStackTrace();}}
	    private void scroll(Keys direction, int times) {
	    for (int i = 0; i < times; ++i) {driver.findElement(By.tagName("html")).sendKeys(direction);} }
	    private void S1(int times) { scroll(Keys.ARROW_DOWN, times);}
	    private void S2(int times) { scroll(Keys.ARROW_UP, times);}
	    private void clickElement(By locator) { driver.findElement(locator).click(); }
	    private void fillInput(By locator, String text) { driver.findElement(locator).sendKeys(text); }
	    
	    private void login() {
	        driver.get("https://vizzainsurance.com/home");W(7);   clickElement(By.xpath("//span[text()='Policy Login']"));W(1);
	        fillInput(By.id("mat-input-0"), "6382228561");        fillInput(By.id("mat-input-1"), "Sakthi@1602");
	        clickElement(By.xpath("//span[text()='Login']"));W(1); }
	    
	    private void fillForm() {
	        Actions actions = new Actions(driver);
	        WebElement hover = driver.findElement(By.xpath("//span[text()='Online Insurance']"));
	        actions.moveToElement(hover).perform();    clickElement(By.xpath("//span[text()='Health Insurance']"));W(2);
	        fillInput(By.id("mat-input-4"), "Star");   fillInput(By.id("mat-input-5"), "Assure");
	        fillInput(By.id("mat-input-6"), "freedela0912@gmail.com");W(2);   S1(10);
	        fillInput(By.id("mat-input-7"), "8531913069");  clickElement(By.xpath("//span[text()='Next']")); }
	    
	    private void FamilySize1() { S2(5); fillInput(By.id("mat-input-19"), "40");}
	    private void FamilySize2() { fillInput(By.id("mat-input-21"), "38");}
	    private void FamilySize3() { fillInput(By.id("mat-input-23"), "17");}
	    private void FamilySize4() { fillInput(By.id("mat-input-25"), "15");}
	    private void Proceed() { S1(5); fillInput(By.id("mat-input-8"), "600012");
	    clickElement(By.xpath("//span[text()='Proceed']")); }
	    
	    private void ProductPage() {W(10);
	    clickElement(By.id("mat-select-value-5")); clickElement(By.id("mat-checkbox-9"));
	    clickElement(By.id("mat-option-3"));W(7); clickElement(By.xpath("/html/body/div[5]/div[1]"));  }
	    
	    private void selectPremium(String premiumValue) { S1(5);
	    clickElement(By.xpath("//span[text()='" + premiumValue + "']")); clickElement(By.xpath("//span[text()='Ok']")); W(3); }
	    private void Premium1A() { selectPremium("₹ 9159"); }
	    private void Premium1B() { selectPremium("₹ 15303"); }
	    private void Premium1C() { selectPremium("₹ 18708"); }
	    private void Premium1D() { selectPremium("₹ 22111"); }
	    private void Premium2A() { selectPremium("₹ 10291"); }
	    private void Premium2B() { selectPremium("₹ 15446"); }
	    private void Premium2C() { selectPremium("₹ 18275"); }
	    private void Premium2D() { selectPremium("₹ 20913"); }
	    
	private void ProposerPage(String title, String dob, String occupation, String addressLine, String area, 
	    String postalCode, String taluk, String city, String nextStepDate) {W(2);

	clickElement(By.id("mat-select-value-23"));
	clickElement(By.xpath("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" + title.toLowerCase() + "')]"));
	fillInput(By.id("mat-input-37"), dob);
	clickElement(By.id("mat-select-value-27"));
	clickElement(By.xpath("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" + occupation.toLowerCase() + "')]"));S1(10);
	fillInput(By.id("mat-input-44"), addressLine);
	fillInput(By.id("mat-input-45"), area);
	fillInput(By.id("mat-input-46"), postalCode);W(2);
	clickElement(By.id("mat-select-value-31"));W(2);
	clickElement(By.xpath("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" + taluk.toLowerCase() + "')]"));S1(8);
	clickElement(By.id("mat-select-value-33")); W(2);
	clickElement(By.xpath("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" + city.toLowerCase() + "')]"));
	S1(15); W(1);
	fillInput(By.id("mat-input-55"), nextStepDate);
	clickElement(By.xpath("//span[text()='Next']"));
	}
	private void ProposerCommon() {
	   ProposerPage( "Mr", "09121990", "business/traders","No.45", "Guindy", "600119", "Sholinganallur Taluk"," Sholinganallur ", "30072025" );}
	  
	    private void selectCkycOption(String radioId, String inputId, String inputValue, String InputDate, String InputValueD) { clickElement(By.id(radioId));
	    fillInput(By.id(inputId), inputValue);fillInput(By.id(InputDate), InputValueD); }
	    private void Ckyc1A() { selectCkycOption("mat-radio-16", "mat-input-66", "gjkpm0846p","mat-input-67","09121999"); }
	    private void Ckyc1B() { selectCkycOption("mat-radio-16", "mat-input-74", "gjkpm0846p","mat-input-75","09121999"); }
	    private void Ckyc1C() { selectCkycOption("mat-radio-67", "mat-input-105", "gjkpm0846p","mat-input-67","09121999"); }
	    private void Ckyc1D() { selectCkycOption("mat-radio-82", "mat-input-113", "gjkpm0846p","mat-input-67","09121999"); }
	    private void Ckyc2A() { selectCkycOption("mat-radio-61", "mat-input-89", "gjkpm0846p","mat-input-67","09121999"); }
	    private void Ckyc2B() { selectCkycOption("mat-radio-100", "mat-input-97", "gjkpm0846p","mat-input-67","09121999"); }
	    private void Ckyc2C() { selectCkycOption("mat-radio-139", "mat-input-105", "gjkpm0846p","mat-input-67","09121999"); }
	    private void Ckyc2D() { selectCkycOption("mat-radio-178", "mat-input-113", "gjkpm0846p","mat-input-67","09121999"); }
	    
	    private void Kyc(String Value1,String Select1,String Option1,String Select2,String Option2,
	    		String Select3,String Option3,String Select4,String Option4,String Select5,String Option5,
	    		String Value2,String Select6,String Option6,String Value3) {
	    	clickElement(By.xpath("//span[text()='" + Value1 + "']"));W(3);
	    	clickElement(By.id("mat-select-value-" + Select1)); W(1);
	    	clickElement(By.id("mat-option-" + Option1)); W(1);
	    	clickElement(By.id("mat-select-value-" + Select2)); W(1);
	    	clickElement(By.id("mat-option-" + Option2)); W(1);
	    	clickElement(By.id("mat-select-value-" + Select3)); W(1);
	    	clickElement(By.id("mat-option-" + Option3)); W(1);
	    	clickElement(By.id("mat-select-value-" + Select4)); W(1);
	    	clickElement(By.id("mat-option-" + Option4)); W(1);
	    	clickElement(By.id("mat-select-value-" + Select5)); W(1);
	    	clickElement(By.id("mat-option-" + Option5)); W(1);
	    	fillInput(By.id("mat-input-" + Value2),"8888");
	    	clickElement(By.id("mat-select-value-" + Select6)); W(1);
	    	clickElement(By.id("mat-option-" + Option6)); W(1);
	    	fillInput(By.id("mat-input-" + Value3),"8888");
	    }
	    private void  Kyc1A() {Kyc("Submit","57","282","59","287","61","291","63","295","65","301","72","67","307","73"); }
	    private void  Kyc1B() {Kyc("Submit","69","315","71","320","73","324","75","328","77","334","80","79","340","81"); }
	    private void  Kyc1C() {Kyc("Submit","57","282","59","287","61","291","63","295","65","301","72","67","307","73"); }
	    private void  Kyc1D() {Kyc("Submit","57","282","59","287","61","291","63","295","65","301","72","67","307","73"); }
	    private void  Kyc2A() {Kyc("Submit","57","282","59","287","61","291","63","295","65","301","72","67","307","73"); }
	    private void  Kyc2B() {Kyc("Submit","57","282","59","287","61","291","63","295","65","301","72","67","307","73"); }
	    
	    private void DocFlow(String Input1,String Input2,String Input3,
	    		String Select1,String Value1,String Select2,String Value2,String Value3) 
	    {   S1(10);W(5);
	        String filePath = "C:\\Users\\freed\\OneDrive\\Desktop\\Doc\\TestDoc.jpg";
	        fillInput(By.id("file1"), filePath);W(1);
	        fillInput(By.id("file2"), filePath);W(1);
	        fillInput(By.id("file3"), filePath);W(1);S1(5);
	    	fillInput(By.id("mat-input-" + Input1),"Chennai");
	    	fillInput(By.id("mat-input-" + Input2),"Koyambedu");
	    	fillInput(By.id("mat-input-" + Input3),"600012");W(1);
	    	clickElement(By.id("mat-select-value-" + Select1)); W(1);
	    	clickElement(By.xpath("//span[text()='" + Value1 + "']"));W(1);
	    	clickElement(By.id("mat-select-value-" + Select2)); W(1);
	    	clickElement(By.xpath("//span[text()='" + Value2 + "']"));
	        clickElement(By.xpath("//span[text()='" + Value3 + "']")); }
	    
	    private void Upload1A() {
	    	DocFlow("68","69","70","69"," Chennai ","71"," Chennai - 12 ","Submit");}
	    private void Upload1B() {
	    	DocFlow("76","77","78","81"," Chennai ","83"," Chennai - 12 ","Submit");}
	    
	    private void selectPersonalCom(int radioId) { clickElement(By.id("mat-radio-" + radioId));S1(10); }
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
	      if (Scroll != null) {S1(10);} }
	    
	    private void Insurer1() {W(3);
	    InsurerFlow("(//strong[text()='Same as proposer'])[1]",null,null,null,null,
	    null,null, "76", "170", "77", "70", null, null, null, null,null);S1(5); }
	    
	    private void Insurer2() {W(3);
	    InsurerFlow(null, "78", "Spouse", "79",
	    "09121990","65"," Female ","80","160","81","60","55"," HOUSEWIVES ","67"," SPOUSE ",null); }
	    
	    private void Insurer2s() {W(3);
	    InsurerFlow(null, "78", "Spouse", "79","09121990","61"," Female ","80","160","81","60","55",
	    " HOUSEWIVES ","63"," SPOUSE ",null); S1(5); }
	    
	    private void Insurer2s1() {W(3);
	    InsurerFlow(null, "78", "Spouse", "79","09121990","63",
	    " Female ","80","160","81","60","55"," HOUSEWIVES ","65"," SPOUSE ","0");S1(5);
	    TabOpener("mat-content ng-tns-c269-192"); }
	    
	    private void Insurer3() {W(3);S1(10);
	    InsurerFlow(null, "82", "Son", "83","09122009","69"," Male ",
	    "84","160","85","60","57"," ANY OTHER ","71"," DEPENDENT CHILD ",null); }
	    
	    private void Insurer3sa() {W(3);S1(5);
	    InsurerFlow(null, "82", "Son", "83","09122009","69"," Male ",
	    "84","160","85","60","57"," OTHERS ","71"," DEPENDENT CHILD ",null); }
	    
	    private void Insurer3s() {W(3);
	    InsurerFlow(null, "82", "Son", "83","09122009","67"," Male ","84","160","85","60","57",
	    " ANY OTHER ","69"," DEPENDENT CHILD ",null); }
	    
	    private void Insurer3s1() {W(3);
	    InsurerFlow(null, "82", "Son", "83","09122009","67"," Male ","84","160","85","60","57",
	    " OTHERS ","69"," DEPENDENT CHILD ",null); }
	    
	    private void Insurer4() {W(3);S1(5);
	    InsurerFlow(null, "86", "Son", "87","09122015","73"," Male ","88","160","89","60","59",
	    " ANY OTHER ","75"," DEPENDENT CHILD ",null);S1(5); }
	    
	    private void Insurer4s() {W(3);S1(5);
	    InsurerFlow(null, "86", "Son", "87","09122015","73"," Male ","88","160","89","60","59",
	    " OTHERS ","75"," DEPENDENT CHILD ",null);S1(5); }
	    
	    private void TabOpener(String Open) { clickElement(By.xpath("//span[@class='" + Open + "']"));}
	    
	    private void fillNomineeDetails(String nomineeId, String ageId, String relationshipSelectId, String shareId) {
	        clickElement(By.xpath("(//span[text()='Next'])[2]"));W(2);
	        fillInput(By.id(nomineeId), "Nominee");fillInput(By.id(ageId), "35");
	        clickElement(By.id(relationshipSelectId));clickElement(By.xpath("//span[text()=' Sister ']"));W(2);
	        fillInput(By.id(shareId), "100");clickElement(By.xpath("(//span[text()='Next'])[3]"));W(15); }
	    
	    private void fillNomineeDetails1() { fillNomineeDetails("mat-input-52", "mat-input-53", "mat-select-value-39", "mat-input-54"); }
	    private void fillNomineeDetails2() { fillNomineeDetails("mat-input-82", "mat-input-83", "mat-select-value-65", "mat-input-84"); }
	    private void fillNomineeDetails3() { fillNomineeDetails("mat-input-86", "mat-input-87", "mat-select-value-71", "mat-input-88"); }
	    private void fillNomineeDetails4() { fillNomineeDetails("mat-input-90", "mat-input-91", "mat-select-value-77", "mat-input-92"); }

	        @BeforeMethod
	        public void beforeTest() { setup(); login(); fillForm(); }

	        @AfterMethod
	        public void afterTest() {S1(15);W(3);S1(15);W(3);S1(10);
//	        	teardown();
	        	}

	        @Test
	        public void Assure_1A() { FamilySize1(); Proceed(); ProductPage(); Premium1A();
	        Ckyc1A();Kyc1A();Upload1A(); ProposerCommon();Insurer1(); fillNomineeDetails1(); }

	        @Test
	        public void Assure_1B() { FamilySize1(); FamilySize2(); Proceed(); ProductPage();Premium1B(); 
	        Ckyc1B();Kyc1B();Upload1B(); ProposerCommon(); Insurer1(); TabOpener("mat-content ng-tns-c269-184"); Insurer2s(); fillNomineeDetails2(); }

	        @Test
	        public void Assure_1C() { FamilySize1(); FamilySize2(); FamilySize3(); Proceed(); ProductPage(); Premium1C();
	        ProposerCommon(); Ckyc1C();  Insurer1(); TabOpener("mat-content ng-tns-c269-184"); Insurer2s1();
	        Insurer3s(); fillNomineeDetails3(); }

	        @Test
	        public void Assure_1D() { FamilySize1(); FamilySize2(); FamilySize3(); FamilySize4(); Proceed(); ProductPage();
	        Premium1D();  ProposerCommon(); Ckyc1D(); Insurer1(); TabOpener("mat-content ng-tns-c269-184");Insurer2(); 
	        TabOpener("mat-content ng-tns-c269-192"); Insurer3(); TabOpener("mat-content ng-tns-c269-200");
	        Insurer4(); fillNomineeDetails4(); }

	        @Test
	        public void Comprehensive_2A() { FamilySize1(); Proceed(); ProductPage(); Premium2A();  ProposerCommon(); Ckyc2A(); 
	        Insurer1(); PersonalCom2A(); fillNomineeDetails1(); }

	        @Test
	        public void Comprehensive_2B() { FamilySize1(); FamilySize2(); Proceed(); ProductPage(); Premium2B();  ProposerCommon();
	        Ckyc2B(); Insurer1();PersonalCom2B();TabOpener("mat-content ng-tns-c269-184");S2(8);
	        Insurer2s();fillNomineeDetails2(); }

	        @Test
	        public void Comprehensive_2C() { FamilySize1(); FamilySize2(); FamilySize3(); Proceed(); ProductPage(); Premium2C();
	        ProposerCommon(); Ckyc2C(); Insurer1(); PersonalCom2C(); TabOpener("mat-content ng-tns-c269-184");
	        S2(8); Insurer2s1(); S2(5); Insurer3s1();S1(15); fillNomineeDetails3(); }

	        @Test
	        public void Comprehensive_2D() { FamilySize1(); FamilySize2(); FamilySize3(); FamilySize4(); Proceed(); ProductPage();
	        Premium2D();  ProposerCommon(); Ckyc2D();  Insurer1(); PersonalCom2D(); TabOpener("mat-content ng-tns-c269-184");
	        S2(8); Insurer2();S1(10); TabOpener("mat-content ng-tns-c269-192");S2(10); Insurer3sa();S1(12); TabOpener("mat-content ng-tns-c269-200");
	        Insurer4s();fillNomineeDetails4();W(3); S1(15); }
	        
}
