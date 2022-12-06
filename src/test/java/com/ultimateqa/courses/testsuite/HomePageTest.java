package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homepage = new HomePage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homepage.navigatedToLoginPageWithClick();
    }
}
