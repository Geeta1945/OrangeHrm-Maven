package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {

    By forgotPassword = By.xpath("//a[text()='Forgot your password?']");
    By messageForgotPassword =By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

    public void clickOnForgotPassword(){

        mouseHoverToElementAndClick(forgotPassword);
        waitForElementWithFluentWait(messageForgotPassword,20,5);

    }

    public String CheckMessageOnForgotPasswordPage(){
       return getTextFromElement(messageForgotPassword);


    }

}
