package com.example.stepDefs;

import com.example.pages.BasePage;
import com.example.pages.ProductPage;
import com.example.utilities.BrowserUtils;
import com.example.utilities.ConfigurationReader;
import com.example.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    BasePage basePage = new BasePage();
    ProductPage productPage = new ProductPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {

        basePage.login(username, password);
    }
    @Then("The user should be able to login and see {string}")
    public void the_user_should_be_able_to_login_and_see(String expectedTitle) {

        String actualTitle= productPage.titleProduct.getText();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @And("The user sort the products {string}")
    public void theUserSortTheProducts(String sortType) {
        productPage.sortProduct(sortType);

    }

    @And("The user clicks cheapest as {string} and second costliest as {string} products")
    public void theUserClicksCheapestAsAndSecondCostliestAsProducts(String cheapest, String costliest) {
        //                                                                  7.99             29.99
        productPage.addProduct(cheapest);
        productPage.addProduct(costliest);

    }

    @And("The user clicks shopping cart")
    public void theUserClicksShoppingCart() {
        productPage.shoppingCart.click();
        BrowserUtils.waitFor(1);
    }
}