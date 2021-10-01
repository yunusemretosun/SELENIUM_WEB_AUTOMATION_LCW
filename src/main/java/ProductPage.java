import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;



public class ProductPage extends BasePage{
    JavascriptExecutor js = (JavascriptExecutor) webDriver;
    By moreProductButton = new By.ByCssSelector("a.lazy-load-button");
    By productNames = new By.ByCssSelector("img.product-lazy-image.lazyloaded");
    public ProductPage(WebDriver webDriver) {
        super(webDriver);

    }

    public void moreProduct(){
        WebElement element = find(moreProductButton);
        js.executeScript("arguments[0].scrollIntoView();", element);
        click(moreProductButton);

    }


    public void selectProduct() {

        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(getAllProducts().size());
        js.executeScript("arguments[0].scrollIntoView();", getAllProducts().get(index));
        getAllProducts().get(index).click();
    }

    private List<WebElement>getAllProducts(){
        return findAll(productNames);
    }

}
