package tek.locators.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By newAccountLocator = By.className("login__account-btn");
        WebElement newAccountElement = driver.findElement(newAccountLocator);
        newAccountElement.click();

        By nameLocator = By.id("nameInput");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("Darya");

        String emailPrefix = "darya_spartans";
        int number = (int) (Math.random() * 100);
        String randomEmail = emailPrefix + number + "@gmail.com";

        By emailLocator = By.id("emailInput");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys(randomEmail);

        By passwordLocator =By.id("passwordInput");
        WebElement passwordElement =driver.findElement(passwordLocator);
        passwordElement.sendKeys("Password123!");

        By confirmPasswordLocator = By.id("confirmPasswordInput");
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordLocator);
        confirmPasswordElement.sendKeys("Password@123");

        By signUpLocator = By.className("signup__btn");
        WebElement signUpElement = driver.findElement(signUpLocator);
        signUpElement.click();


        driver.quit();

    }
}
