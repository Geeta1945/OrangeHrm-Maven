package com.orangehrmlive.demo.opensource.pages;



import com.orangehrmlive.demo.opensource.utility.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By checkWelcomeMessage =By.xpath("//a[@id='welcome']");
   //By clickOnWelcomeMessage = By.xpath("panelTrigger activated-welcome");
    By clickOnLogout =By.xpath("//a[@href='/index.php/auth/logout']");

    public void clickOnWelcomeMessageToLogOut(){

        clickOnElement(checkWelcomeMessage);
        clickOnElement(clickOnLogout);



    }

    public  String checkWelcomeMessageAfterLogin(){

          return  getTextFromElement(checkWelcomeMessage);


    }
}
