package Tests;

import BaseTest.BaseTest;
import HelpMethods.GeneralMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SingUpPageTest extends BaseTest {
    public GeneralMethods generalMethods;

    @Test
    public void SignUpTest() {
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        WebElement signUpButton = driver.findElement(By.xpath("//div[@class='col-auto ']/a[@class='btn btn-block btn-orange register-button']"));
        signUpButton.click();

        WebDriverWait waitPageLoading = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitPageLoading.until(ExpectedConditions.titleContains("Register"));

        String registrationTitle = "Register";
        generalMethods.validatePageTitle(registrationTitle);

        WebElement userField = driver.findElement(By.xpath("//div[@class='svelte-1brqcpa']/input[@type='text']"));
        userField.sendKeys("ndrev");

        WebElement emailField = driver.findElement(By.xpath("//div[@class='svelte-1brqcpa']/input[@type='email']"));
        emailField.sendKeys("andrei.varga182@gmail.com");

        WebElement pass = driver.findElement(By.xpath("//li[3]//div[@class='svelte-695ua8']/input[@type='password']"));
        pass.sendKeys("password123@");

        WebElement buttonShowPass = driver.findElement(By.xpath("//li[3]//button[@class='svelte-695ua8']"));
        buttonShowPass.click();
        WebElement buttonHidePass = driver.findElement(By.xpath("//li[3]//button[@class='svelte-695ua8']"));
        buttonHidePass.click();

        WebElement confirmPass = driver.findElement(By.xpath("//li[4]//div[@class='svelte-695ua8']/input[@type='password']"));
        confirmPass.sendKeys("password123@");

        WebElement buttonShowConfirmPass = driver.findElement(By.xpath("//li[4]//button[@class='svelte-695ua8']"));
        buttonShowConfirmPass.click();
        WebElement buttonHideConfirmPass = driver.findElement(By.xpath("//li[4]//button[@class='svelte-695ua8']"));
        buttonHideConfirmPass.click();

        WebElement createButton= driver.findElement(By.xpath("//p[@class='submit svelte-1ntqfon']/button"));
        createButton.click();

        generalMethods.validatePageTitle(registrationTitle);
        System.out.println(driver.getTitle());

    }

    @Test
    public void existingUser() {
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        WebElement signUpButton = driver.findElement(By.xpath("//div[@class='col-auto ']/a[@class='btn btn-block btn-orange register-button']"));
        signUpButton.click();

        WebElement userField = driver.findElement(By.xpath("//div[@class='svelte-1brqcpa']/input[@type='text']"));
        userField.sendKeys("ndrev");

        WebElement clickOut = driver.findElement(By.xpath("//h1[@class='svelte-1rr400p']"));
        clickOut.click();

        WebElement expectedMessage = driver.findElement(By.xpath("//li[1]/div[@class='warning svelte-1vdzk1k']"));
        Assert.assertTrue(expectedMessage.getText().equals("A user with that username already exists."), "User available");
    }

    @Test
    public void existingEmail() {
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        WebElement signUpButton = driver.findElement(By.xpath("//div[@class='col-auto ']/a[@class='btn btn-block btn-orange register-button']"));
        signUpButton.click();

        WebElement emailField = driver.findElement(By.xpath("//div[@class='svelte-1brqcpa']/input[@type='email']"));
        emailField.sendKeys("andrei.varga182@gmail.com");

        WebElement clickOut = driver.findElement(By.xpath("//h1[@class='svelte-1rr400p']"));
        clickOut.click();

        WebElement expectedMessage = driver.findElement(By.xpath("//li[2]/div[@class='warning svelte-1vdzk1k']"));
        Assert.assertTrue(expectedMessage.getText().equals("This email address is already in use. Please supply a different email address."), "Mail not utilised");
    }
}
