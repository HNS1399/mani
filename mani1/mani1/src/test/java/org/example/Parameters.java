package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parameters {

    @Test
    @org.testng.annotations.Parameters("browser")
    public void testparameters(String browser){

        if(browser.equals("chrome")){

            System.out.println("Opening chrome browser");
            System.setProperty("webdriver.chrome.driver", "A:\\mmm\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/login/");

        }else {

            System.setProperty("webdriver.edge.driver", "A:\\mmm\\edgedriver_win32 (1)\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();

            driver.get("https://www.facebook.com/login/");

        }



    }
}
