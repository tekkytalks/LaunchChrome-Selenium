import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public void launchbrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://accounts.google.com/signin");

    }

    public static void main(String[] args) {

        SeleniumTest obj =new SeleniumTest();
        obj.launchbrowser();

    }

}
