package Pages;

import Utilities.GWD_OmerFatih;
import Utilities.MyFuncOmerFatih;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class ParentPageOmerFatih {

    public WebDriverWait wait=new WebDriverWait(GWD_OmerFatih.getDriver(), Duration.ofSeconds(10));
    public void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
       scrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String yazisi){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazisi);
    }


    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD_OmerFatih.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsText(WebElement element, String value){

        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(GWD_OmerFatih.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        //Sayfaya esc tuşu gönderildi.
    }
    public void myUploadFile(String pathFile) {

        Robot robot;

        {
            try {
                robot = new Robot();
            } catch (AWTException e) {
                throw new RuntimeException(e);
            }
        }

        StringSelection createPathFile = new StringSelection(pathFile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(createPathFile, null);

        MyFuncOmerFatih.Bekle(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        MyFuncOmerFatih.Bekle(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        MyFuncOmerFatih.Bekle(1);

    }

}

