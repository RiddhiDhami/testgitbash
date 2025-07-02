package steps;

/*
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginDemosteps_POM {
    WebDriver d= null;
    LoginPage login;
    @Given("^browser is open$")
    public void browserIsOpen() {
        System.out.println("=== I am inside browser_is_open===");
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        d.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        d.manage().window().maximize();
    }

    @And("^User is on login page$")
    public void userIsOnLoginPage() {
        d.navigate().to("https://www.saucedemo.com/");
    }

    @When("^User enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username,String password){
        login=new LoginPage(d);
        login.enterusername(username);
        login.enterpassword(password);

    }

    @And("^User clicks on login$")
    public void userClicksOnLogin() {
        login.clickLogin();
    }

    @Then("^User is navigated to the home page$")
    public void userIsNavigatedToTheHomePage() throws InterruptedException {
        Thread.sleep(2000);
        d.close();
    }
}
*/
