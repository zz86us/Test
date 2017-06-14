import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Rebalance {

    @Test

    public void startWebdriver() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );
        driver.get("http://192.168.60.17:8080/ias-release/html/logon.html");
        System.out.println(driver.getTitle());



        driver.switchTo().frame(driver.findElement(By.xpath("//frame[contains(@src,'innerlogon.html')]")));

        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("RRegressionUser1");

        driver.findElement(By.xpath("//*[@name=\'Password\']")).sendKeys("redbull");
        driver.findElement(By.xpath("//*[@value=\'Login\']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Clients']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Household Name:']//following::input[1]")).sendKeys("Rebalance TC-277");
        driver.findElement(By.xpath("//*[@class='gwt-Button ias-search-button-orange x-component x-box-item']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='View']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[contains(@style,'background: url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAACYElEQVR42mNgIBLMnTtXauvWrW0HDx68vG3btgVAvjqxehnmz5/PcezYsYo7d+48vXv37r/bt29/3LVrV+/UqVNlidHPuH///vLnz5+/A9r+aNWqVUuB/EfHjx')]")).click();
        driver.findElement(By.xpath("//a[text()='Portfolios']")).click();

        //WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Reblance101']//preceding::td[4]")));
        //checkbox.click();
        driver.findElement(By.xpath("//*[@id=\"iasGrid\"]/div[2]/div[1]/table/tbody[2]/tr[1]/td/div/table/tbody[2]/tr[1]/td[1]")).click();
       // List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));





    }


}
