package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnxpathheart {
	
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(40000);
		
		driver.findElement(By.xpath("//span[text()='Santoor']/../..//*[name()='svg' and @id='addToWishlist']")).click();
		
		
}

}
