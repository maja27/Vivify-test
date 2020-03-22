package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;


public class CheckSuccessfulSearchTest extends BasePage {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @BeforeTest
    public void setup() {
        setUp();
    }

    @Test
    public void Login() {
        navigateToUrl("https://gallery-app.vivifyideas.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Login')]")));
        loginPage.Login();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search...']")));
        homePage.clickSearchFieldBox();
        homePage.clickOnFilterField();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Sunce2')]")));
        assertEquals(homePage.getGalleryHeaderText(), "Sunce2");
    }

    @AfterTest
    public void closeapp() {
        closeApp();
    }
}