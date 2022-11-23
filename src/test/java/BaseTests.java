import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.LoginPage;
import pages.ShopPage;
import pages.ShopProductPage;

public class BaseTests {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected ShopPage shopPage;
    protected ShopProductPage shopProductPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        basePage = new BasePage(driver);
        loginPage = new LoginPage(driver);
        shopPage = new ShopPage(driver);
        shopProductPage = new ShopProductPage(driver);

        basePage.goToUrl();
    }
}
