package pl.jakub.myWebsite.pages.ballonPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.jakub.myWebsite.cfg.WebDriverConfig;

public class BallonPageMethods {
    @FindBy (id = BallonPageData.START_GAME_BUTTON_ID)
    private WebElement startGameButton;
    @FindBy (id = BallonPageData.BALLOON_1_ID)
    private WebElement balloon1;
    @FindBy (id = BallonPageData.BALLOON_2_ID)
    private WebElement balloon2;
    @FindBy (id = BallonPageData.BALLOON_3_ID)
    private WebElement balloon3;

    private WebDriverWait wait = new WebDriverWait(WebDriverConfig.getWebDriverInstance(), 10);


    public void clickStartGame(){
        startGameButton.click();
    }
    public void clickBalloon1(){
        wait.until(ExpectedConditions.visibilityOf(balloon1));
        balloon1.click();
    }
    public void clickBalloon2(){
        wait.until(ExpectedConditions.visibilityOf(balloon2));
        balloon2.click();
    }
    public void clickBalloon3(){
        wait.until(ExpectedConditions.visibilityOf(balloon3));
        balloon3.click();
    }
}
