


package com.example.pages;

import com.example.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//page_url = https://www.saucedemo.com/
public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[text() = 'Password for all users:']")
    public WebElement h4PasswordForAllUsers;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginButton;


    public void login(String username,String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }














}