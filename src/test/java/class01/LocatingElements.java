package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();
//facebook
        driver.get("https://www.facebook.com/");

        //maximize the window
        driver.manage().window().maximize();


        //send text in email

        //find the element                               .send some text
        driver.findElement(By.id("email")).sendKeys("haneefah.dundee@gmail.com");

        //send some text tp password
        driver.findElement(By.name("pass")).sendKeys("agfsfhndgjnfgjmkhgf");

        //print url
        String url=driver.getCurrentUrl();
        System.out.println(url);

        //print title
        String title=driver.getTitle();
        System.out.println(title);

        //confirm that title is Facebook - log in or sign up
        if(title.equals("Facebook - log in or sign up")){
            System.out.println("the title is correct");
        }else{
            System.out.println("the title is incorrect");
        }

        //close
        driver.close();

    }
}
