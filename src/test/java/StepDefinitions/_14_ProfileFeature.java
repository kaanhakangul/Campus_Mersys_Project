package StepDefinitions;

import Pages.DialogContent;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import static Utilities.GWD.wait;

public class _14_ProfileFeature {

    DialogContent dc=new DialogContent();
    @Then("Click on the Profile and Settings")
    public void clickOnTheProfileAndSettings() {
        dc.myClick(dc.TopNavProfil);
        Tools.Wait(1);
        dc.myClick(dc.Settings);
        Tools.Wait(2);

        dc.myClick(dc.AddUserPhoto);

       //dc.myClick(dc.DeleteButton);

       //dc.myClick(dc.YesButton);



    }

    @And("Upload the profile photo")
    public void uploadTheProfilePhoto() {
        dc.myClick(dc.choosePhoto);

        dc.myUploadFile("C:\\Users\\User\\Desktop\\Yeni klasör\\th.jpg");
        Tools.Wait(2);


        dc.myClick(dc.UploadPhoto);

        dc.myClick(dc.SaveButton);
        Tools.Wait(3);
        //dc.wait.until(ExpectedConditions.visibilityOf(dc.SuccessMsg));

        dc.verifyContainsText(dc.SuccessMsg,"Profile successfully updated");
        Tools.Wait(3);










    }
}
