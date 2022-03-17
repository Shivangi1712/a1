package hello;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	WebDriver driver = new ChromeDriver();
		  @BeforeTest
		  public void LaunchBrowser() {
			  System.out.println("Launching Browser");
			  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver.get("https://login.salesforce.com/?locale=ca");
		  }
		  @Test
		  public void username()
		  {
			  System.out.println("Username is:");
			  driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Shivangi");
		  }
		  @Test
		  public void password() {
			  driver.findElement(By.xpath("//input[@name=\"pw\"]")).sendKeys("Shiv");
		  }
		  @Test
			  public void login() {
			  driver.findElement(By.xpath("//input[@name=\"Login\"]")).click();
			  }
		  @Test
		  public void checkbox()
		  {
			  driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		  }
		  @Test
		  public void link()
		  {
			  driver.findElement(By.xpath("//a[@class=\"fl small\"]")).click();
			  driver.navigate().back();
		  }
		  @Test
		  public void link2(){
			  driver.findElement(By.xpath("//a[@id=\"mydomainLink\"]")).click();
		  }
		  @AfterTest
		  public void closeBrowser() {
			  try {
					Thread.sleep(8000);	
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			 // driver.quit();
		  }
		  }
           

