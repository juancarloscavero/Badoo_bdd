package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import steps_features.SharedDriver;
import sun.applet.Main;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 * Created by juancarlos.cavero on 09/07/2015.
 */
public class MainPage extends BasePage{
    By mainButton = By.xpath(".//*[@id='head']/div/div[1]/a");
    By perfilButton= By.xpath("//*[@id=\"status-image\"]/div/div[1]/a");
    By addPhotoButton= By.xpath(".//*[@id='photo_list']/div[1]/div[2]/div/i/span");
    By upPhoto= By.xpath(".//*[@id='locality']/div/div[1]/div/p[1]/span[2]");
    By girlProfile= By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div[1]/div[2]/a");
    By chat1= By.xpath(".//*[@id='js-profile-block-user-menu']/div[1]/a");
    By chat2= By.xpath(".//*[@id='js-profile-block-user-menu']/div[2]/a");
    By chatText= By.xpath(".//*[@id='t']");
    By sendText= By.id("fpost");
    public MainPage(WebDriver driver){
        super(driver);
    }
    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
    public void perfil() {
        press(mainButton);
//        if(System.getProperty("browser.set").equals("chrome")){
//            WebElement element = driver.findElement(perfilButton);
//            ((JavascriptExecutor)driver).executeScript("window.scrollTo(0," + element.getLocation().y + ")");
//        }
        press(perfilButton);
    }
    public void addPhoto()  {

        press(addPhotoButton);
        //press(upPhoto);
        driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("C:\\Users\\juancarlos.cavero\\Desktop\\Badoo_bdd\\Troll.jpg");
    }
    public void buitreo(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        press(mainButton);
        press(girlProfile);
        try {
            press(chat2);
        } catch (Exception e ){
            press(chat1);
        }
        fill(chatText, "Hola quesito de bola");
        press(sendText);
    }


}