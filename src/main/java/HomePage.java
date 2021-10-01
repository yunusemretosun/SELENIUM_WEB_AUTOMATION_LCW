import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    SearchBox searchBox;


    By cartCounter = By.id("spanCart");
    By cartContainer = By.className("header-cart");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        searchBox = new SearchBox(webDriver);
    }



    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountChange() {
        return getCartCounter() > 0;
    }

    public void goToCart() {
        click(cartContainer);
    }

    private int getCartCounter(){
        String count = find(cartCounter).getText();
        return Integer.parseInt(count);
    }

    public boolean isDisplayed() {
        return isDisplayed(searchBox.searchBoxLocator);
    }
}
