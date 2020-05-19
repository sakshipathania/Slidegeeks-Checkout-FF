package TestRunner.loginSteps;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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

public class Login_step_definition extends SetupClass {
	//PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();
	WebDriverWait wait = new WebDriverWait(driver,50);


	// Open web site URl
	@Given("^Open the website url\\.$")
	public void navigates_to_website_url() throws InterruptedException {
		// Maximize Windows
		driver.get("https://www.slideteam.net");
		Thread.sleep(2000);
		try {
			WebElement website = driver.findElement(SignupObject.close_add);
			website.click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} catch (NoSuchElementException popup) {
		}
		
		try {	
			WebElement logout=driver.findElement(By.cssSelector(".signin-link[title='Sign Out']"));
			if(logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		}
			catch(NoSuchElementException Ext) {
			
			}
		}

	
	@Then("^Enter user email address as \"([^\"]*)\"\\.$")
	public void enter_user_email_address_as(String email) throws Throwable {
	 
		try {
		WebElement email_ad= driver.findElement(By.xpath("//*[@id='email']"));
    
		email_ad.click();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		email_ad.clear();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		email_ad.sendKeys("himanshi.sharma@slidetech.in");
		Thread.sleep(1000);
		//wait.implictywait(driver);
		} catch (NoSuchElementException Ext) {
			
			}
		
	
	}

	@Then("^Insert the Password \"([^\"]*)\"\\.$")
	public void enter_user_password_as(String passwd) throws Throwable {
		try {
		WebElement Insert_Pass = driver.findElement(By.xpath("//*[@id='pass']"));
		Insert_Pass.click();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Insert_Pass.clear();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Insert_Pass.sendKeys("123456");
		//wait.implictywait(driver);
		Thread.sleep(1000);
		
	} catch (NoSuchElementException Ext) {
			
			}
		
	
	}

	@Then("^Click on Login button\\.$")
	public void click_on_Login_button() throws Throwable {
		try {
		WebElement Login= driver.findElement(By.xpath("//*[@id='send2']"));
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Login.click();
		//wait.implictywait(driver);
		Thread.sleep(2000);
	} catch (NoSuchElementException Ext) {
			
			}
	}

	/* @Then("^Verify user \"([^\"]*)\" validation message for Email Address\\.$")
	public void verify_user_validation_message_for_Email_Address(String Email) throws Throwable {

		try {
			String Email_test = driver.findElement(LoginObject.uesremail_val).getText();
		        Thread.sleep(1000);
			//wait.implictywait(driver);
			Assert.assertEquals(Email, Email_test);
			//wait.implictywait(driver);
		} catch (NoSuchElementException NSE) {

		}
	}

	@Then("^Verify user \"([^\"]*)\" validation message for Password\\.$")
	public void verify_user_validation_message_for_Password(String pawd) throws Throwable {
		try {
			String password_val = driver.findElement(LoginObject.pass_val).getText();
		        Thread.sleep(1000);
			//wait.implictywait(driver);
			Assert.assertEquals(pawd, password_val);
			//wait.implictywait(driver);
		} catch (NoSuchElementException NSEP) {

		}
	}

	@Then("^Verify user \"([^\"]*)\" message for all invalid credentials\\.$")
	public void verify_user_message_for_all_invalid_credentials(String error) throws Throwable {
		try {
			String signin_error = driver.findElement(LoginObject.error_val).getText();
		        Thread.sleep(1000);
			//wait.implictywait(driver);
			Assert.assertEquals(error, signin_error);
		        Thread.sleep(1000);
			//wait.implictywait(driver);
		} catch (NoSuchElementException NF) {

		}
	}

	@Then("^Enter user a email address as\\.$")

	public void enter_email_as() throws InterruptedException  {
		WebElement address= driver.findElement(By.xpath("//*[@id='email']"));
		address.click();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		address.clear();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		address.sendKeys("selenium.testing1234@gmail.com");
		Thread.sleep(10000);
		//wait.implictywait(driver);
	}

	@Then("^Enter password as\\.$")
	public void enter_paasword_as() throws InterruptedException {
		WebElement password= driver.findElement(By.xpath("//*[@id='pass']"));
		password.click();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		password.clear();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		password.sendKeys("123456");
		Thread.sleep(1000);
		WebElement login_butn= driver.findElement(By.xpath("//*[@id='send2']"));
		Thread.sleep(1000);
		login_butn.click();
		Thread.sleep(1000);
	}

	@Then("^after login redirect to price page\\.$")
	public void after_signup_redirect_to_price_page() throws Throwable {
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		String expectedTitle = "Pricing";
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		//wait.implictywait(driver);
		Thread.sleep(2000);
	} */

	/*@Then("^Select any of price subscription\\.$")
	public void select_any_of_price_subscription() throws Throwable {
		driver.get("https://www.slideteam.net/pricing");
		js.executeScript("window.scrollBy(0,650)");
		Thread.sleep(1000);
	
		//List<WebElement> listin  = driver.findElements(By.xpath("//*[contains(text(),' Join now ')]"));
		//int randomValue = rad.nextInt(listin.size());  // Getting a random value that is between 0 and (list's size)-1
		//Thread.sleep(1000);
		//listin.get(randomValue).click();
		//Thread.sleep(2000);
		WebElement join_now_btn  = driver.findElement(By.xpath("(//span[contains(.,'Join now')])[8]"));
			Thread.sleep(2000);
		    join_now_btn.click();
			Thread.sleep(5000);

	}

	/*@Then("^Verify the payment option field\\.$")
	public void verify_the_payment_option_field() throws Throwable {
		String payment_text = driver.findElement(SignupObject.payment).getText();
		String ExpectTitle = "PAYMENT INFORMATION";
		System.out.println(payment_text);
		Assert.assertEquals(ExpectTitle, payment_text);
         Thread.sleep(1000);
	} 

	@Then("^See default payment option as paypal\\.$")
	public void see_default_payment_option_as_paypal() throws Throwable {
		Thread.sleep(2000);
		try
		{
			WebElement cp_btn  = driver.findElement(By.xpath("//input[@id='paypal_express']"));
			Thread.sleep(2000);
		    cp_btn.click();
		    Thread.sleep(3000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(1000);
	}
	
	@Then("^user will proceed to pay with paypal pp$")
	public void user_will_proceed_to_pay_with_paypal_pp() throws Throwable {
		Thread.sleep(2000);
		
		// place order button 
		try
		{
			  WebElement place_order_btn  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Place Order')]")));
			  Thread.sleep(3000);
		          place_order_btn.click();
			  Thread.sleep(5000);
		}
		 catch (Exception e) {
			 //TODO: handle exception	 
	        } 
		Thread.sleep(1000);
		
	}

	@Then("^pp popup appears and user navigates back to my account pp$")
	public void pp_popup_appears_and_user_navigates_back_to_my_account_pp() throws Throwable {
	    
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
			 WebElement cancel_order_btn  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(.,'Cancel and return to Slideteam Pte. Ltd.')])[2]")));
				Thread.sleep(2000);
			    cancel_order_btn.click();
				Thread.sleep(5000);

				 // Switch To Default Window
				  
				  driver.switchTo().window(currentWindow);
		    
	}

	@Then("^user is deleting the account pp$")
	public void user_is_deleting_the_account_pp() throws Throwable {
	   
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
	@Then("^user lands on pricing page and then user go to free ppts page cd$")
	public void user_lands_on_pricing_page_and_then_user_go_to_free_ppts_page_cd() throws InterruptedException  {
		
		Thread.sleep(2000);
		WebElement free_ppt_btn=driver.findElement(By.xpath("//a[contains(.,'Free PPTs')]"));
		Thread.sleep(2000);
	    free_ppt_btn.click();
	    Thread.sleep(2000);
	   
	}

	@Then("^user down load a free product cd$")
	public void user_down_load_a_free_product_cd() throws InterruptedException  {
		driver.findElement(By.cssSelector("li.item:nth-child(8) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#clicking")).click();
		Thread.sleep(3000);
	   driver.get("https://www.slideteam.net/");
	   Thread.sleep(3000);
	}
	
        @Then("^user wants logout efu$")
	public void user_wants_logout_efu() throws Throwable {
	   Thread.sleep(8000);
	        
	    WebElement my_account = driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.panel.wrapper > div > div > ul > li:nth-child(1) > a"));
	    Thread.sleep(4000);
	   my_account.click();
	    Thread.sleep(4000);
	    
	
		 Thread.sleep(3000);
		 WebElement sign_out = driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.panel.wrapper > div > div > ul > li.authorization-link > a"));
		 Thread.sleep(3000);
		 sign_out.click();
		 Thread.sleep(3000);

	}
}
