package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    //constructor
    //extends yapanlar bu constructor'ı kullanacak
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    //at the top tüm page'lerde olan : Home, Cart, Contact, About Us...
    @FindBy(xpath = "//a[contains(.,'Home')]") //contains kullan çünkü space var, hata verir
    public WebElement home;

    @FindBy (xpath = "//a[.='Cart'")
    public WebElement cart;
}
