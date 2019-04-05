package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\ToolsQA\\AvikCloud_Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "http://demoqa.com/frames-and-windows/";
		driver.get(URL);
		driver.findElement(By.xpath("/html/body")).click();
		driver.close();

	}

}
