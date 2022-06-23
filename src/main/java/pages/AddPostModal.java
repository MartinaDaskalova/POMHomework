package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPostModal extends BaseClass {

    public AddPostModal(WebDriver driver) {
        super(driver);
    }

    public AddPostModal() {

    }


    @FindBy(xpath = "//h3[contains(text(),'Post a picture to share with your awesome follower')]")
    WebElement createHeader;

    @FindBy (xpath = "//input[@class='ng-untouched ng-pristine ng-invalid']")
    WebElement uploadImage;


    @FindBy (xpath = "//img[@class='image-preview']")
    WebElement imagePreview;

    @FindBy (xpath = "//button[@id='choose-file']")
    WebElement browseFile;

    @FindBy (xpath = "//input[@placeholder='Upload Picture']")
    WebElement imageNameDefault;

    @FindBy (xpath = "//input[@placeholder='Upload Picture']")
    WebElement imageNameNew;

    @FindBy (xpath = "//input[@placeholder='Enter you post caption here']")
    WebElement captionField;

    @FindBy (xpath = "//label[normalize-space()='Public']")
    WebElement sliderField;

    @FindBy (xpath = "//label[normalize-space()='Private']")
    WebElement setToPrivate;

    @FindBy (xpath = "//label[normalize-space()='Public']")
    WebElement setToPublic;

    @FindBy (xpath = "//button[@id='create-post']")
    WebElement submitButton;



    public void addFile(){
       uploadImage.sendKeys("D:\\Dragons\\ae67346ec418f711a499613faa124a2f.jpg");
    }

    public void addCaptions(){
        captionField.clear();
        captionField.sendKeys("Hello world!");
    }

    public void setToPublic(){
        if (driver.findElement(By.xpath("//label[normalize-space()='Private']")) == setToPublic){
            sliderField.click();

        }
    }

    public void setToPrivate(){
        if (driver.findElement(By.xpath("//label[normalize-space()='Private']")) != setToPublic){
            sliderField.click();
        }
    }

    public void createPost(){
        submitButton.click();
    }

}
