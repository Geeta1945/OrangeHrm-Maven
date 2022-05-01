package com.orangehrmlive.demo.opensource.demo.opensource.testbase;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    // set up browser
    String browser="chrome";
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);

    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }
}
