package test.java;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import main.java.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class BasePageSetup {

    public static WebDriver driver;
    public ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger ;

    @BeforeTest
    public void BeforeTestMethod() {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("\\user.dir\\") + File. separator + "Reports" + File.separator + " AutomationReport.html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Automation Test Results Report");
        htmlReporter.config().setTheme(Theme.DARK);
        extent =new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo(" Automation Test Analyst" ,"Gouri Sankar" );
    }


    @BeforeMethod
    @Parameters({"browserName"})
    public void BeforeMethod (String browserName, Method testMethod) {
        System.out.println("*****************"+browserName);
        SetUpBrowser(browserName);
        logger= extent.createTest(testMethod.getName());
        driver.manage().window().maximize();
        driver.get(Constants.url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }


    @AfterMethod
    public void AfterMethod(ITestResult result) {
        if(result.getStatus() == ITestResult.SUCCESS) {
            String methodName = result.getMethod().getMethodName();
            String logText = "Test Case : " + methodName + "Passed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            logger.log(Status.PASS, m);
        }
        else  if(result.getStatus() == ITestResult.FAILURE) {
            String methodName = result.getMethod().getMethodName();
            String logText = "Test Case : " + methodName + "Failed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
            logger.log(Status.FAIL, m);
        }
        else  if(result.getStatus() == ITestResult.SKIP) {
            String methodName = result.getMethod().getMethodName();
            String logText = "Test Case : " + methodName + "Skipped";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
            logger.log(Status.SKIP, m);

        }
         driver.quit();

    }


   // @AfterTest
   // public void AfterTestMethod() {

   //     extent.flush();
   // }

    public void SetUpBrowser (String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
          //  options.setExperimentalOption("ExcludeSwitches", new String []{"enable-automation"});
            driver = new ChromeDriver();
            Reporter.log("Chrome Launched", true);

        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("Webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "firefoxdriver");
            driver = new FirefoxDriver();
            Reporter.log("firefox Launched", true);
        } else {

            System.setProperty("webdriver.edge.driver", System.getProperty("\\user.dir\\") + File.separator + "drivers" + File.separator + "edgedriver");
            driver = new EdgeDriver();
            Reporter.log("edge browser Launched", true);

        }
    }


}



