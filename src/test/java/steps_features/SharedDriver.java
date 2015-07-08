package steps_features;

import cucumber.api.java.After;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class SharedDriver extends EventFiringWebDriver {
private static WebDriver driver;

    public SharedDriver()  {
        super(new FirefoxDriver());
    }
    @After
     public void tearDown() throws Exception {
        close();
    }
}
