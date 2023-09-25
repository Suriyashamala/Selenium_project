package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonWebElement {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        // textbox
        WebElement user = driver.findElement(By.id("userId"));
        user.sendKeys("sham@S.com");
        user.clear();

        driver.findElement(By.id("userId"))
                .sendKeys("sham@");

        // date picker
        driver.findElement(By.xpath("//input[@name='the_date']"))
                .sendKeys("06082023");

        // upload - sendkeys(re-path)
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload"))
                .sendKeys("C:\\Users\\Dell\\IdeaProjects\\selenium_project\\src\\main\\java\\WebElement\\CommonWebElement.java");

        try {
            Thread.sleep(5000);
        }catch (Exception e) {}

        driver.close();
    }
}

