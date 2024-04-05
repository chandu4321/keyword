package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyWordMethod {
	
public static WebDriver driver;
ExcelLib ex=new ExcelLib();
	public void openBrowser() {
		driver= new FirefoxDriver();
	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}

	public void url(String url) {
		driver.get(url);
	}
}
