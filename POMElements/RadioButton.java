package POMElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement yes;
    WebElement impressive;
    WebElement textSuccess;
    WebElement no;

    public WebElement getTextSuccess() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > p > span"));
    }

    public RadioButton(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getYes() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(2) > label"));
    }

    public WebElement getImpressive() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(3) > label"));
    }


    public void klikniYes (){
        getYes().click();
    }
    public String uzmiText (){
        String g =  getTextSuccess().getAttribute("innerHTML");
        return g;
    }
    public void klikniImpressive(){
        getImpressive().click();
    }

    public WebElement getNo() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div.custom-control.disabled.custom-radio.custom-control-inline > label"));
    }
    public void klikNo(){
        getNo().click();
    }
}
