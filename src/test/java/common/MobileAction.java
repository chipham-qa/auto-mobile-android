package common;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class MobileAction
{
    AndroidDriver<AndroidElement> driver;
    private File classPath, imageDir, img;
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

    public void selectValue(AndroidElement element, String text)
    {
        waitForVisibility(element);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public AndroidElement scrollToAnElementByTextContain(String text) {
        return driver.findElementByAndroidUIAutomator("new UiScrollable("
                + "new UiSelector().scrollable(true)).scrollIntoView("
                + "new UiSelector().textContains(\"" + text + "\"));");
    }

    //Tap by coordinates
    public void tapByCoordinates ( int x,  int y)
    {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(point(x,y))
                .waitAction(waitOptions(ofMillis(250))).perform();
    }

    public void uploadPhoto(String fileName) throws IOException, IOException {

        classPath = new File(System.getProperty("user.dir"));
        imageDir = new File(classPath, "/resources/images");
        img = new File(imageDir.getCanonicalFile(), "test.jpg");

        String androidImagePath = "/sdcard/Download/" + fileName;

        driver.pushFile(androidImagePath + "/" + img.getName(), img);
    }
}
