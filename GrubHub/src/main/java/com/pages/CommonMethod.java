package com.pages;

import com.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonMethod {

    @FindBy(linkText = "Dismiss")
    private WebElement closePopup;

    public void closePopuButton() {
      try {
          closePopup.click();
          ExtentTestManager.log("Clicked on dismiss Button");

      }catch (Exception e){
          e.printStackTrace();
      }




    }
}
