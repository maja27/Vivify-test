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


public class CheckInsertCommentOnGalleryTest extends BasePage {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @BeforeTest
    public void setup() {
        setUp();
    }

    @Test
    public void Login() throws InterruptedException {
        navigateToUrl("https://gallery-app.vivifyideas.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Login')]")));
        loginPage.Login();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search...']")));
        homePage.clickSearchFieldBox();
        homePage.clickOnFilterField();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Sunce2')]")));
        homePage.clickOnGalleryHeader();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@placeholder='Comment...']")));
        homePage.fillTextArea();
        homePage.clickOnSubmitCommentButton();
        assertEquals(homePage.getCommentText(), "Lepa galerija");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='list-group-item']//div//button")));
        homePage.deleteComment();
        Thread.sleep(3000);
        homePage.confirmDelete();


    }

    @AfterTest
    public void closeapp() {
        closeApp();
    }
}