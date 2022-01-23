package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class GlobalUtility
{


   public static void loadURL(String url,WebDriver driver)
   {
       System.out.println("URL "+url);
       driver.get(url);
   }



    public static void takesScreenshot(WebDriver driver,String filePath)
    {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs((OutputType.FILE));

            FileUtils.copyFile(source, new File(filePath));
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void printActualExpectedValues(Object expected,Object actual)
    {
        System.out.println("Value Comparison: ");
        System.out.print("Actual: "+actual);
        System.out.println(" ,Expected: "+expected);
    }

}
