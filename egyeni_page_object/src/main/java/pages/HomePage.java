package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public By btn = By.id("menu-toggle");
    public By logoutBtn = By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[5]/a");

    public void clickBtn(By btn){
        find(btn).click();
    }
}
