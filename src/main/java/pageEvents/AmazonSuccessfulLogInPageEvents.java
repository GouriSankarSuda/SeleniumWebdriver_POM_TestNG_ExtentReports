package main.java.pageEvents;

import main.java.pageObjects.AmazonSuccessfulLoginPage;
import main.java.utils.ElementFetch;
import org.testng.Assert;

public class AmazonSuccessfulLogInPageEvents {

    public void VerifyAmazonSuccessfulUserLogin() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSuccessfulLoginPage.UserLoginProfile).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSuccessfulLoginPage.UserLoginProfile).isEnabled(), "Product Search not Enabled");
        String ActualText= elementFetch.getWebElement("xpath", AmazonSuccessfulLoginPage.UserLoginProfile).getText();
        Assert.assertEquals(ActualText,"Hello, Gouri");
    }

    public void VerifyUserCurrentLocationAddress() {

        ElementFetch elementFetch= new ElementFetch() ;
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSuccessfulLoginPage.ExistingUserCurrentAdress).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSuccessfulLoginPage.ExistingUserCurrentAdress).isEnabled(), "Product Search not Enabled");
        String ActualText= elementFetch.getWebElement("xpath", AmazonSuccessfulLoginPage.ExistingUserCurrentAdress).getText();
        Assert.assertEquals(ActualText,"");
    }

}
