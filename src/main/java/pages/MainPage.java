package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static core.DriverFactory.getDriver;

public class MainPage extends BasePage {

    public void accessMainScreen(){
        //Email user@phptravels.com Password demouser
        //https://www.phptravels.net/
        getDriver().get("https://www.phptravels.net/");
    }
    public void accessLoginScreen(){
        clicarLink(By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[@id='li_myaccount']//a[@class='dropdown-toggle go-text-right']"));
        clicarLink(By.linkText("Login"));
    }
    public String getSuccessMessage(){
        return obterTexto(By.xpath("//h3[@class='RTL']"));
    }
}
