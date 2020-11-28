package com.pages;

import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(linkText = "Dismiss")
    private WebElement closePopup;

    @FindBy(id = "Search address")
    private WebElement searchBar;

    @FindBy(id = "start-order-search")
    private WebElement searchBtn;

    @FindBy(linkText = "Sign in")
    private WebElement signInBtn;



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

    public void clickOnSignInButton() {
        signInBtn.click();
        ExtentTestManager.log("Clicked on Sign In Button");
    }





}
