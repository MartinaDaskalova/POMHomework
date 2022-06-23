package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Log in page set-up
 */
public class LogInModal extends BaseClass {

    public LogInModal(WebDriver driver) {
        super(driver);
    }

    public LogInModal() {

    }


    @FindBy (xpath = "//a[@id='nav-link-login']")
    WebElement logInButton;

    @FindBy (xpath = "//button[@id='sign-in-button']")
    WebElement signInButton;

    @FindBy (xpath ="//input[@id='defaultLoginFormUsername']")
    WebElement usernameField;

    @FindBy (xpath = "//input[@id='defaultLoginFormPassword']")
    WebElement passwordField;

    @FindBy (xpath = "//div[@aria-label='Successful login!']")
    WebElement loginSuccessfulPopup;

    @FindBy (xpath ="//a[@id='nav-link-profile']")
    WebElement profileButton;

    @FindBy (xpath = "//a[normalize-space()='Register']")
    WebElement registerButton;

    @FindBy (xpath = "//a[@id='nav-link-home']")
    WebElement homeButton;

    @FindBy (xpath = "//i[@class='fas fa-sign-out-alt fa-lg']")
    WebElement signoutButton;

    @FindBy (xpath = "//a[@id='nav-link-new-post']")
    WebElement newPostButton;

    public void LogIn(){
        usernameField.clear();
        usernameField.sendKeys("carpan1@abv.bg");
        passwordField.clear();
        passwordField.sendKeys("A931125z");
        signInButton.click();
}
    public boolean checkPopUp(){
        loginSuccessfulPopup.isDisplayed();
        return true;
    }

    public void setUsernameField(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void setPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void pressLogin(){
        signInButton.click();
    }

    public boolean myProfile(){
        profileButton.isDisplayed();
        return true;
    }

    public void pressHomeButton(){

        homeButton.click();
    }

    public void pressSignout(){

        signoutButton.click();
    }

    public boolean isSignoutButton(){
        signoutButton.isDisplayed();
        return true;
    }

    public void newPostButon(){
        newPostButton.click();
    }
    //TODO create small actions for password and username setup so they can be used separately

    //TODO create assertion methods to be called in the SmokeTests class

}
