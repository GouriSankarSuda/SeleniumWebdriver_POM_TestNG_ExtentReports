package test.java;

import main.java.pageEvents.*;
import org.testng.annotations.Test;

public class NewCustomerRegistrationStartHere extends  BasePageSetup{

    @Test
    public void NewCustomerRegistration() {

        AmazonHomePageEvents homePageEvents = new AmazonHomePageEvents();
        homePageEvents.ClickOnShoppingCart();
    }
}