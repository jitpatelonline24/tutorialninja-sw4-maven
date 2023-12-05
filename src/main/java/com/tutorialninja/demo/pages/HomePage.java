package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Login");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void registerLink(){
        clickOnElement(registerLink);
    }

}
