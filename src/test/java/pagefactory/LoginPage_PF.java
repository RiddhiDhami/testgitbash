package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
    @FindBy(id="user-name")
    WebElement txt_un;
    @FindBy(id="password")
    WebElement txt_ps;
    @FindBy(id="login-button")
    WebElement btn_login;
    WebDriver driver;
    public LoginPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public  void enterusername(String username){
        txt_un.sendKeys(username);
    }
    public void enterpassword(String password){
        txt_ps.sendKeys(password);
    }
    public void clickLogin() {
        btn_login.click();
    }

}
