package brokenImage;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BrokenImageControl {
	@FindBy(xpath="img")List<WebElement> images;	
	WebDriver dr;
	int count=0;
	public void image() throws IOException {
		PageFactory.initElements(dr,this);
		// int size=images.size();
		for(WebElement linkUrl:images) {
		String link=linkUrl.getAttribute("src");
		URL url=new URL(link);
		HttpURLConnection http=(HttpURLConnection)url.openConnection();
		http.setConnectTimeout(20000);
		http.setReadTimeout(20000);
		int statuscode=http.getResponseCode();
		if(statuscode==404||statuscode==500) {
			count++;
			count=count+1;
			System.out.println(link);
			System.out.println("image`count is"+" "+count);
		}
		
		}
		
	}

}
