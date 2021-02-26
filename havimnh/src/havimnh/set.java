package havimnh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class set {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\s\\eclipse-workspace\\havimnh\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://docs.google.com/forms/d/e/1FAIpQLSc2X_isKqJI3YMU24ElDaJoremwaQOJ5fLp23Z6l9LwcOKW7w/viewform");
	}

}
