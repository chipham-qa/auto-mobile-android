package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import common.MobileAction;
import org.openqa.selenium.By;

import java.util.List;

public class LoginPage
{
    AndroidDriver<AndroidElement> driver;
    MobileAction mobileAction;
    public LoginPage(AndroidDriver<AndroidElement> driver)
    {
        this.driver = driver;
        this.mobileAction = new MobileAction(driver);
    }

    /* --- Locators --- */
    private final By txtUsername = By.xpath("//android.widget.EditText[@text='Enter your email']");
    private final By txtPassword = By.xpath("//android.widget.EditText[@text='Enter your password']");
    private final By btnLogin = By.xpath("//android.widget.Button/android.widget.TextView[@text='Login']");
    private final By lstElement =  By.xpath("//android.widget.TextView");


    public List<AndroidElement> getElementsLoginByText() {
        List<AndroidElement> elements = driver.findElements(lstElement);
        return elements;
    }

    public AndroidElement txtUsername() {
        return driver.findElement(txtUsername);
    }

    public AndroidElement txtPassword() {
        return driver.findElement(txtPassword);
    }

    public AndroidElement btnLogin() {
        return driver.findElement(btnLogin);
    }

    /* --- Actions --- */
    public void waitLoginPageLoadSuccess() {
        mobileAction.waitForVisibility(btnLogin());
    }
    public void setTextUsername(String value) {
        mobileAction.setText(txtUsername(), value);
    }

    public void setTextPassword(String value) {
        mobileAction.setText(txtPassword(), value);
    }

    public void clickLogin() {
        mobileAction.click(btnLogin());
    }

    /* --- Verify --- */
    public boolean checkPageShouldContains(String _text)
    {
        boolean status = false;
        List<AndroidElement> elements = getElementsLoginByText();

        for (AndroidElement element : elements)
        {
            String text = element.getText();
            if(text.contentEquals(_text))
            {
                status = true;
                break;
            }
        }
        return status;
    }
}
