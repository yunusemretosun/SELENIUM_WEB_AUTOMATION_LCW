import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    By loginSection = new By.ByCssSelector("div.header-icon-label");
    By usernameLocator = By.id("LoginEmail");
    By passwordLocator = By.id("Password");
    By loginLinkLocater = By.id("loginLink");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void login(String username , String pass){
        click(loginSection);
        type(usernameLocator,username);
        type(passwordLocator,pass);
        Assertions.assertTrue(this.isDisplayed(),"An error spotted");
        click(loginLinkLocater);
    }

    public boolean isDisplayed() {
        return isDisplayed(usernameLocator);
    }
}
