package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy (xpath = "//input[@placeholder='Username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath = "//span[text()=' LOGIN ']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[contains(text(),'Welcome')]")
    public WebElement welcomeText;
   // @FindBy(xpath = "//div[contains(text(),'invalid')]")
   // public WebElement invalidText;

    @FindBy(xpath = "//div[@class='ng-star-inserted']/img")
    public WebElement homePageLogo;

    @FindBy(xpath = "(//span[@class='mdc-button__label'])[1]")
    public WebElement courseTab1;
    @FindBy(xpath = "(//span[@class='mdc-button__label'])[2]")
    public WebElement calendarTab2;
    @FindBy(xpath = "(//span[@class='mdc-button__label'])[3]")
    public WebElement attendanceTab3;
    @FindBy(xpath = "(//span[@class='mdc-button__label'])[4]")
    public WebElement assignmentTab4;
    @FindBy(xpath = "(//span[@class='mdc-button__label'])[5]")
    public WebElement gradingTab5;
    @FindBy(xpath = "(//span[@class='mdc-tab__text-label'])[1]")
    public WebElement calendarTabLabel;
    @FindBy(xpath = "(//span[@class='mdc-tab__text-label'])[1]")
    public WebElement attendanceTabLabel;
    @FindBy(xpath = "//span[contains(text(),' Assignments ')]")
    public WebElement assignmentTabLabel;

    @FindBy(xpath = "//span[contains(text(),' Grading ')]")
    public WebElement gradingTabLabel;

    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-bars fa-fw'])[1]")
    public WebElement hamburger;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messageText;
    @FindBy(xpath = "(//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[1]")
    public WebElement newChatmessageText;
    @FindBy(xpath = " //span[text()=' Assignment - Geo 45']")
    public WebElement assignmentGeo;
    @FindBy(xpath = "//span[text()='Inbox']")
    public WebElement inboxtext;



    public WebElement getWebElement(String strElement){

        switch (strElement){


        }

        return null;
    }
}
