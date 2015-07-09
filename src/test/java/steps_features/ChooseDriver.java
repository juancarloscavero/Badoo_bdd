package steps_features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

/**
 * Created by juancarlos.cavero on 09/07/2015.
 */
public abstract class ChooseDriver {
    public static WebDriver driver;
    public static WebDriver ChooseOne(){
        if (System.getProperty("browser.set").equals("firefox")){
            driver = new FirefoxDriver();
        }
        else if(System.getProperty("browser.set").equals("chrome")) {
            String filePath = new File("").getAbsolutePath().concat("/browsers/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", filePath);
            driver = new ChromeDriver();
        }

        return driver;
    }
}
