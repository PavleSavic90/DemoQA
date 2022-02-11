package POMElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Checkbox {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement home;
    WebElement arrow1;
    WebElement arrow2;
    WebElement arrow3;
    List<WebElement> listOfMessages;

    public Checkbox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getListOfMessages() {
        return driver.findElements(By.className("text-success"));
    }

    public WebElement getHome() {
        return driver.findElement(By.cssSelector(".rct-title"));
    }

    public WebElement getArrow2() {
        return driver.findElement(By.cssSelector("li.rct-node:nth-child(2) > span:nth-child(1) > button:nth-child(1)"));
    }
    public WebElement getArrow1() {
        return driver.findElement(By.cssSelector(".rct-collapse"));
    }

    public WebElement getArrow3() {
        return driver.findElement(By.cssSelector("li.rct-node-collapsed:nth-child(2) > span:nth-child(1) > button:nth-child(1)"));
    }
    public void clickOnArrow1 (){
        getArrow1().click();
    }
    public void clickOnArrow2(){
        getArrow2().click();
    }
    public void clickOnArrow3(){
        getArrow3().click();
    }
    public void clickOnHome (){
        getHome().click();
    }
}
