import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class BaseTest {

    WebDriver webDriver;

    @BeforeAll
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://www.lcwaikiki.com/tr-TR/TR");
        webDriver.manage().window().maximize();
       // webDriver.manage().deleteAllCookies();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @AfterAll
    public void tearDown() {
        webDriver.quit();
    }
}