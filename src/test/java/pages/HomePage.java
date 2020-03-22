package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends BasePage{

    public void clickOnSearchField() {
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Tester Testic");
    }

    public void clickOnFilterField() {
        By filterLocator = By.xpath("//button[@class='btn btn-outline-secondary input-button']");
        clickOnElement(filterLocator);
    }

    public String getProfileName() {
        return driver.findElement(By.xpath("//h4[contains(text(),'No galleries found')]")).getText();
    }

    public void clickOnCreateGallery() {
        By createGalleryLocator = By.xpath("//a[contains(text(),'Create Gallery')]");
        clickOnElement(createGalleryLocator);
    }

    public void clickOnTittleField() {
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Slika");
    }

    public void clickOnDescriptionsField() {
        driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Lepa");
    }

    public void clickOnImagesField() {
        driver.findElement(By.xpath("//input[@placeholder='image url']")).sendKeys("https://images.app.goo.gl/CyZn6FPQh9p1Uqy39");
    }

    public void clickOnSubmitButton() {
        driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
    }


    public String wrongImageFormatText() {
        return driver.findElement(By.xpath("//p[@class='alert alert-danger']")).getText();
    }

    public void clickSearchFieldBox() {
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Sunce2");
    }

    public String getGalleryHeaderText() {
        return driver.findElement(By.xpath("//a[contains(text(),'Sunce2')]")).getText();
    }

    public void fillTextArea() {
    driver.findElement(By.xpath("//textarea[@placeholder='Comment...']")).clear();
    driver.findElement(By.xpath("//textarea[@placeholder='Comment...']")).sendKeys("Lepa galerija");
    }

    public void clickOnSubmitCommentButton() {
        driver.findElement(By.xpath("//button[@class='btn btn-custom']")).click();
    }

    public void clickOnGalleryHeader() {
        driver.findElement(By.xpath("//a[contains(text(),'Sunce2')]")).click();
    }

    public String getCommentText() {
        return driver.findElement(By.xpath("//p[contains(text(),'Lepa galerija')]")).getText();
    }

    public void deleteComment () {
        driver.findElement(By.xpath("//i[@class='fas fa-trash']")).click();
    }

    public void confirmDelete() {
        driver.switchTo().alert().accept();
    }
    }


