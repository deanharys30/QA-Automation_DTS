import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class CartSteps {
    private WebDriver driver;

    public CartSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Given("I am on the products page")
    public void iAmOnProductsPage() {
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    @When("I select a product {string}")
    public void iSelectProduct(String productName) {
        // Implement code to select a product with the given name
        WebElement productElement = driver.findElement(By.xpath("//div[text()='" + productName + "']"));
        productElement.click();
    }

    @When("I add it to the cart")
    public void iAddToCart() {
        // Implement code to add the product to the cart
        WebElement addToCartButton = driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCartButton.click();
    }

    @Then("I should see {string} in the shopping cart")
    public void iShouldSeeProductInCart(String productName) {
        // Implement
    }
}