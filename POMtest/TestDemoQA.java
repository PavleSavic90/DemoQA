package POMtest;

import POMbase.BasePageDemoQA;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestDemoQA extends BasePageDemoQA {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @BeforeMethod
    public void setUpPage(){
        driver.navigate().to(HomeURL);
    }


    @Test
    public void invalidEmail(){
        textBox.goToTextBox();
        String validName = "Pavle";
        textBox.inputFullName(validName);
        String invalidEmail = "Testwithout@dot";
        textBox.inputEmail(invalidEmail);
        String address = "Luke Vojvodica";
        textBox.inputCurrentAddress(address);
        textBox.inputPermanentAdress(address);
        textBox.clickSubmit();
        boolean tuJe = textBox.getOutput().isDisplayed();
        Assert.assertEquals(tuJe, false);
        //We tested that you cannot submit textbox with invalid address (without . and at least 2 letters
    }
    @Test
    public void validInformations(){
        textBox.goToTextBox();
        String validName = "Pavle";
        textBox.inputFullName(validName);
        String validEmail = "Testwith@dot.com";
        textBox.inputEmail(validEmail);
        String address = "Luke Vojvodica";
        textBox.inputCurrentAddress(address);
        textBox.inputPermanentAdress(address);
        textBox.clickSubmit();
        boolean tuJe = textBox.getOutput().isDisplayed();
        Assert.assertEquals(tuJe, true);
        //We tested that you can login with valid informations.

    }
    @Test
    public void radioButtonTests (){
        driver.navigate().to("https://demoqa.com/radio-button");
        radioButton.klikniYes();
        radioButton.uzmiText();
        Assert.assertEquals(radioButton.uzmiText(),"Yes");
        radioButton.klikniImpressive();
        Assert.assertEquals(radioButton.uzmiText(),"Impressive");
        radioButton.klikNo();
        Assert.assertNotEquals(radioButton.uzmiText(),"No");
        //We tested all buttons, first two are clickable and we assert with the css selector, text - success
        //We also asserted that no is not clickable and that string is not equal to "No"
    }
    @Test
    public void buttonTest () throws InterruptedException {
        driver.navigate().to("https://demoqa.com/buttons");
        Thread.sleep(1000);
        buttons.doubleClick();
        Assert.assertEquals(buttons.doubleClickMessage(),"You have done a double click");
        buttons.rightClick();
        Assert.assertEquals(buttons.rightClickMessage(),"You have done a right click");
        //Assert.assertEquals(buttons.dynamicClickMessage(),"You have done a dynamic click");
    }
    @Test
    public void checkBoxesTest (){
        driver.navigate().to("https://demoqa.com/checkbox");
        checkbox.clickOnArrow1();
        checkbox.clickOnArrow2();
        checkbox.clickOnArrow3();
        checkbox.clickOnHome();
        String[] expected = {"home", "desktop","notes","commands","documents","workspace","react","angular","veu","office","public","private","classified","general"
                ,"downloads","wordFile","excelFile"};
        Assert.assertEquals(checkbox.getListOfMessages().size(), expected.length);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], checkbox.getListOfMessages().get(i).getText());
        }

    }
    @Test
    public void testestetete () throws InterruptedException {
        driver.navigate().to("https://demoqa.com/links");
        System.out.println(links.getAllLinks().size());
        links.getAllLinks().size();
        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        String x = "https://demoqa.com/";
        for (int i = 0; i < links.getAllLinks().size(); i++) {
            links.getAllLinks().get(i).click();
            links.nextTab();
            if (driver.getCurrentUrl().contains("https://demoqa.com/")){
                Thread.sleep(1000);
                System.out.println("radi");
                Assert.assertEquals(driver.getCurrentUrl(),x);
                Thread.sleep(5000);
            driver.close();
            }
        }
    }
    @Test
    public void testTexta()  throws InterruptedException{
        String messageText;
        driver.navigate().to("https://demoqa.com/links");
        links.getAllLinks().size();
        for (int i = 2; i < links.getAllLinks().size();i++){
            links.getAllLinks().get(i).click();
            //wdwait.until(ExpectedConditions.elementToBeClickable(links.getPoruka()));

           // waiter(links.getPoruka());

            wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("#linkResponse")));
            messageText = links.getPoruka().getText();
            Assert.assertEquals(messageText,links.getPoruka().getText());
            System.out.println(messageText);
            driver.navigate().refresh();
        }

    }
}



