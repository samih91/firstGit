import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		driver.findElement(By.id("inputUsername")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("samih@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("123");
		driver.findElement(By.className("submit")).click();
		
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		String password =getPassword(driver);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Samih");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("samih@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("1234567896");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	
		

	}
	
	public static String getPassword(WebDriver driver) {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		String[] passArray =passwordText.split("'");
		String password = passArray[1].split("'")[0];
		return password;
		
		
		
		
		
	}

}
