package pomscripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;
import utils.Screenshot;
import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    //TODO add surefire plugin and try to run with it

    LogInModal logInModal;
    SignUpModal signUpModal;
    UserPostModal userPostModal;
    AddPostModal addPostModal;

    @BeforeMethod
    public void setUpApplication() {

        Reporter.log("=====Browser Session Started=====", true);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        Reporter.log("=====Application Started=====", true);

         logInModal = new LogInModal(driver);
         signUpModal = new SignUpModal(driver);
         userPostModal = new UserPostModal(driver);
         addPostModal = new AddPostModal(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterMethod
    public void closeApplication(ITestResult result)
    {
        if (!result.isSuccess()){
            Screenshot.capture(driver,"screenshot", result.getName() );
        }

        driver.quit();
        Reporter.log("=====Browser Session End=====", true);

    }
}
