package tek.review.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement SignInElement  = driver.findElement(By.id("signinLink"));
        explicitWait.until(ExpectedConditions.visibilityOf(SignInElement)).click();


       WebElement EmailElement = driver.findElement(By.id("email"));
       explicitWait.until(ExpectedConditions.visibilityOf(EmailElement)).sendKeys("darya@gmail.com");

        WebElement PasswordFieldElement = driver.findElement(By.id("password"));
        explicitWait.until(ExpectedConditions.visibilityOf(PasswordFieldElement)).sendKeys("Darya123!");

        WebElement LoginBtnFieldElement = driver.findElement(By.id("loginBtn"));
        explicitWait.until(ExpectedConditions.visibilityOf(LoginBtnFieldElement)).click();
        Thread.sleep(5000);

        WebElement phoneNumberElement =   driver.findElement(By.xpath("//input[@id='personalPhoneInput']"));
        explicitWait.until(ExpectedConditions.visibilityOf(phoneNumberElement)).clear();
        phoneNumberElement.sendKeys("7048523695");




    }
}