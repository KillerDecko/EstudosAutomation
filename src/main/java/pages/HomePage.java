package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    // //div[@id='select2-drop']//input[@type='text']
    // //ul[@class='nav nav-tabs RTL nav-justified']/*[contains(.,'Flights')]
    public void selectMenuByVisibleText(String text){
        clicarLink(By.xpath("//ul[@class='nav nav-tabs RTL nav-justified']/*[contains(.,'"+text+"')]/a"));
    }

    public void writeTextInputByDivId(String Id, String text){
        // //div[@id='dpd1']//input[@type='text']
        escrever(By.xpath("//div[@id='"+Id+"']//input[@type='text']"), text);
    }

}
