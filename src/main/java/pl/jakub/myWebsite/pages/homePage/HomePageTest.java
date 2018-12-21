package pl.jakub.myWebsite.pages.homePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.jakub.myWebsite.cfg.WebDriverConfig;


public class HomePageTest {
    private boolean init = true;
    private HomePageMethods homePageMethods;
    @BeforeMethod
    public void init(){
        if(init){
            WebDriverConfig.Initialize();
            homePageMethods = PageFactory.initElements(WebDriverConfig.getWebDriverInstance(), HomePageMethods.class);
        }
    }
    @Test
    public void openHomePage(){
        WebDriverConfig.getWebDriverInstance().get(HomePageData.WEBSITE_URL);
        homePageMethods.clickGames();
        homePageMethods.clickBallon();
        Assert.assertEquals(homePageMethods.getAssertion().trim(),"<p>Balloon Shooter</p>");
        //WebDriverConfig.quitDriver();
    }
}
