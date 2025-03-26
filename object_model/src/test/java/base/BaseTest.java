package base;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage; //Object reference
    protected LoginPage loginPage; //az osszes testscriptnek lesz hozzaferese
    private String url = "https://www.saucedemo.com";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver(); //tovabbi hasznalhato bongeszok: Edge, Firefox, Safari
        driver.manage().window().maximize();
        driver.get(url); //elvezet a kivant oldalra
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
