package TestPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import Locators.Locator;

public class TestLoginPage extends LoginPage {

    private AppiumDriver driver;
    private WebDriverWait wait;

    public TestLoginPage(AppiumDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public static void  Profil(){
        btnProfil.click();
    }
    public static void  DoAccess(){
        btnDoAccess.click();
    }

    public static void  SendtxtEmail(String email){
        txtEmail.sendKeys(email);

    }

    public  static void  SendtxtPassword(String password){
        txtPassword.sendKeys(password);

    }

    public static void  BtnCloseAlert(){
        btnCloseAlert.click();
    }

    public static void  BtnCloseButton(){
        btnCloseButton.click();
    }

    public static void  btnConfirmAlert(){
        btnConfirmAlert.click();
    }

    public static void  LoginButton(){
        loginButton.click();
    }
}
