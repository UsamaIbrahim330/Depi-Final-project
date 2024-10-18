package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageobjects.Register;
import pageobjects.Search;
import resources.Base;

import java.io.IOException;

public class SearchTest extends Base {
    WebDriver driver;
    @Test
    public void Search() throws IOException {

        driver = intializerDriver();
        driver.get(prop.getProperty("url"));

        Search search = new Search(driver);
        search.Search().sendKeys("Flower Girl Bracelet");

        Search getSearch = new Search(driver);
        getSearch.GetSearch().click();

        Search addCard = new Search(driver);
        addCard.AddCard().click();

        Search cardDropdown = new Search(driver);
        cardDropdown.CardDropdown().click();

        Search termsofservice = new Search(driver);
        termsofservice.Termsofservice().click();

        Search checkout = new Search(driver);
        checkout.Checkout().click();

        driver.close();

    }
}
