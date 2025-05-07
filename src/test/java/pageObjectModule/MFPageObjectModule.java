package pageObjectModule;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MFPageObjectModule {
	
	WebDriver driver;
	
@FindBy(xpath= "//*[contains(text(), 'Start your investment journey today')]")
WebElement Register_Page_Locator;
@FindBy(xpath= "(//a[@class='blue'])[1]")
WebElement New_Register_Locator;
//@FindBy(xpath= "//span[@class='mat-form-field-label-wrapper ng-tns-c62-0']")
@FindBy(xpath= "//input[@formcontrolname='FIRST_NAME']")
WebElement First_Name_Locator;
@FindBy(xpath= "//input[@formcontrolname='LAST_NAME']")
WebElement Last_Name_Locator;
@FindBy(xpath= "//input[@formcontrolname='EMAIL_ID']")
WebElement Email_Locator;
@FindBy(xpath= "//button[@id='regSignUp']")
WebElement Submit_Locator;

public MFPageObjectModule(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void Register_a_New_User()throws InterruptedException {
    //Select Choose = new Select(New_Register_Locator);
    //Choose.selectByValue("Click here to Register");
	  New_Register_Locator.click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='blue'])")));
}	
public void VerifyTextPAge() {
	String RegisterPageTest = Register_Page_Locator.getText();
	String ExpectedRegPageText = "Start your investment journey today";
	Assert.assertEquals(RegisterPageTest, ExpectedRegPageText);
}
public void Enter_First_Name() {
	First_Name_Locator.sendKeys("Stephen");
}
public void Enter_Last_Name() {
	Last_Name_Locator.sendKeys("Raj");
}
public void Enter_Email_Address() {
	Email_Locator.sendKeys("Stephen627@gmail.com");
}
public void Click_On_Submit() {
	Submit_Locator.click();
}
public void Close_The_Browser()throws InterruptedException {
	driver.quit();
	Thread.sleep(3000);
}
}
