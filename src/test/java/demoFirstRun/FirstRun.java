package demoFirstRun;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class FirstRun
{
    AndroidDriver<AndroidElement> driver;
    @Test
    public void setup()
    {
        try {
            String userDirectory = System.getProperty("user.dir");

            String pathConfigFile = userDirectory + "\\src\\main\\resources\\env-demo.properties";
            FileInputStream file = new FileInputStream(pathConfigFile);
            Properties prop = new Properties();
            prop.load(file);
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", (String) prop.get("emulatorDevice"));
            capabilities.setCapability("platformName", (String) prop.get("platformName"));
            capabilities.setCapability("platformVersion", (String) prop.get("platformVersion"));
            capabilities.setCapability("newCommandTimeout", 20000);
            //capabilities.setCapability("app", userDirectory + "\\src\\main\\resources\\app\\" + (String) prop.get("apkApp"));
            capabilities.setCapability("appPackage", (String) prop.get("appPackage"));
            capabilities.setCapability("appActivity", (String) prop.get("appActivity"));


            URL url = new URL((String) prop.get("emulatorDeviceURL"));

            driver = new AndroidDriver<AndroidElement>(url, capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
