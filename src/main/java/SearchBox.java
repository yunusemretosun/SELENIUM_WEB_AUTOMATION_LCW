import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {
    By searchBoxLocator =  By.id("search");
    By submitSearch = By.className("search-button");

    public SearchBox(WebDriver webDriver) {
        super(webDriver);
    }

    public void search(String text) {
        type(searchBoxLocator,text);
        click(submitSearch);
    }
}
