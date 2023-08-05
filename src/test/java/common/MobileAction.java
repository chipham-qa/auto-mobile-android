package common;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MobileAction
{
    AndroidDriver<AndroidElement> driver;
    public static final long WAIT = 20;

    public MobileAction(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    public void waitForVisibility(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public void click(AndroidElement element)
    {
        waitForVisibility(element);
        element.click();
    }

    public void setText(AndroidElement element, String text) {
        waitForVisibility(element);
        element.sendKeys(text);
    }
}
