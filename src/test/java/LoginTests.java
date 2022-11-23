import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

@Test
    public void inputDataInLoginFieldsTest(){
        loginPage.inputDataInLoginFields();
    }
}
