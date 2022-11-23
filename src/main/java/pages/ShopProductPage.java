package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopProductPage extends BasePage {

    public ShopProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart(){
        click(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
    }
}
