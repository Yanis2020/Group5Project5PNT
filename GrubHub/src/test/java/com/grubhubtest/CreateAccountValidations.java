package com.grubhubtest;

import com.base.TestBase;
import com.pages.CreateAccount;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateAccountValidations extends TestBase {


    @Test(enabled = false)


    public static void userAbleToCreateAccount() {

        CreateAccount createAccount = PageFactory.initElements(driver, CreateAccount.class);
        // HomePage homePage= PageFactory.initElements(driver,CreateAccount.class);
        sleepFor(2);

        try {
            createAccount.closePopuButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
        createAccount.clickOnContinueButton();

        sleepFor(2);

        createAccount.clickOnCreateAccount();
        sleepFor(2);

        createAccount.typeOnFirstNameField("Yanis");
        sleepFor(2);

        createAccount.typeOnLastNameField("Am");
        sleepFor(2);

        createAccount.typeOnEmailField("amimeuryanis@gmail.com");
        sleepFor(2);

        createAccount.typeOnPasswordField("Grubhub2020");
        sleepFor(2);

        createAccount.clickOnFinalCreateAccount();

        sleepFor(10);

        closeDriver();
    }
}
