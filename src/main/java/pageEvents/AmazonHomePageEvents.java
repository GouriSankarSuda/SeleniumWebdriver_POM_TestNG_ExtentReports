package main.java.pageEvents;


import main.java.pageObjects.AmazonHomePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import test.java.BasePageSetup;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class AmazonHomePageEvents extends BasePageSetup {


    public void ClickOnAmazonLogo() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", AmazonHomePageElements.AmazonHomepage_Logo).click();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

   public void ClickOnSelectYourAddress() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_SelectYourAddressLink).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_SelectYourAddressLink).isEnabled(), "Product Search not Enabled");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_SelectYourAddressLink).click();
        BasePageSetup.logger.info(" Select your Address btn is successfully  clicked");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*String MainWindow=driver.getWindowHandle();
        Set<String>WindowHandles=driver.getWindowHandles();
        Iterator<String> Handles=WindowHandles.iterator();
        while(Handles.hasNext()) {
            String ChooseYourLocationWindow=Handles.next();
            if (MainWindow.equalsIgnoreCase(ChooseYourLocationWindow)) {
                driver.switchTo().window(ChooseYourLocationWindow);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_SignToseeYourAddressBtn).isDisplayed(), "Product Search not displayed");
                Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_SignToseeYourAddressBtn).isEnabled(), "Product Search not Enabled");
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_SignToseeYourAddressBtn).click();
            }

        }*/
}








    public void ClickOnProductCategory () {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_ProductCatagory).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_ProductCatagory).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("xpath", AmazonHomePageElements.AmazonHomepage_ProductCatagory).click();
        BasePageSetup.logger.info(" Product Category btn is successfully  clicked ");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        }

    public void VerifyAmazonApplnIsOpenedOrNot() {
        ElementFetch    elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_Logo).isDisplayed(), "Amazon Application is not opened");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void SetAmazonGlobalSearch() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_ProductSearch).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_ProductSearch).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_ProductSearch).sendKeys();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickonProductSearchBtn() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_ProductSearchSubmitBtn).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_ProductSearchSubmitBtn).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomepage_ProductSearchSubmitBtn).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void MouseHoverglobalisationTab() {
        ElementFetch elementFetch = new ElementFetch();
        Actions actions = new Actions(driver);
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomePage_Globalisation).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomePage_Globalisation).isEnabled(), "Product Search not Enabled");
        actions.moveToElement(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomePage_Globalisation)).build().perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       }

    public void MouseHoverSignInAccountsAndLists () {
        ElementFetch elementFetch = new ElementFetch();
        WebElement SignInAccountsAndLists = elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomePage_HelloSignIn_AccountAndLists);
//        System.out.println(SignInAccountsAndLists.getText());
      //  Boolean SignInAccountsAndListsIsAvailable = SignInAccountsAndLists.isDisplayed();
       // Boolean SignInAccountsAndListsIsEnabled = SignInAccountsAndLists.isEnabled();
       // if ( SignInAccountsAndListsIsAvailable == true && SignInAccountsAndListsIsEnabled ==true ){
            Actions actions = new Actions(driver);
            actions.moveToElement(SignInAccountsAndLists).build().perform();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }


    public void ClickOnReturnsAndOrdersTab() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomePage_ReturnsAndOrdersTab).isDisplayed(), "Product Search not displayed");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomePage_ReturnsAndOrdersTab).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("XPATH", AmazonHomePageElements.AmazonHomePage_ReturnsAndOrdersTab).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnShoppingCart() {
        ElementFetch elementFetch = new ElementFetch();
        // elementFetch.getWebElement("ID", AmazonHomePageElements.AmazonHomePage_CartTab).click();

        Boolean ShoppingCartIsAvaiable = (elementFetch.getWebElement("ID", AmazonHomePageElements.AmazonHomePage_CartTab)).isDisplayed();
        Boolean ShoppingCartIsEnabled = (elementFetch.getWebElement("ID", AmazonHomePageElements.AmazonHomePage_CartTab)).isEnabled();

        if (ShoppingCartIsAvaiable == true && ShoppingCartIsEnabled == true) {
            elementFetch.getWebElement("ID", AmazonHomePageElements.AmazonHomePage_CartTab).click();

            // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }

    }

        public void ClickOnSelectYourLocationAndMoveToPopUpWindow() throws InterruptedException {
            ClickOnSelectYourAddress();
            waitForNewWindowAndSwitchToIt();

        }



    public void waitForNewWindowAndSwitchToIt() throws InterruptedException {
        String cHandle = driver.getWindowHandle();
        String newWindowHandle = null;
        Set<String> allWindowHandles = driver.getWindowHandles();

        //Wait for 20 seconds for the new window and throw exception if not found
        for (int i = 0; i < 10; i++) {
            if (allWindowHandles.size() > 1) {
                for (String allHandlers : allWindowHandles) {
                    if (!allHandlers.equals(cHandle))
                        newWindowHandle = allHandlers;
                }
                driver.switchTo().window(newWindowHandle);
                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                break;
            } else {
                Thread.sleep(1000);
            }
        }
        if (cHandle == newWindowHandle) {
            throw new RuntimeException(
                    "Time out - No window found");
        }
    }


    public void waitForPageLoad() {

        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                System.out.println("Current Window State       : "
                        + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        }

        );
    }
    }


