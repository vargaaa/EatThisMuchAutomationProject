package Tests;

import BaseTest.BaseTest;
import HelpMethods.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class LoginPageTest extends BaseTest {
    public GeneralMethods generalMethods;
    @Test
    public void successfulLogin(){
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        WebElement loginPageRedirection=driver.findElement(By.xpath("//form[@class='form text-center no-gutters']//a[@class='sign-in-link']"));
        loginPageRedirection.click();

        generalMethods.getPageTitle();

        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("andrei.varga182@gmail.com");
        WebElement password=driver.findElement(By.xpath("//div[@class='svelte-695ua8']/input"));
        password.sendKeys("password123@");
        WebElement loginButton=driver.findElement(By.xpath("//button[@class='_interaction_11et8_1 primary svelte-1m78l37']"));
        loginButton.click();

        WebDriverWait pageLoading= new WebDriverWait(driver,Duration.ofSeconds(10));
        pageLoading.until(ExpectedConditions.titleContains("Today"));
        generalMethods.validatePageTitle("Today");

        //assert

        generalMethods.getPageTitle();
        String titlePage="Today";
        Assert.assertTrue(driver.getTitle().equals(titlePage));
    }

    @Test
    public void wrongUserLoginFail(){
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        WebElement loginPageRedirection=driver.findElement(By.xpath("//form[@class='form text-center no-gutters']//a[@class='sign-in-link']"));
        loginPageRedirection.click();

        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("andrei.varga@gmail.com");
        WebElement password=driver.findElement(By.xpath("//div[@class='svelte-695ua8']/input"));
        password.sendKeys("password123@");
        WebElement loginButton=driver.findElement(By.xpath("//button[@class='_interaction_11et8_1 primary svelte-1m78l37']"));
        loginButton.click();

        WebElement expectedMessage=driver.findElement(By.xpath("//div[@class='warning svelte-1vdzk1k']"));
        Assert.assertTrue(expectedMessage.getText().contains("Please enter a correct username and password. Note that both fields may be case-sensitive."));
    }

    @Test
    public void wrongPasswordLoginFail(){
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        WebElement loginPageRedirection=driver.findElement(By.xpath("//form[@class='form text-center no-gutters']//a[@class='sign-in-link']"));
        loginPageRedirection.click();

        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("andrei.varga182@gmail.com");
        WebElement password=driver.findElement(By.xpath("//div[@class='svelte-695ua8']/input"));
        password.sendKeys("password");
        WebElement loginButton=driver.findElement(By.xpath("//button[@class='_interaction_11et8_1 primary svelte-1m78l37']"));
        loginButton.click();

        WebElement expectedMessage=driver.findElement(By.xpath("//div[@class='warning svelte-1vdzk1k']"));
        Assert.assertTrue(expectedMessage.getText().contains("Please enter a correct username and password. Note that both fields may be case-sensitive."));
    }

    @Test
    public void forgotPasswordTest(){
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        WebElement loginPageRedirection=driver.findElement(By.xpath("//form[@class='form text-center no-gutters']//a[@class='sign-in-link']"));
        loginPageRedirection.click();

        WebElement forgotPassButton=driver.findElement(By.xpath("//*[contains(text(), 'Forgot Password')]"));
        forgotPassButton.click();

        WebElement emailField=driver.findElement(By.xpath("//ul[@class='_class_1ajrk_1 svelte-sb5uci']//input"));
        emailField.sendKeys("andrei.varga182@gmail.com");

        WebElement recoveryPassButton=driver.findElement(By.xpath("//button[@class='_interaction_11et8_1 primary svelte-1m78l37']"));
        recoveryPassButton.click();

        WebDriverWait waitPageLoading = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitPageLoading.until(ExpectedConditions.titleContains("Reset Password"));
        Assert.assertTrue(driver.getTitle().equals("Reset Password"),"Button not working");
    }

}
