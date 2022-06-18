package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BaseClass;

public class LogInModal extends BaseClass {

    public WebDriver driver;

    public LogInModal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @BeforeClass
    @Override
    public void setUpApplication() {
        super.setUpApplication();
    }

    @AfterClass
    @Override
    public void closeApplication() {
        super.closeApplication();
    }

    @FindBy (id = "//a[@id='nav-link-login']")
    WebDriver logInButton;

    @FindBy (id = "//button[@id='sign-in-button']")
    WebDriver signInButton;

    @FindBy (id ="//input[@id='defaultLoginFormUsername']")
    WebDriver usernameField;

    @FindBy (id = "//input[@id='defaultLoginFormPassword']")
    WebDriver passwordField;

    public void LogIn(){

        usernameField.sendKeys("carpan1@abv.bg");
//        driver.findElement((By) usernameField).clear();
//        driver.findElement((By) usernameField).sendKeys("carpan1@abv.bg");
//        driver.findElement((By) passwordField).clear();
//        driver.findElement((By) passwordField).sendKeys("");

}
}
