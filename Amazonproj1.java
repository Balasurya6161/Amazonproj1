package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazonproj1    {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sk\\eclipse-workspace\\javaSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    driver.manage().window().maximize();
	    
	    WebElement findElement = driver.findElement(By.id("nav-link-accountList"));
	    findElement.click();
	    
	    WebElement a = driver.findElement(By.name("email"));
	    a.sendKeys("8883986161");
	    driver.findElement(By.id("continue")).click();
	    
	    WebElement findElement2 = driver.findElement(By.name("password"));
	    findElement2.sendKeys("Bala@123");
	    driver.findElement(By.id("signInSubmit")).click(); 
	    
	    driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
	    Select s = new Select(findElement);
	    s.selectByIndex(15);
	    
	    WebElement f = driver.findElement(By.id("twotabsearchtextbox"));
	    f.sendKeys("AsusZenfonemaxprom1");
	    f.click();
	    
	    WebElement h = driver.findElement(By.id("nav-search-submit-button"));
	    h.click();
	    
	    
	    
	    
	    
		
		
		                
		
		
		
		
	}
	
	
	
	

}
