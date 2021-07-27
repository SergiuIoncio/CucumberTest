package Test;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter

public class LoginPage {

    private WebDriver driver;
    private String baseUrl = "http://localhost:4200";
    @FindBy(xpath = "/html/body/app-root/app-home/div/div/div[2]/div[3]/div/form/div[1]/input")
    private WebElement usernameElement;
    @FindBy(xpath = "/html/body/app-root/app-home/div/div/div[2]/div[3]/div/form/div[2]/input")
    private WebElement passwordElement;
    @FindBy(tagName = "button")
    private WebElement loginButtonElement;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
