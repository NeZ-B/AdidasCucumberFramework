package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage{

    @FindBy(xpath= "//a[.='Add to cart']")
    public WebElement addToCartElement;
//@findby annotation works only with constants




    public void navigateTo(String product, String category){
        Driver.get().findElement(By.linkText(product)).click();
        Driver.get().findElement(By.linkText(category)).click();
    }

    public void addToCart(){
        //add to cart click yapınca bir popup çıkacak."product is added" ok demelisin
        addToCartElement.click();
        //browserUtil'den sleep() method çağırıyoruz. try-catch blok var to handle failed part
        BrowserUtils.sleep(2);
        // WebDriverWait wait= new WebDriverWait(Driver.get(),10);
        Alert alert = Driver.get().switchTo().alert();
       // wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();


    }
}
