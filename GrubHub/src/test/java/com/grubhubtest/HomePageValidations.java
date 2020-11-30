package com.grubhubtest;

import com.base.TestBase;
import com.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        sleepFor(2);
        homePage.closePopuButton();
        sleepFor(2);

        homePage.typeOnSearchBar("Austin, TX, 78701");
        homePage.clickOnSearchButton();
        sleepFor(5);

        homePage.addFoodButton();
        sleepFor(3);


    }


/*
    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
    }
*/


}