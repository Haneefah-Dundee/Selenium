package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {

        //instance
        WebDriver driver=new ChromeDriver();

        //go to url
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //maximize the window
        driver.manage().window().maximize();

        //find element and enter text
        //username
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");

        //password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        ////print title

        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("Web Orders Login")){
            System.out.println("The title is correct.");
        }else{
            System.out.println("The title is incorrect.");
        }

        //Wait
        Thread.sleep(4000);

        //close the browser
        driver.quit();




    }
}
