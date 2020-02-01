package seleniumCode;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshort {
	WebDriver driver;
public screenshort(WebDriver driver) {
	this.driver=driver;
}
public screenshort() throws IOException {
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("C:\\Users\\shapl\\eclipse-workspace2\\"
		+ "firstFramework\\src\\test\\resources\\Screenshorts\\sayan.png"));
   
}
//public void screenshort() {
	// TODO Auto-generated method stub
public void screenshort() {
	// TODO Auto-generated method stub
	
}
	
}
