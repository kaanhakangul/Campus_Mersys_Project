package StepDefinitions;

import Pages.DialogContentOmerFatih;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _07_DeleteItems {
    DialogContentOmerFatih dc=new DialogContentOmerFatih();
    @And("Click trash and see and click delete ıtem and restore ıtem")
    public void clickTrashAndSeeAndClickDeleteItemAndRestoreItem() {
        dc.myClick(dc.Trash);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.deleteButton));
        Assert.assertTrue(dc.deleteButton.isEnabled());
        dc.wait.until(ExpectedConditions.visibilityOf(dc.restoreButton));
        Assert.assertTrue(dc.restoreButton.isEnabled());
        dc.myClick(dc.restoreButton);










    }

    @And("restore success and confirm  delete ıtem and successmessage")
    public void restoreSuccessAndConfirmDeleteItemAndSuccessmessage() {
        dc.myClick(dc.deleteButton);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.deleteConfirm));
        Assert.assertTrue(dc.deleteConfirm.isDisplayed());
        dc.wait.until(ExpectedConditions.visibilityOf(dc.deletefinish));
        dc.myClick(dc.deletefinish);




    }
}
