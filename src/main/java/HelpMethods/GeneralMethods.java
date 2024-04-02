package HelpMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GeneralMethods {
    private WebDriver driver;

    public GeneralMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void validatePageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle), "Wrong title");
    }

    public String homePageRedirectionsSelector(int i){
        return "//ul[@class='navbar-nav justify-content-md-center col-md']/li["+i+"]";
    }

    public void returnToHomePage(){
        WebElement backToHomePageRedirection=driver.findElement(By.xpath("//a[@class='navbar-brand']"));
        backToHomePageRedirection.click();
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }
}
