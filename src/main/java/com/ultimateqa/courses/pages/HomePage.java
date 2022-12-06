package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By navigateToLoginPage = By.xpath("//li[@class='header__nav-item header__nav-sign-in']/a[1]");


    public void navigatedToLoginPageWithClick(){
        clickOnElement(navigateToLoginPage);

    }

}
