package TestRunner.loginSteps;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepository.SignupObject;
import TestRunner.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webApp.PerformAction;
public class SignUp_Step extends SetupClass {
	//PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public static String Email_Address;
	Random rad = new Random();
	WebDriverWait wait = new WebDriverWait(driver,50);

	String name = "" + rad.nextInt(100000) + "@gmail.com";

	// Open web site URl
	@Given("^Navigates to website url\\.$")
	public void navigates_to_website_url() throws InterruptedException {
		// Maximize Windows
		driver.get("https://www.slideteam.net");
		Thread.sleep(2000);
		try {
			WebElement Website = driver.findElement(SignupObject.close_add);
			Website.click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} catch (NoSuchElementException Exc) {
		}

		try {
			WebElement User_Signin = driver.findElement(By.cssSelector(".signin-link[title='Sign Out']"));
			if (User_Signin.isEnabled()) {
				User_Signin.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Exb) {

		}
		try {
			driver.findElement(By.cssSelector("ul.header > li:nth-child(1) > a:nth-child(1)")).click();
			Thread.sleep(2000);
			log.info("It's opening the website URL and redirect user to sign up page");
		} 
		catch (NoSuchElementException popup) {
		}
	}

        /*@Then("^user will navigate to complete deck from account dashboard page$")
         public void user_will_navigate_to_complete_deck_from_account_dashboard_page() throws InterruptedException  {
    
	 driver.get("https://www.slideteam.net/complete-powerpoint-decks-presentations/all-powerpoint-complete-decks.html");
	 Thread.sleep(3000);
	 
	// WebElement selectproduct=driver.findElement(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)"));
	  //Thread.sleep(2000);   
	 //selectproduct.click();
	  //Thread.sleep(2000);
	    
            }

	@Then("^Click on Download this presentation link\\.$")
	public void click_on_Download_this_presentation_link() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement Download_ppt= driver.findElement(By.xpath("//*[@id='clicking']"));
		//wait.implictywait(driver);
		Thread.sleep(2000);
		Download_ppt.click();
		Thread.sleep(1000);
	} 

	@Then("^Click on Create an Account CTA\\.$")
	public void reate_an_Account_CTA() throws InterruptedException {
		WebElement create_account= driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div[2]/div/div/a"));
		create_account.click();
		Thread.sleep(1500);
	} */

	@Then("^Enter Email Address as \"([^\"]*)\"\\.$")
	public void enter_Email_Address_as(String email) throws Throwable {
		WebElement Email_Address = driver.findElement(By.xpath("//*[@id='email_address']"));
		Email_Address.click();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Email_Address.clear();
		//wait.implictywait(driver);
		Thread.sleep(2000);
		Email_Address.sendKeys(email);
		//wait.implictywait(driver);
		Thread.sleep(2000);
		log.info("It's entering the user email Address");
	}

	@Then("^Enter First Name as \"([^\"]*)\"\\.$")
	public void enter_First_Name_as(String Fname) throws Throwable {
		WebElement FirstName= driver.findElement(By.xpath("//*[@id='firstname']"));
		FirstName.click();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		FirstName.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		FirstName.sendKeys(Fname);
		Thread.sleep(2000);
		//wait.implictywait(driver);
		log.info("It's entering the user First Name");
	}

	@Then("^Enter Last Name as \"([^\"]*)\"\\.$")
	public void enter_Last_Name_as(String LName) throws Throwable {
		WebElement LastName= driver.findElement(By.xpath("//*[@id='lastname']"));
		LastName.click();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		LastName.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		LastName.sendKeys(LName);
		Thread.sleep(2000);
		//wait.implictywait(driver);
		log.info("It's entering the user Last Name");
	}

	@Then("^Enter Password as \"([^\"]*)\"\\.$")
	public void enter_password(String pwd) throws InterruptedException {
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		WebElement Pass_word = driver.findElement(By.xpath("//*[@id='password']"));
		Pass_word.click();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Pass_word.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Pass_word.sendKeys(pwd);
		Thread.sleep(2000);
		//wait.implictywait(driver);
		log.info("It's entering the user password");
	}

	@Then("^Enter Confirm password as \"([^\"]*)\"\\.$")
	public void enter_Confirm_password_as(String Cpswd) throws Throwable {
		WebElement Confirm_password= driver.findElement(By.xpath("//*[@id='password-confirmation']"));
		//wait.implictywait(driver);
		Thread.sleep(2000);
		Confirm_password.click();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Confirm_password.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Confirm_password.sendKeys(Cpswd);
		Thread.sleep(2000);
		//wait.implictywait(driver);
		log.info("It's entering the user password");
	}

	@Then("^Enter the captcha\\.$")
	public void enter_the_captcha() throws InterruptedException {
		WebElement Captcha= driver.findElement(By.xpath("//*[@id='captcha_user_create']"));
		//wait.implictywait(driver);
		Thread.sleep(2000);
		Captcha.click();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Captcha.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Captcha.sendKeys("23102018");
		Thread.sleep(1000);
		//wait.implictywait(driver);
		log.info("It's entering the user password");
	}

	@Then("^click on Signup button\\.$")
	public void click_on_Signup_button() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 40);
			WebElement element = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/form/fieldset/div[8]/div[2]/div/div/button"));
			Thread.sleep(1000);
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(2000);

		} catch (TimeoutException e) {
		}
	}

	/*@Then("^Verify \"([^\"]*)\" validation message for Email Address\\.$")
	public void verify_validation_message_for_Email_Address(String Email) throws InterruptedException {

		try {

			String Email_val = driver.findElement(SignupObject.Email_AddressVal).getText();
			//wait.implictywait(driver);
			Thread.sleep(2000);
			Assert.assertEquals(Email, Email_val);
			//wait.implictywait(driver);
			Thread.sleep(1000);
			
		} catch (NoSuchElementException nc) {
		  Object s = js.executeScript("return document.getElementById('email_address').validationMessage");
		  //wait.implictywait(driver);
			Thread.sleep(2000);
	        System.out.println(s);
	        //wait.implictywait(driver);
			Thread.sleep(2000);
	         log.info("It's getting HTML5 validation message using JS executor");
				//wait.implictywait(driver);
			Thread.sleep(2000);
		}


}

	@Then("^Verify \"([^\"]*)\" validation message for First Name\\.$")
	public void verify_validation_message_for_First_Name(String Fn) throws InterruptedException  {
		try {
			String Fname = driver.findElement(SignupObject.FNVal).getText();
			Thread.sleep(2000);
			//wait.implictywait(driver);
			Assert.assertEquals(Fname, Fn);
			Thread.sleep(2000);
			//wait.implictywait(driver);
		} catch (NoSuchElementException FnameElment) {

		}
	}

	@Then("^Verify \"([^\"]*)\" validation message forLast Name\\.$")
	public void verify_validation_message_forLast_Name(String LastName) throws InterruptedException  {
		try {
			String LName_vali = driver.findElement(SignupObject.LNVal).getText();
			//wait.implictywait(driver);
			Thread.sleep(2000);
			Assert.assertEquals(LName_vali, LastName);
			//wait.implictywait(driver);
			Thread.sleep(2000);

		} catch (NoSuchElementException LastNameElement) {

		}
	}

	@Then("^Verify \"([^\"]*)\" validation message for Password\\.$")
	public void verify_validation_message_for_password(String pwd) throws InterruptedException  {
		// Write code here that turns the phrase above into concrete actions
		try {
			String password_validation = driver.findElement(SignupObject.password_errormessage).getText();
			//wait.implictywait(driver);
			Thread.sleep(2000);
			Assert.assertEquals(password_validation, pwd);
			//wait.implictywait(driver);
			Thread.sleep(2000);
		} catch (NoSuchElementException PassElement) {

		}
	}

	@Then("^Verify \"([^\"]*)\" validation message for Confirm_password\\.$")
	public void verify_validation_message_for_Confirm_password(String Cpass) throws InterruptedException  {
		try {
			String CNP_validation = driver.findElement(SignupObject.repeat_errormessage).getText();
			Thread.sleep(2000);
			//wait.implictywait(driver);
			Assert.assertEquals(CNP_validation, Cpass);
			Thread.sleep(2000);
			//wait.implictywait(driver);
		} catch (NoSuchElementException ConfirmElement) {

		}
	}

	@Then("^Verify \"([^\"]*)\" message for all invalid credentials\\.$")
	public void message_for_all_invalid_credentials(String Error) throws InterruptedException  {
		try {
			String Email_Reg = driver.findElement(SignupObject.Signup_errormessage).getText();
			//wait.implictywait(driver);
			Thread.sleep(2000);
			Assert.assertEquals(Email_Reg, Error);
			Thread.sleep(2000);
			//wait.implictywait(driver);
		} catch (NoSuchElementException EmailElement) {
			System.out.println("element not found");
		}
	}

	@Then("^Enter Email \"([^\"]*)\"\\.$")
	public void Enter_Email_credentials(String Newuser) throws InterruptedException  {
		WebElement Enter_email= driver.findElement(By.xpath("//*[@id='email_address']"));
		Enter_email.click();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Enter_email.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Email_Address = Newuser + name;
		Enter_email.sendKeys(Email_Address);
		Thread.sleep(2000);
		//wait.implictywait(driver);

	}*/

	@Then("^After signup see the price page\\.$")
	public void verify_the_price_page() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		//wait.implictywait(driver);
		Thread.sleep(2000);
		String expectedTitle = "Pricing";
		//wait.implictywait(driver);
		Thread.sleep(2000);
		Assert.assertEquals(expectedTitle, actualTitle);
		//wait.implictywait(driver);
		Thread.sleep(1000);
	}

	/*@Then("^Select price subscription\\.$")
	public void select_price_subscription() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,650)");
		Thread.sleep(1000);
		List<WebElement> listings = driver.findElements(By.xpath("//*[contains(text(),' Join now ')]"));
		int randomValue = rad.nextInt(listings.size()); // Getting a random value that is between 0 and (list's size)-1
		listings.get(randomValue).click();
		Thread.sleep(2000);

	}

	@Then("^Verify the payment option\\.$")
	public void payement_option() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String payment_text = driver.findElement(SignupObject.payment).getText();
		String ExpectTitle = "PAYMENT INFORMATION";
		Assert.assertEquals(ExpectTitle, payment_text);
		//wait.implictywait(driver);
		Thread.sleep(4000);
	}

	@Then("^Enter the coupon code\\.$")
	public void Enter_the_coupon_code() throws Throwable {

		WebElement Coupon_code = driver.findElement(SignupObject.Enter_Coupon);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", webelement);
		//wait.implictywait(driver);
		Thread.sleep(2000);
		Coupon_code.clear();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Coupon_code.sendKeys("5OFF");
		//wait.implictywait(driver);
                Thread.sleep(2000);
	}

	@Then("^Apply the coupon code as given\\.$")
	public void apply_the_coupon_code() throws Throwable {
		WebElement Apply_coupon = driver.findElement(SignupObject.Apply_Coupon);
		js.executeScript("arguments[0].click();", Apply_coupon);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
	}

	@Then("^Verify the applied coupon code\\.$")
	public void applied_coupon_code() throws InterruptedException {
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		String applied_code = driver.findElement(SignupObject.verify_apply_code).getText();
		System.out.println(applied_code);
		String ExpectTitle = "Discount (5OFF)";
		Assert.assertEquals(ExpectTitle, applied_code);
		Thread.sleep(1000);
	}

	@Then("^Verify the default payment option as paypal\\.$")
	public void select_the_default_payment_option_as_paypal() throws Throwable {
		WebElement verify = driver.findElement(SignupObject.paypay_radio_button);
		if (!driver.findElement(SignupObject.paypay_radio_button).isSelected())
		// to check the check box is already selected or not
		{
			driver.findElement(SignupObject.paypay_radio_button).click();
			//wait.implictywait(driver);
			Thread.sleep(2000);
		}

		String paypal_text = driver.findElement(SignupObject.verify_paypal_text).getText();
		String ExpectTitle = "You will be redirected to the PayPal website when you place an order.";
		Assert.assertEquals(ExpectTitle, paypal_text);
		Thread.sleep(1000);
	}

	@Then("^click on place order button\\.$")
	public void click_on_place_order_cta() throws InterruptedException {
		WebElement Button = driver.findElement(SignupObject.place_cta);
		//wait.implictywait(driver);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", Button);
		Thread.sleep(5000);
	}

	@Then("^Verify the paypal payement process\\.$")
	public void paypal_payement_place_process_Step() throws InterruptedException {
		Thread.sleep(4000);
		try {
			String actualTitle1 = driver.getTitle();
			Thread.sleep(2000);
			//wait.implictywait(driver);
			System.out.println(actualTitle1);
			Thread.sleep(2000);
			String expectedTitle1 = "Billing Information - PayPal";
			Thread.sleep(2000);
			//wait.implictywait(driver);
			String expectedTitle2 = "PayPal Checkout";
			Thread.sleep(2000);
			//wait.implictywait(driver);

			if (actualTitle1.equals(expectedTitle1)) {
				Assert.assertEquals(expectedTitle1, actualTitle1);
				//wait.implictywait(driver);
				Thread.sleep(3000);
				System.out.println("title does not matched");
			} else {
				Assert.assertEquals(expectedTitle2, actualTitle1);
				//wait.implictywait(driver);
				Thread.sleep(2000);
				System.out.println(actualTitle1);
				Thread.sleep(3000);
				System.out.println("title matched");
			}
		} catch (NoSuchElementException PayPal) {

		}
	}

	@Then("^Select the payment option as card\\.$")
	public void card_payment() throws InterruptedException {
	
		WebElement Payment = driver.findElement(SignupObject.card_radio_button);
		Payment.click();
		Thread.sleep(1000);
		String card_text = driver.findElement(SignupObject.verify_2checkout).getText();
		System.out.println(card_text);
		String ExpectTitle = "2Checkout (Visa, Amex, Discover, JCB, Diners Club, Debit Card, PayPal)";

		Assert.assertEquals(ExpectTitle, card_text);
		Thread.sleep(1000);
	}

	@Then("^Verify the card payement page\\.$")
	public void card_page() throws InterruptedException {
		Thread.sleep(4000);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		String expectedTitle = "2Checkout";
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(2000);
		//wait.implictywait(driver);
		System.out.println(actualTitle);
		Thread.sleep(7000);
	}

	@Then("^Navigates to website url home page\\.$")
	public void website_url_home_page() throws InterruptedException {
		driver.get("https://www.slideteam.net");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Then("^logout the application\\.$")
	public void logout_app() throws InterruptedException {
		WebElement Logout = driver.findElement(By.cssSelector(".signin-link[title='Sign Out']"));
		Thread.sleep(2000);
		//wait.implictywait(driver);
		Logout.click();
		Thread.sleep(1000);

	}

	@Then("^Click on My account link\\.$")
	public void my_account_link() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		

		WebElement myaccount = new WebDriverWait(driver, 50)
				.until(ExpectedConditions.visibilityOfElementLocated(SignupObject.MyAccount));
		//wait.implictywait(driver);
		Thread.sleep(2000);
		myaccount.click();
		Thread.sleep(1000);

	}

	@Then("^Click on delete account link\\.$")
	public void delete_account_link() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement delete = new WebDriverWait(driver, 50)
				.until(ExpectedConditions.visibilityOfElementLocated(SignupObject.Delete));
		//wait.implictywait(driver);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", delete);
		Thread.sleep(1000);

	}

	@Then("^Click on Yes button\\.$")
	public void confirm_yes_() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement yes_delete = new WebDriverWait(driver, 50)
				.until(ExpectedConditions.visibilityOfElementLocated(SignupObject.Delete_Yes));
		//wait.implictywait(driver);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", yes_delete);
		Thread.sleep(1000);

	}

	@Then("^Verify the delete account confirmation message\\.$")
	public void delete_confirmation_message() throws InterruptedException {
		Thread.sleep(2000);
		String Account_delete = driver.findElement(SignupObject.Conf_delete).getText();
		Thread.sleep(2000);
		//wait.implictywait(driver);
		String expecte_delete = "Your account has been deleted successfully.";
		Assert.assertEquals(expecte_delete, Account_delete);
		//wait.implictywait(driver);
		Thread.sleep(2000);

	}*/
	@Then("^user will download a free product cd$")
	public void user_will_download_a_free_product_cd() throws InterruptedException  {
		driver.findElement(By.cssSelector("li.item:nth-child(8) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#clicking")).click();
		Thread.sleep(3000);
	   driver.get("https://www.slideteam.net/");
	   Thread.sleep(3000);
	}

	@Then("^user wants to delete the new account created cd$")
	public void user_wants_to_delete_the_new_account_created_cd() throws InterruptedException  {
	    

		 driver.findElement(By.cssSelector("ul.header > li:nth-child(1) > a:nth-child(1)")).click();
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
		 WebElement continue_delete = driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Continue')]"));
		 continue_delete.click();
		 Thread.sleep(3000);
	}



}
