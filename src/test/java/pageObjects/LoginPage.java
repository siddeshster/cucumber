package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="input-email")
    WebElement txtEmail;

    @FindBy(id="input-password")
    WebElement txtPassword;

    @FindBy(className = "btn btn-primary")
    WebElement login;

    @FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
    WebElement logout;

    public void setTxtEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void setTxtPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void clickLogin(){
        login.click();
    }

    public void clickLogout(){
        logout.click();
    }
}
