/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author vinot
 */
public class Costcologinest {
    private WebDriver driver;
    public Costcologinest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before    public void setUp() {
        System.setProperty("webdriver.chrome.driver","c:\\data\\chromedriver.exe");
      
        driver = new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCostcoLoginTestCase() throws Exception {
    CostcoFileUtil util=new CostcoFileUtil();   
         driver.get("https://www.costco.com/");
    driver.findElement(By.id("header_sign_in")).click();
    driver.findElement(By.id("logonId")).clear();
    driver.findElement(By.id("logonId")).sendKeys(util.getUsername());
    driver.findElement(By.id("logonPassword")).click();
    driver.findElement(By.id("logonPassword")).clear();
    driver.findElement(By.id("logonPassword")).sendKeys(util.getPassword());
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remember Me'])[1]/following::input[1]")).click();
  }
     
    // public void hello() {}
}
