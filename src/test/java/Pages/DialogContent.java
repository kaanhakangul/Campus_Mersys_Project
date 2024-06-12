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
    @FindBy(xpath = "//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base mat-mdc-tooltip-disabled']")
    public WebElement newChatmessageText;
    @FindBy(xpath = "//div[text()=' Student_8 11A ']")
    public WebElement newMessageCheck;

    @FindBy(xpath = "(//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[2]")
    public WebElement closethewindow;

    @FindBy(xpath = "//span[text()='Inbox']")
    public WebElement inboxtext;

    @FindBy(xpath = "//span[contains(text(),' Assignment')]")
    public WebElement assignmenttext;

    @FindBy(xpath = "(//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[1]")
    public WebElement messagebox;

    @FindBy(xpath = "//span[@class='title dialog-title']")
    public WebElement messageBoxCheck;

    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger user-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base ng-star-inserted']")
    public WebElement TopNavProfil;

    @FindBy(xpath = "//span[text()='My Certificates']")
    public WebElement MyCertificate;

    @FindBy(xpath = "//span[text()='New Message']")
    public WebElement HamburgerNewMessage;


    @FindBy(xpath = "//span[text()=' New Message ']")
    public WebElement NewMessageAssert;

    @FindBy(xpath = "//span[text()=' Inbox ']")
    public WebElement InboxAssert;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement Outbox;

    @FindBy(xpath = "//span[text()=' Outbox ']")
    public WebElement OutBoxAssert;

    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement Trash;

    @FindBy(xpath = "//span[text()=' Trash ']")
    public WebElement TrashAssert;

    @FindBy(xpath="//span[contains(text(),'Finance')]")
    public WebElement financeLink;

    @FindBy(xpath="//span[contains(text(),'My Finance')]")
    public WebElement myfinanceLink;

    @FindBy(xpath="//span[contains(text(),'Class: 11A')]")
    public WebElement ChooseStudent;

    @FindBy(xpath="//span[contains(text(),'Online Payment')]")
    public WebElement AssertOnlinePay;

    @FindBy(xpath="//div[@class='mdc-radio']")
    public WebElement StripeButton;

    @FindBy(xpath="//*[@class='w-50-p discount-class']")
    public WebElement Pay;

    @FindBy(xpath="//*[@id='Field-numberInput']")
    public WebElement CardNumber;

    @FindBy(xpath="//*[@class='p-GridCell p-GridCell--12 p-GridCell--xs6 p-GridCell--sm6 p-GridCell--md3'][1]")
    public WebElement Expiration;

    @FindBy(xpath="//*[@class='p-GridCell p-GridCell--12 p-GridCell--xs6 p-GridCell--sm6 p-GridCell--md3'][2]")
    public WebElement Cvc;


    @FindBy(xpath="//*[@class='StripeElement']")
    public WebElement StripeElement;

    @FindBy(xpath="//div[@class='mdc-tab mat-mdc-tab mat-mdc-focus-indicator ng-star-inserted']")
    public WebElement balanceButton;

    @FindBy(xpath="//*[@class='mat-expansion-panel-header-title ng-tns-c2622717266-41']")
    public WebElement AsserPayerInfo;

    @FindBy(xpath ="//span[text()='Attendance']")
    public WebElement AttendanceButton;

    @FindBy(xpath ="//span[text()=' ATTENDANCE EXCUSES ']")
    public WebElement AttendanceExcusesButton;

    @FindBy(xpath ="(//span[@class='mat-mdc-focus-indicator'])[18]")
    public WebElement AddIcon;


    @FindBy(xpath = "//*[@placeholder=\"Message\"]")
    public WebElement TextBox;

    @FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
    public WebElement AttachFile;

    @FindBy(xpath = "//*[@class='mat-mdc-menu-item mat-mdc-focus-indicator mat-badge mat-badge-accent mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']")
    public WebElement FromLocal;

    @FindBy(xpath = "//span[contains(text(),'Send')]")
    public WebElement SendButton;

    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement Settings;

    @FindBy(xpath = "//div[@class='user-info']")
    public WebElement AddUserPhoto;

    @FindBy(xpath = "//button[@class='mat-mdc-tooltip-trigger mdc-fab mdc-fab--mini mat-mdc-mini-fab mat-accent mat-mdc-button-base']")
    public WebElement choosePhoto;

    @FindBy(xpath = "//span[text()=' Upload ']")
    public WebElement UploadPhoto;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement SaveButton;

    @FindBy(xpath = "//*[text()='Profile successfully updated']")
    public WebElement SuccessMsg;
    @FindBy(xpath = "//div[@id='mat-select-value-7']")
    public WebElement DefaultTheme;

    @FindBy(xpath = "//*[@id='mat-option-2']")
    public WebElement DefaultTheme2;
    @FindBy(xpath = "//*[@id='mat-option-3']")
    public WebElement PurpleTheme;
    @FindBy(xpath = "//*[@id='mat-select-value-15']")
    public WebElement BackToTheme;

    @FindBy(xpath = "//*[@id='mat-option-4']")
    public WebElement DarkPurpleTheme;
    @FindBy(xpath = "//*[@id='mat-option-5']")
    public WebElement IndigoTheme;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-floppy-disk fa-fw']")
    public WebElement SaveButton2;

    @FindBy(xpath = "//*[text()='Profile successfully updated']")
    public WebElement SuccessMsg2;

   // @FindBy(xpath = "//div[text()='Profile successfully updated']")
   // public WebElement SuccessMsg2;

















    public WebElement getWebElement(String strElement){

        switch (strElement){
            case "AttachFile":
                return AttachFile;
            case "FromLocal":
                return FromLocal;
            case "SendButton":
                return SendButton;

        }

        return null;
    }
}
