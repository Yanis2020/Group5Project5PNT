package com.grubhubtest;
import com.base.TestBase;
import com.data.DataProviders;
import com.pages.HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class FindFoodValidations extends TestBase {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchData", enabled = false)
    public void validateUserBeingAbleToSearchForAnItem(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
        homePage.clickOnSearchButton();
    }
}
