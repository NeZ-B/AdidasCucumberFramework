package com.demoblaze.step_definitions;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PurchaseSteps {

    ProductPage productPage=new ProductPage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("demoblaze.url"));
        //to go to url
    }
//project- right click- new file- configuration.properties : browser, url
//demoblaze-right click--create folder Utilities--create configurationreader : for reading your properties file
//then create your singleton Driver class
//then create your pages package: abstract BasePage, ProductPage extends

    @When("User adds {string} from {string}")
    public void user_adds_from(String product, String category) {
        //Product Page'den bir obj creat etmek yeterli, Bu sayfa BasePage'e erişim sağlıyor zaten.
        //product page'den navigate, addTocart method çağrıyoruz
        //home bir webelement, click yapıyor
        productPage.navigateTo(product, category);
        productPage.addToCart();
        productPage.home.click();
    }
}
