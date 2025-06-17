package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModule.MFPageObjectModule;

public class MFStepDefinition {
	MFPageObjectModule Import;
	WebDriver driver;
	
	@Given("Launch the Browser and open the SBIMutualFund page")
	public void launch_the_browser_and_open_the_sbi_mutual_fund_page() {
		System.setProperty("webdriver.edge.driver","C:\\\\WebDriver\\\\edgedriver_win64\\\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.sbimf.com/login");
		Import = new MFPageObjectModule(driver);
		
	}
	
	@When("I click here to Register")
	public void i_click_here_to_register()throws InterruptedException{
	    Import.Register_a_New_User();
        Import.VerifyTextPAge();
	}
	
	@Then("I Enter the First Name")
	public void i_enter_the_first_name() {
	  Import.Enter_First_Name();
	}
	@Then("I Enter the Last Name")
	public void i_enter_the_last_name() {
	   Import.Enter_Last_Name();
	}
	@Then("I Enter my Email Address")
	public void i_enter_my_email_address() {
	   Import.Enter_Email_Address();
	}
	@Then("Click on Submit")
	public void click_on_submit() {
	   Import.Click_On_Submit();
	}
	@Then("Set a New Password")
	public void Enter_New_Password() {
		
	}
	
	@Then("Enter confirm Password")
	public void enter_confirm_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Close the Browser")
	public void close_the_browser()throws InterruptedException {
	   Import.Close_The_Browser();

	}


}
