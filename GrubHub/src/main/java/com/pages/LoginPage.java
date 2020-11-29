package com.pages;


import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "userid")
    private WebElement emailField;


    @FindBy(xpath = "(//a[@href='/login'])[1]")
    private WebElement continueBtn;

    @FindBy(id = "pass")
    private WebElement passwordField;

    public void typeOnEmailField(String username) {

        emailField.sendKeys(username);
    }

    public void clickOnContinueButton() {
        continueBtn.click();
        ExtentTestManager.log("Clicked on continue button");

    }

    public void typeOnPasswordField(String password) {

        passwordField.sendKeys(password);
    }

}