package com.pages;

import com.extent.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount {

    private static Logger LOGGER = Logger.getLogger(CreateAccount.class);

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement SignIn;

    @FindBy(linkText = "Dismiss")
    private WebElement closePopup;

    @FindBy(linkText = "Create your account")
    private WebElement createAccount;

    @FindBy(xpath = "(//a[@href='/login'])[1]")
    private WebElement signInButton;


    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement finalCreateAccount;


    public void closePopuButton() {
        closePopup.click();
        ExtentTestManager.log("Clicked on dismiss Button");


    }

    public void clickOnContinueButton() {
        signInButton.click();
        ExtentTestManager.log("Clicked on continue button");

    }

    public void clickOnCreateAccount() {
        createAccount.click();
        ExtentTestManager.log("Clicked on the create account button");

    }

    public void typeOnFirstNameField(String firstname) {
        firstNameField.sendKeys(firstname);
    }

    public void typeOnLastNameField(String lastname) {
        lastNameField.sendKeys(lastname);
    }

    public void typeOnEmailField(String email) {
        emailField.sendKeys(email);
    }

    public void typeOnPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickOnFinalCreateAccount() {
        finalCreateAccount.click();
        ExtentTestManager.log("Clicked on final create Account Button");


    }


}
