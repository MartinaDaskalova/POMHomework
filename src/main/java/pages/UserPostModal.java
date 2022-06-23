package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;

import java.util.List;

public class UserPostModal extends BaseClass{

    public UserPostModal(WebDriver driver) {
        super(driver);
    }

    public UserPostModal() {

    }
    // FindBys is used when you have multiple locators for the liked items
 // @FindBys({
    //
    //  array of web elements
    // })
    // List <WebElements> LikePostList


    @FindBy (xpath = "//i[@class='like far fa-heart fa-2x']")
    WebElement likeButton;

    @FindBy (xpath = "//i[@class='like far fa-heart fa-2x liked']")
    WebElement likeIsClicked;

    @FindBy (xpath = "//div[@class='icons-container']//i[@class='ml-4 far fa-thumbs-down fa-2x']")
    WebElement dislikeButton;

    @FindBy (xpath = "//i[@class='ml-4 far fa-thumbs-down fa-2x liked']")
    WebElement dislikeIsClicked;

    @FindBy(xpath = "//div[@class='toast-success ngx-toastr ng-trigger ng-trigger-flyInOut']")
    WebElement likeDislikeAlert;

    @FindBy(xpath = "//div[@aria-label='Post liked']")
    WebElement likeAlertText;

    @FindBy(xpath = "div[@aria-label='Post disliked']")
    WebElement dislikeAlertText;

    @FindBy (xpath = "//div[@class='container-flud post-profile-container']//a[@class='post-user']")
    WebElement postOwner;

    @FindBy (xpath = "//div[@class='container-flud post-profile-container']//button[@class='btn btn-primary ng-star-inserted'][normalize-space()='Follow']")
    WebElement followButton;

    @FindBy (xpath = "//div[@class='comment-list-container']")
    List<WebElement> allComments;

    @FindBy (xpath = "//div[@class='col-12 post-info']//div[@class='post-date']")
    WebElement postDate;

    @FindBy (xpath = "//input[@placeholder='Comment here']")
    WebElement commentField;

    @FindBy (xpath = "/html[1]/body[1]/app-root[1]/div[2]/app-all-posts[1]/div[1]/div[1]/div[1]/app-post-detail[1]")
    WebElement takeFirstPost;


    public void addComment(){

        commentField.sendKeys("Random comment.");

    }

    public void likePost(){
        likeButton.click();
    }

    public void dislikePost(){
        dislikeButton.click();
    }

    public boolean isPostLiked(){
        likeIsClicked.isDisplayed();
        return true;
    }

    public boolean isPostDisliked(){
        dislikeIsClicked.isDisplayed();
        return true;
    }


    // за Like/dislike може да се ползва текста на pop-up

//    public boolean isAnimationDone(){
//        wait.until(ExpectedCondition.visiblityOf(likePostSuccessAlet));
//        Assert.assertEquals(likePostSuccessfulAlert,true);
//    }
}
