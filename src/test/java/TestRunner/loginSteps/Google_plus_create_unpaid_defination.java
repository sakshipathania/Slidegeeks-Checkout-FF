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

public class Google_plus_create_unpaid_defination extends SetupClass {
	PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();

	// Open web site URl
	@Given("^launch application\\.$")
	public void navigates_to_website_url() throws InterruptedException {
		// Maximize Windows
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
		driver.get("https://www.slideteam.net/");
		Thread.sleep(2000);
		
		try {
			// click on sign in with google button on home page
			driver.findElement(By.xpath("//a[contains(text(),'Sign in with Google')]")).click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} 
		catch (NoSuchElementException popup) {
		}
		
	}

	/*@Then("^user navigate to complete deck from account dashboard$")
         public void user_navigate_to_complete_deck_from_account_dashboard_page() throws InterruptedException  {
    
	 driver.get("https://www.slideteam.net/complete-powerpoint-decks-presentations/all-powerpoint-complete-decks.html");
	 Thread.sleep(3000);
	 
	//WebElement select_product= driver.findElement(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)"));
	  //Thread.sleep(2000);   
	 //select_product.click();
	   Thread.sleep(2000);
	    
            }
	
	@Then("^go to download link\\.$")
	public void click_on_Download_this_presentation_link() throws InterruptedException {
		driver.get("https://www.slideteam.net/business-icons-for-planning-and-idea-generation-flat-powerpoint-design.html");
		WebElement link= driver.findElement(By.xpath("//*[@id='clicking']"));
		//wait.implictywait(driver);
		Thread.sleep(1000);
		link.click();
		Thread.sleep(1000);
	}

	@Then("^Click on Create account cta\\.")
	public void create_accuont() throws InterruptedException {
		WebElement Create= driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div[2]/div/div/a/span"));
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Create.click();
		Thread.sleep(1000);
	}

	@Then("^then click on Google plus link button\\.$")
	public void fb_link() throws InterruptedException {
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(500);
		WebElement Google= driver.findElement(By.xpath("//*[@id='form-validate']/fieldset/div[3]/div/div[2]/a"));
		Google.click();
		Thread.sleep(2000);
	}*/
	/*@Then("^User click on sign in with google button$")
	public void user_click_on_sign_in_with_google_button() throws InterruptedException  {
		Thread.sleep(2000);
		try
		{
			WebElement another_btn=driver.findElement(By.xpath("//div[text()='Use another account']"));
			another_btn.click();
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			
		
		}
		Thread.sleep(3000);
		
	}*/


	@Then("^enter a email\\.$")
	public void enter_user_mail() throws InterruptedException {
		try {
			WebElement useraccount = driver.findElement(By.xpath("//*[@id='identifierId']"));
			//wait.implictywait(driver);
			Thread.sleep(2000);
			useraccount.click();
			//wait.implictywait(driver);
			Thread.sleep(2000);
		}catch(NoSuchElementException usenewaccount) {	
	}
	
	try {
                WebElement email= driver.findElement(FbandGP_Object.GPEmail);
		//WebElement = new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(FbandGP_Object.GPEmail));
		//wait.implictywait(driver);
		Thread.sleep(2000);
		email.click();
		//wait.implictywait(driver);
		Thread.sleep(2000);
		email.clear();
		//wait.implictywait(driver);
		Thread.sleep(2000);
		email.sendKeys("selenium.testing9977@gmail.com");
		//wait.implictywait(driver);
		Thread.sleep(2000);
	}catch(NoSuchElementException usenewa) {	
	}
	}
	
	@Then("^Go to next page\\.$")
	public void password_page() throws InterruptedException {

		WebElement next= driver.findElement(By.xpath("#identifierNext > span:nth-child(3) > span:nth-child(1)"));
		next.click();
		//wait.implictywait(driver);
		Thread.sleep(3000);

	}

	@Then("^enter password\\.$")
	public void enter_user_password() throws Throwable {
		WebElement password= driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
		password.click();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		password.clear();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		password.sendKeys("Test@1234");
		//wait.implictywait(driver);
		
		Thread.sleep(3000);
	}

	@Then("^Click on next button\\.$")
	public void click_on_Login_button() throws Throwable {
		WebElement button= driver.findElement(By.cssSelector("#passwordNext > span:nth-child(3)"));
		//wait.implictywait(driver);
		Thread.sleep(1000);
		button.click();
		//wait.implictywait(driver);
		Thread.sleep(10000);

	}

