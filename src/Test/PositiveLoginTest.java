package Test;

import POM.HomePageElements;
import POM.LoginPageElements;
import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PositiveLoginTest extends BaseDriver {

    HomePageElements homePageElements;
    LoginPageElements loginPageElements;


    @Test
    public void positiveLogIn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        homePageElements = new HomePageElements(driver);
        loginPageElements = new LoginPageElements(driver);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='ico-login']")));

        homePageElements.LoginButton.click();
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='button-1 login-button']")));

        loginPageElements.inputEmail.sendKeys("asdfgh@qwerty.com");
        loginPageElements.inputPassword.sendKeys("789512358");
        loginPageElements.signInButton.click();
        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='account']")));

        String headerText = homePageElements.emailHeader.getText();
        Assert.assertEquals(headerText, "asdfgh@qwerty.com");

    }
}
