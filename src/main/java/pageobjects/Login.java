package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class = 'ico-login']")
    WebElement loginDropdown;

    @FindBy(xpath = "//input[@id = 'Email']")
    WebElement Email;

    @FindBy(xpath = "//input[@id = 'Password']")
    WebElement Password;

    @FindBy(xpath = "//input[@id = 'RememberMe']")
    WebElement RememberMe;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement Log_in;
    public WebElement loginDropdown(){
        return loginDropdown;
    }
    public WebElement Email(){
        return Email;
    }

    public WebElement Password(){
        return Password;
    }
    public WebElement RememberMe(){
        return RememberMe;
    }

    public WebElement Log_in(){
        return Log_in;
    }

}
