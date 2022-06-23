package pomscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTests extends BaseTest {



    public SmokeTests(WebDriver driver) {
        super(driver);
    }


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
        logInModal.newPostButon();
        addPostModal.addFile();
        addPostModal.setToPublic();
        addPostModal.addCaptions();
        addPostModal.createPost();
        Thread.sleep(5000);
    }

    @Test
    public void likePost(){

        //logoutTest();
    }

    @Test
    public void logoutTest() {
        //TODO implement logout functionality from every place
        // click the home button
        // click te logout button, note to the logout after liking a post, you need to click outside the popup to remove it (hint, use refresh)
        driver.navigate().refresh();
    }



}
