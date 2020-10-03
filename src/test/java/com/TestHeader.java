package com;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestHeader extends TestBase {
    @Test
    public void testHeader() {
        //click On Search button & check field
        wd.findElement(By.cssSelector("[href='/search']")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//h3[contains(text(),'Find your car now!')]")));


        // click Let the car work button & check field
         wd.findElement(By.cssSelector("[href='/car']")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//h3[contains(text(),'Let the car work')]")));

        // click Sign Up & check field
        wd.findElement(By.cssSelector("[href='/signup']")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

            // click Login & check field
        wd.findElement(By.cssSelector("[href='/login']")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//span[contains(text(),'Type your data and hit Yalla!')]")));




    }
}