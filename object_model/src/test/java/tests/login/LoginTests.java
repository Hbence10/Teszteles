package tests.login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

//    Direkt rossz bejelentkezes tesztelese
    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyz3400");
        loginPage.clickButton();
        String actualMessage = loginPage.getErrorMessage();
        String expected = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualMessage, expected);
//        Assert.assertTrue(actualMessage.contains("Epic sadface"));

        System.out.println(actualMessage);
    }
}
