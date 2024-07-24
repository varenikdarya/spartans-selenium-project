package tek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Accessories']")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Wireless Keyboard and Mouse Combo Backlit']")))
        .click();

       WebElement quantityElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product__select")));
        Select selectQuantity = new Select(quantityElement);
        selectQuantity.selectByIndex(4);


}}