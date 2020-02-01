package extendReportMain;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extend {
	WebDriver dr;
	public  ExtentReports extent;
	
	@Test
	public  void extendRepo() {
		ExtentHtmlReporter htmlrep=new ExtentHtmlReporter("extent.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlrep);
	ExtentTest test=	extent.createTest("my first test");
	test.log(Status.INFO,"it shows the information");
	test.log(Status.ERROR,"it shows the error message");
	System.out.println("i am extent report");
	
	extent.flush();
		
	}
	@Test
	void test2() {
	int a=20;
	int b=30;
	boolean c=a%b==0;
	String s="asma";
	//String total=a+b+s;
	
	String s1=dr.findElement(By.xpath("")).getText();
	System.out.println(s1);
	extent.flush();
		

	}
}

