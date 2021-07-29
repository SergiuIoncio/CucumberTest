package Test.step.StepDefinitions;
import Test.AddUser;
import Test.DeleteUser;
import Test.EditUser;
import Test.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AppTestSteps {

    String baseUrl = "http://localhost:4200/";
    WebDriver driver;
    @Given("Insert the username, password and Login page")
    public void TestLoginPage(){

        LoginPage loginPage;
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        loginPage = new LoginPage(driver);
        loginPage.getUsernameElement().sendKeys("sfaq");
        loginPage.getPasswordElement().sendKeys("ss11s");
        loginPage.getLoginButtonElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-header/mat-toolbar")).isDisplayed());

    }
    @And("^Add new user with (.+)$")
    public void TestAddNewUser(String nameFull){

        AddUser addUser = new AddUser(driver);
        addUser.getAddUserElement().click();
        addUser.getUsernameAddElement().sendKeys("sfsdf1");

        addUser.getEmailElement().sendKeys("ssergssaasiu@scsx.com");
        addUser.getFullNameElement().sendKeys(nameFull);
        addUser.getPasswordAddElement().sendKeys("ssss22345ff");
        addUser.getFocusedElement().click();
        addUser.getCarringElement().click();
        addUser.getPerfectionistElement().click();
        addUser.getCourageousElement().click();
        addUser.getMaleElement().click();
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        Assert.assertEquals(driver.getPageSource().contains("Andrei Ion"),true);
    }
    @And("Edit one user with username")
    public void TestEditUsers(){
        EditUser editUser = new EditUser(driver);
        driver.navigate().refresh();
        if(driver.findElement(By.xpath("//h1[contains(.,'Alexandruss')]")).getText().toString().contains("Rikesh Singleton")) {
            editUser.getEditButtonElement().sendKeys(Keys.ENTER);
            editUser.ClearBoxes();
            try {
                Thread.sleep(3000
                );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            editUser.getUsernameAddElement().sendKeys("sfsdc xvxessswwd");
            editUser.getEmailElement().sendKeys("Ioonelsso@yahoosss.com");
            editUser.getFullNameElement().sendKeys("Alexandruss1");
            editUser.getPasswordAddElement().sendKeys("Aana111111d11111222222reiu111");
            editUser.getSubmitEditElement().click();
            Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(.,'Alexandruss')]")).getText().toString().contains("Alexandruss1"));
        }
    }
    @And("Delete one user")
    public void TestDeleteUser(){
        driver.navigate().refresh();
        DeleteUser deleteUser = new DeleteUser(driver);
        deleteUser.getDeleteButton().click();
        deleteUser.getYesButtonElement().click();
        Assert.assertTrue(driver.findElement(By.className("mat-button-wrapper")).isEnabled());

    }
    @Then("Back to home page")
    public void TestBackPage(){
        driver.navigate().refresh();
        DeleteUser deleteUser = new DeleteUser(driver);
        deleteUser.getBackElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/div[2]")).isDisplayed());
        driver.close();
    }

}
