package feature;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class boots {
	ChromeDriver dr;
	boots(ChromeDriver dr){
		this.dr=dr;
	}
	public void addCart() {
		dr.findElement(By.xpath("html/body/div[2]/div[1]/header/div[3]/div[1]/div/a"));
	}
	public void buyStuart() {
		dr.findElement(By.xpath(".//*[@id='product-price-']/span"));
	}
	
	
	public void nevigateBack() {
		dr.navigate().back();
	}

}
