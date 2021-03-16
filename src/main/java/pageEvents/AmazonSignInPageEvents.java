package main.java.pageEvents;


import main.java.pageObjects.AmazonHomePageElements;
import main.java.pageObjects.AmazonSignInPage;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AmazonSignInPageEvents {

    WebDriver driver;

    public void ClickOnSignInBtn() {
        ElementFetch elementFetch = new ElementFetch();
        Actions actions = new Actions(driver);
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomePage_HelloSignIn_AccountAndLists).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomePage_HelloSignIn_AccountAndLists).isEnabled(), "Product Search not Enabled");
        actions.moveToElement(elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomePage_HelloSignIn_AccountAndLists)).build().perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSignInPage.AmazonHomepage_ExistingUser_SignIn).isDisplayed(), "Product Search not displayed");
            Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSignInPage.AmazonHomepage_ExistingUser_SignIn).isEnabled(), "Product Search not Enabled");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            actions.moveToElement(elementFetch.getWebElement("xpath", AmazonSignInPage.AmazonHomepage_ExistingUser_SignIn)).click();

        }
    }

    public void ClickOnNewCustomer_StartHere() {
        ElementFetch elementFetch = new ElementFetch();
        Actions actions = new Actions(driver);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSignInPage.AmazonHomepage_NewCustomer_StartHere_).isDisplayed(), "Product Search not displayed");
            Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonSignInPage.AmazonHomepage_NewCustomer_StartHere_).isEnabled(), "Product Search not Enabled");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            actions.moveToElement(elementFetch.getWebElement("xpath", AmazonSignInPage.AmazonHomepage_NewCustomer_StartHere_)).click();
        }
    }










}

