package main.java.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.java.BasePage.BasePageSetup;

import java.util.List;

public class ElementFetch {

    public WebElement getWebElement(String identifierType, String identifierValue) {

        switch (identifierType) {
            case "ID":
                return BasePageSetup.driver.findElement(By.id(identifierValue));
            case "CSS":
                return BasePageSetup.driver.findElement(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BasePageSetup.driver.findElement(By.tagName(identifierValue));
            case "XPATH":
                return BasePageSetup.driver.findElement(By.xpath(identifierValue));
            default:
                return null;
        }
    }

    public List<WebElement> getListWebelelemnts (String identifierType, String identifierValue) {

        switch (identifierType) {
            case "ID":
                return BasePageSetup.driver.findElements(By.id(identifierValue));
            case "CSS":
                return BasePageSetup.driver.findElements(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BasePageSetup.driver.findElements(By.tagName(identifierValue));
            case "XPATH":
                return BasePageSetup.driver.findElements(By.xpath(identifierValue));
            default:
                return null;
        }
    }

    }



