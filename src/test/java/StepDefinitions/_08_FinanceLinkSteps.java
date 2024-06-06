package StepDefinitions;

import Pages.DialogContentOmerFatih;
import Utilities.GWD_OmerFatih;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_FinanceLinkSteps {
    DialogContentOmerFatih dc=new DialogContentOmerFatih();
    @And("Finance Hover Over")
    public void financeHoverOver() {
        Actions aksiyonDriver=new Actions(GWD_OmerFatih.getDriver());
        Action aksiyon=aksiyonDriver.moveToElement(dc.financeLink).build();// element in üzerine gel
        aksiyon.perform();// etki oluştur(mouse üzerinde).



    }

    @Then("My Finance Click")
    public void myFinanceClick() {
        dc.myClick(dc.myfinanceLink);
        dc.verifyContainsText(dc.studentsFees,"Students Fees");

    }
}
