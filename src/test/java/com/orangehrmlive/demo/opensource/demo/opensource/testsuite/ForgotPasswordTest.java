package com.orangehrmlive.demo.opensource.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.demo.opensource.testbase.TestBase;
import com.orangehrmlive.demo.opensource.pages.ForgotPasswordPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {


    @Test

    public void clickOnForgotPasswordToReset(){

        ForgotPasswordPage forgotPasswordPageObj = new ForgotPasswordPage();
        LoginPageTest loginPageTestObj = new LoginPageTest();


        forgotPasswordPageObj.clickOnForgotPassword();

       String actualMessage = forgotPasswordPageObj.CheckMessageOnForgotPasswordPage();
       String expectedMessage ="Forgot Your Password?";

        Assert.assertEquals(actualMessage,expectedMessage);

    }
}
