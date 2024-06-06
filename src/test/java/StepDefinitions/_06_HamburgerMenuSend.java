package StepDefinitions;

import Pages.DialogContentOmerFatih;
import Utilities.MyFuncOmerFatih;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _06_HamburgerMenuSend {
    DialogContentOmerFatih dc=new DialogContentOmerFatih();
    @And("click outbox and move to trash")
    public void clickOutboxAndMoveToTrash() {
        dc.myClick(dc.Outbox);
        MyFuncOmerFatih.Bekle(5);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.Movetotrash));
        Assert.assertTrue(dc.Movetotrash.isDisplayed());
        dc.myClick(dc.Movetotrash);









    }

    @And("see the confirm message and successfully")
    public void seeTheConfirmMessageAndSuccessfully() {
        Assert.assertTrue(dc.confirm.isDisplayed());
        dc.wait.until(ExpectedConditions.visibilityOf(dc.yesButton));
        dc.myClick(dc.yesButton);
    }

}
