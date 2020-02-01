package firstFramework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import jdk.incubator.http.internal.common.Log;

public class Base {
WebDriver driver;
public static Logger log=LogManager.getLogger();
@Test(invocationCount=1)
public void openBrowser() throws IOException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\shapl\\Documents\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.childrensplace.com/us/home");
	String title=driver.getTitle();
	System.out.println("This is the title"+" "+title);
	log.fatal("this is perfect title");
	log.warn("This is perfect title");
	log.error("This is perfect title");
	log.info("This is perfect title");
	log.debug("This is perfect title");
	//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(src,new File("C:\\Users\\shapl\\eclipse-workspace2\\"
			//+ "firstFramework\\src\\test\\resources\\Screenshorts\\asma.png"));
}
}
