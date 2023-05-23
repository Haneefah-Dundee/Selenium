package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        //instance
        WebDriver driver =new ChromeDriver();

        //go to url
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //maximize screen
        driver.manage().window().maximize();

        //find element

        WebElement usrNameTxtBox=driver.findElement(By.id("txtUsername"));
        usrNameTxtBox.sendKeys("Admin");
        //same as
        //driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //slow down
        Thread.sleep(2000);

        //after sending username to txt box, clear it
        usrNameTxtBox.clear();

        //send username again
        usrNameTxtBox.sendKeys("Admin");

        //find password
        WebElement pass =driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        //find login

        WebElement loginBtn= driver.findElement(By.className("button"));
        loginBtn.click();

        //get the welcome message
        WebElement message =driver.findElement(By.linkText("Welcome Admin"));
         String text=message.getText();
        System.out.println(text);

        driver.findElement(By.partialLinkText("Recru")).click();


    }
}
