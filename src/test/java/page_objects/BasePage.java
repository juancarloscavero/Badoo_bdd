package page_objects;
import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected final WebDriver driver;
    protected final WebDriverWait wait;

    protected BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }
    protected  void press( By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
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
    protected void waiter(int time){
        wait.withTimeout(time, TimeUnit.SECONDS);
    }
}
