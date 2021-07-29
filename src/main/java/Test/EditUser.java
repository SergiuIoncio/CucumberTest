package Test;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class EditUser {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/app-root/app-home/div/div/div[2]/div[3]/div/form/div[1]/input")
    private WebElement usernameElement;
    @FindBy(xpath = "/html/body/app-root/app-home/div/div/div[2]/div[3]/div/form/div[2]/input")
    private WebElement passwordElement;
    @FindBy(tagName = "button")
    private WebElement loginButtonElement;
    @FindBy(xpath = "/html/body/app-root/app-users/app-header/mat-toolbar/button[2]/span[1]/span")
    private WebElement AddUserElement;
    @FindBy(id ="mat-input-0")
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
    @FindBy(xpath = "/html/body/app-root/app-users/app-user-card[1]/div/div[7]/button[1]")
    private WebElement EditButtonElement;
    @FindBy(xpath = "/html/body/app-root/app-editmodal/div/div/form/button")
    private WebElement SubmitEditElement;
    @FindBy(xpath = "/html/body/app-root/app-editmodal/div/div/form/div/mat-checkbox[1]/label/span[1]")
    private WebElement EditFocusedElement;
    @FindBy(xpath = "/html/body/app-root/app-editmodal/div/div/form/div/mat-checkbox[2]/label/span[1]")
    private WebElement EditCarringElement;
    @FindBy(xpath = "/html/body/app-root/app-editmodal/div/div/form/div/mat-checkbox[3]/label/span[1]")
    private WebElement EditPerfectionistElement;
    @FindBy(xpath = "/html/body/app-root/app-editmodal/div/div/form/div/mat-checkbox[4]/label/span[1]")
    private WebElement EditCourageousElement;
    @FindBy(xpath = "/html/body/app-root/app-editmodal/div/div/form/mat-radio-group/mat-radio-button[1]/label/span[1]/span[1]")
    private  WebElement EditMaleElement;
    @FindBy(xpath = "/html/body/app-root/app-editmodal/div/div/form/mat-radio-group/mat-radio-button[2]/label/span[1]/span[2]")
    private WebElement EditFemaleElement;
    @FindBy(xpath = "/html/body/app-root/app-editmodal/div/div/form/mat-radio-group/mat-radio-button[3]/label/span[1]/span[2]")
    private WebElement EditApacheElement;
    @FindBy(xpath = "//div[@class='lilCel'][contains(.,'Username: Andreis')]")
    private WebElement InsertedUsernameElement;



    public EditUser (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void ClearBoxes() {
        EditUser editUser = new EditUser(driver);
        editUser.getUsernameAddElement().clear();
        editUser.getEmailElement().clear();
        editUser.getFullNameElement().clear();
        editUser.getPasswordAddElement().clear();
        PageFactory.initElements(driver,this);
    }
    public void setUsernameAddElement(String username){
        UsernameAddElement.sendKeys(username);
    }
}

