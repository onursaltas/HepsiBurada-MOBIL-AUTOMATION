package Tests;

import TestPages.TestLoginPage;
import org.junit.Test;
import pages.LoginPage;

public class MainTest extends InitialTest{

@Test
    public void LoginHepsiBurada_Case_1(){
    TestLoginPage.Profil();
    TestLoginPage.DoAccess();
    TestLoginPage.SendtxtEmail("Eposta@gmail.com");
    TestLoginPage.SendtxtPassword("password");
    TestLoginPage.LoginButton();
    TestLoginPage.BtnCloseAlert();
}

}
