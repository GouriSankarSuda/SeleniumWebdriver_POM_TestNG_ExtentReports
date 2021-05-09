package main.java.pageEvents;

import main.java.pageObjects.AmazonHomePageElements;
import main.java.pageObjects.AmazonShoppingCartPage;
import main.java.utils.ElementFetch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class AmazonCartPageEvents {

WebDriver driver ;

    public void ClickOnShopTodaysDealsLnk () {
        ElementFetch elementFetch= new ElementFetch();
        (elementFetch.getWebElement("LINKTEXT", AmazonShoppingCartPage.AmazonCart_ShopTodaysDeals)).click();
       /* Assert.assertTrue(elementFetch.getWebElement("LINKTEXT", AmazonShoppingCartPage.AmazonCart_ShopTodaysDeals).isDisplayed(), "Shop Todays Deals link not displayed");
        Assert.assertTrue(elementFetch.getWebElement("LINKTEXT", AmazonShoppingCartPage.AmazonCart_ShopTodaysDeals).isEnabled(), "Product Search not Enabled");
        (elementFetch.getWebElement("LINKTEXT", AmazonShoppingCartPage.AmazonCart_ShopTodaysDeals)).click();*/
    }

    public void ClickOnSignIntoYourAccount () {
        ElementFetch elementFetch= new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("ID", AmazonShoppingCartPage.AmazonCart_SignIntoYourAccount).isDisplayed(), "Shop Todays Deals link not displayed");
        Assert.assertTrue(elementFetch.getWebElement("ID", AmazonShoppingCartPage.AmazonCart_SignIntoYourAccount).isEnabled(), "Product Search not Enabled");
        elementFetch.getWebElement("ID", AmazonShoppingCartPage.AmazonCart_SignIntoYourAccount).click();
    }

    public void ClickOnSignUpNowAccount () {
        ElementFetch elementFetch= new ElementFetch();
        elementFetch.getWebElement("ID", AmazonShoppingCartPage.AmazonCart_SignUpNow).click();
    }

    public void VerifyPageTitle_AmazonCart () {
        ElementFetch elementFetch= new ElementFetch();
        String ActualText= driver.getTitle();
        String ExpectedTitle="Amazon.in Shopping Cart";
        Assert.assertEquals("ActualText", "ExpectedTitle");


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
        });
    }

}
