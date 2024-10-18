package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    WebDriver driver;

    public Register(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//a[@class = 'ico-register']")
    WebElement registerDropdown;
    @FindBy(xpath = "//input[@id = 'gender-female']")
    WebElement gender;
    @FindBy(xpath = "//input[@id = 'FirstName']")
    WebElement FirstName;

    @FindBy(xpath = "//input[@id = 'LastName']")
    WebElement LastName;

    @FindBy(xpath = "//select[@name = 'DateOfBirthDay']")
    WebElement BirthDay;

    @FindBy(xpath = "//select[@name = 'DateOfBirthMonth']")
    WebElement Month;

    @FindBy(xpath = "//select[@name = 'DateOfBirthYear']")
    WebElement Year;

    @FindBy(xpath = "//input[@id = 'Email']")
    WebElement Email;

    @FindBy(xpath = "//input[@id = 'Password']")
    WebElement Password;

    @FindBy(xpath = "//input[@id = 'ConfirmPassword']")
    WebElement ConfirmPassword;

    @FindBy(xpath = "//button[@id = 'register-button']")
    WebElement submit;

    @FindBy(xpath = "//a[@class = 'button-1 register-continue-button']")
    WebElement Continue;



    public WebElement registerDropdown(){
        return registerDropdown;
    }
    public WebElement gender(){
        return gender;
    }
    public WebElement FirstName(){
        return FirstName;
    }
    public WebElement LastName(){
        return LastName;
    }
    public WebElement BirthDay(){
        return BirthDay;
    }

    public WebElement Month(){
        return Month;
    }

    public WebElement Year(){
        return Year;
    }

    public WebElement Email(){
        return Email;
    }

    public WebElement Password(){
        return Password;
    }

    public WebElement ConfirmPassword(){
        return ConfirmPassword;
    }

    public WebElement submit(){
        return submit;
    }

    public WebElement Continue(){
        return Continue;
    }



}
