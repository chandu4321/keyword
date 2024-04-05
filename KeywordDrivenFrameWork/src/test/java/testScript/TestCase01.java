package testScript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.ExcelLib;

public class TestCase01 extends ExcelLib {

	public static WebDriver driver;

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		for (int i = 1; i < 5; i++) {
			switch (actions(i)) {
			case "open browser": {
				driver = new FirefoxDriver();
			}break;
			case "maximize":{
				driver.manage().window().maximize();
			}break;
			case "launch URL":{
				driver.get(testData(i));
			}break;
			case "close":{
				Thread.sleep(2000);
				driver.quit();
			}break;
			}

		}
	}
}