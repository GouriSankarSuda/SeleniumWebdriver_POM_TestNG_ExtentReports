package main.java.pageEvents;

import main.java.pageObjects.AmazonSigInPageElementsEmailOrMobileNumber;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AmazonLoginPageEmailOrMobileNumberPageEvents {

WebDriver driver;

public void  SetEmailOrMobilePhoneNumber() {

    ElementFetch elementFetch= new ElementFetch() ;
    Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPageElementsEmailOrMobileNumber.Login_EmailORMobilePhoneNumber).isDisplayed(), "Product Search not displayed");
    Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPageElementsEmailOrMobileNumber.Login_EmailORMobilePhoneNumber).isEnabled(), "Product Search not Enabled");
    elementFetch.getWebElement("xpath", AmazonSigInPageElementsEmailOrMobileNumber.Login_EmailORMobilePhoneNumber).sendKeys("gsds1106@gmail.com");
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

    public void ClickContinueBtnOnSignInPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPageElementsEmailOrMobileNumber.Login_Continue).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPageElementsEmailOrMobileNumber.Login_Continue).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonSigInPageElementsEmailOrMobileNumber.Login_Continue).sendKeys();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickNeedHelpLinkOnSignInPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPageElementsEmailOrMobileNumber.Login_NeedHelp).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPageElementsEmailOrMobileNumber.Login_NeedHelp).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonSigInPageElementsEmailOrMobileNumber.Login_NeedHelp).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnCreateYourAmazonAccountonBtnOnSignInPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPageElementsEmailOrMobileNumber.Login_NewToAmazon_CreateYourAmazonAccount).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPageElementsEmailOrMobileNumber.Login_NewToAmazon_CreateYourAmazonAccount).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonSigInPageElementsEmailOrMobileNumber.Login_NewToAmazon_CreateYourAmazonAccount).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


}
