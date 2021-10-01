import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class Test_Add_Product_To_Cart extends BaseTest {

    LoginPage loginPage;
    HomePage homPage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;



    @Test
    @Order(1)
    public void login_homepage(){
        loginPage = new LoginPage(webDriver);
        loginPage.login("EmreT719@gmail.com","123456tr");
    }

    @Test
    @Order(2)
    public void search_product(){

        homPage = new HomePage(webDriver);
        productPage = new ProductPage(webDriver);
        homPage.searchBox.search("pantolon");

    }

    @Test
    @Order(3)
    public void click_a_product(){
        productPage.moreProduct();
        productPage.selectProduct();
    }
    @Test
    @Order(4)
    public void add_product_to_cart(){
        productDetailPage = new ProductDetailPage(webDriver);
        productDetailPage.addToCart();


    }
    @Test
    @Order(5)
    public void go_to_cart(){

        cartPage = new CartPage(webDriver);
        homPage.goToCart();
        cartPage.deleteOnCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),"Product count did not add");
    }
}
