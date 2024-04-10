package BaseTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    //BeforeMethod ruleaza inainta fiecarei metode de test
    @BeforeMethod
    public void openSite(){
        driver= new ChromeDriver();
        driver.get("https://www.eatthismuch.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //AfterMethod ruleaza dupa fiecare clasa de test
    //restore to initial state
    @AfterMethod
    public void closeDriver(){
        //.close() inchide doar fereastra curenta
        //.quit() inchide browserul
        driver.quit();
    }
}
