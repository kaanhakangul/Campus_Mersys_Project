package StepDefinitions;

import Pages.DialogContentOmerFatih;
import io.cucumber.java.en.And;

public class _09_studentsPaymentSteps {
    DialogContentOmerFatih dc=new DialogContentOmerFatih();
    @And("Click on Students Id and Payment Page Appear")
    public void clickOnStudentsIdAndPaymentPageAppear() {
        dc.myClick(dc.studentsId);
        dc.verifyContainsText(dc.freeBalance,"Fee");




    }

    @And("Free Balance Detail and Installment")
    public void freeBalanceDetailAndInstallment() {
        dc.myClick(dc.freeBalance);
        dc.verifyContainsText(dc.Installment,"Installment");
    }
}

