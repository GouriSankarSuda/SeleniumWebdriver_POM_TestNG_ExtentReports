package main.java.pageEvents;


import main.java.pageObjects.AmazonHomePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class AmazonHomePageEvents {

    WebDriver driver;
    ElementFetch elementFetch = new ElementFetch();

    public void ClickOnAmazonLogo() {

        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_Logo).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_Logo).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_Logo).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnSelectYourAddress() {

        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_SelectYourAddressLink).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_SelectYourAddressLink).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_SelectYourAddressLink).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnProductCatagory() {

        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_ProductCatagory).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_ProductCatagory).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_ProductCatagory).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void VerifyAmazonAppIsLaunchedorNot() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_Logo).isDisplayed(), "Amazon Application is not opened");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void SetAmazonGlobalSearch() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_ProductSearch).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_ProductSearch).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_ProductSearch).sendKeys();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickonProductSearchBtn() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_ProductSearchSubmitBtn).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_ProductSearchSubmitBtn).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_ProductSearchSubmitBtn).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void MouseHoverglobalisation() {
        ElementFetch elementFetch = new ElementFetch();
        Actions actions = new Actions(driver);
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomePage_Globalisation).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomePage_Globalisation).isEnabled(), "Product Search not Enabled");
        actions.moveToElement(elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomePage_Globalisation)).build().perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       }

    public void MouseHoverSignInAccountsAndLists() {
        ElementFetch elementFetch = new ElementFetch();
        Actions actions = new Actions(driver);
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomePage_HelloSignIn_AccountAndLists).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomePage_HelloSignIn_AccountAndLists).isEnabled(), "Product Search not Enabled");
        actions.moveToElement(elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomePage_HelloSignIn_AccountAndLists)).build().perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnReturnsAndOrdersTab() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomePage_ReturnsAndOrdersTab).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomePage_ReturnsAndOrdersTab).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomePage_ReturnsAndOrdersTab).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnShoppingCart() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomePage_CartTab).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomePage_CartTab).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomePage_CartTab).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnSingInToSeeYourCurrentLocation() {
        ElementFetch elementFetch = new ElementFetch();
        ClickOnSingInToSeeYourCurrentLocation();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_SignToseeYourAddressBtn).isDisplayed());
            Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_SignToseeYourAddressBtn).isEnabled());
            elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_SignToseeYourAddressBtn).click();
        }



    }








}