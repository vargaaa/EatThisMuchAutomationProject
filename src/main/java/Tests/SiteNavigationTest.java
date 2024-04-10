package Tests;

import BaseTest.BaseTest;
import HelpMethods.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SiteNavigationTest extends BaseTest {
    public GeneralMethods generalMethods;

    @Test
    public void homePageTest() throws InterruptedException {
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        Thread.sleep(1500);
        WebElement howItWorkPageRedirection = driver.findElement(By.xpath(generalMethods.homePageRedirectionsSelector(1)));
        howItWorkPageRedirection.click();
        String howItWorksPage = "How it works - Eat This Much";
        generalMethods.validatePageTitle(howItWorksPage);
        generalMethods.getPageTitle();

        generalMethods.returnToHomePage();
        generalMethods.getPageTitle();

        WebElement browseFoodsPageRedirection = driver.findElement(By.xpath(generalMethods.homePageRedirectionsSelector(2)));
        browseFoodsPageRedirection.click();
        String browseFoodsPage = "Food and Recipe browser - Eat This Much";
        generalMethods.validatePageTitle(browseFoodsPage);
        generalMethods.getPageTitle();

        generalMethods.returnToHomePage();
        generalMethods.getPageTitle();

        WebElement supportedDietsPageRedirection = driver.findElement(By.xpath(generalMethods.homePageRedirectionsSelector(3)));
        supportedDietsPageRedirection.click();
        String supportedDietsPage = "Diet Types - Eat This Much";
        generalMethods.validatePageTitle(supportedDietsPage);
        generalMethods.getPageTitle();

        generalMethods.returnToHomePage();
        generalMethods.getPageTitle();


        WebElement forProfessionalsPageRedirection = driver.findElement(By.xpath(generalMethods.homePageRedirectionsSelector(4)));
        forProfessionalsPageRedirection.click();
        String forProfessionalsPage = "Meal Planner for Trainers and Dietitians - Eat This Much";
        generalMethods.validatePageTitle(forProfessionalsPage);
        generalMethods.getPageTitle();

        generalMethods.returnToHomePage();
        generalMethods.getPageTitle();

        WebElement registerPageRedirection = driver.findElement(By.xpath("//div[@class='col-auto ']/a[@class='btn btn-block btn-orange register-button']"));
        registerPageRedirection.click();
        generalMethods.getPageTitle();

        WebElement logoRegisterPage = driver.findElement(By.xpath("//a[@aria-label='Eat This Much']"));
        logoRegisterPage.click();
        generalMethods.getPageTitle();

        WebElement signInPageRedirection = driver.findElement(By.xpath("//form[@class='form text-center no-gutters']/a[@class='sign-in-link']"));
        signInPageRedirection.click();
        generalMethods.getPageTitle();

        WebElement logoLoginPage = driver.findElement(By.xpath("//a[@aria-label='Eat This Much']"));
        logoLoginPage.click();
        generalMethods.getPageTitle();
    }
}
