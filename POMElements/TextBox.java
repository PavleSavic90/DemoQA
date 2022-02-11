package POMElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submit;
    WebElement output;


    public TextBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmit() {
        return driver.findElement(By.id("submit"));
    }

    public void goToTextBox(){
        driver.navigate().to("https://demoqa.com/text-box");
    }

    public void inputFullName(String a){
        getFullName().sendKeys(a);
    }
    public void inputEmail(String a){
        getEmail().sendKeys(a);
    }
    public void inputCurrentAddress(String a){
        getCurrentAddress().sendKeys(a);
    }
    public void inputPermanentAdress(String a){
        getPermanentAddress().sendKeys(a);
    }
    public void clickSubmit(){
        getSubmit().click();
    }

    public WebElement getOutput() {
        return driver.findElement(By.id("output"));
    }
}
