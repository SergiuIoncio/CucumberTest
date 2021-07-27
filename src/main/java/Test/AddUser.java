package Test;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class AddUser {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/app-root/app-home/div/div/div[2]/div[3]/div/form/div[1]/input")
    private WebElement usernameElement;
    @FindBy(xpath = "/html/body/app-root/app-home/div/div/div[2]/div[3]/div/form/div[2]/input")
    private WebElement passwordElement;
    @FindBy(tagName = "button")
    private WebElement loginButtonElement;
    @FindBy(xpath = "/html/body/app-root/app-users/app-header/mat-toolbar/button[2]/span[1]/span")
    private WebElement AddUserElement;
    @FindBy(id = "mat-input-0")
    private WebElement UsernameAddElement;
    @FindBy(id = "mat-input-1")
    private WebElement EmailElement;
    @FindBy(id = "mat-input-2")
    private WebElement FullNameElement;
    @FindBy(id = "mat-input-3")
    private WebElement PasswordAddElement;
    @FindBy(xpath = "/html/body/app-root/app-addmodal/div/div/form/div/mat-checkbox[1]/label/span[2]")
    private WebElement FocusedElement;
    @FindBy(xpath = "/html/body/app-root/app-addmodal/div/div/form/div/mat-checkbox[2]/label/span[1]")
    private WebElement CarringElement;
    @FindBy(xpath = "/html/body/app-root/app-addmodal/div/div/form/div/mat-checkbox[3]/label/span[1]")
    private WebElement PerfectionistElement;
    @FindBy(xpath = "html/body/app-root/app-addmodal/div/div/form/div/mat-checkbox[4]/label/span[2]")
    private WebElement CourageousElement;
    @FindBy(xpath = "/html/body/app-root/app-addmodal/div/div/form/mat-radio-group/mat-radio-button[1]/label/span[1]/span[1]")
    private WebElement MaleElement;
    @FindBy(xpath = "/html/body/app-root/app-addmodal/div/div/form/mat-radio-group/mat-radio-button[2]/label/span[1]/span[1]")
    private WebElement FemaleElement;
    @FindBy(xpath = "/html/body/app-root/app-addmodal/div/div/form/mat-radio-group/mat-radio-button[3]/label/span[1]/span[1]")
    private WebElement AppacheElement;
    @FindBy(xpath = "/html/body/app-root/app-addmodal/div/div/form/button/span[1]")
    private WebElement SubmitElement;
    @FindBy(xpath = "//span[contains(.,'Sergiu')]")
    private WebElement Username1;

    public AddUser (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
