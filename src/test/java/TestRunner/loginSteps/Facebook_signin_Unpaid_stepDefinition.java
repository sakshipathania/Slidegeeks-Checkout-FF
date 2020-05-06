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

import ObjectRepository.FbandGP_Object;
import ObjectRepository.SignupObject;
import TestRunner.SetupClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webApp.PerformAction;

public class Facebook_signin_Unpaid_stepDefinition extends SetupClass {
	PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();

	// Open web site URl
	@Given("^Go to the application URL\\.$")
	public void navigates_to_website_url() throws InterruptedException {
		// Maximize Windows
		driver.get("https://www.slideteam.net");
		Thread.sleep(2000);
		try {
			WebElement sign = driver.findElement(SignupObject.close_add);
			sign.click();
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

	/*@Then("^navigate to complete deck from account dashboard page$")
         public void navigate_to_complete_deck_from_account_dashboard_page() throws InterruptedException  {
    
	 driver.get("https://www.slideteam.net/");
		Thread.sleep(4000);
		WebElement fb_link = driver.findElement(By.xpath("//a[@class='btn btn-block btn-social btn-facebook social-btn']"));
		Thread.sleep(2000);
	    fb_link.click();
		Thread.sleep(3000);
		
	    
            }*/


	@Then("^Click on fblink\\.$")
	public void fb_link() throws InterruptedException {
		WebElement FbLink = driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[1]"));
		wait.implictywait(driver);
		FbLink.click();
		Thread.sleep(2000);
	}

	@Then("^Facebook user enter a email as\\.$")
	public void enter_user_mail() throws InterruptedException {
		Thread.sleep(1000);
		try {
		WebElement Fbemail = driver.findElement(By.xpath("//*[@id='email']"));
		//wait.implictywait(driver);
		Thread.sleep(1000);
	        Fbemail.click();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Fbemail.clear();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Fbemail.sendKeys("amw.vrushali@gmail.com");
		//wait.implictywait(driver);
		Thread.sleep(1000);
		} catch (NoSuchElementException alreadylogged) {

		}
	}
	

	@Then("^Facebook user enter password\\.$")
	public void enter_user_password() throws Throwable {
		try {
		WebElement Fpass= driver.findElement(By.xpath("//*[@id='pass']"));
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Fpass.click();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Fpass.clear();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Fpass.sendKeys("vrushali@786");
		Thread.sleep(1000);
		//wait.implictywait(driver);
	} catch (NoSuchElementException alreadpass) {

	}

	}

	@Then("^Login the application\\.$")
	public void click_on_Login_button() throws Throwable {
		try {
		WebElement Appl= driver.findElement(By.xpath("//*[@id='loginbutton']"));
		//wait.implictywait(driver);
			Thread.sleep(1000);
		Appl.click();
		//wait.implictywait(driver);
		Thread.sleep(10000);
	} catch (NoSuchElementException alredylogin) {

	}

		try {
			WebElement FP= driver.findElement(FbandGP_Object.continue_as_QA);
			FP.click();
			Thread.sleep(3000);
		} catch (NoSuchElementException qalink) {

		}
	}

	@Then("^See that user is redirected to price page\\.$")
	public void after_signup_redirect_to_price_page() throws Throwable {
                driver.get("https://www.slideteam.net/pricing");
		String actualTitle = driver.getTitle();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		String expectedTitle = "Pricing";
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Assert.assertEquals(expectedTitle, actualTitle);
		//wait.implictywait(driver);
		Thread.sleep(1000);
	}

	/*@Then("^Subscribe the product\\.$")
	public void select_any_of_price_subscription() throws Throwable {
		WebElement join_now_btn  = driver.findElement(By.xpath("//div[3]//div[3]//span[1]//form[1]//button[1]//span[1]"));
			Thread.sleep(2000);
		    join_now_btn.click();
			Thread.sleep(5000);

	}

	@Then("^Redirect to payment page\\.$")
	public void Redirect_to_payment_page() throws Throwable {
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

	@Then("^user proceed to pay with paypal\\.$")
	public void user_proceed_to_pay_with_paypal() throws Throwable {
		WebElement Pay_pal = driver.findElement(SignupObject.paypay_radio_button);
		if (!driver.findElement(SignupObject.paypay_radio_button).isSelected())
		// to check the check box is already selected or not
		{
			driver.findElement(SignupObject.paypay_radio_button).click();
			//wait.implictywait(driver);
			Thread.sleep(1000);
		}

		String paypal_text = driver.findElement(SignupObject.verify_paypal_text).getText();
		String ExpectTitle = "You will be redirected to the PayPal website when you place an order.";
		Assert.assertEquals(ExpectTitle, paypal_text);
		Thread.sleep(1000);
	}

        @Then("^pay pal popup appears and user navigates back to my account pp$")
	public void pay_pal_popup_appears_and_user_navigates_back_to_my_account_pp() throws Throwable {
	    
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
		    
	} */
	
	@Then("^user go to free ppts page fbu$")
	public void user_go_to_free_ppts_page_efu() throws InterruptedException  {
		Thread.sleep(2000);

		WebElement free_ppt_btn=driver.findElement(By.xpath("//a[contains(.,'Free PPTs')]"));
		Thread.sleep(2000);

	    free_ppt_btn.click();
	}

	@Then("^user download a free ppt fbu$")
	public void user_download_a_free_ppt_fbu() throws InterruptedException  {
	    
		//driver.findElement(By.xpath("//a[contains(.,'3d Puzzle Pieces In Line Powerpoint Presentation …')]")).click();
		driver.get("https://www.slideteam.net/2d-pyramid-simple-powerpoint-presentation-slides.html");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#clicking")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2300);
		
	}

	@Then("^user logout fbu\\.$")
	public void user_logout_fbu() throws Throwable {
	   Thread.sleep(8000);
	        
	    WebElement my_account =driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.panel.wrapper > div > div > ul > li:nth-child(1) > a"));
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
