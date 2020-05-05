package TestRunner.loginSteps;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import ObjectRepository.FbandGP_Object;
import ObjectRepository.SignupObject;
import TestRunner.SetupClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webApp.PerformAction;

public class Facebook_create_sigin_unpaid_stepDefin extends SetupClass {
	//PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();
        WebDriverWait wait = new WebDriverWait(driver,50);
	// Open web site test on ff

	@Given("^Launching the application URL\\.$")
	public void launching_the_application_URL() throws InterruptedException {
		// Maximize Windows
		driver.get("https://www.slideteam.net");
		Thread.sleep(2000);
		try {
			WebElement app = driver.findElement(SignupObject.close_add);
			app.click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} catch (NoSuchElementException popup) {
		}

		try {
			WebElement logout = driver.findElement(By.cssSelector(".signin-link[title='Sign Out']"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
	}

	@Then("^complete deck from account dashboard page$")
        public void user_navigate_to_complete_deck_from_account_dashboard_page() throws InterruptedException  {
    
	 driver.get("https://www.slideteam.net/complete-powerpoint-decks-presentations/all-powerpoint-complete-decks.html");
	 Thread.sleep(3000);
	 
	 WebElement acc = driver.findElement(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)")).click();
	  Thread.sleep(2000);   
	    
}

	@Then("^Open the download presentation link\\.$")
	public void open_the_download_presentation_link() throws InterruptedException {
		driver.get("https://www.slideteam.net/business-process-evaluation-powerpoint-show.html");
		WebElement download = driver.findElement(By.cssSelector("#clicking"));
		//wait.implictywait(driver);
		download.click();
		Thread.sleep(5000);
	}

	@Then("^Click on create as account link\\.$")
	public void click_on_create_as_account_link() throws InterruptedException {
		try {
		WebElement account_link = driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div[2]/div/div/a/span"));
		account_link.click();
		Thread.sleep(5000);
	} catch (NoSuchElementException Ext) {

		}
	}

	@Then("^Click on faceblink\\.$")
	public void click_on_faceblink() throws InterruptedException {
		try {
		WebElement Faceblink = driver.findElement(By.xpath("//*[@id='form-validate']/fieldset/div[3]/div/div[1]/a"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", Faceblink);
		Thread.sleep(3000);
		}
		catch (NoSuchElementException Ext) {
			
			}
	}

	@Then("^Fb user enter a valid email\\.$")
	public void fb_user_enter_a_valid_email() throws InterruptedException {
		try {
		WebElement valid_email= driver.findElement(By.xpath("//*[@id='email']"));
		valid_email.click();
		Thread.sleep(5000);
		valid_email.clear();
		Thread.sleep(5000);
		valid_email.sendKeys("slidetech.qa@gmail.com");
                Thread.sleep(5000);
	} catch (NoSuchElementException Ext) {

		}
	}

	@Then("^Fb user enter valid password\\.$")
	public void fb_user_enter_valid_password() throws Throwable {
		try {
		WebElement Valid_pass = driver.findElement(By.xpath("//*[@id='pass']"));
		Valid_pass.click();
		Thread.sleep(5000);
		Valid_pass.clear();
		Thread.sleep(5000);
		Valid_pass.sendKeys("himanshi@123");
		Thread.sleep(5000);
	} catch (NoSuchElementException Ext) {

		}
	}

	@Then("^click on login cta on fb page\\.$")
	public void click_on_login_cta_on_fb_page() throws InterruptedException {
		try {
		WebElement Fb_login= driver.findElement(By.xpath("//*[@id='loginbutton']"));
		Thread.sleep(3000);
		Fb_login.click();
		Thread.sleep(3000);
		} catch (NoSuchElementException Ext) {
			
			}
		try {
			WebElement Fb_GP = driver.findElement(FbandGP_Object.continue_as_QA);
			Fb_GP.click();
			Thread.sleep(1000);
		} catch (NoSuchElementException qalink) {

		}
	}

	@Then("^The user is redirected to price page\\.$")
	public void the_user_is_redirected_to_price_page() throws Throwable {
                driver.get("https://www.slideteam.net/pricing");
		String actualTitle = driver.getTitle();
		Thread.sleep(4000);
		//wait.implictywait(driver);
		String expectedTitle = "Pricing";
		Thread.sleep(4000);
		//wait.implictywait(driver);
		try {
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(4000);
		}
		catch (Throwable t) {
		}
        
		//wait.implictywait(driver);
		//Thread.sleep(2000);
		
	} 
					
	/* @Then("^the randamly the subscription product\\.$")
	public void the_randamly_the_subscription_product() throws Throwable {
		js.executeScript("window.scrollBy(0,650)");
		Thread.sleep(4000);
		try {
	         WebElement join_now_btn  = driver.findElement(By.xpath("(//span[contains(.,'Join now')])[8]"));
			Thread.sleep(2000);
		    join_now_btn.click();
			Thread.sleep(5000);
		}  catch (NoSuchElementException qalink) {

		}
		//List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),' Join now ')]"));
		//int randomValue = rad.nextInt(list.size()); // Getting a random value that is between 0 and (list's size)-1
		//Thread.sleep(4000);
		//list.get(randomValue).click();
		
	} 
  @Then("^user is redirected to pricing page and choose a plan to pay pp$")
	public void user_is_redirected_to_pricing_page_and_choose_a_plan_to_pay_pp() throws Throwable {
	   
		// choose a plan
		 WebElement join_now_btn  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]//div[3]//span[1]//form[1]//button[1]//span[1]")));
			Thread.sleep(2000);
		    join_now_btn.click();
			Thread.sleep(5000);

	}

	@Then("^user is redirected to checkout page pp$")
	public void user_is_redirected_to_checkout_page_pp() throws Throwable {
		Thread.sleep(2000);
		try
		{
			WebElement cp_btn  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='paypal_express']")));
			Thread.sleep(2000);
		    cp_btn.click();
		    Thread.sleep(3000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(1000);
	}

	@Then("^user proceed to pay with paypal pp$")
	public void user_proceed_to_pay_with_paypal_pp() throws Throwable {
		Thread.sleep(2000);
		
		// place order button 
		try
		{
			  WebElement place_order_btn  = driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));
			  Thread.sleep(3000);
		          place_order_btn.click();
			  Thread.sleep(5000);
		}
		 catch (Exception e) {
			 //TODO: handle exception	 
	        } 
		Thread.sleep(1000);
		
	}

	@Then("^paypal popup appears and user navigates back to my account pp$")
	public void paypal_popup_appears_and_user_navigates_back_to_my_account_pp() throws Throwable {
	    
		  // Maximize Window
		  driver.manage().window().maximize();
		
		  // Store the CurrentWindow for future reference
		  
		  String currentWindow = driver.getWindowHandle();
		  String popupWindowHandle = null;
		   
		  // Switch To Popup Window
		  
		  for(String handle : driver.getWindowHandles()){
		   if(!handle.equals(currentWindow)){
		    
		    popupWindowHandle = handle;
		    
		   }
		  }
		  
		  driver.switchTo().window(popupWindowHandle);
		  
		// page title
		  String pp_page_title=driver.getTitle();
			Thread.sleep(3000);
		    System.out.println("Title of the Page is --> "+pp_page_title);
		    
		 // place order button 
			 WebElement cancel_order_btn  = driver.findElement(By.xpath("(//a[contains(.,'Cancel and return to Slideteam Pte. Ltd.')])[2]"));
				Thread.sleep(2000);
			    cancel_order_btn.click();
				Thread.sleep(5000);

				 // Switch To Default Window
				  
				  driver.switchTo().window(currentWindow);
		    
	}

	@Then("^user deleted the account pp$")
	public void user_deleted_the_account_pp() throws Throwable {
	   
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(.,'My Account')]")).click();
		 Thread.sleep(3000);
		 
                   try {
			WebElement iframe = driver.findElement(By.id("livechat-full-view"));
			if(iframe.isDisplayed()) {
				driver.switchTo().frame(iframe);   
				 Actions act = new Actions(driver);
				 act.moveToElement(driver.findElement(By.cssSelector("#title .icon-minimize"))).build().perform();
				 Thread.sleep(2000);
					WebElement chat1=driver.findElement(By.cssSelector("#title .icon-minimize"));
					 Thread.sleep(1000);
						chat1.click();
						 Thread.sleep(1000);
						 driver.switchTo().defaultContent();
						 Thread.sleep(1000);
						 driver.switchTo().parentFrame();
					 Thread.sleep(1000);
			}
			else {
				

			System.out.println("chat window does not open");
			}
		}
				catch(NoSuchElementException NCP) {
					
				}



		 WebElement delete_account = driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]"));
		 delete_account.click();
		 Thread.sleep(3000);
		 WebElement continue_delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'][contains(.,'Continue')]")));
		 continue_delete.click();
		 Thread.sleep(3000);
		
	}*/


}
	
