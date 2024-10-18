package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Search {

    WebDriver driver;

    public Search(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id = 'small-searchterms']")
    WebElement search;

    @FindBy(xpath = "//button[@class = 'button-1 search-box-button']")
    WebElement getSearch;

    @FindBy(xpath = "//button[@class = 'button-2 product-box-add-to-cart-button']")
    WebElement addCard;

    @FindBy(xpath = "//a[@class = 'ico-cart']")
    WebElement cardDropdown;

    @FindBy(xpath = "//input[@id = 'termsofservice']")
    WebElement termsofservice;

    @FindBy(xpath = "//button[@id = 'checkout']")
    WebElement checkout;

    public WebElement Search(){
        return search;
    }
    public WebElement GetSearch(){
        return getSearch;
    }

    public WebElement AddCard(){
        return addCard;
    }

    public WebElement CardDropdown(){
        return cardDropdown;
    }

    public WebElement Termsofservice(){
        return termsofservice;
    }
    public WebElement Checkout(){
        return checkout;
    }



}
