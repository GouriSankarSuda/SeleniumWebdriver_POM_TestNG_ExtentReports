package main.java.pageEvents;

import main.java.pageObjects.ChooseYourLocationPopUpWindow;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebElement;
import test.java.BasePageSetup;

import java.util.concurrent.TimeUnit;

public class ChooseYourLocationPageEvents  {


    public void ClickOnSignIntoSeeYourLocation () {

        ElementFetch elementFetch= new ElementFetch();
        WebElement SignIntoSeeYourLocation=(elementFetch.getWebElement("ID", ChooseYourLocationPopUpWindow.AmazonHomepage_SignToseeYourAddressBtn));
        Boolean SignIntoSeeYourLocationIsAvailable=SignIntoSeeYourLocation.isDisplayed();
        Boolean SignIntoSeeYourLocationIsEnable=SignIntoSeeYourLocation.isEnabled();
        if(SignIntoSeeYourLocationIsAvailable ==true && SignIntoSeeYourLocationIsEnable== true) {
            SignIntoSeeYourLocation.click();
        }
    }

    public void SetPinCode () throws InterruptedException {
        ElementFetch elementFetch= new ElementFetch();
        WebElement PinCode=(elementFetch.getWebElement("ID", ChooseYourLocationPopUpWindow.AmazonHomepage_PinCode));
        Boolean PinCodeIsAvailable=PinCode.isDisplayed();
        Boolean PinCodeIsEnable=PinCode.isEnabled();
        if(PinCodeIsAvailable ==true && PinCodeIsEnable== true) {
            PinCode.sendKeys("560016");
                  }
    }

    public void ClickApplyPinCode () throws InterruptedException {
        ElementFetch elementFetch= new ElementFetch();
        WebElement ApplyPinCode=(elementFetch.getWebElement("ID", ChooseYourLocationPopUpWindow.AmazonHomepage_PinCodeApplyBtn));
        Boolean ApplyPinCodeIsAvailable=ApplyPinCode.isDisplayed();
        Boolean ApplyPinCodeIsEnable=ApplyPinCode.isEnabled();
        if(ApplyPinCodeIsAvailable ==true && ApplyPinCodeIsEnable== true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ApplyPinCode.click();
            Thread.sleep(3000);
        }
    }





}
