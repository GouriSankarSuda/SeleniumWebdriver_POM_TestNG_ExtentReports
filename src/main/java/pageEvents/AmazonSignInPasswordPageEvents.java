package main.java.pageEvents;

import main.java.pageObjects.AmazonSigInPasswordPage;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import test.java.BasePageSetup;

import java.util.concurrent.TimeUnit;

public class AmazonSignInPasswordPageEvents extends BasePageSetup {



    public void ClickOnChangeEmailLinkPasswordPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.EmailChange).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.EmailChange).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonSigInPasswordPage.EmailChange).sendKeys();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void SetPassword() {
        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.Password).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.Password).isEnabled(), "Product Search not Enabled");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.Password).sendKeys("GouriDhanvi@786");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void ClickForgotPasswordLinkOnPasswordPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.ForgotPassword).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.ForgotPassword).isEnabled(), "Product Search not Enabled");
       // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.ForgotPassword).click();
    }

    public void ClickSignInBtnOnPasswordPage() throws InterruptedException {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("ID", AmazonSigInPasswordPage.SignInBtn).isDisplayed(), " SignIn Button is not displayed");
        Assert.assertTrue(elementFetch.getWebElement("ID", AmazonSigInPasswordPage.SignInBtn).isEnabled(), " SignIn Button is not Enabled");
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        elementFetch.getWebElement("ID", AmazonSigInPasswordPage.SignInBtn).click();
        Thread.sleep(10000);
    }


    public void ClickDetailsLinkOnPasswordPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.DetailsLink).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.DetailsLink).isEnabled(), "Product Search not Enabled");
     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.DetailsLink).click();
    }

    public void CheckKeepMeSignrdInOnPasswordPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.KeepMeSignedIn).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.KeepMeSignedIn).isEnabled(), "Product Search not Enabled");
       //  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        elementFetch.getWebElement("XPATH", AmazonSigInPasswordPage.KeepMeSignedIn).click();
    }


}
