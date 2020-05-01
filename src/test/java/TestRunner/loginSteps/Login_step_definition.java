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

	  @Then("^user navigate to complete deck from account dashboard page$")
         public void user_navigate_to_complete_deck_from_account_dashboard_page() throws InterruptedException  {
    
	 driver.get("https://www.slideteam.net/complete-powerpoint-decks-presentations/all-powerpoint-complete-decks.html");
	 Thread.sleep(3000);
	 
	// WebElement select_product=driver.findElement(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)"));
	  //Thread.sleep(2000);   
	//  select_product.click();
	 //ac.moveToElement(select_product).build().perform();
	   Thread.sleep(2000);
	    } 
	
	@Then("^select a product item\\.$")
	public void select_product() throws InterruptedException {
		driver.get("https://www.slideteam.net/6-months-project-timeline-roadmap.html");
		//WebElement Product= driver.findElement(SignupObject.Select_item);
		//Product.click();
		//wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^click on download this presentation link\\.$")
	public void click_on_Download_this_presentation_link() throws InterruptedException {
		WebElement PPT_link = driver.findElement(By.xpath("//*[@id='clicking']"));
		//wait.implictywait(driver);
		PPT_link.click();
		Thread.sleep(1000);
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

	@Then("^Select any of price subscription\\.$")
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
	} */

	@Then("^See default payment option as paypal\\.$")
	public void see_default_payment_option_as_paypal() throws Throwable {
		WebElement paypal = driver.findElement(By.cssSelector("#paypal_express"));
		if (!driver.findElement(SignupObject.paypay_radio_button).isSelected())
		// to check the check box is already selected or not
		{
			driver.findElement(By.cssSelector("#paypal_express")).click();
			//wait.implictywait(driver);
			Thread.sleep(1000);
		}

		String paypal_text = driver.findElement(SignupObject.verify_paypal_text).getText();
		String ExpectTitle = "You will be redirected to the PayPal website when you place an order.";
		Assert.assertEquals(ExpectTitle, paypal_text);
		Thread.sleep(1000);
	}

	@Then("^Enter coupon code\\.$")
	public void enter_coupon() throws InterruptedException {
		WebElement code = driver.findElement(SignupObject.Enter_Coupon);
		//wait.implictywait(driver);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", code);
		//wait.implictywait(driver);
		Thread.sleep(1000);
		code.clear();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		code.sendKeys("5OFF");
		Thread.sleep(1000);
		//wait.implictywait(driver);
	}

	@Then("^Apply cuopon code\\.$")
	public void apply_the_cuopon_code() throws Throwable {
		WebElement coupon= driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[4]/div[3]/ol/li[3]/div/form/fieldset/div[3]/div[2]/form/div[2]/div/button/span/span"));
		js.executeScript("arguments[0].click();", coupon);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

	}

	@Then("^Verify applied coupon code offer\\.$")
	public void verify_the_applied_coupon_code_offer() throws Throwable {
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		String applied_code = driver.findElement(SignupObject.verify_apply_code).getText();
		System.out.println(applied_code);
		String ExpectTitle = "Discount (5OFF)";
		Assert.assertEquals(ExpectTitle, applied_code);
		Thread.sleep(2000);
	}

	@Then("^click on place order CTA\\.$")
	public void click_on_place_order_CTA() throws Throwable {
		WebElement CTA= driver.findElement(SignupObject.place_cta);
		//wait.implictywait(driver);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", CTA);
		Thread.sleep(5000);
	}

	@Then("^Verify the paypal payement page\\.$")
	public void verify_the_paypal_payement_page() throws Throwable {
		Thread.sleep(4000);
		 try {
			 String actualTitle1 = driver.getTitle();
			 Thread.sleep(1000);
				//wait.implictywait(driver);
				System.out.println(actualTitle1);
			 Thread.sleep(1000);
				String expectedTitle1 = "Billing Information - PayPal";
			 Thread.sleep(1000);
				//wait.implictywait(driver);
				String expectedTitle2="PayPal Checkout";
			 Thread.sleep(1000);
				//wait.implictywait(driver);
				
			    if(actualTitle1.equals(expectedTitle1)){
				Assert.assertEquals(expectedTitle1, actualTitle1);
				//wait.implictywait(driver);
				Thread.sleep(3000);
				System.out.println("title does not matched");
	        }

		 else{
				Assert.assertEquals(expectedTitle2, actualTitle1);
			 Thread.sleep(1000);
				//wait.implictywait(driver);
				System.out.println(actualTitle1);
				Thread.sleep(3000);
				System.out.println("title matched");
		    }
		 }
		 catch (NoSuchElementException Paypalget){
	
		 }
	}
	@Then("^Select payment option as Card\\.$")
	public void select_payment_option_as_Card() throws Throwable {
		WebElement option= driver.findElement(SignupObject.card_radio_button);
		option.click();
		Thread.sleep(1000);
		String card_text = driver.findElement(SignupObject.verify_2checkout).getText();
		System.out.println(card_text);
		String ExpectTitle = "2Checkout (Visa, Amex, Discover, JCB, Diners Club, Debit Card, PayPal)";

		Assert.assertEquals(ExpectTitle, card_text);
		Thread.sleep(1000);

	}

	@Then("^Verify card payement page\\.$")
	public void card_page() throws InterruptedException {
		Thread.sleep(4000);
		String actualTitle = driver.getTitle();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		String expectedTitle = "2Checkout";
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		//wait.implictywait(driver);
		System.out.println(actualTitle);
		Thread.sleep(2000);
	}
	
}
