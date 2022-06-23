package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Base class for setup and common logic for all pages.
 */

    public class BaseClass {
    public WebDriver driver;
    public Actions actions;
    public JavascriptExecutor executor;


    public BaseClass(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.executor = (JavascriptExecutor) driver;
        PageFactory.initElements(driver,this);
    }


    public BaseClass() {

    }




}

