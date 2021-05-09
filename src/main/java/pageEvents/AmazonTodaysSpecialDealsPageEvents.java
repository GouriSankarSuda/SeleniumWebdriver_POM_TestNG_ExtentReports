package main.java.pageEvents;

import main.java.pageObjects.TodaysDealsPage;
import main.java.utils.ElementFetch;

public class AmazonTodaysSpecialDealsPageEvents {

public void NavigatetoNextSetProducts() {

    ElementFetch elementFetch= new ElementFetch();
    elementFetch.getWebElement("ID", TodaysDealsPage.ProductNextSetScroll).click();
    }

    public void ClickASelectedProduct1() {

        ElementFetch elementFetch= new ElementFetch();
        elementFetch.getWebElement("ID", TodaysDealsPage.SelectedProduct1).click();
    }

    public void ClickASelectedProduct2() {

        ElementFetch elementFetch= new ElementFetch();
        elementFetch.getWebElement("ID", TodaysDealsPage.SelectedProduct2).click();
    }

    public void ClickASelectedProduct3() {

        ElementFetch elementFetch= new ElementFetch();
        elementFetch.getWebElement("ID", TodaysDealsPage.SelectedProduct3).click();
    }

    public void ClickASelectedProduct4() {

        ElementFetch elementFetch= new ElementFetch();
        elementFetch.getWebElement("ID", TodaysDealsPage.SelectedProduct4).click();
    }

    public void ClickASelectedProduct5() {

        ElementFetch elementFetch= new ElementFetch();
        elementFetch.getWebElement("ID", TodaysDealsPage.SelectedProduct5).click();
    }


}
