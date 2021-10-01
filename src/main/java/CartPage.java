import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    By cartProducts = By.className("rd-cart-item-code");
    //By productPrice = By.className("---");
    //By sumPrice = By.className("---");
    //By productCount = By.className("---");

    By deleteProducts = new By.ByCssSelector("[title=\"Sil\"]");
    By deleteConfirm = By.id("Cart_ProductFavAndDelete_675959327");

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean checkIfProductAdded() {
        return getCartProducts().size()>0;
    }

    public List<WebElement>getCartProducts(){
        return findAll(cartProducts);
    }

    public void deleteOnCart() {
        List<WebElement> removeProductBtnList = webDriver.findElements(deleteProducts);
        for (WebElement removeProductBtn : removeProductBtnList ) {
            webDriver.findElement(deleteProducts).click();
        }
        webDriver.findElement(deleteConfirm).click();
    }
    /*public boolean comparePrice(){
        String price = find(productPrice).getText();
        int priceValue = Integer.parseInt(price);
        //(price value * product count) == sum value return true;
        // ()
    }  */
}
