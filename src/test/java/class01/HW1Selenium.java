package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Selenium {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance
        WebDriver driver=new ChromeDriver();

        //use .get(url)
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        //maximize window of browse
        driver.manage().window().maximize();

        //Fill out form

        //first name
        driver.findElement(By.id("customer.firstName")).sendKeys("Haneefah");

        //last name
        driver.findElement(By.id("customer.lastName")).sendKeys("Dundee");

        //Address
        driver.findElement(By.id("customer.address.street")).sendKeys("1727 Melrose lane");

        //city
        driver.findElement(By.id("customer.address.city")).sendKeys("Durham");

        //state
        driver.findElement(By.id("customer.address.state")).sendKeys("North Carolina");

        //zip code
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("27713");

        //phone #
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("919-000-0000");

        //SSN
        driver.findElement(By.name("customer.ssn")).sendKeys("123-45-6789");

        //username
        driver.findElement(By.name("customer.username")).sendKeys("H.Dundee");

        //Password
        driver.findElement(By.name("customer.password")).sendKeys("453powYUR@$");

        //repeat password
        driver.findElement(By.name("repeatedPassword")).sendKeys("453powYUR@$");

        //Wait
        Thread.sleep(5000);

        //close the browser
        driver.quit();








    }
}
