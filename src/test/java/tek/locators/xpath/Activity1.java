package tek.locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='hamburgerBtn']")).click();

        driver.findElement(By.xpath("//span[text()='Electronics']")).click();



}}
