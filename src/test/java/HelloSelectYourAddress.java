package test.java;

import main.java.pageEvents.*;
import org.testng.annotations.Test;


public class HelloSelectYourAddress extends BasePageSetup {

   // WebDriver driver;

@Test
    public void SelectYourAdrees () {
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
