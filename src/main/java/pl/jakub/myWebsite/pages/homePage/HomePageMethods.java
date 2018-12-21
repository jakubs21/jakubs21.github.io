package pl.jakub.myWebsite.pages.homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageMethods {
    @FindBy (id = HomePageData.HEADER_GAME_ID)
    private WebElement headerGameButton;
    @FindBy (xpath = HomePageData.BALLON_HEADER_XPATH)
    private WebElement ballonHeaderButton;
    @FindBy (id = HomePageData.ASSERTION_ID)
    private WebElement assertion;
    public void clickGames(){
        headerGameButton.click();
    }
    public void clickBallon(){
        ballonHeaderButton.click();
    }
    public String getAssertion(){
        return assertion.getAttribute("innerHTML");
    }
}
