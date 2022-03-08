package com.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class HomePage{
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //@FindBy (xpath = "//*[@id='wx-link-login-desktop']/div/span']")
      @FindBy (className ="user-text-noLogin" )
            private WebElement dangNhapButton;

   // @FindBy (css = "a[href='https://www.vietnamworks.com/dang-ky?redirectURL=https%3A%2F%2Fwww.vietnamworks.com%2F%3Futm_source%3D%26utm_medium%3DHeader&t=1646695794948'")
       //@FindBy (xpath = "//a[@href='https://www.vietnamworks.com/dang-ky?redirectURL=https%3A%2F%2Fwww.vietnamworks.com%2F%3Futm_source%3D%26utm_medium%3DHeader&t=1646695794948']")

        @FindBy (css="div.dropdownSection:nth-child(3) > a:nth-child(1) > span:nth-child(2)")
       private WebElement dangKyTKLink;

    public WebElement getDangNhapButton(){
        return dangNhapButton;
    }

    public WebElement getDangKyTKLink(){
        return dangKyTKLink;
    }


    public String getPageTitle(){
        return driver.getTitle();
        //assertThat(pageTitle,is(title));

    }
}
