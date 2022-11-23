import org.testng.annotations.Test;

public class ShopTests extends BaseTests {

    @Test
    public void selectProductTest(){
        loginPage.inputDataInLoginFields();
        shopPage.selectProduct();
    }
}
