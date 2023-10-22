import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class SearchSteps {
    private WebDriver driver;

    public SearchSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Given("I am on the products page")
    public void iAmOnProductsPage() {
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    @When("I search for a product with keyword {string}")
    public void iSearchForProduct(String keyword) {
        // Enter the keyword into the search input field and click the search button
        WebElement searchInput = driver.findElement(By.cssSelector("[data-test='search-box']"));
        WebElement searchButton = driver.findElement(By.cssSelector("[data-test='search-button']"));
        searchInput.sendKeys(keyword);
        searchButton.click();
    }

    @Then("I should see matching results")
    public void iShouldSeeMatchingResults() {
        // Verify that you see matching search results
        WebElement resultsContainer = driver.findElement(By.cssSelector("[data-test='search-results']"));
        Assert.assertTrue(resultsContainer.isDisplayed());
    }

    @Then("I should see a message {string}")
    public void iShouldSeeMessage(String message) {
        // Verify that you see a specific message
        WebElement messageElement = driver.findElement(By.cssSelector("[data-test='search-message']"));
        Assert.assertEquals(message, messageElement.getText());
    }
}
