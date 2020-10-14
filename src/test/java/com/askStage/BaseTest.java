package com.askStage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;


    @Before

    public void setUp() {

        System.setProperty("webdriver.chrome.driver","/Users/lenusykk16/Desktop/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://skryabin.com/webdriver/html/sample.html");

        System.out.println("Start");

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String expectedTitle = "Sample Page";

        Assert.assertEquals(expectedTitle, actualTitle);



    }

    @After

    public void quit() {
        System.out.println("Finish");
        /*driver.quit();*/
    }

}
