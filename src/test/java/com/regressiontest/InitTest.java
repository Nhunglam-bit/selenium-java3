package com.regressiontest;

import com.pageobjects.HomePage;
import com.pageobjects.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class InitTest {
    private WebDriver driver;

    @BeforeClass
    public void setUpDriver() {
        System.setProperty("webdriver.gecko.driver","/Users/khoapham/Documents/Tools/geckodriver");
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        //driver.get("https://www.woolworths.com.au/");
        driver.get("https://www.vietnamworks.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testPageTitle(){
        HomePage homePage = new HomePage(driver);
        assertEquals("Tuyển dụng, việc làm, tìm việc làm nhanh mới nhất | VietnamWorks", homePage.getPageTitle());
    }

    @Test(priority = 2)
    public void testGoingToLogInPage(){
        HomePage homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        homePage.getDangNhapButton().click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        homePage.getDangKyTKLink().click();
    }

    @Test (priority = 3)
    public void testDangKyTKForm(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.getTitleForm().isEnabled();
        logInPage.getFirstName().sendKeys("test1");
        logInPage.getLastName().sendKeys("testPW");
        logInPage.getEmail().sendKeys("lttnhung2511@gmail.com");

    }



    @AfterClass
    public void closeAllBrowsers(){
        driver.quit();
    }
}
