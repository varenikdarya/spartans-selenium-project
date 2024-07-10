package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) {
        //Open Browser Chrome Browser
        ChromeDriver chromeDriver = new ChromeDriver();
        //Navigate to URL
        chromeDriver.get("https://dev.insurance.tekschool-students.com/");
        chromeDriver.manage().window().maximize();
        String title = chromeDriver.getTitle();

        chromeDriver.quit();
}
}
