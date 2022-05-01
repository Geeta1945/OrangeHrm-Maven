package com.orangehrmlive.demo.opensource.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.demo.opensource.testbase.TestBase;
import com.orangehrmlive.demo.opensource.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTest extends TestBase {


    @Test

      public void checkLogoutButtonWorking() {
        DashboardPage dashboardPageObj = new DashboardPage();
        LoginPageTest loginPageTestObj = new LoginPageTest();


            loginPageTestObj.verifyUserShouldLoginWithValidCredentials();
            // here we are calling LoginTestPage method to check whether user have logged in with valid credentials or not
            // Then we will call method of DashboardPage to check that user can log out
            dashboardPageObj.clickOnWelcomeMessageToLogOut();

            // Finally, we are checking by comparing "Login Panel" message on login page that user has successfully logout
            loginPageTestObj.verifyUserShouldNavigateToLoginPage();


        }



    }


