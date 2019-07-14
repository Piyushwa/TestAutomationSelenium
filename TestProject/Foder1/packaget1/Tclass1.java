package packaget1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public  class Tclass1 {
	
	public static String chromepath = System.getProperty("user.dir") + "\\chromedriver.exe";

	WebDriver driver;

	public   void googlesearch(){
		System.setProperty("webdriver.chrome.driver",chromepath);

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("https://www.google.com");
		String title = driver.getTitle();
		
		System.out.println(title);
		
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
	
	driver.findElement(By.xpath("//input[@value ='Google Search']")).click();
	
	
		
		
	}

	public static void main(String[] args) {

		Tclass1 c1 = new Tclass1();
		c1.googlesearch();
		
	}
	

}
