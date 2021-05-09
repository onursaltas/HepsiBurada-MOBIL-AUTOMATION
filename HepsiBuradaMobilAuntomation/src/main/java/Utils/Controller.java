package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Controller {

    private AppiumDriver driver;
    private WebDriverWait wait;


    public Controller(AppiumDriver driver, WebDriverWait wait) {
        this.driver=driver;
        this.wait=wait;
    }

    public String getPlatform(){
        return driver.getCapabilities().getCapability("platform").toString().toUpperCase();
    }

    public void hideKeyboard() {
        try{
            if (getPlatform().equals("IOS")) {
                MobileElement keyboardDone = (MobileElement) driver.findElement(By.xpath("//*[@name='Done']"));
                keyboardDone.click();
            }
            else if (getPlatform().toUpperCase().equals("ANDROID")) {
                driver.hideKeyboard();
            }
        }
        catch (Exception ex){
            //do nothing
        }
    }
}
