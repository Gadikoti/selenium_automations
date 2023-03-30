package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_browsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\G Karthik\\eclipse-workspace\\selenium_automations\\selenium_files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.ecoders.in");
		//getting the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//fetching the url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.quit();

	}

}
