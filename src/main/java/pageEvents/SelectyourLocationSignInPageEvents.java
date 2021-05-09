package main.java.pageEvents;

import main.java.pageObjects.SelectYourAddress_SignInPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;

public class SelectyourLocationSignInPageEvents {

    public void SelectYourLocation_SetEmailORMobile() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("ID", SelectYourAddress_SignInPageElements.SignIn_EmailOrMobile).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("ID", SelectYourAddress_SignInPageElements.SignIn_EmailOrMobile).isEnabled());
        elementFetch.getWebElement("ID", SelectYourAddress_SignInPageElements.SignIn_EmailOrMobile).sendKeys("gsds1106@gmail.com");
    }

    public void ClickContinueOnSelectYourAddress() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("ID", SelectYourAddress_SignInPageElements.SignIn_Continue).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("ID", SelectYourAddress_SignInPageElements.SignIn_Continue).isEnabled());
        elementFetch.getWebElement("ID", SelectYourAddress_SignInPageElements.SignIn_Continue).click();
    }
}