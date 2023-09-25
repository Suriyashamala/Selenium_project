package NonWebElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class JavascriptAlerts {
    public static void main(String[] args){
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//        simple alert (ok)
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"))
                .click();
        Alert alert= driver.switchTo().alert();
        // String text = alert.getText();
        // System.out.println(text);
        alert.accept();


//        confirm alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"))
                .click();
        Alert confirm = driver.switchTo().alert();
        alert.accept();
        // alert.dismiss();


//        prompt alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"))
                .click();
        Alert prompt = driver.switchTo().alert();
        alert.sendKeys("shamala");
        alert.accept();
        //alert.dismiss();

    }
}

