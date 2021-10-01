import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    /* beden secimi icin farkli bir cozum gerekli */
    By chooseSize = new By.ByXPath("//div[@class='col-xs-12 size-area main-size-area pt-5']" +
            "//div[@class='option-sizes size-area ucOptionSizeSelector mt-0 mb-0']//div[@class='option-size']" +
            "//a[@href='javascript:;'][contains(text(),'3-4 Yaş')]");
    By addCartButtonLocator = new By.ByCssSelector("a.add-to-cart.button-link.add-to-cart-button");

    public ProductDetailPage(WebDriver webDriver) {
        super(webDriver);
    }



    public void selectSize() {
        click(chooseSize);
    }
    public void addToCart() {

        click(addCartButtonLocator);
    }
}
