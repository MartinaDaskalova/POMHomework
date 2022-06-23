package pomscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

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

    @Test (dependsOnMethods = "createPost")
    public void likePost() throws InterruptedException {
        loginTest();
        userPostModal.takeFirstPost();
        userPostModal.likePost();
        userPostModal.isPostLiked();
        userPostModal.isLikeAlertDisplayed();
        driver.navigate().refresh();
        logoutTest();
        Thread.sleep(5000);
    }

    @Test
    public void addComment() throws InterruptedException {
        loginTest();
        userPostModal.takeFirstPost();
        userPostModal.addComment();
    }

//    @Test
//    public void checkComment(){
//        userPostModal.takeComments();
//        Assert.assertEquals();
//    }

    @Test
    public void logoutTest() throws InterruptedException {
        loginTest();
        logInModal.isSignoutButton();
        logInModal.pressSignout();
    }



}
