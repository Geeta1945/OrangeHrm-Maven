package com.orangehrmlive.demo.opensource.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.demo.opensource.testbase.TestBase;
import com.orangehrmlive.demo.opensource.pages.DashboardPage;
import com.orangehrmlive.demo.opensource.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homepageLogin = new HomePage();
    DashboardPage dashboard = new DashboardPage();

    @Test

    public void verifyUserShouldNavigateToLoginPage(){
        String expectedMessage = "LOGIN Panel";

        String actualMessage =homepageLogin.homePageLoginTextCheck();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test

    public void verifyUserShouldLoginWithValidCredentials(){

        homepageLogin.enterEmailId("Admin");
        homepageLogin.enterUserPassword("admin123");
        homepageLogin.clickLoginButton();
        String expectedWelcomeMessage = "Welcome";
        String actualMessage = dashboard.checkWelcomeMessageAfterLogin();
        String splitMessage[]=actualMessage.split("");
        String welcomeMessageDispalyed = splitMessage[0];

        if(welcomeMessageDispalyed.equalsIgnoreCase("welcome"))
        {
            System.out.println("You have successfully log in ");

        }
    }
}
