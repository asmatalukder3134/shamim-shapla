package firstFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryRun {

	@FindBy(name = "userName")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "submit")
	WebElement submit;

	WebDriver dr;

	@AfterTest
	void tearDown() {
		dr.quit();
	}

	@BeforeTest
	void openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shapl\\Documents\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://demo.guru99.com/test/newtours/");

		dr.manage().deleteAllCookies();
		String title = dr.getTitle();
		System.out.println(title);
	}

	@Test
	public void file() throws IOException, InterruptedException {
		PageFactory.initElements(dr, this);
		File file = new File("C:\\Users\\shapl\\eclipse-workspace2"
				+ "\\childPlace\\src\\main\\resources\\AllFile\\loggingCredential");

		FileInputStream fis = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fis);
		String name = prop.getProperty("userName");
		String pass = prop.getProperty("password");

		userName.sendKeys(name);
		password.sendKeys(pass);
		submit.click();
		Thread.sleep(20000);

	}

	@Test(invocationCount = 2)
	void sys() {
		System.out.println(100);
	}

}
