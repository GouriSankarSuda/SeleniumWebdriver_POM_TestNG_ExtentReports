package test.java.BasePage;

import main.java.pageEvents.*;
import main.java.pageObjects.AmazonSigInPageElementsEmailOrMobileNumber;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HelloSelectYourAddress {

    WebDriver driver;

@Test
    public void SelectYoutAdrees () {
        AmazonHomePageEvents  homePageEvents=new AmazonHomePageEvents();
        homePageEvents.ClickOnSingInToSeeYourCurrentLocation();
        AmazonLoginPageEmailOrMobileNumberPageEvents emailOrMobileNumber=new AmazonLoginPageEmailOrMobileNumberPageEvents();
        emailOrMobileNumber.SetEmailOrMobilePhoneNumber();
        emailOrMobileNumber.ClickContinueBtnOnSignInPage();
        AmazonSignInPasswordPageEvents passwordPageEvents = new AmazonSignInPasswordPageEvents();
        passwordPageEvents.SetPassword();
        passwordPageEvents.ClickSignInBtnOnPasswordPage();
        AmazonSuccessfulLogInPageEvents logInPageEvents=new AmazonSuccessfulLogInPageEvents();
        logInPageEvents.VerifyUserCurrentLocationAddress();
  }
}
