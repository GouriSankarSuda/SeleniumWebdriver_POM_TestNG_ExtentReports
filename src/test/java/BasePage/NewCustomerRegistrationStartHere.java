package test.java.BasePage;

import main.java.pageEvents.*;
import main.java.pageObjects.AmazonHomePageElements;
import main.java.pageObjects.AmazonSignInPage;
import org.testng.annotations.Test;

public class NewCustomerRegistrationStartHere {

@Test
    public void NewCustomerRegistration (){

        AmazonHomePageEvents homePageEvents=new AmazonHomePageEvents();
        homePageEvents.MouseHoverSignInAccountsAndLists();

        AmazonSignInPageEvents signInPageEvents= new AmazonSignInPageEvents();
        signInPageEvents.ClickOnNewCustomer_StartHere();

        AmazonNewUserCreationPageEvents newUserCreationPageEvents=new AmazonNewUserCreationPageEvents();
        newUserCreationPageEvents.SetYourName();
        newUserCreationPageEvents.SelectCountryCode();
        newUserCreationPageEvents.SetMobileNumber();
        newUserCreationPageEvents.SetEmailAdress();
        newUserCreationPageEvents.SetPassword();
        newUserCreationPageEvents.ClickOnContinue();

        AmazonNewUserRegistrationMobileOTPVerficationPageEvents mobileOTPVerficationPageEvents=new AmazonNewUserRegistrationMobileOTPVerficationPageEvents();
        mobileOTPVerficationPageEvents.SetMobileOTP();
        mobileOTPVerficationPageEvents.ClickCreateYourAmazonAccountBtn();

        AmazonSuccessfulLogInPageEvents logInPageEvents= new AmazonSuccessfulLogInPageEvents();
        logInPageEvents.VerifyAmazonSuccessfulUserLogin();


   }
}
