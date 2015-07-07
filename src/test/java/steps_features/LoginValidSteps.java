package steps_features;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page_objects.LoginPage;

public  class LoginValidSteps {
    private static WebDriver driver;


    @Given("^I am about to login$")
    public void I_am_about_to_login() throws Throwable {
        this.driver = new FirefoxDriver();
        driver.get("https://badoo.com/es/signin/?f=top");
        LoginPage page = new LoginPage(driver);
        if (!page.pageLoginExist()) {
            throw new PendingException("Error, I am not on login page");
        }
    }
    @When("^I enter valid credentials$")
    public void I_enter_valid_credentials(){
        LoginPage page = new LoginPage(driver);
        page.enterCredentials("jc.caverogracia@gmail.com", "siqoseju");
    }

    @Then("^I am on main menu$")
    public void I_am_on_main_menu() throws Throwable{
        LoginPage page = new LoginPage(driver);
        if (!page.pageMenuExist()) {
            throw new PendingException("Error, no estoy en la pagina correcta");
        }
    }
    @After
    public void quit(){
        this.driver.close();
    }
}
