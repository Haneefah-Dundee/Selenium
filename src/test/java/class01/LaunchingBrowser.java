package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        //navigate to google.com

        //declare the instance
        WebDriver driver=new ChromeDriver();

        //use .get(url)
        driver.get("https://www.google.com");

        //maximize window of browse
        driver.manage().window().maximize();

        //get the current URL
       String currentURL = driver.getCurrentUrl();

       //print on console
        System.out.println("The current URL is "+currentURL);

        //get web title
       String title= driver.getTitle();

       //print the title
        System.out.println("The title of the page is "+ title);

        //add some wait time
        Thread.sleep(5000);

        //close the browser
        driver.quit();


    }
}
