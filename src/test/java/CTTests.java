import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class CTTests {
    WebDriver driver;
    @BeforeMethod
    public void setup (){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void register (){
        driver.get("https://www.ctshop.rs/");
        WebDriverWait webDriverWait =new WebDriverWait(driver,  30);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Ceo dan kisa pada")));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("Nadam se Suncu")));
        driver.findElement(By.cssSelector("danas je lep dan")).click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("dsdsdsds")));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("sdasdasad")));
        driver.findElement(By.cssSelector("danas je lep dan")).click();




    }






}