package POMElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.List;

public class WebTables {
    public Driver driver;
    public WebDriverWait wdwait;
    WebElement addButton;
    WebElement searchBox;
    List <WebElement> editButton;
    WebElement delete;
    WebElement firstName;
    WebElement lastName;
    WebElement email;
    WebElement age;
    WebElement salary;
    WebElement department;
    WebElement submitButton;
    List <WebElement> cellInfo;
    List<WebElement> rowInfo;



    public WebTables(Driver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
