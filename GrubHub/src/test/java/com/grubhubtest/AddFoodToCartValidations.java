package com.grubhubtest;

import com.base.TestBase;
import com.pages.AddFoodToCartPage;
import com.pages.CommonMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddFoodToCartValidations extends TestBase {


    @Test
    public void userAbleToAddFoodToTheCart() {
        AddFoodToCartPage addFoodToCartPage = PageFactory.initElements(driver, AddFoodToCartPage.class);
        CommonMethod commonMethod = PageFactory.initElements(driver,CommonMethod.class);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        commonMethod.closePopuButton();
        sleepFor(2);
        addFoodToCartPage.addAnAddress("5230 Thunder Creek Rd, Austin, TX, 78759");
        sleepFor(2);
        addFoodToCartPage.clickOnFindFood();
        sleepFor(2);
        addFoodToCartPage.clickOnARestaurantChoosed();
        sleepFor(2);
        js.executeScript("window.scrollBy(0,600)");
       // addFoodToCartPage.clickOnAboutButton();
       addFoodToCartPage.clickOnChickenBiscuit();
        sleepFor(2);
        addFoodToCartPage.clickOnAddToBag();
        sleepFor(2);
        addFoodToCartPage.clickOnProceedToCheckOut();
        sleepFor(2);

    }
}
