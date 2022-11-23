import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopProductTests extends BaseTests {

    @Test
    public void addToCartTest() {
        loginPage.inputDataInLoginFields();
        shopPage.selectProduct();
        shopProductPage.addToCart();

        String productInCart= basePage.getText(By.cssSelector(".shopping_cart_badge"));
        System.out.println(productInCart);
        Assert.assertTrue(productInCart.contains("1"),"The number of products in the cart is not the same");
    }
}
