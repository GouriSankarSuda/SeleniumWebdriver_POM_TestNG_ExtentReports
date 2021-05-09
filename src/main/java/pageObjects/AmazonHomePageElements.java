package main.java.pageObjects;

import main.java.pageEvents.AmazonHomePageEvents;
import org.openqa.selenium.WebElement;

public interface AmazonHomePageElements {

    //  Amazon_Homepage_TopHeaderElements

    String AmazonHomepage_Logo="nav-logo";
    String AmazonHomepage_SelectYourAddressLink=".//a[@id='nav-global-location-popover-link']";
    String AmazonHomepage_ProductCatagory=".//div[@id='nav-search-dropdown-card']";
    String AmazonHomepage_ProductSearch=".//div[@class='nav-search-field ']";
    String AmazonHomepage_ProductSearchSubmitBtn=".//input[@id='nav-search-submit-button']";
    String AmazonHomePage_Globalisation=".//div[@id='navbar']//div[@class='layoutToolbarPadding']//*[@id='icp-nav-flyout']";
    String AmazonHomePage_HelloSignIn_AccountAndLists ="//a[@id='nav-link-accountList']";
    String AmazonHomePage_ReturnsAndOrdersTab= ".//a[@id='nav-orders']";
    String AmazonHomePage_CartTab="nav-cart-count-container";



   // Amazon Homepage_Header Links

    String AmazonHomepageHeader_HambergerMenu=".//div[@id='nav-main']//a[@id='nav-hamburger-menu']";
    String AmazonHomepageHeader_ProductCatagory_BestSellers=".//div[@id='nav-main']//a[text()='Best sellers']";
    String AmazonHomepageHeader_ProductCatagory_Mobiles=".//div[@id='nav-main']//a[text()='Mobiles']";
    String AmazonHomepageHeader_ProductCatagory_TodaysDeals=".//div[@id='nav-xshop']//a[@href='/gp/goldbox?ref_=nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84']";
    String AmazonHomepageHeader_ProductCatagory_Fashion=" .//div[@id='nav-xshop']//a[text()='Fashion']";
    String AmazonHomepageHeader_ProductCatagory_NewReleases=" .//div[@id='nav-xshop']//a[text()='New Releases']";
    String AmazonHomepageHeader_ProductCatagory_Prime=" .//div[@id='nav-xshop']//a[@id='nav-link-prime']";
    String AmazonHomepageHeader_ProductCatagory_Electronics=" .//div[@id='nav-xshop']//a[text()=' Electronics ']";
    String AmazonHomepageHeader_ProductCatagory_CustomerService=".//div[@id='nav-xshop']//a[text()='Customer Service']";
    String AmazonHomepageHeader_ProductCatagory_AmazonPay=".//div[@id='nav-xshop']//a[text()='Amazon Pay']";
    String AmazonHomepageHeader_ProductCatagory_HomeAndKitchen=".//div[@id='nav-xshop']//a[text()='Home & Kitchen']";
    String AmazonHomepageHeader_ProductCatagory_Computers=".//div[@id='nav-xshop']//a[text()='Computers']";
    String AmazonHomepageHeader_ProductCatagory_Books=".//div[@id='nav-xshop']//a[text()='Books']";
    String AmazonHomepageHeader_ProductCatagory_ToysAndGames=".//div[@id='nav-xshop']//a[text()='Toys & Games']";






}
