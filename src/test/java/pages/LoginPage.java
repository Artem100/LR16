package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ListenerSelenium;

public class LoginPage {

    public WebDriver driver;

    public static ListenerSelenium event1;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void listenerForLogin(WebDriver driver){
        ListenerSelenium event1= new  ListenerSelenium (driver);
    }

    @FindBy(id = "login-form-username")
    private WebElement elLoginField;

    @FindBy(id = "login-form-password")
    private WebElement elPasswordField;

    @FindBy(id = "login-form-submit")
    private WebElement elButtonLogin;

    public void loginField(String login){ elLoginField.sendKeys(login); }

    public void passwordField(String password){ elPasswordField.sendKeys(password);}

    public void loginButton(){ event1.afterClickOn(elButtonLogin);}
}
