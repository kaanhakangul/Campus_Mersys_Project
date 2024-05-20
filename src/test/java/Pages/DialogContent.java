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


    public WebElement getWebElement(String strElement){

        switch (strElement){


        }

        return null;
    }
}
