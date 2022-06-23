package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpModal extends BaseClass{
    public SignUpModal(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='nav-link-login']")
    WebElement logInButton;

    @FindBy (xpath = "//button[@id='sign-in-button']")
    WebElement signUpButton;

    @FindBy (xpath ="//input[@placeholder='Username']")
    WebElement usernameField;

    @FindBy (xpath="//input[@placeholder='email']")
    WebElement emailField;

    @FindBy (xpath = "//input[@id='defaultRegisterFormPassword']")
    WebElement passwordField;

    @FindBy (xpath = "//input[@id='defaultRegisterPhonePassword']")
    WebElement confirmPasswordField;

    public SignUpModal() {

    }

    public void inputUsername(){
        usernameField.clear();
        usernameField.sendKeys("carpan1@abv.bg");
    }

    public void inputEmail(){
        emailField.clear();
        emailField.sendKeys("martina.daskalova@mentormate.com");
    }

    public void inputPassword(){
      passwordField.clear();
      passwordField.sendKeys("testTEST1!");
      confirmPasswordField.clear();
      confirmPasswordField.sendKeys("testTEST1!");
    }

    public void inputConfirmPasswordField(){
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys("testTEST1!");
    }

    public void clickSignUp(){
        signUpButton.click();
    }

    public void signUp(){
        inputUsername();
        inputEmail();
        inputPassword();
        inputConfirmPasswordField();
        clickSignUp();
    }
}
