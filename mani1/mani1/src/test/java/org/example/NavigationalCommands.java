package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationalCommands {

    @Test
    public  void navigationalcommands() {


        System.setProperty("webdriver.chrome.driver", "A:\\mmm\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Navigate to URL
         driver.navigate().to("https://www.facebook.com/login/");

        //Navigate backward in browser history
        driver.navigate().back();

       // Refresh page
        driver.navigate().refresh();

       // Navigate forwards in browser history
        driver.navigate().forward();




    }
}
