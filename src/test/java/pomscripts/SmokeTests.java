package pomscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserPostModal;

public class SmokeTests extends BaseTest {



    //TODO add all tests in the SmokeTests class

    @Test (retryAnalyzer = utils.Retry.class)
    public void loginTest() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/");
        logInModal.LogIn();
        Assert.assertTrue(logInModal.checkPopUp());
        Thread.sleep(5000);

    }

//    @Test
//    public void createAccount(){
//        driver.get("http://training.skillo-bg.com/");
//        signUpModal.signUp();
//
//    }

    @Test
    public void createPost() throws InterruptedException {
        loginTest();
        logInModal.newPostButon();
        addPostModal.addFile();
        addPostModal.setToPublic();
        addPostModal.addCaptions();
        addPostModal.createPost();
        Thread.sleep(5000);
    }

    @Test
    public void deletePost(){
        try {
            userPostModal.deletePost();
        }
            catch(ElementNotVisibleException e ) {
            System.out.println("You are not the owner of this post");
        }
    }

    @Test (dependsOnMethods = "createPost")
    public void likePost() throws InterruptedException {
        loginTest();
        userPostModal.takeFirstPost();
        userPostModal.likePost();
        userPostModal.isPostLiked();
        userPostModal.isLikeAlertDisplayed();
        driver.navigate().refresh();
        Thread.sleep(5000);
    }

    @Test
    public void addComment() throws InterruptedException {
        loginTest();
        userPostModal.takeFirstPost();
        userPostModal.addComment();
    }

    @Test
    public void checkComment() throws InterruptedException {
        loginTest();
        userPostModal.takeFirstPost();
        driver.findElements(By.xpath("//*[contains(text(), 'Hello World')]"));
    }

    @Test
    public void logoutTest() throws InterruptedException {
        loginTest();
        logInModal.isSignoutButton();
        logInModal.pressSignout();
    }



}
