package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWSelXpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();


        WebElement createAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAccount.click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Haneefah");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dundee");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Haneefah@email.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("haneefah@email.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123@AB3");

        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("November");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("15");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1985");

        driver.findElement(By.xpath("//label[text()='Female']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        Thread.sleep(4000);
        driver.quit();

    }
}
