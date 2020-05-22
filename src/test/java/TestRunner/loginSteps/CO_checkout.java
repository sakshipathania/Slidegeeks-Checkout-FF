package TestRunner.loginSteps;

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

public class CO_checkout extends SetupClass{
	
	//PerformAction wa_it = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();

	WebDriverWait wait = new WebDriverWait(driver,50);

	@Given("^user is already on Website Home Page CO$")
	public void user_is_already_on_Website_Home_Page_CO(int arg1) throws Throwable {
	
		driver.get("https://www.slideteam.net");
		Thread.sleep(3000);
		try {
			WebElement app = driver.findElement(SignupObject.close_add);
			app.click();
			Thread.sleep(3000);
			log.info("It's opening the website URL");
		} catch (NoSuchElementException popup) {
		}
                  Thread.sleep(3000);
		try {
			WebElement logout = driver.findElement(By.cssSelector(".signin-link[title='Sign Out']"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(3000);
			}
		} catch (NoSuchElementException Ext) {

		}	
	
	}

	@Then("^user navigates to sign up page CO$")
	public void user_navigates_to_sign_up_page_CO(int arg1) throws Throwable {
		Thread.sleep(3000);
		try {
			driver.findElement(By.cssSelector("ul.header > li:nth-child(1) > a:nth-child(1)")).click();
			Thread.sleep(3000);
			log.info("It's opening the website URL and redirect user to sign up page");
		} 
		catch (NoSuchElementException popup) {
		}
	}

	@Then("^user create a new ac count CO$")
	public void user_create_a_new_ac_count_CO(int arg1) throws Throwable {
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
					WebElement Captcha= driver.findElement(By.xpath("//*[@id='captcha_user_create']"));
		//wait.implictywait(driver);
		Thread.sleep(2000);
		Captcha.click();
		Thread.sleep(2000);
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
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();", element);
			Thread.sleep(2000);

			}
		catch( NoSuchElementException popup) {
		}
	}

	@Then("^user is redirected to pricing page and choose a plan to pay CO$")
	public void user_is_redirected_to_pricing_page_and_choose_a_plan_to_pay_CO(int arg1) throws Throwable {
		// choose a plan
		try {
		 WebElement join_now_btn  = driver.findElement(By.cssSelector("div.col-box:nth-child(2) > div:nth-child(3) > span:nth-child(1) > form:nth-child(1) > button:nth-child(4) > span:nth-child(1)"));
		// WebElement join_now_btn  = driver.findElement(By.xpath("(//span[contains(.,'Join now')])[8]"));
			Thread.sleep(5000);
		    join_now_btn.click();
			Thread.sleep(2000);
		}catch( NoSuchElementException popup) {
		}

	}

	@Then("^user is redirected to checkout page CO$")
	public void user_is_redirected_to_checkout_page_CO(int arg1) throws Throwable {
		Thread.sleep(4000);
	}

	@Then("^user proceed to pay with CO$")
	public void user_proceed_to_pay_with_CO(int arg1, int arg2) throws InterruptedException {
	     try {
		Thread.sleep(4000);
		// select 2co option
		WebElement co_btn  = driver.findElement(By.xpath("//input[@id='tco_checkout']"));
		Thread.sleep(2000);
	         co_btn.click();
		Thread.sleep(3000);
	     } catch( NoSuchElementException popup) { 
	     }
	
		// place order button 
		try {
		 WebElement place_order_btn  =  driver.findElement(By.xpath("//button[contains(.,'Place Order')]"));
			Thread.sleep(2000);
		    place_order_btn.click();
			Thread.sleep(3000);
		} catch (NoSuchElementException popup) {
		}
	}

	@Then("^popup appears and user navigates back to my account CO$")
	public void popup_appears_and_user_navigates_back_to_my_account_CO(int arg1) throws Throwable {
		//WebDriverWait wait=new WebDriverWait(driver, 20);
	    String co_page_title=driver.getTitle();
		Thread.sleep(3000);
	    System.out.println("Title of the Page is --> "+co_page_title);
	    
	    String page_title="2Checkout";
	    
	    if(page_title.equalsIgnoreCase(co_page_title))
	    {
	    	System.out.println(" user is on the 2checkout page");
	    	log.info("USER IS ON THE 2CHECKOUT PAGE");
	    }
	    else
	    {
	    	System.out.println("user is on the wrong page");
	    	log.info("USER IS ON THE WRONG PAGE");
	    }
		Thread.sleep(3000);
	}

	@Then("^user deleted the account CO$")
	public void user_deleted_the_account_CO(int arg1) throws Throwable {
		Thread.sleep(3000);
	    driver.get("https://www.slideteam.net/");
		Thread.sleep(2000);
		

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
