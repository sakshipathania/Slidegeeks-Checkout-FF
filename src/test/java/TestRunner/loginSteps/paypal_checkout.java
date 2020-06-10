package TestRunner.loginSteps;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepository.LoginObject;
import ObjectRepository.SignupObject;
import TestRunner.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webApp.PerformAction;


public class paypal_checkout extends SetupClass {
	
        WebDriverWait wait = new WebDriverWait(driver,100);
        //PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();
	
	@Given("^user is already on Website Home Page pp$")
	public void user_is_already_on_Website_Home_Page_pp() throws Throwable {
		
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
	    Thread.sleep(2000);
	    try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
	    Thread.sleep(1000);
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

	    
	}

	@Then("^user navigates to sign up page pp$")
	public void user_navigates_to_sign_up_page_pp() throws Throwable {
		Thread.sleep(3000);
		try {
			driver.findElement(By.cssSelector("ul.header > li:nth-child(1) > a:nth-child(1)")).click();
			Thread.sleep(2000);
			log.info("It's opening the website URL and redirect user to sign up page");
		} 
		catch (NoSuchElementException popup) {
		}
	}

	@Then("^user create a new ac count pp$")
	public void user_create_a_new_ac_count_pp() throws Throwable {
		//WebDriverWait pp = new WebDriverWait(driver,100);
		// create new email for sign up
		
		int leftLimit = 97; // letter 'a'
			    int rightLimit = 122; // letter 'z'
			    int targetStringLength = 10;
			    Random random = new Random();
			    StringBuilder buffer = new StringBuilder(targetStringLength);
			    for (int i = 0; i < targetStringLength; i++) {
			        int randomLimitedInt = leftLimit + (int) 
			          (random.nextFloat() * (rightLimit - leftLimit + 1));
			        buffer.append((char) randomLimitedInt);
			    }
			    String generatedString = buffer.toString();
			 
			    System.out.println(generatedString);
			    
			    String signup_email=generatedString;
			    String full_email="selenium.testing."+generatedString+"@gmail.com";
			    System.out.println(full_email);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
				//driver.findElement(By.id("email_address")).sendKeys(full_email);
				

				Thread.sleep(2000);
		try {
			    WebElement new_email_signup = driver.findElement(By.xpath("//*[@id='email_address']"));
				Thread.sleep(2000);
			    new_email_signup.sendKeys(full_email);
				Thread.sleep(2000);
		}
		catch( NoSuchElementException popup) {
		}
				// enter name
               try {
			   WebElement FirstName= driver.findElement(By.xpath("//*[@id='firstname']"));
		FirstName.click();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		FirstName.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		FirstName.sendKeys("Selenium");
		Thread.sleep(2000);
		//wait.implictywait(driver);
		log.info("It's entering the user First Name");
                    }
		catch( NoSuchElementException popup) {
		}
		try {
			    WebElement LastName= driver.findElement(By.xpath("//*[@id='lastname']"));
		LastName.click();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		LastName.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		LastName.sendKeys("Testing");
		Thread.sleep(2000);
		//wait.implictywait(driver);
		log.info("It's entering the user Last Name");
			}
		catch( NoSuchElementException popup) {
		}	
				//enter password
		try {
				 WebElement Pass_word = driver.findElement(By.xpath("//*[@id='password']"));
		Pass_word.click();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Pass_word.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Pass_word.sendKeys("selenium@123");
		Thread.sleep(2000);
		//wait.implictywait(driver);
		log.info("It's entering the user password");
                 }
		catch( NoSuchElementException popup) {
		}
		try {
				    WebElement Confirm_password= driver.findElement(By.xpath("//*[@id='password-confirmation']"));
		//wait.implictywait(driver);
		Thread.sleep(2000);
		Confirm_password.click();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Confirm_password.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Confirm_password.sendKeys("selenium@123");
		Thread.sleep(2000);
		//wait.implictywait(driver);
		log.info("It's entering the user password");
			}
		catch( NoSuchElementException popup) {
		}		
					// enter captcha
		try {
		WebElement Captcha= driver.findElement(By.cssSelector("#captcha_user_create"));
		//wait.implictywait(driver);
		Thread.sleep(2000);
		//Captcha.click();
		//Thread.sleep(2000);
		//wait.implictywait(driver);
		Captcha.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Captcha.sendKeys("Aj7W2mtf9namwf55");
		Thread.sleep(1000);
		//wait.implictywait(driver);
		log.info("It's entering the user password");
			}
		catch( NoSuchElementException popup) {
		}	    
				    // sign  up button
		try {
				    WebDriverWait wait = new WebDriverWait(driver, 40);
			WebElement element = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/form/fieldset/div[8]/div[2]/div/div/button"));
			Thread.sleep(1000);
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(2000);

			}
		catch( NoSuchElementException popup) {
		}
	}


