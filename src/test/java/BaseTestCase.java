import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.GlobalUtility;

import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTestCase
{
    public WebDriver driver;
    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest logger;


    @BeforeTest
    void setReports()
    {
        String fileName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

         htmlReporter = new ExtentHtmlReporter("reports/AutomationReport"+fileName+".html");
         htmlReporter.config().setEncoding("utf-8");
         htmlReporter.config().setDocumentTitle("Automation Report");
         htmlReporter.config().setReportName("Automation Test Results");
         htmlReporter.config().setTheme(Theme.DARK);

         extent = new ExtentReports();
         extent.attachReporter(htmlReporter);
         extent.setSystemInfo("Tester","Rish");


    }


    @BeforeMethod
    @Parameters({"browserName"})
    void setDriver(@Optional("chrome")String browserName, Method testMethod) {

       logger = extent.createTest(testMethod.getName());

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
            System.out.println("Chrome Browser Selected");
            driver = new ChromeDriver();
        }
        else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/drivers/geckodriver");
            System.out.println("FireFox Browser Selected");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
    }


    @AfterMethod
    void afterMethod(ITestResult testResult)
    {
        if(testResult.getStatus()==ITestResult.SUCCESS)
        {
            String methodName= testResult.getMethod().getMethodName();
            String logText = "Test Case: "+ methodName + " Passed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            logger.log(Status.PASS,m);
        }
        else if(testResult.getStatus()==ITestResult.FAILURE)
        {
            String methodName= testResult.getMethod().getMethodName();
            String logText = "Test Case: "+ methodName + " Failed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
            logger.log(Status.FAIL,m);

            //Taking Screenshot of error
            GlobalUtility gUtility = new GlobalUtility();
            gUtility.takesScreenshot(driver,"screenshots"+ File.separator+"Error.png");

        }

        driver.quit();
    }


    @AfterTest
    void afterTest()
    {
    extent.flush();
    }

}
