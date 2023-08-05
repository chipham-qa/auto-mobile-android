package pageObjects;

import io.appium.java_client.android.AndroidDriver;
public class PageObjectManager
{
    public AndroidDriver driver;
    private LoginPage loginPage;
    // Declare the remaining page below

    public PageObjectManager(AndroidDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }
}
