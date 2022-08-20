package Test;

import POM.HomePageElements;
import POM.LoginPageElements;
import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PlaceOrderTest extends BaseDriver {

    HomePageElements homePageElements;
    LoginPageElements loginPageElements;


    @Test
    public void positiveLogIn() throws InterruptedException {
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

        List<WebElement> addToCardButtons = driver.findElements(By.cssSelector("input[value='Add to cart']"));
        addToCardButtons.get(2).click();
        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[id='add-to-cart-button-72']")));

        homePageElements.addToCart.click();

        homePageElements.shoppingCart.click();

        Select selectCountry = new Select(homePageElements.countryDropdown);
        selectCountry.selectByVisibleText("United States");

        Select selectStates = new Select(homePageElements.stateDropdown);
        selectStates.selectByVisibleText("New York");

        homePageElements.inputZipcode.sendKeys("11229");

        homePageElements.termsRadioButton.click();

        homePageElements.checkoutButton.click();

        homePageElements.billingContinueButton.click();

        homePageElements.shippingContinueButton.click();

        homePageElements.shippingMethodCont.click();

        homePageElements.paymentMethod.click();

        homePageElements.paymentContinueButton.click();

        Select selectCardType = new Select(homePageElements.cardType);
        selectCardType.selectByIndex(1);

        homePageElements.cardholderName.sendKeys("Frank Collins");

        homePageElements.cardNumber.sendKeys("1111222233334444");

        Select selectMonth = new Select(homePageElements.expireMonth);
        selectMonth.selectByVisibleText("05");

        Select selectYear = new Select(homePageElements.expireYear);
        selectYear.selectByVisibleText("2024");

        homePageElements.cardCode.sendKeys("123");

        homePageElements.paymentInfoContinueButton.click();

        homePageElements.confirmOrderButton.click();

        String successMessage =homePageElements.successfulMessage.getText();
        String expected = "Your order has been successfully processed!";
        Assert.assertEquals(successMessage, expected);






    }

}
