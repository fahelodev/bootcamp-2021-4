package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class atc01_busquedaProductoExistenteFirefox {

    WebDriver driver;

    @BeforeClass
    public static void init() {
        WebDriverManager.firefoxdriver().setup();
    }

    @Before
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @Test
    public void atc01() {
        driver.get("http://automationpractice.com/");

        driver.findElement(By.xpath("//*[@id=\'search_query_top\']"))
                .sendKeys("chiffon dress");

        driver.findElement(By.cssSelector("#searchbox > button")).click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        if(currentUrl.contains("submit_search=")){
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    @After
    public void close() {
        System.out.println("after");
        System.out.println("simulacion driver.close()");
    }

}

