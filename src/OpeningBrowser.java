import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpeningBrowser {

	
	public static void main(String[] args) {
		int res;
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
	
		//Write a method to print PASS if the title of the page matches with “QA Automation Tools Trainings and Tutorials | QA Tech Hub” else FAIL.
		String s1="QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		String s2=driver.getTitle();
		//System.out.println(s1.compareTo(s2));
	    res=s1.compareTo(s2);
	    OpeningBrowser b = new OpeningBrowser();
	    String resultt=b.gettitle(res);
		System.out.println(resultt);
		driver.close();
	}	
	
	public String gettitle(int ress) {		
		if(ress==0) {
			return "PASS";
		}
		else {
			return "FAIL";
		}	
	}
}
