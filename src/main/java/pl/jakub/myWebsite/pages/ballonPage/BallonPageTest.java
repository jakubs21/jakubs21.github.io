package pl.jakub.myWebsite.pages.ballonPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.jakub.myWebsite.cfg.WebDriverConfig;

public class BallonPageTest {
    private boolean init = true;
    private BallonPageMethods ballonPageMethods;
    @BeforeMethod
    public void init(){
        if(init){
            WebDriverConfig.Initialize();
            ballonPageMethods = PageFactory.initElements(WebDriverConfig.getWebDriverInstance(), BallonPageMethods.class);
        }
    }
    @Test
    public void startBalloonGame(){
        ballonPageMethods.clickStartGame();
        ballonPageMethods.clickBalloon1();
        ballonPageMethods.clickBalloon2();
        ballonPageMethods.clickBalloon3();
        ballonPageMethods.clickBalloon1();
        ballonPageMethods.clickBalloon2();
        ballonPageMethods.clickBalloon3();
        ballonPageMethods.clickBalloon1();
        ballonPageMethods.clickBalloon2();
        ballonPageMethods.clickBalloon3();
        ballonPageMethods.clickBalloon1();
        ballonPageMethods.clickBalloon2();
        ballonPageMethods.clickBalloon3();
    }
}
