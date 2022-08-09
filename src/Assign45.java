import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign45 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//LocalAdmin//Documents//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//1. Maximize the browser window.
		driver.manage().window().maximize();
		
	//2. Navigate to https://www.myntra.com/
		driver.get("https://www.myntra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//3. Choose any section like men or women from menu bar.
		 Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(By.cssSelector(".desktop-main[href='/shop/men'][data-group='men']"))).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 /* WebElement selectMenuOption=driver.findElement(By.xpath("//div[@class='desktop-categoryContainer']/li[@class='desktop-navBlock']/ul[@class='desktop-navBlock']/li[@data-reactid='30']/a[@class='desktop-categoryLink' and data-reactid='31' and href='/men-tshirts']"));
		 WebElement selectMenuOption=driver.findElement(By.xpath("//a[@class='desktop-categoryLink' and data-reactid='31' and href='/men-tshirts')]"));
		 actions.moveToElement(selectMenuOption).click().build().perform();*/
		
		driver.findElement(By.xpath("//a[@href='/shop/men' and @data-group]")).click(); //home page men
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	//4. Then choose any item you want to purchase.
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,1800)");
		driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/w_163,c_limit,fl_progressive,dpr_2.0/assets/images/2022/8/1/053d033a-cc12-4a54-89d5-32f2ccaa5d161659374758243-RTF_Men_DK_02.jpg']")).click(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.switchTo().alert().dismiss();//closing alert box
		driver.findElement(By.cssSelector(".sort-sortBy")).click();
		//Thread.sleep(2000);
		//System.out.println(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]")).getText());
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]")).click(); 
		Thread.sleep(2000);
		//filter
		actions.moveToElement(driver.findElement(By.xpath("(//input[@value='Huetrap'])[1]"))).click().perform();//filter by brand
		Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,500)");
		actions.moveToElement(driver.findElement(By.xpath("(//input[@value='494.0 TO 659.0'])[1]"))).click().perform();//filter by price
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("div.application-base:nth-child(1) main.search-base div.row-base:nth-child(3) div.search-rightContainer.column-base div.search-searchProductsContainer.row-base section:nth-child(1) ul.results-base li.product-base:nth-child(1) a:nth-child(2) > div.product-productMetaInfo")).click();
		//driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']/input[@value=\"Roadster\"]")).click();
		//System.out.println(driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']/input[@value='Roadster']")).getText());
		
		//5. Click on sort by and choose What’s new.
	  
      //actions.moveToElement(driver.findElement(By.cssSelector(".sort-sortBy"))).click().build().perform(); //open sort by
      //Thread.sleep(3000);
	/*
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	 String neww=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//label[contains(text(),'What\'s New')]"))).getText();  
	 System.out.println(neww);*/
      
    // WebElement element2 = driver.findElement(By.xpath("//input[@value='new']")); //.sort-label[text()='Popularity'] 
	 //WebElement element2 = driver.findElement(By.xpath("//input[@value='new']"));
	 //actions.moveToElement(driver.findElement(By.xpath("//input[@value='new']"))).click();
	// System.out.println(element2);
	//actions.click().build().perform();
	
	
			 
			 //*[@id='desktopSearchResults']/div[1]/section/div[1]/div[1]/div/div/div/ul/li[2]/label/input";
	   //x
	   // actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[1]/div/div/div/ul/li[2]/label/input[@value='new']"))).click().perform();
	                                            //         
	   //Thread.sleep(3000);
	
		    // Actions actions = new Actions(driver);
	        //Retrieve WebElement 'Price: Low to High' to perform mouse hover 
		     ////div[@class='sort-sortBy']/input[contains(@value,'price_desc')]div[contains(text(),'Price: Low to High')]
	    	//WebElement menuOption = driver.findElement(By.xpath("(//div[@class='sort-sortBy'][1]/input[contains(@value,'price_desc')]"));
	    	//Mouse hover menuOption 'Price: Low to High'
	    	//actions.moveToElement(menuOption).click();
	    	//System.out.println("Done Mouse hover on 'Price: Low to High' from Menu");
		   
		   
		
		//6. Check for filter and use different filter like brand, discount, range etc.

		   
		/*   driver.findElement(By.xpath("(//input[@value='Levis'])[1]")).click(); 
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			  
		   driver.findElement(By.xpath("(//ul[@class='price-list']//li[1]//label[1]")).click(); 
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			  
		   driver.findElement(By.xpath("(//input[@value='50.0 TO 100.0']")).click(); 
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));*/
		   
		//7. Then choose any item you want to see\purchase.
		   
		    // driver.findElement(By.xpath("//img[@title=\"Levi's X Deepika Padukone Women Blue Relaxed Fit High-Rise Printed Jeans\"]")).click();
		
		//8. Then add it to bag.
		   
		   //driver.findElement(By.xpath("//button[@class='size-buttons-size-button size-buttons-size-button-default'])[1]")).click();
		    //body/div[@id='mountRoot']/div/div[@class='application-base']/div/main[@class='pdp-pdp-container']/div[@class='pdp-details common-clearfix']/div[@class='pdp-description-container']/div[1]/div[1]/div[1]
				   
		
		//9. Then open a bag and check item is there.
		
		
		//10. Then click on move to Wishlist.


		//driver.quit();
		
	}

	private static long until(ExpectedCondition<WebElement> visibilityOfElementLocated) {
		// TODO Auto-generated method stub
		return 0;
	}

}