	@Then("^Redirected to price page\\.$")
	public void after_signup_redirect_to_price_page() throws Throwable {

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

	/*@Then("^Subscribe randomly the product\\.$")
	public void select_any_of_price_subscription() throws Throwable {
		js.executeScript("window.scrollBy(0,650)");
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),' Join now ')]"));
		int randomValue = rad.nextInt(list.size()); // Getting a random value that is between 0 and (list's size)-1
		Thread.sleep(1000);
		list.get(randomValue).click();
		Thread.sleep(2000);
	}

	@Then("^the payment information is verify\\.$")
	public void verify_the_payment_option_field() throws Throwable {
		String payment_text = driver.findElement(SignupObject.payment).getText();
		String ExpectTitle = "PAYMENT INFORMATION";
		System.out.println(payment_text);
		Assert.assertEquals(ExpectTitle, payment_text);
		Thread.sleep(1000);
	}

	@Then("^then default payment option is paypal\\.$")
	public void see_default_payment_option_as_paypal() throws Throwable {
		WebElement payment= driver.findElement(SignupObject.paypay_radio_button);
		if (!driver.findElement(SignupObject.paypay_radio_button).isSelected())
		// to check the check box is already selected or not
		{
			driver.findElement(SignupObject.paypay_radio_button).click();
			Thread.sleep(1000);
			//wait.implictywait(driver);
		}

		String paypal_text = driver.findElement(SignupObject.verify_paypal_text).getText();
		String ExpectTitle = "You will be redirected to the PayPal website when you place an order.";
		Assert.assertEquals(ExpectTitle, paypal_text);
		Thread.sleep(1000);
	}

	@Then("^insert coupon as display in screen\\.$")
	public void enter_coupon() throws Throwable {
		WebElement display= driver.findElement(SignupObject.Enter_Coupon);
		Thread.sleep(1000);
		//wait.implictywait(driver);
		js.executeScript("arguments[0].click();", display);
		Thread.sleep(1000);
		//wait.implictywait(driver);
		display.clear();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		display.sendKeys("5OFF");
		Thread.sleep(1000);
		//wait.implictywait(driver);
	}

	@Then("^apply coupon cta\\.$")
	public void apply_the_cuopon_code() throws Throwable {
		WebElement apply= driver.findElement(SignupObject.Apply_Coupon);
		js.executeScript("arguments[0].click();", apply);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

	}

	@Then("^Verify the apply coupon code text is appeared\\.$")
	public void verify_the_applied_coupon_code_offer() throws Throwable {
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		String applied_code = driver.findElement(SignupObject.verify_apply_code).getText();
		System.out.println(applied_code);
		String ExpectTitle = "Discount (5OFF)";
		Assert.assertEquals(ExpectTitle, applied_code);
		Thread.sleep(1000);
	}

	@Then("^Go to checkout payement process page\\.$")
	public void click_on_place_order_CTA() throws Throwable {
		WebElement checkout= driver.findElement(SignupObject.place_cta);
		//wait.implictywait(driver);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", checkout);
		Thread.sleep(5000);
	}

	@Then("^Verify the payment screen is paypal is dispalyed\\.$")
	public void verify_the_paypal_payement_page() throws Throwable {
		Thread.sleep(4000);
		 try {
			 String actualTitle1 = driver.getTitle();
				//wait.implictywait(driver);
			 Thread.sleep(1000);
				System.out.println(actualTitle1);
				String expectedTitle1 = "Billing Information - PayPal";
				//wait.implictywait(driver);
			 Thread.sleep(1000);
				String expectedTitle2="PayPal Checkout";
				//wait.implictywait(driver);
			 Thread.sleep(1000);
				
			    if(actualTitle1.equals(expectedTitle1)){
				Assert.assertEquals(expectedTitle1, actualTitle1);
				//wait.implictywait(driver);
				Thread.sleep(1000);
				    System.out.println(actualTitle1);
				Thread.sleep(3000);
				System.out.println("title does not matched");
	}
		 else{
				Assert.assertEquals(expectedTitle2, actualTitle1);
				//wait.implictywait(driver);
				Thread.sleep(3000);
				System.out.println("title matched");
		    }
		 }
		 catch (NoSuchElementException checkPaypalpayement){
	
		 }
	}

	@Then("^Click on card radio button\\.$")
	public void select_payment_option_as_Card() throws Throwable {
		WebElement radio= driver.findElement(SignupObject.card_radio_button);
		radio.click();
		Thread.sleep(1000);
		String card_text = driver.findElement(SignupObject.verify_2checkout).getText();
		System.out.println(card_text);
		String ExpectTitle = "2Checkout (Visa, Amex, Discover, JCB, Diners Club, Debit Card, PayPal)";

		Assert.assertEquals(ExpectTitle, card_text);
		Thread.sleep(1000);

	}

	@Then("^Verify the payment page is secure card 2checkout title\\.$")
	public void card_page() throws InterruptedException {
		Thread.sleep(4000);
		String actualTitle = driver.getTitle();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		String expectedTitle = "2Checkout";
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		//wait.implictywait(driver);
		Thread.sleep(1000);
		System.out.println(actualTitle);
		Thread.sleep(2000);
	}*/
	@Then("^user go to free ppts page old gp$")
	public void user_go_to_free_ppts_page_old_gp() throws InterruptedException  {
	 
		//free ppt pg
		Thread.sleep(4000);
		WebElement free_ppt_btn=driver.findElement(By.xpath("//a[contains(.,'Free PPTs')]"));
		Thread.sleep(2000);
	    free_ppt_btn.click();
		Thread.sleep(1000);

	}

	@Then("^user download a free ppt old gp$")
	public void user_download_a_free_ppt_old_gp() throws InterruptedException  {
	 
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li.product:nth-child(4) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#clicking")).click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		// logout
		Thread.sleep(2000);
		try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				Thread.sleep(1000);
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
		
	}

}

