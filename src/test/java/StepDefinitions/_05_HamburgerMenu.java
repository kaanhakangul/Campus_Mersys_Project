package StepDefinitions;

import Pages.DialogContentOmerFatih;
import Utilities.GWD_OmerFatih;
import Utilities.MyFuncOmerFatih;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _05_HamburgerMenu {
    DialogContentOmerFatih dc=new DialogContentOmerFatih();
    @And("Click New Message and see receivers")
    public void clickNewMessageAndSeeReceivers() {
        dc.myClick(dc.hamburger);
        Actions aksiyonDriver=new Actions(GWD_OmerFatih.getDriver());
        Action aksiyon=aksiyonDriver.moveToElement(dc.hoverOver).build();// element in üzerine gel
        aksiyon.perform();// etki oluştur(mouse üzerinde).
        dc.myClick(dc.newMessage);
        MyFuncOmerFatih.Bekle(3);

        dc.wait.until(ExpectedConditions.visibilityOf(dc.Receivers));
        Assert.assertTrue(dc.Receivers.isDisplayed());
        dc.AddReceivers.click();


























    }

    @And("Select receivers and put subject")
    public void selectReceiversAndPutSubject() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.fieldReceiver));
        dc.mySendKeys(dc.fieldReceiver,"Stu");
        dc.wait.until(ExpectedConditions.visibilityOf(dc.selectReceiver));
        dc.myClick(dc.selectReceiver);
        dc.myClick(dc.addClose);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.subjectEntry));
        dc.mySendKeys(dc.subjectEntry,"subject");
        GWD_OmerFatih.getDriver().switchTo().frame(0);
        dc.mySendKeys(dc.iframetext,"Hhaasdjhjash");
        GWD_OmerFatih.getDriver().switchTo().defaultContent();
        MyFuncOmerFatih.Bekle(3);
        dc.myClick(dc.attachFileBtn);
        dc.myClick(dc.fromLocalButton);
        dc.myUploadFile("C:\\Users\\Ömer\\Desktop\\Cv\\IMG_8302.JPG");
        dc.myClick(dc.sendButton);







    }

    @And("Get text")
    public void getText() {
        dc.verifyContainsText(dc.sentMessage,"Successfully");

    }
}
