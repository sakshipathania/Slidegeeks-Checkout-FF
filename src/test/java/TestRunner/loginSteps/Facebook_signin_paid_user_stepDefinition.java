package TestRunner.loginSteps;

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

public class Facebook_signin_paid_user_stepDefinition extends SetupClass {
	PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();

	// Open web site URl
	@Given("^Open given the application URL$")
	public void navigates_to_website_url() throws InterruptedException  {
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
                  Thread.sleep(1000);
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

	@Then("^user navigate to complete deck from dashboard page$")
         public void user_navigate_to_complete_deck_from_dashboard_page() throws InterruptedException  {
    
	 driver.get("https://www.slideteam.net/complete-powerpoint-decks-presentations/all-powerpoint-complete-decks.html");
	 Thread.sleep(3000);
	 
	 WebElement select_product=driver.findElement(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)"));
	  Thread.sleep(2000);   
	 select_product.click();
	    Thread.sleep(2000);
	    
            }
	
	@Then("^Click on download this presentation$")
	public void click_on_Download_thist_presentation_link() throws InterruptedException {
		//WebElement Download_ppt = driver.findElement(By.cssSelector("#clicking"));
		driver.get("https://www.slideteam.net/business-process-evaluation-powerpoint-show.html");
		//wait.implictywait(driver);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#clicking")).click();
		//Download_ppt.click();
		Thread.sleep(1000);
	}

	@Then("^Click on test fblink$")
	public void fb_link() throws InterruptedException {
		driver.get("https://www.slideteam.net/");
		Thread.sleep(4000);
		WebElement fblink = driver.findElement(By.xpath("//a[@class='btn btn-block btn-social btn-facebook social-btn']"));
		Thread.sleep(1000);
		fblink.click();
		Thread.sleep(1000);
	}

	@Then("^user email as$")
	public void enter_user_mail() throws InterruptedException {
		
		try {
		WebElement user_email = driver.findElement(By.xpath("//*[@id='email']"));
		user_email.click();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		user_email.clear();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		user_email.sendKeys("slidetech.qa@gmail.com");
		//wait.implictywait(driver);
                Thread.sleep(1000);
		} catch (NoSuchElementException nonemaillink) {

		}
	}

	 @Then("^user password as$")
	 public void enter_user_password() throws Throwable {
		try {
		WebElement user_pass = driver.findElement(By.xpath("//*[@id='pass']"));
		user_pass.click();
		Thread.sleep(1000);
			//wait.implictywait(driver);
		user_pass.clear();
		 Thread.sleep(1000);
			//wait.implictywait(driver);
		user_pass.sendKeys("himanshi@123");
		Thread.sleep(1000);
			//wait.implictywait(driver);

	
            } catch (NoSuchElementException password) {

            }  
	}

	@Then("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
		try {
		WebElement Login_button = driver.findElement(By.xpath("//*[@id='loginbutton']"));
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Login_button.click();
		//wait.implictywait(driver);
		Thread.sleep(2000);
		} catch (NoSuchElementException logincta) {
			
		}
		 Thread.sleep(1000);
		try {
			WebElement FP_GP = driver.findElement(FbandGP_Object.continue_as_QA);
			FP_GP.click();
			Thread.sleep(1000);
		} catch (NoSuchElementException qalink) {

		}
		  Thread.sleep(1000);
		try {
			WebElement close = driver.findElement(By.cssSelector(".fancybox-item.fancybox-close"));
			//wait.implictywait(driver);
			Thread.sleep(1000);
			close.click();
			Thread.sleep(500);
		} catch (NoSuchElementException nonpoptest) {

		}
		
	}
		
	@Then("^See the this link as download this presenetion link is appeared$")
	public void verify_uesr_validation_message_for_Email_Address() throws Throwable {
                 driver.get("https://www.slideteam.net/business-process-evaluation-powerpoint-show.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#clicking")).click();
		Thread.sleep(2000);
		/*try {
			String Email_test = driver.findElement(SignupObject.Downloaded).getText();
			//wait.implictywait(driver);
			Thread.sleep(1000);
			String Expected_Cta = "Download this presentation";
			Assert.assertEquals(Expected_Cta, Email_test);
			//wait.implictywait(driver);
			Thread.sleep(1000);
		} catch (NoSuchElementException er1) {

		}*/
	}

}

