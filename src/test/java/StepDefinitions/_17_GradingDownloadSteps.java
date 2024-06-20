package StepDefinitions;

import Pages.DialogContent;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _17_GradingDownloadSteps {
    DialogContent dc=new DialogContent();
   // @Then("User should be able to view course grade and click on download button")
   // public void userShouldBeAbleToViewCourseGradeAndClickOnDownloadButton() {
   //     dc.myClick(dc.Grading);
   //     Tools.Wait(5);
   //     //dc.wait.until(ExpectedConditions.elementToBeClickable(dc.printButton));
   //     dc.myClick(dc.courseGrade1);
   //     dc.myClick(dc.printButton);
//
   // }

    @Then("User should be able to view student transcript and click on print button")
    public void userShouldBeAbleToViewStudentTranscriptAndClickOnPrintButton() {
        dc.myClick(dc.studentTranscript);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.transcriptPrint));
        dc.myClick(dc.transcriptPrint);
        Assert.assertTrue(dc.StudentTanscript.isDisplayed(),"The document can t be displayed");

    }

    @And("User must see pdf document when clicking on print button")
    public void userMustSeePdfDocumentWhenClickingOnPrintButton() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.printPage));
        dc.myClick(dc.printPage);
    }

}
