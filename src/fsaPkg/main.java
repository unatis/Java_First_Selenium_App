package fsaPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class main {

	public static void main(String[] args) throws Exception   {
		
		       /* System.setProperty("webdriver.gecko.driver","D://Dev//Course//SeleniumServ//geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				*/
		
				System.setProperty("webdriver.chrome.driver", "D://Dev//Course//SeleniumServ//chromedriver.exe");
			   	 
				WebDriver driver = new ChromeDriver();				 
								
				driver.manage().window().maximize();

				driver.get("http://www.google.com");
				        
				WebElement element = driver.findElement(By.name("q"));

				element.sendKeys("Cheese!");

				element.submit();

				System.out.println("Page title is: " + driver.getTitle());
				
				Thread.sleep(5000);
				      
				driver.quit();
		
	}

}
