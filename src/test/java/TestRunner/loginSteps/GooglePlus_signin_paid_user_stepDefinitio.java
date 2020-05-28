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
import org.openqa.selenium.interactions.Actions;

import ObjectRepository.FbandGP_Object;
import ObjectRepository.SignupObject;
import TestRunner.SetupClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webApp.PerformAction;

public class GooglePlus_signin_paid_user_stepDefinitio extends SetupClass {
	//PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();
	WebDriverWait wait = new WebDriverWait(driver,50);

	// Open web site URl
	@Given("^Open home page of the application\\.$")
	public void navigates_to_website_url() throws InterruptedException {
		// Maximize Windows
		driver.get("https://www.slideteam.net");
		Thread.sleep(3000);
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
				Thread.sleep(3000);
//				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
	}

	@Then("^user navigate to complete deck from account$")
         public void user_navigate_to_complete_deck_from_account() throws InterruptedException  {
    
	 driver.get("https://www.slideteam.net/complete-powerpoint-decks-presentations/all-powerpoint-complete-decks.html");
	 Thread.sleep(3000);
	 
	 WebElement select_product=driver.findElement(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)"));
	  Thread.sleep(2000);   
	 select_product.click();
	    Thread.sleep(2000);
	    
            }


	@Then("^Click on downloadbtn test5 link\\.$")
	public void click_on_Download_this_presentation_link() throws InterruptedException {
		driver.get("https://www.slideteam.net/best-presentation-on-myself-powerpoint-presentation-slide.html");
		Thread.sleep(3000);
		//WebElement test5 = driver.findElement(By.cssSelector("//*[@id='clicking']"));
		//Thread.sleep(2000);
		//wait.implictywait(driver);
		//test5.click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("#clicking")).click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@Then("^Click on googlePlus link\\.$")
	public void fb_link() throws InterruptedException {
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		WebElement gplus = driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.panel.wrapper > div > div > div.social-login-authentication-channel.account-social-login > div > div.actions-toolbar.social-btn.social-btn-actions-toolbar.google-login > a"));
		gplus.click();
		Thread.sleep(2000);
	}

	@Then("^Enter user google email addess\\.$")
	public void enter_user_mail() throws InterruptedException  {
		WebElement gmail = driver.findElement(By.xpath("//*[@id='identifierId']"));
		gmail.click();
		//wait.implictywait(driver);
		Thread.sleep(3000);
		gmail.clear();
		Thread.sleep(3000);
		//wait.implictywait(driver);
		gmail.sendKeys("sakshi.pathania@slidetech.in");
		//wait.implictywait(driver);
		Thread.sleep(3000);
		
	}

	@Then("^go to password page\\.$")
	public void enter_user_password() throws InterruptedException  {
	
		WebElement pass_page = driver.findElement(By.xpath("//*[@id='identifierNext']/span"));
		Thread.sleep(3000);
		//wait.implictywait(driver);
		pass_page.click();
		Thread.sleep(3000);

	
	}

	 @Then("^Enter user google pass\\.$")
	public void google_pass() throws InterruptedException {
		 	 WebElement google_pass = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
				google_pass.click();
		                Thread.sleep(3000);
				//wait.implictywait(driver);
				google_pass.clear();
		                Thread.sleep(3000);
				//wait.implictywait(driver);
				google_pass.sendKeys("Qwerty@1");
				//wait.implictywait(driver);
				Thread.sleep(3000);
			

			
		}
	
	@Then("^Click on next CTA\\.$")
	public void click_on_Login_button() throws Throwable {

		WebElement next = driver.findElement(By.xpath("//*[@id='passwordNext']/span"));
		//wait.implictywait(driver);
		Thread.sleep(3000);
		next.click();
		//wait.implictywait(driver);
		Thread.sleep(1000);

		/*try {
			WebElement close = driver.findElement(By.cssSelector(".fancybox-item.fancybox-close"));
			//wait.implictywait(driver);
			Thread.sleep(1000);
			close.click();
			Thread.sleep(500);
		} catch (NoSuchElementException nonpoptest) {

		}*/

	}

	
	@Then("^user go to All ppts page gmail$")
	public void user_go_to_All_ppts_page_gmail() throws Throwable {
		Thread.sleep(3000);
		driver.get("https://www.slideteam.net/best-presentation-on-myself-powerpoint-presentation-slide.html");
		WebElement Dld_link = driver.findElement(By.xpath("//*[@id='clicking']"));
		Thread.sleep(3000);
		//wait.implictywait(driver);
		Dld_link.click();
		Thread.sleep(3000);
	}
	
	@Then("^logout pld gmail$")
	public void logout_pld_gmail() throws Throwable {
	   
		driver.get("https://www.slideteam.net/");
		   Thread.sleep(3000);
		   
		 driver.findElement(By.xpath("//a[contains(.,'My Account')]")).click();
		 Thread.sleep(3000);
		 
		 
		 driver.findElement(By.xpath("//a[contains(.,'Delete Account')]")).click();
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

     
		 Thread.sleep(3000);
		 WebElement continue_delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"deleteaccount-form\"]/button[1]")));
		 Thread.sleep(2000);

		 continue_delete.click();
		 Thread.sleep(3000);
		
		
	}

}
