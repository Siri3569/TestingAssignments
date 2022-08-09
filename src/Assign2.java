import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s,ltext,countriestext,countrydeaths;
		int lst;
	//1.open browser
		System.setProperty("webdriver.chrome.driver","C://Users//LocalAdmin//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//2.navigate to https://in.yahoo.com/
		 driver.navigate().to("https://in.yahoo.com/");
	//3.Verify text "Trending Now"
		 s=driver.findElement(By.cssSelector(".title.d-i.fz-s.fw-xl.s-label")).getText();
		 System.out.println(s);
		 
	//4.Get total number of links under Trending Now header. and print the link text.
	
		 List<WebElement> links = driver.findElements(By.cssSelector("li[class*='icon-find']"));
	
		 System.out.println("The number of links under Trending Searches is " + links.size());
	
		 List<WebElement>b=driver.findElements(By.xpath("//a[@class=' d-ib w-85p fc-14th']"));
	
		 for (WebElement webElement : b) {
         String listname = webElement.getText();
         System.out.println(listname);
		 }
	 
	//5.Navigate to each link and come back again to main page.
		
	     for(lst=1;lst<=10;lst++) {
		 driver.findElement(By.xpath("//ul[@class='d-ib w-100p ov-h']/li[contains(@class,'icon-find')]["+lst+"]")).click();
		 driver.navigate().back();
		 }
		 
	//6. Stay on main page and click on Coronavirus menu bar link.
		 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.findElement(By.xpath("//a[@aria-label='COVID-19 Updates']")).click(); // --> relative path
		
	//7. Get the all content of cases overview like India, Global confirmed and deaths.
	     
		 countriestext=driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).getText();//-->absolute path
	     countrydeaths= driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(4) div:nth-child(1) span:nth-child(1)")).getText();
	     System.out.println(countriestext+" confirmed deaths = "+countrydeaths);
		  
 	//8. Exit the browser.
		driver.quit();
		
		
	}

}
