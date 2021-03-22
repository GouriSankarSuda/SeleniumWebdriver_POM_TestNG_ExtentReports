package main.java.pageEvents;


import main.java.pageObjects.AmazonHomePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import test.java.BasePageSetup;

import java.util.concurrent.TimeUnit;

public class AmazonHomePageEvents {

    WebDriver driver;


    public void ClickOnAmazonLogo() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", AmazonHomePageElements.AmazonHomepage_Logo).click();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnSelectYourAddress() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_SelectYourAddressLink).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_SelectYourAddressLink).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_SelectYourAddressLink).click();
        BasePageSetup.logger.info(" Select your Address btn is successfullu  clicked ");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnProductCatagory() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_ProductCatagory).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_ProductCatagory).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_ProductCatagory).click();
        BasePageSetup.logger.info(" Product Catagory btn is successfullu  clicked ");
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

    public void MouseHoverSignInAccountsAndLists () {
        ElementFetch elementFetch = new ElementFetch();
        WebElement SignInAccountsAndLists = elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomePage_HelloSignIn_AccountAndLists);
//        System.out.println(SignInAccountsAndLists.getText());
        Boolean SignInAccountsAndListsIsAvailable = SignInAccountsAndLists.isDisplayed();
        Boolean SignInAccountsAndListsIsEnabled = SignInAccountsAndLists.isEnabled();
        if ( SignInAccountsAndListsIsAvailable == true && SignInAccountsAndListsIsEnabled ==true ){
            Actions actions = new Actions(driver);
            actions.moveToElement(SignInAccountsAndLists).build().perform();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
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
        WebElement ShoppingCart = elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomePage_CartTab);
        Boolean ShoppingCartIsAvaiable = ShoppingCart.isDisplayed();
        Boolean ShoppingCartIsEnabled = ShoppingCart.isEnabled();

        if (ShoppingCartIsAvaiable == true && ShoppingCartIsEnabled == true) {
            ShoppingCart.click();

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
    }

    public void ClickOnSingInToSeeYourCurrentLocation() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("xapth", AmazonHomePageElements.AmazonHomepage_SelectYourAddressLink).click();
        for (String winHandle : driver.getWindowHandles()) {
           driver.switchTo().window(winHandle);
            Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_SignToseeYourAddressBtn).isDisplayed());
            Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_SignToseeYourAddressBtn).isEnabled());
            elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_SignToseeYourAddressBtn).click();
        }



    }








}