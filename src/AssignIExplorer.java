import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignIExplorer {



   	// TODO Auto-generated method stub
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","C://Users//LocalAdmin//Documents//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//driver.manage().deleteAllCookies();
		
		
		
 //1. Maximize the browser window.
		driver.manage().window().maximize();
		
 //2. Navigate to https://www.myntra.com/
		driver.get("https://www.myntra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
 //3. Choose any section like men or women from menu bar.
		
		driver.findElement(By.xpath("//a[@href='/shop/men' and @data-group]")).click(); //home page men
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
 //4. Then choose any item you want to purchase.
		JavascriptExecutor js = (JavascriptExecutor) driver;  //To scroll down the window
		 js.executeScript("window.scrollBy(0,1800)");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement menTab;
		 menTab= w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//img[@src='https://assets.myntassets.com/w_163,c_limit,fl_progressive,dpr_2.0/assets/images/2022/8/1/053d033a-cc12-4a54-89d5-32f2ccaa5d161659374758243-RTF_Men_DK_02.jpg']")));//click sort by
		 menTab.click();
		
	//  driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/w_163,c_limit,fl_progressive,dpr_2.0/assets/images/2022/8/1/053d033a-cc12-4a54-89d5-32f2ccaa5d161659374758243-RTF_Men_DK_02.jpg']")).click(); 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
 //5. Click on sort by and choose What’s new.	
	 Actions actions = new Actions(driver);
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement sorttab;
	 sorttab= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[@class='sort-sortBy'][1]")));//click sort by
	 sorttab.click();
	
	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
	 WebElement whatsnewtab;
	 whatsnewtab= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]"))); //select What's New
	 whatsnewtab.click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		

 //6. Check for filter and use different filter like brand, discount, range etc.
	 
	 actions.moveToElement(driver.findElement(By.xpath("(//input[@value='Huetrap'])[1]"))).click().perform();//filter by brand
		Thread.sleep(3000);
	
	//js.executeScript("window.scrollBy(0,800)");
	actions.moveToElement(driver.findElement(By.xpath("(//input[@value='494.0 TO 659.0'])[1]"))).click().perform();//filter by price
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	

 //7. Then choose any item you want to see\purchase.		

	driver.findElement(By.xpath("//img[@title='Huetrap Men Grey Printed Round Neck T-shirt'][1]")).click();//selecting product
	Thread.sleep(3000);

//8. Then add it to bag.
	Set <String> Windows=driver.getWindowHandles();
	Iterator<String> it = Windows.iterator();
	String parentId = it.next();
	String childId=it.next();
	driver.switchTo().window(childId);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//div[@class='size-buttons-tipAndBtnContainer'])[5]")).click();//selecting size xl 
	
	driver.findElement(By.xpath("(//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center'])[1]")).click();//click on add to bag button

//9. Then open a bag and check item is there.
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center ']")).click();//click on bag on top right corner
	
//10. Then click on move to Wish list.
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	actions.moveToElement(driver.findElement(By.xpath("//div[@class='itemComponents-base-toolTipCTA']"))).click().perform();  //black alert box
	 /*WebElement wishlisttab;
	 wishlisttab= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button[@class='nlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkWishlist']")));//click sort by
	 wishlisttab.click();*/
    actions.moveToElement(driver.findElement(By.xpath("//button[@class='nlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkWishlist]"))).click().perform(); 
	
	
	}


}
