package main.java.pageEvents;

import main.java.pageObjects.AmazonSigInPasswordPage;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AmazonSignInPasswordPageEvents {

    WebDriver driver ;

    public void ClickOnChangeEmailLinkPasswordPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.EmailChange).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.EmailChange).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonSigInPasswordPage.EmailChange).sendKeys();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void SetPassword() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.Password).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.Password).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonSigInPasswordPage.Password).sendKeys("GouriDhanvi@786");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickForgotPasswordLinkOnPasswordPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.ForgotPassword).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.ForgotPassword).isEnabled(), "Product Search not Enabled");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        elementFetch.getWebElement("xpath", AmazonSigInPasswordPage.ForgotPassword).click();
    }

    public void ClickSignInBtnOnPasswordPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.SignInBtn).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.SignInBtn).isEnabled(), "Product Search not Enabled");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        elementFetch.getWebElement("xpath", AmazonSigInPasswordPage.SignInBtn).click();
    }


    public void ClickDetailsLinkOnPasswordPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.DetailsLink).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.DetailsLink).isEnabled(), "Product Search not Enabled");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        elementFetch.getWebElement("xpath", AmazonSigInPasswordPage.DetailsLink).click();
    }

    public void CheckKeepMeSignrdInOnPasswordPage() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.KeepMeSignedIn).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSigInPasswordPage.KeepMeSignedIn).isEnabled(), "Product Search not Enabled");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        elementFetch.getWebElement("xpath", AmazonSigInPasswordPage.KeepMeSignedIn).click();
    }


}
