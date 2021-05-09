package pages;

import Locators.Locator;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class LoginPage extends Locator {

    private AppiumDriver driver;
    private WebDriverWait wait;

    @iOSXCUITFindBy(id = "UsernameTextField")
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/llUserAccountLogin")
    protected static MobileElement  btnDoAccess;

    @iOSXCUITFindBy(id = "---")
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/account_icon_frame")
    protected static MobileElement btnProfil;

    @iOSXCUITFindBy(id = "---")
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/etLoginEmail")
    protected static MobileElement  txtEmail;

    @iOSXCUITFindBy(id = "---")
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/etLoginPassword")
    protected static MobileElement  txtPassword;

    @iOSXCUITFindBy(id = "---")
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/btnLoginLogin")
    protected static MobileElement  loginButton;

    @iOSXCUITFindBy(id = "---")
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/buttonSecondaryAction")
    protected static MobileElement  btnCloseAlert;

    @iOSXCUITFindBy(id = "---")
    @AndroidFindBy(id = "android:id/button1")
    protected static MobileElement  btnConfirmAlert;

    @iOSXCUITFindBy(id = "---")
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/btnUserAccountClose")
    protected static MobileElement  btnCloseButton;

    public LoginPage(AppiumDriver driver, WebDriverWait wait) {
       super(driver,wait);
    }










}
