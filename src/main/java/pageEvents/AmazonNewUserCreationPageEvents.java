package main.java.pageEvents;

import main.java.pageObjects.AmazonNewUserCreationPage;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class AmazonNewUserCreationPageEvents {

    WebDriver driver;

    public void SetYourName(){
        ElementFetch elementFetch=new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_YourName).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_YourName).isEnabled());
        elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_YourName).sendKeys("Gouri");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void SelectCountryCode(){
        ElementFetch elementFetch=new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_MobileNumber_Country).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_MobileNumber_Country).isEnabled());
        Select select= new Select(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_MobileNumber_Country));
        select.selectByVisibleText("Guadeloupe +590");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    public void SetMobileNumber(){
        ElementFetch elementFetch=new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_MobileNUmber).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_MobileNUmber).isEnabled());
        elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_MobileNUmber).sendKeys("1234567890");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void SetEmailAdress(){
        ElementFetch elementFetch=new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_Email).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_Email).isEnabled());
        elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_Email).sendKeys("gouris.s.sankar@gmail.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
         }

    public void SetPassword(){
        ElementFetch elementFetch=new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_Password).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_Password).isEnabled());
        elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_Password).sendKeys("Test12345");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnContinue(){
        ElementFetch elementFetch=new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_Continue).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_Continue).isEnabled());
        elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.NewAccount_Continue).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnAlreadyHaveanAccountSignIn(){
        ElementFetch elementFetch=new ElementFetch();

           Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.AlreadyHaveAnAccount_SignIn).isDisplayed());
           Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.AlreadyHaveAnAccount_SignIn).isEnabled());
           elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.AlreadyHaveAnAccount_SignIn).click();
              driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void ClickOnCreateAFreeBusinessAccount() {
        ElementFetch elementFetch=new ElementFetch();
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.CreateAFreeBusinessAccount).isDisplayed());
        Assert.assertTrue(elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.CreateAFreeBusinessAccount).isEnabled());
        elementFetch.getWebElement("xpath", AmazonNewUserCreationPage.CreateAFreeBusinessAccount).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

}
