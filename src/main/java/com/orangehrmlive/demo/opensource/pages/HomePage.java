package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //logInPanelHeading

    By loginText = By.xpath("//div[@id='logInPanelHeading']");
    By loginUsername = By.xpath("//input[@name='txtUsername']");
    By loginPassword =By.xpath("//input[@id='txtPassword']");
    By loginButton  = By.xpath("//input[@id='btnLogin']");


    public String homePageLoginTextCheck(){
         return getTextFromElement(loginText);

    }

    public void enterEmailId(String email){
        sendTextToElement(loginUsername,email);

    }

    public void enterUserPassword(String password){

        sendTextToElement(loginPassword,password);
    }
    public void clickLoginButton(){
        clickOnElement(loginButton);
    }


}
