package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginShouldFailTest {

    //A bongeszo iranyitasa es elemek megtalalasa
    WebDriver driver;

    //Az osztaly elinditasa elott futattja le a fuggvenyben szereplo kodot
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    @AfterClass
    public void tearDown(){
        driver.quit();  //Az osszes ablakot bezarja
//        driver.close  (); //csak az aktualis ablakot zarja be
    }

    //Test fuggveny:
    @Test
    public void testLoggingIntoApplication() throws  InterruptedException{
        Thread.sleep(2000);
/*
*          Lepesek:
*                   1. A web element megtalalasa
*                   2. Cselekedet vegrehajtasa
*
            By class --> element megtalalasahoz hasznalhato class
            8 db locator-t hasznalunk seleniumban (pl. id, classname, name)
*
* */

//        2 modszer
        //Ez egy olyan element-et fog visszadobni aminek username name-je van
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin"); //infot kuld az elementnek

        //var = java keyword
        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000);
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";

        System.out.println(actualResult);
        Assert.assertNotEquals(actualResult, expectedResult);
    }
}
