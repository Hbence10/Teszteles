package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage; //Object reference
    protected LoginPage loginPage; //az osszes testscriptnek lesz hozzaferese
    protected HomePage homePage;
    private String url = "https://katalon-demo-cura.herokuapp.com/profile.php#login";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver(); //tovabbi hasznalhato bongeszok: Edge, Firefox, Safari
        driver.manage().window().maximize();
        driver.get(url); //elvezet a kivant oldalra
        basePage = new BasePage();
        loginPage = new LoginPage();
        basePage.setDriver(driver);
    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    public void setHomePage(){
        this.homePage = new HomePage();
    }
}
