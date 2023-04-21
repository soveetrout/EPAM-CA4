package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class WebUniversity {
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();
        Thread.sleep(15000);

    }
    @Test
    public void SampleTest() throws InterruptedException {
        Select select1=new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']")));
        select1.selectByValue("sql");
        Thread.sleep(1000);
        Select select2=new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']")));
        select2.selectByValue("junit");
        Thread.sleep(1000);
        Select select3=new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']")));
        select3.selectByValue("jquery");
        Thread.sleep(1000);
        WebElement e1=driver.findElement(By.xpath("//input[@value='option-1']"));
        e1.click();
        Thread.sleep(1000);
        WebElement e2=driver.findElement(By.xpath("//input[@value='option-4']"));
        e2.click();
        Thread.sleep(1000);
        WebElement e3=driver.findElement(By.xpath("//input[@value='option-3']"));
        e3.click();
        Thread.sleep(1000);
        WebElement radio=driver.findElement(By.xpath("//input[@value='purple']"));
        radio.click();
    }
}
