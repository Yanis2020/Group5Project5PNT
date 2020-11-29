package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindFoodPage {
    @FindBy(xpath = "//a[@title='Chick-fil-A']")
    private WebElement addFood;


}