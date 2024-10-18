package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.Login;
import pageobjects.MyAccount;
import resources.Base;

import java.io.IOException;

public class LoginTest extends Base {
    WebDriver driver;
    @Test(priority = 1)
    public void InvalidLogin() throws IOException {

        driver = intializerDriver();
        driver.get(prop.getProperty("url"));

        Login login = new Login(driver);
        login.loginDropdown().click();

        Login Email = new Login(driver);
        Email.Email().sendKeys(prop.getProperty("Email"));

        Login Password = new Login(driver);
        Password.Password().sendKeys(prop.getProperty("invpassword"));

        Login RememberMe = new Login(driver);
        RememberMe.RememberMe().click();

        Login Log_in = new Login(driver);
        Log_in.Log_in().click();
        driver.close();
    }
    @Test(priority = 2)
    public void ValidLogin() throws IOException {

        driver = intializerDriver();
        driver.get(prop.getProperty("url"));

        Login login = new Login(driver);
        login.loginDropdown().click();

        Login Email = new Login(driver);
        Email.Email().sendKeys(prop.getProperty("Email"));

        Login Password = new Login(driver);
        Password.Password().sendKeys(prop.getProperty("password"));

        Login RememberMe = new Login(driver);
        RememberMe.RememberMe().click();

        Login Log_in = new Login(driver);
        Log_in.Log_in().click();


        MyAccount myAccount = new MyAccount(driver);
        myAccount.MyAccount().click();

        MyAccount changePassword = new MyAccount(driver);
        changePassword.ChangePassword().click();


        MyAccount oldPassword = new MyAccount(driver);
        oldPassword.OldPassword().sendKeys("123456789");

        MyAccount newPassword = new MyAccount(driver);
        newPassword.NewPassword().sendKeys("654987321");

        MyAccount confirmNewPassword = new MyAccount(driver);
        confirmNewPassword.ConfirmNewPassword().sendKeys("654987321");

        MyAccount confirmButton = new MyAccount(driver);
        confirmButton.ConfirmButton().click();

        driver.close();



    }

}
