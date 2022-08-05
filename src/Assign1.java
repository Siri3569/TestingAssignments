import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//1. Open the Chrome browser.
				System.setProperty("webdriver.chrome.driver","C://Users//LocalAdmin//Documents//chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			   
			//2. Maximize the browser window.
				driver.manage().window().maximize();
				
			//3. Navigate to “http://qatechhub.com”.
				
				driver.get("http://qatechhub.com");
				
			//4. Print the title of the Page
				System.out.println(driver.getTitle());
				
			//5. Print the current URL	
				System.out.println(driver.getCurrentUrl());
				
			//6. navigate to facebook
			    driver.navigate().to("https://www.facebook.com");
			   //Thread.sleep(5);
			    
			//7.Navigate back to the QA Tech Hub website.
			    driver.navigate().back();
			    
			//8. Print the URL of the current page.
			    System.out.println(driver.getCurrentUrl());
			    
			//9. Navigate forward.
			    driver.navigate().forward();
			    
			//10.Reload the page.
			    driver.navigate().refresh();
			    
			 //Close the browser
			    driver.close();	
		
		
	}

}
