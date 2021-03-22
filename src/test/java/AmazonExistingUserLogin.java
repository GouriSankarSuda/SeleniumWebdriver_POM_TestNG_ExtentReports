package test.java;

import main.java.pageEvents.*;
import org.testng.annotations.Test;


public class AmazonExistingUserLogin extends BasePageSetup {

@Test
    public static  void AmazonUserLogin () {
        AmazonHomePageEvents homePageEvents=new AmazonHomePageEvents();
        homePageEvents.MouseHoverSignInAccountsAndLists();

        AmazonSignInPageEvents signInPageEvents= new AmazonSignInPageEvents();
        signInPageEvents.ClickOnSignInBtn();

        AmazonLoginPageEmailOrMobileNumberPageEvents EmailOrMobileNumberPageEvents= new AmazonLoginPageEmailOrMobileNumberPageEvents();
        EmailOrMobileNumberPageEvents.SetEmailOrMobilePhoneNumber();
        EmailOrMobileNumberPageEvents.ClickContinueBtnOnSignInPage();

        AmazonSignInPasswordPageEvents PasswordPageEvents=new AmazonSignInPasswordPageEvents();
        PasswordPageEvents.SetPassword();
        PasswordPageEvents.ClickSignInBtnOnPasswordPage();

        AmazonSuccessfulLogInPageEvents SuccessfulLogInPageEvents= new AmazonSuccessfulLogInPageEvents();
        SuccessfulLogInPageEvents.VerifyAmazonSuccessfulUserLogin();








    }



}
