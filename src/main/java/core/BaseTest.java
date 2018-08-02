package core;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.MainPage;
import pages.LoginPage;
import pages.MenuPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

public class BaseTest {

	MainPage page = new MainPage();
	LoginPage logPage = new LoginPage();
	MenuPage menPage = new MenuPage();

	@Before
	public void inicializa(){
		//Email user@phptravels.com Password demouser
		//https://www.phptravels.net/
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		page.accessMainScreen();
		page.accessLoginScreen();

		logPage.setEmail("user@phptravels.com");
		logPage.setPass("demouser");
		logPage.enter();
	}

	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		/*
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
		File.separator + testName.getMethodName() + ".jpg"));
		 */

		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

}
