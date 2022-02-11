package POMbase;

import POMElements.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class BasePageDemoQA {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public TextBox textBox;
    public ExcelReader excelReader;
    public String HomeURL;
    public String ElementsPage;
    public String submeniElements;
    public String test;
    public RadioButton radioButton;
    public Buttons buttons;
    public Checkbox checkbox;
    public Links links;


    public void waiter (WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader= new ExcelReader("C:\\Users\\Pavle\\Desktop\\DemoQA.xlsx");
        textBox = new TextBox(driver, wdwait);
        HomeURL = excelReader.getStringData("DemoQA",1,0);
        ElementsPage = excelReader.getStringData("DemoQA",1,1);
        submeniElements = excelReader.getStringData("DemoQA", 1,2);
        radioButton = new RadioButton(driver,wdwait);
        buttons = new Buttons(driver);
        checkbox = new Checkbox(driver,wdwait);
        links = new Links(driver, wdwait);




        }


    @AfterClass
    public void tearDown(){
//        driver.manage().deleteAllCookies();
//        driver.close();
//        driver.quit();
    }


}
