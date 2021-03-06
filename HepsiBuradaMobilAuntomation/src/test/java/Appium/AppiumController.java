package Appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppiumController {
    protected AppiumDriver driver;
    protected WebDriverWait wait;
    private DesiredCapabilities capabilities;

    //deviceConnect Information
    public static String server;
    public static String username;
    public static String apiToken;

    //Device Lists
    public static List<Object[]> deviceList;

    //Per Test Capabilities
    public OperatingSystem platform;
    public String udid;
    public String automationName;
    public String bundleID;

    public enum OperatingSystem {
        ANDROID,
        IOS
    }

    public void startAppium() throws Exception {
        switch (platform){
            case IOS:
                capabilities = new DesiredCapabilities();
                capabilities.setCapability("gigafox:username", username);
                capabilities.setCapability("gigafox:apiKey", apiToken);
                capabilities.setCapability("udid", udid);
                capabilities.setCapability("platformName", platform.toString());
                capabilities.setCapability("bundleID", bundleID);
                capabilities.setCapability("automationName", automationName);
                driver = new IOSDriver<MobileElement>(new URL(server), capabilities);
                break;

            case ANDROID:
                capabilities = new DesiredCapabilities();
                capabilities.setCapability("gigafox:username", username);
                capabilities.setCapability("gigafox:apiKey", apiToken);
                capabilities.setCapability("udid", udid);
                capabilities.setCapability("platformName", platform.toString());
                capabilities.setCapability("bundleID", bundleID);
                capabilities.setCapability("automationName", automationName);

                driver = new AndroidDriver<MobileElement>(new URL(server), capabilities);
                break;
        }

        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void stopAppium() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }

}
