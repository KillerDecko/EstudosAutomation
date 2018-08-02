package pages;

import core.BasePage;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class MenuPage extends BasePage {

    public void accessMenuByName(String menu){
        clicarLink(By.xpath("//li[@class=\"main-lnk \"]/*[contains(., '" +menu+"')]"));
    }

    public void accessMainScreen(){
        clicarLink(By.xpath("//a[@class='navbar-brand']"));
    }
    public void accessHomeScreen(){
        clicarLink(By.linkText("Home"));
    }
    public void accessHotelsScreen(){
        clicarLink(By.linkText("Hotels"));
    }
    public void accessFlightsScreen(){
        clicarLink(By.linkText("Flights"));
    }
    public void accessToursScreen(){
        clicarLink(By.linkText("Tours"));
    }
    public void accessCarsScreen(){
        clicarLink(By.linkText("Cars"));
    }
    public void accessVisaScreen(){
        clicarLink(By.linkText("Visa"));
    }
    public void accessOffersScreen(){
        clicarLink(By.linkText("Offers"));
    }
    public void accessBlogScreen(){
        clicarLink(By.linkText("Blog"));
    }

}
