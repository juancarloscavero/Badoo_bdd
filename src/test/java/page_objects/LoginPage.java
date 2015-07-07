package page_objects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage extends BasePage {
    By username = By.id("email");
    By password = By.id("password");
    By loginButton = By.name("post");
   // By next = By.className(".skip_to_step");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean pageLoginExist() {
        return pageExist(username);
    }

    public boolean pageMenuExist() {
        return pageExist(By.className("skip_to_step"));
    }

    public void enterCredentials(String user, String pass) {
        fill(username, user);
        fill(password, pass);
        press(loginButton);

    }
}