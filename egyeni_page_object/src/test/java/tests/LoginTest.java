package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMessage() throws InterruptedException {
        loginPage.setUsername("John Doe");
        loginPage.setPassword("ThisIsNotAPassword");
        loginPage.clickBtn();
        String actualMessage = "";

        try {
            loginPage.getErrorMessage();
        } catch (Exception e) {

        }

        System.out.println(actualMessage);
        String expected = "";

        goLogOut();
        Assert.assertEquals(actualMessage, expected);;
    }

    @Test
    public void goLogOut() throws InterruptedException {
        setHomePage();
        homePage.clickBtn(homePage.btn);
        Thread.sleep(2000);
        homePage.clickBtn(homePage.logoutBtn);
    }
}
