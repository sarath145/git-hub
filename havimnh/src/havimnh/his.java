package havimnh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class his {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\s\\eclipse-workspace\\havimnh\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("www.google.com");
	}
}
