package jp.momotown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RBStrikeCrawler {

	public static WebDriver webDriver;

	public RBStrikeCrawler() {
	}

	public static void main(String[] args) {
		webDriver = new FirefoxDriver();

		webDriver.quit();
	}

}
