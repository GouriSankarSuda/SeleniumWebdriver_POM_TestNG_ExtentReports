package test.java;

import main.java.pageEvents.AmazonHomePageEvents;
import main.java.pageEvents.ChooseYourLocationPageEvents;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HelloSelectYourAddressWithPinCode extends BasePageSetup {

    @Test(invocationCount = 5)
    public void SettingLocationWithPinCode() throws InterruptedException {
        AmazonHomePageEvents amazonHomePageEvents= new AmazonHomePageEvents();
        amazonHomePageEvents.ClickOnSelectYourLocationAndMoveToPopUpWindow();
        ChooseYourLocationPageEvents chooseYourLocationPageEvents = new ChooseYourLocationPageEvents();
        chooseYourLocationPageEvents.SetPinCode();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chooseYourLocationPageEvents.ClickApplyPinCode();



    }





}
