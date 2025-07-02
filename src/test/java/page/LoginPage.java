package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By txt_un= By.id("user-name");
    private By txt_ps=By.id("password");
    private By btn_login=By.id("login-button");

    public LoginPage(WebDriver d){
        this.driver=d;
        if (!driver.getTitle().equals("Swag Labs")) {
            throw new IllegalStateException("This is not the login page. Current page: " + d.getCurrentUrl());
        }

    }
    public  void enterusername(String username){
        driver.findElement(txt_un).sendKeys(username);
    }
    public void enterpassword(String password){
        driver.findElement(txt_ps).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }
    
    public void loginValidUser(String username,String password){
        driver.findElement(txt_un).sendKeys(username);
        driver.findElement(txt_ps).sendKeys(password);
        driver.findElement(btn_login).click();
    }
}
