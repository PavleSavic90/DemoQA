package POMElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.List;

public class Links {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public List <WebElement> allLinks;
    WebElement poruka;


    public WebElement getPoruka() {
        return driver.findElement(By.cssSelector("#linkResponse"));
    }

    public Links(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getAllLinks() {
        return driver.findElement(By.id("linkWrapper")).findElements(By.tagName("a"));

    }
    public void nextTab () {
        String parentWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()){
            if (!parentWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
    public void mainTab(){
        String parentWindow = driver.getWindowHandle();
        driver.switchTo().window(parentWindow);
    }


}
