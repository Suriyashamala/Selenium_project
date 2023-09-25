package WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {

        // opening browser
        WebDriver driver = new ChromeDriver();
//        EdgeDriver driver = new EdgeDriver();
//        FirefoxDriver driver = new FirefoxDriver();
//        SafariDriver driver = new SafariDriver();

        // opening url
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // navigation commands
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();

        // browser commands
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().minimize();

        // driver methods
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

//        driver.quit();
        driver.close();

    }
}

