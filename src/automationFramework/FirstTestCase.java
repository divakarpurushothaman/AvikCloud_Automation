package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\ToolsQA\\AvikCloud_Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://avikcloud.com/";
		driver.get(URL);
		driver.findElement(By.xpath("//*[@id=\"post-344\"]/div/div/div/div/section[2]/div[2]/div/div/div/div[2]/div/div/h2")).click();
		driver.close();

	}

}
