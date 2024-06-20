package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _18_AssignmentSteps {
    DialogContent dc=new DialogContent();
    @When("link to assignments")
    public void linkToAssignments() {
        dc.myClick(dc.assignments);
    }

    @Then("clicks Course button and hover-over on show all to view all assignments")
    public void clicksCourseButtonAndHoverOverOnShowAllToViewAllAssignments() {
    }

    @Then("clicks Course button and hover-over on show all to view his her assignments")
    public void clicksCourseButtonAndHoverOverOnShowAllToViewHisHerAssignments() {
    }
}
