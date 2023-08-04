package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class PageObjectManager
{
    public AndroidDriver<AndroidElement> driver;
    private LoginPage loginPage;
    // Declare the remaining page below

    public PageObjectManager(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }
}
