package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps_features.SharedDriver;
import sun.applet.Main;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/**
 * Created by juancarlos.cavero on 09/07/2015.
 */
public class MainPage extends BasePage{
    By mainButton = By.xpath(".//*[@id='head']/div/div[1]/a");
    By perfilButton= By.xpath(".//*[@id='status-image']/div/div[1]/a");
    By addPhotoButton= By.xpath(".//*[@id='photo_list']/div[1]/div[2]/div/i/span");
    By upPhoto= By.xpath(".//*[@id='locality']/div/div[1]/div/p[1]/span[2]");
    By girlProfile= By.xpath(".//*[@id='search']/div[1]/div[1]/div[1]/div[1]/div/a");
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
        press(perfilButton);
    }
    public void addPhoto()  {
        press(addPhotoButton);
        press(upPhoto);
        //driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("C:\\Users\\juancarlos.cavero\\Desktop\\Badoo_bdd\\Troll.jpg");
        setClipboardData("Troll.jpg");
        try{
        Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch(AWTException e){

        }
        waiter(7);
    }
    public void buitreo(){
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