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
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)"))).click();
	  Thread.sleep(2000);   
	    
}

	@Then("^Open the download presentation link\\.$")
	public void open_the_download_presentation_link() throws InterruptedException {
		WebElement download = driver.findElement(By.xpath("#clicking"));
		//wait.implictywait(driver);
		download.click();
		Thread.sleep(1000);
	}

	@Then("^Click on create as account link\\.$")
	public void click_on_create_as_account_link() throws InterruptedException {
		WebElement account_link = driver.findElement(SignupObject.create);
		account_link.click();
		Thread.sleep(1500);
	}

	@Then("^Click on faceblink\\.$")
	public void click_on_faceblink() throws InterruptedException {
		WebElement Faceblink = driver.findElement(FbandGP_Object.fbLink);
		//wait.implictywait(driver);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", Faceblink);
		Thread.sleep(3000);
	}

	@Then("^Fb user enter a valid email\\.$")
	public void fb_user_enter_a_valid_email() throws InterruptedException {
		WebElement valid_email= driver.findElement(FbandGP_Object.Femai);
		valid_email.click();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		valid_email.clear();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		valid_email.sendKeys("amw.vrushali@gmail.com");
		//wait.implictywait(driver);
                Thread.sleep(1000);
	}

	@Then("^Fb user enter valid password\\.$")
	public void fb_user_enter_valid_password() throws Throwable {
		WebElement Valid_pass = driver.findElement(FbandGP_Object.Fpassword);
		Valid_pass.click();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Valid_pass.clear();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Valid_pass.sendKeys("vrushali@786");
		//wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^click on login cta on fb page\\.$")
	public void click_on_login_cta_on_fb_page() throws InterruptedException {
		WebElement Fb_login= driver.findElement(FbandGP_Object.FbLogin);
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Fb_login.click();
		//wait.implictywait(driver);
		Thread.sleep(10000);
		try {
			WebElement Fb_GP = driver.findElement(FbandGP_Object.continue_as_QA);
			Fb_GP.click();
			Thread.sleep(1000);
		} catch (NoSuchElementException qalink) {

		}
	}

	@Then("^The user is redirected to price page\\.$")
	public void the_user_is_redirected_to_price_page() throws Throwable {

		String actualTitle = driver.getTitle();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		String expectedTitle = "Pricing";
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Thread.sleep(2000);
		
	}
					
	@Then("^the randamly the subscription product\\.$")
	public void the_randamly_the_subscription_product() throws Throwable {
		js.executeScript("window.scrollBy(0,650)");
		Thread.sleep(1000);
	
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),' Join now ')]"));
		int randomValue = rad.nextInt(list.size()); // Getting a random value that is between 0 and (list's size)-1
		Thread.sleep(1000);
		list.get(randomValue).click();
		Thread.sleep(2000);
		
	}

	@Then("^Verify the payement section on the app\\.$")
	public void verify_the_payement_section_on_the_app() throws Throwable {
		String payment_text = driver.findElement(SignupObject.payment).getText();
		String ExpectTitle = "PAYMENT INFORMATION";
		System.out.println(payment_text);
		Assert.assertEquals(ExpectTitle, payment_text);
		Thread.sleep(1000);
	}

	@Then("^By default payment option as paypal is selected\\.$")
	public void by_default_payment_option_as_paypal_is_selected() throws Throwable {
		WebElement paypal = driver.findElement(By.cssSelector("#paypal_express"));
		if (!driver.findElement(By.cssSelector("#paypal_express")).isSelected())
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

	@Then("^Enter the the offer code is off is showing\\.$")
	public void enter_coupon() throws Throwable  {
		WebElement Offer = driver.findElement(By.xpath("//*[@id='discount-code']"));
		Thread.sleep(1000);
		//wait.implictywait(driver);
		js.executeScript("arguments[0].click();", Offer);
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Offer.clear();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		Offer.sendKeys("5OFF");
		Thread.sleep(1000);
		//wait.implictywait(driver);
	}

	@Then("^Apply the code\\.$")
	public void apply_the_cuopon_code() throws Throwable {
		WebElement coupon_code= driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[4]/div[3]/ol/li[3]/div/form/fieldset/div[3]/div[2]/form/div[2]/div/button/span/span"));
		js.executeScript("arguments[0].click();", coupon_code);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

	}

	@Then("^Verify the apply offer code is appeared\\.$")
	public void verify_the_applied_coupon_code_offer() throws Throwable {
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		String applied_code = driver.findElement(SignupObject.verify_apply_code).getText();
		System.out.println(applied_code);
		String ExpectTitle = "Discount (5OFF)";
		Assert.assertEquals(ExpectTitle, applied_code);
		Thread.sleep(1000);
	}

	@Then("^Place order the product\\.$")
	public void click_on_place_order_CTA() throws Throwable {
		WebElement product= driver.findElement(SignupObject.place_cta);
		Thread.sleep(1000);
		//wait.implictywait(driver);
		js.executeScript("arguments[0].click();", product);
		Thread.sleep(5000);
	}

	@Then("^Verify the payment page\\.$")
	public void verify_the_paypal_payement_page() throws Throwable {
		Thread.sleep(4000);
		 try {
			 String actualTitle1 = driver.getTitle();
				Thread.sleep(1000);
			  //wait.implictywait(driver);
				System.out.println(actualTitle1);
				String expectedTitle1 = "Billing Information - PayPal";
				Thread.sleep(1000);
			 //wait.implictywait(driver);
				String expectedTitle2="PayPal Checkout";
				Thread.sleep(1000);
			 //wait.implictywait(driver);
				
			    if(actualTitle1.equals(expectedTitle1)){
				Assert.assertEquals(expectedTitle1, actualTitle1);
			Thread.sleep(1000);	
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
		 catch (NoSuchElementException checkPaypalget){
	
		 }
	}
					
	@Then("^Select the payment option as CARD is given\\.$")
	public void select_payment_option_as_Card() throws Throwable {
		WebElement card= driver.findElement(SignupObject.card_radio_button);
		card.click();
		Thread.sleep(1000);
		String card_text = driver.findElement(SignupObject.verify_2checkout).getText();
		System.out.println(card_text);
		String ExpectTitle = "2Checkout (Visa, Amex, Discover, JCB, Diners Club, Debit Card, PayPal)";

		Assert.assertEquals(ExpectTitle, card_text);
		Thread.sleep(1000);

	}

	@Then("^Verify the payment option as on card page\\.$")
	public void card_page() throws InterruptedException {
		Thread.sleep(4000);
		String actualTitle = driver.getTitle();
		Thread.sleep(1000);
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
