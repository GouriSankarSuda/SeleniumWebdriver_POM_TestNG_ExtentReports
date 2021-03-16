package main.java.pageEvents;

import main.java.pageObjects.AmazonNewUserRegistrationMobileOTPVerficationPageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AmazonNewUserRegistrationMobileOTPVerficationPageEvents {

    WebDriver driver;

    public void ClickChangeMobileNumberLnk (){
        ElementFetch elementFetch=new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.MobileNumber_ChangeLnk).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.MobileNumber_ChangeLnk).isEnabled());
        elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.MobileNumber_ChangeLnk).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickResendOTP(){
        ElementFetch elementFetch=new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.ResendOTPlnk).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.ResendOTPlnk).isEnabled());
        elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.ResendOTPlnk).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void SetMobileOTP(){
        ElementFetch elementFetch=new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.MobileNumber_OTP).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.MobileNumber_OTP).isEnabled());
        elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.MobileNumber_OTP).sendKeys("");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
              }

    public void ClickCreateYourAmazonAccountBtn(){
        ElementFetch elementFetch=new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.CreateYourAmazonAccountBtn).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.CreateYourAmazonAccountBtn).isEnabled());
        elementFetch.getWebElement("xpath", AmazonNewUserRegistrationMobileOTPVerficationPageElements.MobileNumber_OTP).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


}
