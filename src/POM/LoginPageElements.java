package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

    public LoginPageElements(WebDriver driver){PageFactory.initElements(driver, this);}

    @FindBy(css = "input[id='Email']")
    public WebElement inputEmail;

    @FindBy(css = "input[id='Password']")
    public WebElement inputPassword;

    @FindBy(css = "input[class='button-1 login-button']")
    public WebElement signInButton;

    @FindBy(css = "div[class='validation-summary-errors']")
    public WebElement incorrectCredentials;
}
