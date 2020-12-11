package com.pages;


import com.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "email")
    private WebElement emailField;


    @FindBy(xpath = "(//a[@href='/login'])[1]")
    private WebElement continueBtn;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement SignIn;

    @FindBy(linkText = "Dismiss")
    private WebElement closePopup2;


    public void typeOnEmailField(String username) {

        emailField.sendKeys(username);
    }

    public void closePopuButton2() {
        closePopup2.click();
        ExtentTestManager.log("Clicked on dismiss Button");

    }

    public void clickOnContinueButton() {
        continueBtn.click();
        ExtentTestManager.log("Clicked on continue button");

    }

    public void typeOnPasswordField(String password) {

        passwordField.sendKeys(password);
    }

    /*   From here will be create account



     */

    public void clickOnFinalSignInButton() {
        SignIn.click();
        ExtentTestManager.log("Clicked on the final sign in button");

    }


}