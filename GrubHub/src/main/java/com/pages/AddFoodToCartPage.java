package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddFoodToCartPage {

    @FindBy(xpath = "//input[@aria-label='Search Address']")
    private WebElement putAnAdress;


    @FindBy(xpath = "//button[@class='s-btn s-btn-primary s-btn--block addressInput-submitBtn s-btn--large']")
    private WebElement findFoodButton;

    @FindBy(linkText = "Chick-fil-A")
    private WebElement chooseARestaurant;

    @FindBy(xpath = "//a[@title='Gallon Freshly-Brewed Iced Tea Unsweetened']")
    private WebElement chooseChickenBiscuit;

    @FindBy(id="goToAbout")
    private WebElement aboutButton;

    @FindBy(xpath = "//div[@class='s-row u-flex-justify-xs--between']")
    private WebElement addToBag;

    @FindBy(id="ghs-cart-checkout-button")
    private WebElement proceedToCheckOut;


    public void addAnAddress(String address) {
        putAnAdress.sendKeys(address);
    }

    public void clickOnFindFood() {
        findFoodButton.click();
    }

    public void clickOnARestaurantChoosed(){
        chooseARestaurant.click();
    }
    public void clickOnChickenBiscuit(){
        chooseChickenBiscuit.click();
    }

    public void clickOnAboutButton (){
        aboutButton.click();
    }

    public void clickOnAddToBag(){
        addToBag.click();
    }
    public void clickOnProceedToCheckOut(){
        proceedToCheckOut.click();
    }
}