package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    private WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "div.title")
    private WebElement titleForm;

    @FindBy (id = "firstname")
        private WebElement firstName;

    @FindBy (id = "lastname")
    private WebElement lastName;

    @FindBy (id = "username")
        private WebElement email;

    public WebElement getTitleForm(){
        //return newMemberMessage;
        //WebElement message = driver.findElement(By.id("loginForm-Email"));
        return titleForm;
    }

    public WebElement getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName.sendKeys(firstName);
    }

    public WebElement getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName.sendKeys(lastName);
    }


    public WebElement getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email.sendKeys(email);
    }
}
