package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class jacket {
	ChromeDriver dr;
	jacket(ChromeDriver dr){
		this.dr=dr;
	}
	public void buyBadgley() {
		dr.findElement(By.xpath(".//*[@id='product-price-']/span"));
	}
public void addtoCart() {
	dr.findElement(By.xpath("html/body/div[2]/div[1]/header/div[3]/div[1]/div/a"));
}
public void nevigateBack() {
	dr.navigate().back();
}

}
