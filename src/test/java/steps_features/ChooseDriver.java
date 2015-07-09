package steps_features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\juancarlos.cavero\\Desktop\\Badoo_bdd\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        return driver;
    }
}
