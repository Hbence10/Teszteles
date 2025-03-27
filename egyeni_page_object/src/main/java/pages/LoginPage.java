package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By usernameField = By.id("txt-username");
    private By passwordField = By.id("txt-password");
    private By loginButton = By.id("btn-login");
    private By errorMsg = By.cssSelector("p.text-danger");

    public void setUsername(String value){
        set(usernameField, value);
    }

    public void setPassword(String value){
        set(passwordField, value);
    }

    public String getErrorMessage(){
        return find(errorMsg).getText();
    }

    public void clickBtn(){
        find(loginButton).click();
    }
}
