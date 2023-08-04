package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import helpers.MobileAction;
import org.openqa.selenium.By;
public class LoginPage
{
    AndroidDriver<AndroidElement> driver;
    MobileAction mobileAction;
    public LoginPage(AndroidDriver<AndroidElement> driver)
    {
        this.driver = driver;
        this.mobileAction = new MobileAction(driver);
    }

}
