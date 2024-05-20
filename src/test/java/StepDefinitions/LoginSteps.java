package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter valid username and password and click login botton")
    public void enterValidUsernameAndPasswordAndClickLoginBotton() {
        dc.mySendKeys(dc.userName,"Student_6");
        dc.mySendKeys(dc.password,"S12345");
        dc.myClick(dc.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsText(dc.welcomeText,"Welcome");
    }
}
