package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HendleBrowser {
    public static void main(String[] args) {
        //Open Browser Chrome Browser
        ChromeDriver chromeDriver = new ChromeDriver();
        //Navigate to URL
        chromeDriver.get("https://google.com");




        //to Close browser entirely
        // chromeDriver.quit();


    }
}
