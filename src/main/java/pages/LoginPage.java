package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    public void setEmail(String email) {
        aguardarElementoPorTexto(By.xpath("//label[contains(text(),'Email')]"),"Email");
        escrever(By.xpath("//input[@placeholder='Email']"), email);
    }

    public void setPass(String password) {

        escrever(By.xpath("//input[@placeholder='Password']"), password);
    }

    public void enter(){

        clicarBotaoPorTexto("Login");
    }
}
