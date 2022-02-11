package POMElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;

public class Buttons {

    public WebDriverWait wdwait;
    public WebDriver driver;


    WebElement doubleClick;
    WebElement rightClick;
    WebElement clickMe;
    WebElement doubleClickMessage;
    WebElement rightClickMessage;
    WebElement dynamicClickMessage;
    List<WebElement> buttons;


    public List<WebElement> getButtons() {
        return driver.findElements(By.cssSelector("button"));
    }
    public void print (){
        System.out.println(getButtons().size());
    }

    public WebElement getDoubleClickMessage() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getRightClickMessage() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getDynamicClickMessage() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

    public Buttons(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDoubleClick() {
        return driver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement getRightClick() {
        return driver.findElement(By.id("rightClickBtn"));
    }

    public WebElement getClickMe() {
        return driver.findElement(By.cssSelector(".col-12.mt-4.col-md-6"));
    }
    public void doubleClick () throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.doubleClick(getDoubleClick()).perform();
    }
    public String doubleClickMessage (){
        return getDoubleClickMessage().getText();
    }
    public void rightClick(){
        Actions actions = new Actions(driver);
        actions.contextClick(getRightClick()).perform();
    }
    public String rightClickMessage(){
        return getRightClickMessage().getText();
    }
    public void dynamicClick (){
        getClickMe().click();
    }
    public String dynamicClickMessage(){
        return getDynamicClickMessage().getText();
    }
}
