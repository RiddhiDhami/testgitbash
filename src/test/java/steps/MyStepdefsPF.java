package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

import java.util.concurrent.TimeUnit;

public class MyStepdefsPF {
    WebDriver d= null;
    LoginPage_PF login;
    HomePage_PF home;
    @Given("^browser is open$")
    public void browser_is_open() {
        System.out.println("=== I am inside browser_is_open==in= gitbash");
        System.out.println("Inside step - browser is open");
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        d.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        d.manage().window().maximize();
    }

    @And("^User is on login page$")
    public void user_is_on_login_page() {
        d.navigate().to("https://www.saucedemo.com/");
    }

    @When("^User enters (.*) and (.*)$")
    public void user_enters_standard_user_and_secret_sauce(String username,String password){
        login=new LoginPage_PF(d);
        login.enterusername(username);
        login.enterpassword(password);
    }

    @And("^User clicks on login$")
    public void user_clicks_on_login() {
        login.clickLogin();
    }


    @Then("^User is navigated to the home page$")
    public void user_is_navigated_to_the_home_page()throws InterruptedException {
        home=new HomePage_PF(d);
        home.productDisplayed();

        Thread.sleep(2000);
        d.close();
    }





}
