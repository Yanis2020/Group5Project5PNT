package com.pages;

import com.extent.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(linkText = "Dismiss")
    private WebElement closePopup;

    @FindBy(xpath = "//input[@aria-label='Search Address']")
    private WebElement searchBar;

    @FindBy(xpath = "//button[@at-start-order-search-btn='true']")
    private WebElement searchBtn;

    @FindBy(xpath = "//a[@title='Chick-fil-A']")
    private WebElement addFood;


    public void closePopuButton() {
        closePopup.click();
        ExtentTestManager.log("Clicked on dismiss Button");

    }

    public void typeOnSearchBar(String data) {
        searchBar.sendKeys(data);
        ExtentTestManager.log("Typed on search bar : " + data);

    }

    public void clickOnSearchButton() {
        searchBtn.click();
        ExtentTestManager.log("Clicked on find food Button");

    }

    public void addFoodButton() {
        addFood.click();
        ExtentTestManager.log("Clicked on add food Button");

    }
/*
    public void clickOnSignInButton() {
        signInBtn.click();
        ExtentTestManager.log("Clicked on Sign In Button");
    }
*/


}
