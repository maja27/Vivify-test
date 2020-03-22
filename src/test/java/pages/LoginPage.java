package pages;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    String email = "maja.27@yahoo.com";
    String password = "caocaocao1";

    public LoginPage() {
    }

    //    click sign in button
    public void clickSignInButton() {
        By signInButtonLocator = By.xpath("//a[contains(text(),'Login')]");
        clickOnElement(signInButtonLocator);
    }

//    Set email in textbox
    public void setEmail(String email) {
        By emailLocator = By.id("email");
        sendKeysInElement(emailLocator, email);
    }

//    Set password in textbox
    public void setPassword(String password) {
        By passwordLocator = By.id("password");
        sendKeysInElement(passwordLocator, password);
    }

//    Click on login button
    public void clickLogin() {
        By clickLoginLocator = By.xpath("//button[@class='btn btn-custom']");
        clickOnElement(clickLoginLocator);
    }

     public void Login() {
        clickSignInButton();
        setEmail(email);
        setPassword(password);
        clickLogin();
     }

}
