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

public class Email_Signin_paidUser_stepDefinition extends SetupClass {
//git change
	
	//PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();
	WebDriverWait wait = new WebDriverWait(driver,50);

	// Open web site URl
	@Given("^Open application URL$")
	public void navigates_to_website_url() throws InterruptedException {
		// Maximize Windows
		driver.get(AppURL);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	log.info("It's opening the website URL");
	Thread.sleep(1000);
	driver.get("https://www.slideteam.net");
	Thread.sleep(2000);
	driver.get("https://www.slideteam.net");
	Thread.sleep(2000);
    driver.manage().deleteAllCookies();
    Thread.sleep(2000);
	try {
		driver.findElement(By.cssSelector(".authorization-link > a:nth-child(1)")).click();
		Thread.sleep(2000);
		log.info("It's opening the website URL");
	} 
	catch (NoSuchElementException popup) {
	}

	}

	
	@Then("^Enter a user email$")
	public void enter_a_user_email() throws Throwable {
                try {
		WebElement Email_add= driver.findElement(By.xpath("//*[@id='email']"));
		Email_add.click();
		Thread.sleep(3000);
		//wait.implictywait(driver);
		Email_add.clear();
		Thread.sleep(3000);
		//wait.implictywait(driver);
		Email_add.sendKeys("sakshi.pathania@slidetech.in");
		//wait.implictywait(driver);
                Thread.sleep(3000);
	        } catch (NoSuchElementException Ext) {

		}
	}

	@Then("^Enter the user password$")
	public void enter_the_user_password() throws Throwable {
		try {
		WebElement user_pass = driver.findElement(By.xpath("//*[@id='pass']"));
		user_pass.click();
		Thread.sleep(3000);
		//wait.implictywait(driver);
		user_pass.clear();
		Thread.sleep(3000);
		//wait.implictywait(driver);
		user_pass.sendKeys("Qwerty@1");
		//wait.implictywait(driver);
		Thread.sleep(3000);
		 } catch (NoSuchElementException Ext) {

		}

	}

	@Then("^click on Login cta$")
	
	public void click_on_Login_cta() throws Throwable {
		try {
		WebElement Login_button= driver.findElement(By.xpath("//*[@id='send2']"));
		//wait.implictywait(driver);
		Thread.sleep(3000);
		Login_button.click();
		//wait.implictywait(driver);
		Thread.sleep(3000);
		}
                   catch (NoSuchElementException Ext) {
			
			}
		try {
			WebElement close = driver.findElement(By.cssSelector(".fancybox-item.fancybox-close"));
			//wait.implictywait(driver);
			close.click();
			Thread.sleep(500);
		} catch (NoSuchElementException nonpop) {

		}
	}
        
	@Then("^user is navigate to complete deck from account dashboard page$")
         public void user_is_navigate_to_complete_deck_from_account_dashboard_page() throws InterruptedException  {
    
	 driver.get("https://www.slideteam.net/complete-powerpoint-decks-presentations/all-powerpoint-complete-decks.html");
	 Thread.sleep(3000);
	 
	 WebElement select_product= driver.findElement(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)"));
	  Thread.sleep(5000);   
	 select_product.click();
	    Thread.sleep(5000);
          }
	
	@Then ("^chat window option\\.$")
	public void chat_window_option() throws InterruptedException {
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

	@Then("^the download this presenetion link is appeared$")
	public void the_download_this_presenetion_link_is_appeared() throws Throwable {
                driver.get("https://www.slideteam.net/one-page-strategy-vision-goals-strategies-tactics.html");
		try {
			String Email_test = driver.findElement(SignupObject.Downloaded).getText();
			//wait.implictywait(driver);
			Thread.sleep(3000);
			String Expected_Cta = "Download this presentation";
			Assert.assertEquals(Expected_Cta, Email_test);
			//wait.implictywait(driver);
			Thread.sleep(1000);
		} catch (NoSuchElementException er) {

		}
	}
	
        @Then("^Click on download this presentation link$")
	public void click_on_Download_this_presentation_link() throws InterruptedException {
		WebElement presentation= driver.findElement(By.cssSelector("#clicking"));
		//wait.implictywait(driver);
		Thread.sleep(3000);
		presentation.click();
		//wait.implictywait(driver);
		Thread.sleep(3000);
	}
}

