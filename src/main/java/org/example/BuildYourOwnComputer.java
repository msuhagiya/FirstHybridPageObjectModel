package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnComputer extends Utils {
    By _clickOnEmailAFriendButton = By.xpath("//form[@id='product-details-form']/div[2]/div/div[2]/div[10]/div[3]/button");
    public void verifyUseIsOnBuildYourOwnComputerPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("build-your-own-computer"),"You are not on Build your own computer page");
    }
    public void clickOnEmailAFriend()
    {
        //Click on Email a friend
        clickOnElement(_clickOnEmailAFriendButton);
    }
}
