package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By navigateToSignInButton = By.xpath("//li[@class='header__nav-item header__nav-sign-in']/a[1]");

    By welcomeBackMessage = By.xpath("//h1[@class='page__heading']");

    By invalidUsername = By.id("user[email]");

    By passcode = By.id("user[password]");

    By signInButton = By.xpath("//input[@type='submit' and @value='Sign in']");

    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public void navigatedToLoginPage(){
        clickOnElement(navigateToSignInButton);
    }
    public String Message(){
        return getTextFromElement(welcomeBackMessage);
    }
    public void userName(String email) {
        sendTextToElement(invalidUsername,email);
    }
    public void passwordField(String password){
        sendTextToElement(passcode,password);
    }
    public String messageOccur(){
        return getTextFromElement(errorMessage);
    }
    public void setSignInButton(){
        clickOnElement(signInButton);
    }}