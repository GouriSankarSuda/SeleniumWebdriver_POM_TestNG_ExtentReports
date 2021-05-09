package test.java;

import main.java.pageEvents.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class HelloSelectYourAddressExistingUser extends BasePageSetup {

   WebDriver driver;

@Test
    public void SelectYourAddrees () throws InterruptedException {

    AmazonHomePageEvents amazonHomePageEvents = new AmazonHomePageEvents();
    amazonHomePageEvents.ClickOnSelectYourLocationAndMoveToPopUpWindow();
    ChooseYourLocationPageEvents chooseYourLocationPageEvents = new ChooseYourLocationPageEvents();
    chooseYourLocationPageEvents.ClickOnSignIntoSeeYourLocation();
     SelectyourLocationSignInPageEvents selectyourLocationSignInPageEvents = new SelectyourLocationSignInPageEvents();
    selectyourLocationSignInPageEvents.SelectYourLocation_SetEmailORMobile();
    selectyourLocationSignInPageEvents.ClickContinueOnSelectYourAddress();
    AmazonSignInPasswordPageEvents amazonSignInPasswordPageEvents = new AmazonSignInPasswordPageEvents();
    amazonSignInPasswordPageEvents.SetPassword();
    amazonSignInPasswordPageEvents.ClickSignInBtnOnPasswordPage();
   // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


}
}
