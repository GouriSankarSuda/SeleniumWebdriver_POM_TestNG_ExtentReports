package test.java;

import main.java.pageEvents.*;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class AmazonExistingUserLogin extends BasePageSetup {

@Test
    public static  void AmazonUserLogin () throws InterruptedException {
        AmazonHomePageEvents homePageEvents=new AmazonHomePageEvents();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        homePageEvents.MouseHoverSignInAccountsAndLists();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AmazonSignInPageEvents signInPageEvents= new AmazonSignInPageEvents();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signInPageEvents.ClickOnSignInBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AmazonLoginPageEmailOrMobileNumberPageEvents EmailOrMobileNumberPageEvents= new AmazonLoginPageEmailOrMobileNumberPageEvents();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        EmailOrMobileNumberPageEvents.SetEmailOrMobilePhoneNumber();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        EmailOrMobileNumberPageEvents.ClickContinueBtnOnSignInPage();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        AmazonSignInPasswordPageEvents PasswordPageEvents=new AmazonSignInPasswordPageEvents();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PasswordPageEvents.SetPassword();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PasswordPageEvents.ClickSignInBtnOnPasswordPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AmazonSuccessfulLogInPageEvents SuccessfulLogInPageEvents= new AmazonSuccessfulLogInPageEvents();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SuccessfulLogInPageEvents.VerifyAmazonSuccessfulUserLogin();
    }
}
