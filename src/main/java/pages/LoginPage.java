package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Constants;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputDataInLoginFields() {
        setText(By.cssSelector("#user-name"), Constants.USER_NAME);
        setText(By.cssSelector("#password"), Constants.PASSWORD);
        click(By.cssSelector("#login-button"));
    }
}
