package test.java;

import main.java.pageEvents.AmazonHomePageEvents;
import org.testng.annotations.Test;

public class AmazonHomePageRefresh extends BasePageSetup {

    @Test
    public void AmazonWebPageRefresh () {

        AmazonHomePageEvents amazonHomePageEvents= new AmazonHomePageEvents();
        amazonHomePageEvents.ClickOnAmazonLogo();

    }
}
