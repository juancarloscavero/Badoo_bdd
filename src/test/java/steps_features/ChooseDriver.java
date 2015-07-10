package steps_features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

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
        else if(System.getProperty("browser.set").equals("ie")){
            String filePath = new File("").getAbsolutePath().concat("/browsers/IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", filePath);
            DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
            caps.setCapability(
                    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            driver = new InternetExplorerDriver(caps);
        }
        return driver;
    }
}
