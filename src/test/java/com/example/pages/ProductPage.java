package com.example.pages;

import com.example.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

// page_url = https://www.saucedemo.com/inventory.html
public class ProductPage extends BasePage {
    @FindBy(xpath = "//*[text() = 'Products']")
    public WebElement titleProduct;


    @FindBy(css = ".product_sort_container")
    public WebElement selectProductSortContainer;

    @FindBy(xpath = "//a[contains(@class, 'cart')]")
    public WebElement shoppingCart;


    public void sortProduct(String sortType){
        Select select = new Select(selectProductSortContainer);
        select.selectByVisibleText(sortType);

    }

    public void addProduct(String price){
        Driver.get().findElement(By.xpath("//div[text()='"+price+"']/../button")).click();
    }
}
