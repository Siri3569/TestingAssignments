import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s,ltext,countriestext,countrydeaths;	int lst;
	//1.open browser
		System.setProperty("webdriver.chrome.driver","C://Users//LocalAdmin//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//2.navigate to https://in.yahoo.com/
		 driver.navigate().to("https://in.yahoo.com/");
	//3.Verify text "Trending Now"
		 s=driver.findElement(By.cssSelector(".title.d-i.fz-s.fw-xl.s-label")).getText();
		 System.out.println(s);
	//4.Get total number of links under Trending Now header. and print the link text.
		
		/* //System.out.println(driver.findElement(By.cssSelector("li[class*='icon-find']")));
		// ltext=driver.findElement(By.cssSelector("li[class*='icon-find'],a[class='d-ib w-85p fc-14th']")).getAttribute("title");
        //ltext=driver.findElement(By.xpath("//li[@class='icon-find'])[4]/span/a")).getAttribute("title");
		//System.out.println(ltext);
		 //ltext=driver.findElement(By.xpath("//li[@class='icon-find'])[4]/a[@class='d-ib w-24 fw-xl']"));
		 //System.out.println(getAttribute("//li[@class='icon-find'])[4]@title"));	 
		*/
		 
	//5.Navigate to each link and come back again to main page.
		
		 for(lst=1;lst<=10;lst++) {
		 driver.findElement(By.xpath("//ul[@class='d-ib w-100p ov-h']/li[contains(@class,'icon-find')]["+lst+"]")).click();
		 driver.navigate().back();
		 }
		 
	//6. Stay on main page and click on Coronavirus menu bar link.
		 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.findElement(By.xpath("//a[@aria-label='COVID-19 Updates']")).click();
		
	//7. Get the all content of cases overview like India, Global confirmed and deaths.
	      countriestext=driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).getText();
		  //tbody tr:nth-child(1) td:nth-child(4) div:nth-child(1) span:nth-child(1)   //compTableAdvance
	     countrydeaths= driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(4) div:nth-child(1) span:nth-child(1)")).getText();
	     System.out.println(countriestext+" confirmed deaths = "+countrydeaths);
		  
 /*	//8. Exit the browser.*/
		driver.quit();
		
		
	}

}