	@Then("^user is redirected to pricing page and choose a plan to pay pp$")
	public void user_is_redirected_to_pricing_page_and_choose_a_plan_to_pay_pp() throws Throwable {
		
		//to check monthly subscription
		try {
		WebElement Monthly=driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.pricing-page-container > div.pricing-block.clearfix > div > div > div > div:nth-child(2) > div.col.col1.col-bg1 > span”));
		Thread.sleep(2000);
		 WebElement Monthly_pay= driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.pricing-page-container > div.pricing-block.clearfix > div > div > div > div:nth-child(2) > div:nth-child(2) > span > span > em"));
		Thread.sleep(4000);
               //{System.out.println("Monthly Subscription is present for $49.99"); }
		Thread.sleep(4000);
		} catch (NoSuchElementException popup) { }
	        
	       // To check Semi Annual Subscription
	       try {
		 WebElement SemiAnnual = driver.findElement(By.cssSelecor("#maincontent > div.columns > div > div.pricing-page-container > div.pricing-block.clearfix > div > div > div > div:nth-child(3) > div.col.col1.col-bg1 > span > span > em"));
		Thread.sleep(2000);
		       WebElement  SemiAnnual_pay= driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.pricing-page-container > div.pricing-block.clearfix > div > div > div > div:nth-child(3) > div.col.col1.discount-block > span.cell-align > span.price > em"));
		       Thread.sleep(4000);
		       //{
		       //System.out.println("SemiAnnual Subscription is present for $149.99");
		       //}
		       Thread.sleep(4000);
		} catch (NoSuchElementException popup) { }
	        
	       //To check Annual Subscription
		try {
			WebElement Annual= driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.pricing-page-container > div.pricing-block.clearfix > div > div > div > div:nth-child(4) > div.col.col1.col-bg1 > span > span > em"));
			Thread.sleep(2000);
			WebElement Annual_pay= driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.pricing-page-container > div.pricing-block.clearfix > div > div > div > div:nth-child(4) > div.col.col1.discount-block > span.cell-align > span.price > em"));
			Thread.sleep(4000);
			//{       System.out.println("Annual Subscription is present for $249.99"); }
		       Thread.sleep(4000);
		} catch (NoSuchElementException popup) { }
		
		// To check Annual + Custom Design subscription
	        try {
			WebElement Annual_Custom Design= driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.pricing-page-container > div.pricing-block.clearfix > div > div > div > div:nth-child(5) > div.col.col1.col-bg1 > span.cell-align > span > em"));
			Thread.sleep(2000);
			WebElement Annual_Custom Design_pay= driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.pricing-page-container > div.pricing-block.clearfix > div > div > div > div:nth-child(5) > div.col.col1.discount-block > span.cell-align > span.price > em"));
			Thread.sleep(4000);
			//{   System.out.println("Annual & Custom Design Subscription is present for $299.99");}
		       Thread.sleep(4000);
		} catch (NoSuchElementException popup) { }
			
                //To check Team license subscription								     
		try {
			WebElement Team_License= driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.pricing-page-container > div.pricing-block.clearfix > div > div > div > div:nth-child(6) > div.col.col1.col-bg1 > span"));
			Thread.sleep(2000);
			WebElement Team_License_Pay= driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.pricing-page-container > div.pricing-block.clearfix > div > div > div > div:nth-child(6) > div.col.col1.discount-block > span.cell-align > span.price > em"));
			Thread.sleep(4000);
			//{  System.out.println("Team License Subscription is present for $599.99"); }
		       Thread.sleep(4000);
		} catch (NoSuchElementException popup) { }
								     
	       //To click on join button							     
		try {
		 WebElement join_now_btn  = driver.findElement(By.cssSelector("div.col-box:nth-child(2) > div:nth-child(3) > span:nth-child(1) > form:nth-child(1) > button:nth-child(4) > span:nth-child(1)"));
		// WebElement join_now_btn  = driver.findElement(By.xpath("(//span[contains(.,'Join now')])[8]"));
			Thread.sleep(2000);
		    join_now_btn.click();
			Thread.sleep(6000);
		} catch( NoSuchElementException popup) {
		}


	}

	@Then("^user is redirected to checkout page pp$")
	public void user_is_redirected_to_checkout_page_pp() throws Throwable {
		Thread.sleep(1000);
		try
		{
			WebElement cp_btn  = driver.findElement(By.xpath("//input[@id='paypal_express']"));
			Thread.sleep(8000);
		    cp_btn.click();
		    Thread.sleep(6000);
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
			js.executeScript("arguments[0].scrollIntoView();",place_order_btn);
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
	        //WebDriverWait wait = new WebDriverWait(driver,100);
		  // Maximize Window
		  driver.manage().window().maximize();
		
		  // Store the CurrentWindow for future reference
		 // String handle = " ";
		  String currentWindow = driver.getWindowHandle();
		  String popupWindowHandle = null;
		   
		  // Switch To Popup Window
		  
		  for(String handle : driver.getWindowHandles()){
		   if(!handle.equals(currentWindow)){
		    
		    popupWindowHandle = handle;
		    driver.switchTo().window(popupWindowHandle);
		   }
		  }
		  
		  
		  
		// page title
		  String pp_page_title=driver.getTitle();
			Thread.sleep(3000);
		    System.out.println("Title of the Page is --> "+pp_page_title);
		    
		 // place order button 
			 WebElement cancel_order_btn  = driver.findElement(By.xpath("(//a[contains(.,'Cancel and return to Slideteam Pte. Ltd.')])[2]"));
			js.executeScript("arguments[0].scrollIntoView();",cancel_order_btn);		
		Thread.sleep(2000);
			    cancel_order_btn.click();
				Thread.sleep(5000);

				 // Switch To Default Window
				  
				  driver.switchTo().window(currentWindow);
		    
	}

	@Then("^user deleted the account pp$")
	public void user_deleted_the_account_pp() throws Throwable {
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

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'My Account')]")).click();
		 Thread.sleep(3000);
		

		 WebElement delete_account = driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]"));
		js.executeScript("arguments[0].scrollIntoView();",delete_account);
		 delete_account.click();
		 Thread.sleep(3000);
		 WebElement continue_delete = driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Continue')]"));
		js.executeScript("arguments[0].scrollIntoView();",continue_delete); 
		 continue_delete.click();
		 Thread.sleep(3000);
		
	}


}
