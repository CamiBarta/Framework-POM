package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopPage extends BasePage {

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    public void selectProduct(){
        click(By.xpath("(//div[@class='inventory_item_name'])[1]"));
    }
}
