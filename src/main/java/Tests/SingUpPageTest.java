package Tests;

import BaseTest.BaseTest;
import HelpMethods.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SingUpPageTest extends BaseTest {
    public GeneralMethods generalMethods;

    @Test
    public void SignUpTest() throws InterruptedException {
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

        Thread.sleep(1000);
        WebElement buttonShowPass = driver.findElement(By.xpath("//li[3]//button[@class='svelte-695ua8']"));
        buttonShowPass.click();
        Thread.sleep(1000);
        WebElement buttonHidePass = driver.findElement(By.xpath("//li[3]//button[@class='svelte-695ua8']"));
        buttonHidePass.click();

        WebElement confirmPass = driver.findElement(By.xpath("//li[4]//div[@class='svelte-695ua8']/input[@type='password']"));
        confirmPass.sendKeys("password123@");

        Thread.sleep(1000);
        WebElement buttonShowConfirmPass = driver.findElement(By.xpath("//li[4]//button[@class='svelte-695ua8']"));
        buttonShowConfirmPass.click();
        Thread.sleep(1000);
        WebElement buttonHideConfirmPass = driver.findElement(By.xpath("//li[4]//button[@class='svelte-695ua8']"));
        buttonHideConfirmPass.click();

        Thread.sleep(1000);
        WebElement termsCheckBox=driver.findElement(By.xpath("//li[@class='terms-of-service svelte-1ntqfon']//input[@class='svelte-1o2prm5']"));
        termsCheckBox.click();

    }
}
