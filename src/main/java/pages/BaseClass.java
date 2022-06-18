package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
    WebDriver driver;


    @BeforeClass
    public void setUpApplication() {

        Reporter.log("=====Browser Session Started=====", true);

        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://training.skillo-bg.com");

        Reporter.log("=====Application Started=====", true);
    }

    @AfterClass
    public void closeApplication()
    {
        driver.quit();
        Reporter.log("=====Browser Session End=====", true);

    }




}

