package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserCommands {

    @Test
    public void browsercommands(){

        System.setProperty("webdriver.chrome.driver", "A:\\mmm\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        // maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);


        String title  = driver.getTitle();
        System.out.println(title);

        String currenURL = driver.getCurrentUrl();
        System.out.println(currenURL);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        driver.close();










    }
}
