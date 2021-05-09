package Tests;

import Appium.AppiumController;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class InitialTest extends AppiumController {

    @BeforeClass
    @Parameters({"gigafoxUrl", "gigafoxUser", "gigafoxKey", "iosBundleId", "androidBundleId", "deviceId", "deviceOs"})
    public void setUp(String gigafoxUrl, String gigafoxUser, String gigafoxKey, String iosBundleId, String androidBundleId, String deviceId, String deviceOs) throws Exception {

        platform = OperatingSystem.valueOf(deviceOs.toUpperCase());
        server = gigafoxUrl;
        username = gigafoxUser;
        apiToken = gigafoxKey;

        if(platform.equals(OperatingSystem.ANDROID)){
            udid = deviceId;
            bundleID = androidBundleId;
            automationName = "UiAutomator2";
        }
        else if (platform.equals(OperatingSystem.IOS)) {
            udid = deviceId;
            bundleID = iosBundleId;
            automationName = "XCUITest";
        }

        startAppium();

    }

    @AfterClass
    public void tearDown() throws Exception {

        stopAppium();
    }



}
