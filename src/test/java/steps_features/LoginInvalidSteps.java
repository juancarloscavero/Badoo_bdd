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

public class LoginInvalidSteps {

private static WebDriver driver;

//        @Before
//         public void setUp() {
//            driver = new FirefoxDriver();
//            driver.get("https://badoo.com/es/signin/?f=top");
//    }

        @When("^I enter invalid credentials$")
        public void I_enter_invalid_credentials(){
            LoginPage page = new LoginPage(driver);
            page.enterCredentials("wrong", "1234");
        }

        @Then("^I am on login page$")
        public void I_am_in_login_page() throws Throwable{
            LoginPage page = new LoginPage(driver);
            if (!page.pageLoginExist()) {
                throw new PendingException("Error, I am not on Main menu");
            }
        }
        @After
        public void quit(){
            driver.close();
        }
    }

