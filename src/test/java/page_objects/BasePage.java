package page_objects;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected final WebDriver driver;
    protected final WebDriverWait wait;

    protected BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }
    protected  void press( By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    protected  void fill(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    protected   boolean pageExist(By by) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(by));
            return true;
        } catch (TimeoutException ignored) {
            return false;
        }
    }
}
