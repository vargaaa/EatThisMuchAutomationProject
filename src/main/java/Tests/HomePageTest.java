package Tests;

import BaseTest.BaseTest;


import HelpMethods.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {
    public GeneralMethods generalMethods;

    @Test
    public void generatorAnythingThreeMeals() {
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement anythingCategory = driver.findElement(By.xpath("//ul[@class='nav nav-pills preset_selector no-gutters text-center']/li[@data-value='anything']"));
        WebElement calInput = driver.findElement(By.id("cal_input"));
        WebElement numberOfMeals = driver.findElement(By.xpath("//select[@id='num_meals_selector']"));
        WebElement option3Meals = driver.findElement(By.xpath("//option[@value='3']"));
        WebElement generateButton = driver.findElement(By.xpath("//div[@class='col-12 col-md-3 offset-md-4 offset-lg-5']/button[@data-loading-text='Generate']"));

        anythingCategory.click();
        calInput.sendKeys("3000");
        numberOfMeals.click();
        option3Meals.click();
        generateButton.click();
    }

    @Test
    public void generatorPaleoMeal() {
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement paleoCategory = driver.findElement(By.xpath("//ul[@class='nav nav-pills preset_selector no-gutters text-center']/li[@data-value='paleo']"));
        WebElement calInput = driver.findElement(By.id("cal_input"));
        WebElement numberOfMeals = driver.findElement(By.xpath("//select[@id='num_meals_selector']"));
        WebElement option3Meals = driver.findElement(By.xpath("//option[@value='4']"));
        WebElement generateButton = driver.findElement(By.xpath("//div[@class='col-12 col-md-3 offset-md-4 offset-lg-5']/button[@data-loading-text='Generate']"));

        paleoCategory.click();
        calInput.sendKeys("2000");
        numberOfMeals.click();
        option3Meals.click();
        generateButton.click();
    }

    @Test
    public void generatorVegetarianMeal() {
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement paleoCategory = driver.findElement(By.xpath("//ul[@class='nav nav-pills preset_selector no-gutters text-center']/li[@data-value='vegetarian']"));
        WebElement calInput = driver.findElement(By.id("cal_input"));
        WebElement numberOfMeals = driver.findElement(By.xpath("//select[@id='num_meals_selector']"));
        WebElement option3Meals = driver.findElement(By.xpath("//option[@value='4']"));
        WebElement generateButton = driver.findElement(By.xpath("//div[@class='col-12 col-md-3 offset-md-4 offset-lg-5']/button[@data-loading-text='Generate']"));

        paleoCategory.click();
        calInput.sendKeys("2000");
        numberOfMeals.click();
        option3Meals.click();
        generateButton.click();
    }

    @Test
    public void generatorVeganMeal() {
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement paleoCategory = driver.findElement(By.xpath("//ul[@class='nav nav-pills preset_selector no-gutters text-center']/li[@data-value='vegan']"));
        WebElement calInput = driver.findElement(By.id("cal_input"));
        WebElement numberOfMeals = driver.findElement(By.xpath("//select[@id='num_meals_selector']"));
        WebElement option3Meals = driver.findElement(By.xpath("//option[@value='4']"));
        WebElement generateButton = driver.findElement(By.xpath("//div[@class='col-12 col-md-3 offset-md-4 offset-lg-5']/button[@data-loading-text='Generate']"));

        paleoCategory.click();
        calInput.sendKeys("2000");
        numberOfMeals.click();
        option3Meals.click();
        generateButton.click();
    }

    @Test
    public void generatorKetogenicMeal() {
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement paleoCategory = driver.findElement(By.xpath("//ul[@class='nav nav-pills preset_selector no-gutters text-center']/li[@data-value='atkins / ketogenic']"));
        WebElement calInput = driver.findElement(By.id("cal_input"));
        WebElement numberOfMeals = driver.findElement(By.xpath("//select[@id='num_meals_selector']"));
        WebElement option3Meals = driver.findElement(By.xpath("//option[@value='4']"));
        WebElement generateButton = driver.findElement(By.xpath("//div[@class='col-12 col-md-3 offset-md-4 offset-lg-5']/button[@data-loading-text='Generate']"));

        paleoCategory.click();
        calInput.sendKeys("2000");
        numberOfMeals.click();
        option3Meals.click();
        generateButton.click();
    }

    @Test
    public void generatorMediterraneanMeal() {
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement paleoCategory = driver.findElement(By.xpath("//ul[@class='nav nav-pills preset_selector no-gutters text-center']/li[@data-value='mediterranean']"));
        WebElement calInput = driver.findElement(By.id("cal_input"));
        WebElement numberOfMeals = driver.findElement(By.xpath("//select[@id='num_meals_selector']"));
        WebElement option3Meals = driver.findElement(By.xpath("//option[@value='4']"));
        WebElement generateButton = driver.findElement(By.xpath("//div[@class='col-12 col-md-3 offset-md-4 offset-lg-5']/button[@data-loading-text='Generate']"));

        paleoCategory.click();
        calInput.sendKeys("2000");
        numberOfMeals.click();
        option3Meals.click();
        generateButton.click();
    }


    @Test
    public void homePageGeneratorNotSure() {
        generalMethods = new GeneralMethods(driver);
        String expectedTitle = "The Automatic Meal Planner - Eat This Much";
        generalMethods.validatePageTitle(expectedTitle);

        generalMethods.scrollDown();

        WebElement notSureButton = driver.findElement(By.id("not_sure_button"));

        WebElement goalBuildMuscles = driver.findElement(By.xpath("//*[contains(text(), 'Build muscle')]"));

        WebElement usStandard = driver.findElement(By.xpath("//*[contains(text(), 'U.S. Standard')]"));
        WebElement heightFt = driver.findElement(By.id("height-primary"));
        WebElement heightIn = driver.findElement(By.id("height-secondary"));
        WebElement weight = driver.findElement(By.id("weight"));
        WebElement years = driver.findElement(By.id("age"));
        WebElement sex = driver.findElement(By.xpath("//*[contains(text(), 'Male')]"));

        WebElement metricSystem = driver.findElement(By.xpath("//*[contains(text(), 'Metric')]"));
        WebElement bodyFatLow = driver.findElement(By.xpath("//*[contains(text(), 'Low')]"));

        notSureButton.click();

        generalMethods.scrollDown();

        goalBuildMuscles.click();

        usStandard.click();
        sex.click();
        heightFt.sendKeys("6");
        heightIn.sendKeys("5");
        weight.sendKeys("190");
        years.sendKeys("24");

        metricSystem.click();
        bodyFatLow.click();

        generalMethods.scrollDown();

        WebElement activitySelector = driver.findElement(By.id("activity_level_dropdown"));
        activitySelector.click();

        WebElement veryActive = driver.findElement(By.xpath("//div[@id='activity_level_dropdown']//option[@value='1.725']"));
        veryActive.click();

        WebElement calculateButton = driver.findElement(By.id("calculate_button"));
        calculateButton.click();


        //TODO
        //WebElement enterGoal=driver.findElement(By.xpath("//*[contains(text(), 'Yeah let's do it')]"));
        //enterGoal.click();

//        WebElement newWeightGoal=driver.findElement(By.id("c59_weight_goal"));
//        newWeightGoal.sendKeys("90");


        WebElement closeButton = driver.findElement(By.className("close"));
        closeButton.click();


    }
}
