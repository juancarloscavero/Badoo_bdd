package steps_features;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.BasePage;
import page_objects.LoginPage;
import page_objects.MainPage;

/**
 * Created by juancarlos.cavero on 09/07/2015.
 */
public class MainPageSteps {
   public static SharedDriver driver;

    public MainPageSteps(SharedDriver driver){
        this.driver = driver;
    }
    @Given("^I am logged$")
    public void I_am_logged(){
        driver.get("https://badoo.com/es/signin/?f=top");
        LoginPage page = new LoginPage(driver);
        page.enterCredentials("jc.caverogracia@gmail.com", "siqoseju");
    }
    @When("^I enter in Perfil$")
    public void I_enter_in_Perfil(){
        MainPage page = new MainPage(driver);
        page.perfil();
    }
    @And("^I add a photo$")
    public void I_add_a_photo(){
        MainPage page  = new MainPage(driver);
        page.addPhoto();
    }
    @When("^I write a girl$")
    public void I_write_a_girl(){
        MainPage page = new MainPage(driver);
        page.buitreo();
    }
    @Then("^I wait a responde$")
    public void I_wait_a_response(){

    }
}
