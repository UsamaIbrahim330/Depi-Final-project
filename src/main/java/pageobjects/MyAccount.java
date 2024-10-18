package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MyAccount {

    WebDriver driver;

    public MyAccount(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[@class = 'ico-account']")
    public
    WebElement MyAccount;

    @FindBy(xpath = "//a[@href = '/customer/changepassword']")
    public
    WebElement changePassword;

    @FindBy(xpath = "//input[@id = 'OldPassword']")
    public
    WebElement oldPassword;


    @FindBy(xpath = "//input[@id = 'NewPassword']")
    public
    WebElement newPassword;

    @FindBy(xpath = "//input[@id = 'ConfirmNewPassword']")
    public
    WebElement confirmNewPassword;

    @FindBy(xpath = "//button[@class = 'button-1 change-password-button']")
    public
    WebElement confirmButton;

    public WebElement MyAccount() {

        return MyAccount;

    }
    public WebElement ChangePassword() {
        return changePassword;
    }

    public WebElement OldPassword() {
        return oldPassword;

    }

    public WebElement NewPassword() {
        return newPassword;
    }

    public WebElement ConfirmNewPassword() {
        return confirmNewPassword;
    }

    public WebElement ConfirmButton() {
        return confirmButton;
    }



}