import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://onet.pl");
        System.out.println("Page Title: " + driver.getTitle());
        driver.quit();
    }
}