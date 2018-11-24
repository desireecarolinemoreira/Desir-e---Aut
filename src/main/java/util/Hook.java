package util;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
    protected static WebDriver driver;

    @Before
    public void befor (){
       WebDriverManager.chromedriver () .setup ();
       driver = new ChromeDriver ();
        }
        @After
    public void after (){
        driver.quit();

    }
    public static  WebDriver getDriver ()   {
        return driver;
    }

        }
