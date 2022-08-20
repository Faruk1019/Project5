package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {

    public HomePageElements(WebDriver driver){PageFactory.initElements(driver, this);}

    @FindBy(css = "a[class='ico-login']")
    public WebElement LoginButton;

    @FindBy(css = "a[class='account']")
    public WebElement emailHeader;

    @FindAll({@FindBy(css = "input[value='Add to cart']")})
    public WebElement homePageItems;

    @FindBy(css = "input[id='add-to-cart-button-72']")
    public WebElement addToCart;

    @FindBy(css = "span[class='cart-label']")
    public WebElement shoppingCart;

    @FindBy(css = "select[id='CountryId']")
    public WebElement countryDropdown;

    @FindBy(css = "select[id='StateProvinceId']")
    public WebElement stateDropdown;

    @FindBy(css = "input[id='ZipPostalCode']")
    public WebElement inputZipcode;

    @FindBy(css = "input[id='termsofservice']")
    public WebElement termsRadioButton;

    @FindBy(css = "button[id='checkout']")
    public WebElement checkoutButton;

    @FindBy(css = "input[class='button-1 new-address-next-step-button']")
    public WebElement billingContinueButton;

    @FindBy(css = "div[id='shipping-buttons-container']>input")
    public WebElement shippingContinueButton;

    @FindBy(css = "input[class='button-1 shipping-method-next-step-button']")
    public WebElement shippingMethodCont;

    @FindBy(css = "input[id='paymentmethod_2']")
    public WebElement paymentMethod;

    @FindBy(css = "input[class='button-1 payment-method-next-step-button']")
    public WebElement paymentContinueButton;

    @FindBy(css = "select[id='CreditCardType']")
    public WebElement cardType;

    @FindBy(css = "input[id='CardholderName']")
    public WebElement cardholderName;

    @FindBy(css = "input[id='CardNumber']")
    public WebElement cardNumber;

    @FindBy(css = "select[id='ExpireMonth']")
    public WebElement expireMonth;

    @FindBy(css = "select[id='ExpireYear']")
    public WebElement expireYear;

    @FindBy(css = "input[id='CardCode']")
    public WebElement cardCode;

    @FindBy(css = "input[class='button-1 payment-info-next-step-button']")
    public WebElement paymentInfoContinueButton;

    @FindBy(css = "input[class='button-1 confirm-order-next-step-button']")
    public WebElement confirmOrderButton;

    @FindBy(css = "div[class='title']")
    public WebElement successfulMessage;


}