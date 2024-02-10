package loginecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

public class login {
	public static WebDriver driver;

	@Test
	@Parameters({"Browser","emailId","password"})
	public static void lohin(String Browser,String emailId,String password){
		if(Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(Browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get("https://www.google.com/search?q=https%2F%2F%3Arahulshettyacademy.com%2Fclient%2Fauth%2Flogin&sca_esv=600762144&rlz=1C1GCEA_enIN1030IN1030&ei=AtyvZZT8CJOw2roPobu0sAQ&ved=0ahUKEwiUhb-26vODAxUTmFYBHaEdDUYQ4dUDCBA&uact=5&oq=https%2F%2F%3Arahulshettyacademy.com%2Fclient%2Fauth%2Flogin&gs_lp=Egxnd3Mtd2l6LXNlcnAiMGh0dHBzLy86cmFodWxzaGV0dHlhY2FkZW15LmNvbS9jbGllbnQvYXV0aC9sb2dpbkgAUABYAHAAeACQAQCYAQCgAQCqAQC4AQPIAQDiAwQYACBB&sclient=gws-wiz-serp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		
		driver.findElement(By.id("userEmail")).sendKeys(emailId);
		driver.findElement(By.id("userPassword")).sendKeys(password);
		
		driver.findElement(By.cssSelector("input[id='login']")).click();
		

	}

}
