package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https:/gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("konkaveni@gmail.com");
	}

}
