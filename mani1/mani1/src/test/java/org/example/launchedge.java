package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class launchedge {

    @Test
    public void edge(){

        System.setProperty("webdriver.edge.driver", "A:\\mmm\\edgedriver_win32 (1)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/login/");
    }
}
