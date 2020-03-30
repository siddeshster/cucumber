package ccmbr;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class StepDefinition {

    WebDriver driver;

    LoginPage loginPage;

    @Given("^User Launch Browser$")
    public void user_Launch_Browser() throws Exception {
        System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("^User Opens URL$")
    public void user_Opens_URL() throws Exception {
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;
    }

    @When("^user enters EmailID as (.*) and Password as (.*)$")
    public void user_enters_EmailID_as_and_Password_as(String tab_email, String tab_password) throws Exception {
        loginPage = new LoginPage(driver);
        loginPage.setTxtEmail(tab_email);
        loginPage.setTxtPassword(tab_password);
    }

    @When("^user Clicks on Login$")
    public void user_Clicks_on_Login() throws Exception {
        loginPage.clickLogin();
    }

    @Then("^Page title should be  \"([^\"]*)\"$")
    public void page_title_should_be(String arg1) throws Exception {
        assertTrue(driver.getTitle().contains("My Account"));
    }

    @Then("^Click on Logout$")
    public void click_on_Logout() throws Exception {
        loginPage.clickLogout();
        driver.quit();
    }



}
