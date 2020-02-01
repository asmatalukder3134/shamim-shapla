package firstFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import extendReportMain.extend;



public class D1 extends Base {
	@Test
public void test1() throws IOException {

File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
FileUtils.copyFile(src,new File("C:\\Users\\shapl\\Pictures\\local.png"));

}catch(IOException io) {
io.getMessage();
}
 //ExtentReports extent = null;

extend x=new extend();
x.extendRepo();


 ExtentReports ex=x.extent;
 ex.flush();









}
}
