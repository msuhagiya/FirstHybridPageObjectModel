package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    By _clickOnRegistration = By.linkText("Register");
    By _clickOnDetailLink = By.xpath("//div[@class='master-wrapper-page']/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[3]/a[1]");
    By _clickOnComputerCategory = By.linkText("Computers");
    public void clickOnRegistration() {
        //Click on register button
        clickOnElement(_clickOnRegistration);
    }
    public void clickOnDetailUnderNews()
    {
        //click on detail underneath news
        clickOnElement(_clickOnDetailLink);
    }
    public void clickOnComputerMenu()
    {
        //Click on category Computer
        clickOnElement(_clickOnComputerCategory);
    }
}
