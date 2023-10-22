import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class LoginSteps {
    private WebDriver driver;

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Given("I am on the Saucedemo login page")
    public void iAmOnLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("your_valid_username");
        loginPage.enterPassword("your_valid_password");
    }

    @When("I enter invalid credentials")
    public void iEnterInvalidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("invalid_username");
        loginPage.enterPassword("invalid_password");
    }

    @When("I click the login button")
    public void iClickLoginButton() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }

    @Then("I should be on the products page")
    public void iShouldBeOnProductsPage() {
        // Verify that you are on the products page
        WebElement productsHeader = driver.findElement(By.className("product_label"));
        Assert.assertTrue(productsHeader.isDisplayed());
    }

    @Then("I should see an error message")
    public void iShouldSeeErrorMessage() {
        // Verify that you see an error message
        WebElement errorElement = driver.findElement(By.cssSelector("[data-test='error']"));
        Assert.assertTrue(errorElement.isDisplayed());
    }
}
