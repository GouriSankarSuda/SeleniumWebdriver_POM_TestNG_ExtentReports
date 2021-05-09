package test.java;

import main.java.pageEvents.AmazonCartPageEvents;
import main.java.pageEvents.AmazonHomePageEvents;
import main.java.pageEvents.AmazonTodaysSpecialDealsPageEvents;
import main.java.pageObjects.AmazonShoppingCartPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonAddItemsToCart extends BasePageSetup {

@Test
    public void AddItemsToCart () {

        AmazonHomePageEvents amazonHomePageEvents=new AmazonHomePageEvents();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        amazonHomePageEvents.ClickOnShoppingCart();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AmazonCartPageEvents amazonCartPageEvents= new AmazonCartPageEvents();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        amazonCartPageEvents.ClickOnShopTodaysDealsLnk();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AmazonTodaysSpecialDealsPageEvents amazonTodaysSpecialDealsPageEvents= new AmazonTodaysSpecialDealsPageEvents();
        amazonTodaysSpecialDealsPageEvents.NavigatetoNextSetProducts();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        amazonTodaysSpecialDealsPageEvents.ClickASelectedProduct5();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
