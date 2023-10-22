import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runner.RunWith;
import io.github.bonigarcia.wdm.WebDriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"login", "search", "cart"},  // Sesuaikan dengan paket-paket yang telah Anda buat
    plugin = {"pretty", "html:target/cucumber-reports"}
)

public class TestRunner {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Inisialisasi WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\deanh\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        // Menggunakan WebDriverManager untuk mengatur ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
