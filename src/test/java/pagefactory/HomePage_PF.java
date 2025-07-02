package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
    @FindBy(className="title")
    WebElement product;
    WebDriver driver;
    public HomePage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void productDisplayed(){
        product.isDisplayed();
    }
}
