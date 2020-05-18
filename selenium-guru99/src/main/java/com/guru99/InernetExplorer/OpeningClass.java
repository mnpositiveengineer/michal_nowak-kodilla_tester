package com.guru99.InernetExplorer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpeningClass {
    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver", "C:/selenium-drivers/Firefox/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.ie.driver","C:/selenium-drivers/InternetExplorer64/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://demo.guru99.com/test/newtours/");

        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle;

        actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }

        driver.close();
    }
}
