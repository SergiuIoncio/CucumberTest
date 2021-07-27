package Test.step.StepDefinitions;

import Test.AddUser;
import Test.DeleteUser;
import Test.EditUser;
import Test.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginStep {

    String baseUrl = "http://localhost:4200/";
    WebDriver driver;
    @Given("Login page")
    public void loginPage(){

        LoginPage loginPage;
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        loginPage = new LoginPage(driver);
        loginPage.getUsernameElement().sendKeys("sfaq");
        loginPage.getPasswordElement().sendKeys("ss11s");
        loginPage.getLoginButtonElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-header/mat-toolbar")).isDisplayed());

    }
    @Then("Add new user")
    public void addNewUser(){

        AddUser addUser = new AddUser(driver);
        addUser.getAddUserElement().click();
        addUser.getUsernameAddElement().sendKeys("Sergiuss");
        addUser.getEmailElement().sendKeys("ssergssaasiu@scsx.com");
        addUser.getFullNameElement().sendKeys("Serrqqsfsdd");
        addUser.getPasswordAddElement().sendKeys("ssqqsqs12s34");
        addUser.getFocusedElement().click();
        addUser.getCarringElement().click();
        addUser.getPerfectionistElement().click();
        addUser.getCourageousElement().click();
        addUser.getMaleElement().click();
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        //boolean isInserted = addUser.getUsername1().isDisplayed();
        //Assert.assertTrue(isInserted);
        //Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[6]/div/div[1]/a/h1")).isDisplayed());
        Assert.assertEquals(driver.getPageSource().contains("Sergius"),true);
    }
    @Then("Edit User")
    public void editUsers(){
        EditUser editUser = new EditUser(driver);
        driver.navigate().refresh();
        editUser.getEditButtonElement().sendKeys(Keys.ENTER);
        editUser.getUsernameAddElement().clear();
        editUser.getUsernameAddElement().sendKeys("Alexandru");
        editUser.getEmailElement().clear();
        editUser.getEmailElement().sendKeys("Ioonelsso@yahoo.com");
        editUser.getFullNameElement().clear();
        editUser.getFullNameElement().sendKeys("AurVIoreluss Idssddovvvncssio");
        editUser.getPasswordAddElement().clear();
        editUser.getPasswordAddElement().sendKeys("Aana111111d222222reiu111");
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='lilCel'][contains(.,'Username: Alexandru')]")).getText().toString().contains("Alexandru"));
        //Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]/div/div[1]/a/h1")).isDisplayed());
        //Assert.assertEquals("Andreis", editUser.getInsertedUsernameElement().getText());

    }
    @Then("Delete User")
    public void deleteUser(){
        driver.navigate().refresh();
        DeleteUser deleteUser = new DeleteUser(driver);
        deleteUser.getDeleteButton().click();
        deleteUser.getYesButtonElement().click();
        Assert.assertTrue(driver.findElement(By.className("mat-button-wrapper")).isEnabled());

    }

    @Given("Back page")
    public void backPage(){
        driver.navigate().refresh();
        DeleteUser deleteUser = new DeleteUser(driver);
        deleteUser.getBackElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/div[2]")).isDisplayed());
        driver.close();
    }

}
