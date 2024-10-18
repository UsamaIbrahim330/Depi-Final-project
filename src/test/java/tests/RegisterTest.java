package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageobjects.Register;
import resources.Base;

import java.io.IOException;

public class RegisterTest extends Base {
    WebDriver driver;
    @Test
    public void login() throws IOException {

        driver = intializerDriver();
        driver.get(prop.getProperty("url"));

        Register register = new Register(driver);
        register.registerDropdown().click();

        Register gender = new Register(driver);
        gender.gender().click();

        Register FirstName = new Register(driver);
        FirstName.FirstName().sendKeys(prop.getProperty("FirstName"));

        Register LastName = new Register(driver);
        LastName.LastName().sendKeys(prop.getProperty("LastName"));

        Register BirthDay = new Register(driver);
        BirthDay.BirthDay().sendKeys(prop.getProperty("BirthDay"));

        Register Month = new Register(driver);
        Month.Month().sendKeys(prop.getProperty("Month"));

        Register Year = new Register(driver);
        Year.Year().sendKeys(prop.getProperty("Year"));

        Register Email = new Register(driver);
        Email.Email().sendKeys(prop.getProperty("Email"));

        Register Password = new Register(driver);
        Password.Password().sendKeys(prop.getProperty("password"));

        Register ConfirmPassword = new Register(driver);
        ConfirmPassword.ConfirmPassword().sendKeys(prop.getProperty("password"));

        Register submit = new Register(driver);
        submit.submit().click();


        Register Continue = new Register(driver);
        Continue.Continue().click();

    }
    @AfterMethod
    public void closure(){
        driver.close();

    }

}
