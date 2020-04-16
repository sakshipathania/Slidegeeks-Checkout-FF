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
	
	PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();

	// Open web site URl
	@Given("^Open application URL$")
	public void navigates_to_website_url() throws InterruptedException {
		// Maximize Windows
		driver.get("https://www.slideteam.net");
		Thread.sleep(5000);
		try {
			WebElement App_url= driver.findElement(SignupObject.close_add);
			App_url.click();
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

	 @Then("^user goes to complete deck from account dashboard page$")
         public void user_goes_to_complete_deck_from_account_dashboard_page() throws InterruptedException  {
    
	 //driver.get("https://www.slideteam.net/complete-powerpoint-decks-presentations/all-powerpoint-complete-decks.html");
	 //wait.implictywait(driver);
	 Thread.sleep(3000);
	 
	WebElement select_product = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)"))).click();
          Thread.sleep(2000);   
	//ac.moveToElement(select_product).build().perform();	 
	 select_product.click();
	   // Thread.sleep(2000);
	    
            }

	@Then("^Click on download this presentation link$")
	public void click_on_Download_this_presentation_link() throws InterruptedException {
		WebElement presentation= driver.findElement(By.cssSelector("#clicking"));
		wait.implictywait(driver);
		presentation.click();
		wait.implictywait(driver);
		Thread.sleep(8000);
	}
	@Then ("^chat window option\\.$")
	public void close_chat_window() throws InterruptedException {
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

	@Then("^Enter a user email$")
	public void enter_user_email_address_as() {

		WebElement Email_add= driver.findElement(LoginObject.UserId);
		Email_add.click();
		wait.implictywait(driver);
		Email_add.clear();
		wait.implictywait(driver);
		Email_add.sendKeys("sumit@slideteam.net");
		wait.implictywait(driver);

	}

	@Then("^Enter the user password$")
	public void enter_user_password_as() throws Throwable {
		WebElement user_pass = driver.findElement(LoginObject.userpass);
		user_pass.click();
		wait.implictywait(driver);
		user_pass.clear();
		wait.implictywait(driver);
		user_pass.sendKeys("sumittest@21234");
		wait.implictywait(driver);

	}

	@Then("^click on Login cta$")
	public void click_on_Login_button() throws Throwable {
		WebElement Login_button= driver.findElement(LoginObject.login);
		wait.implictywait(driver);
		Login_button.click();
		wait.implictywait(driver);
		Thread.sleep(2000);

		try {
			WebElement close = driver.findElement(By.cssSelector(".fancybox-item.fancybox-close"));
			wait.implictywait(driver);
			close.click();
			Thread.sleep(500);
		} catch (NoSuchElementException nonpop) {

		}
	}

	@Then("^the download this presenetion link is appeared$")
	public void verify_uesr_validation_message_for_Email_Address() throws Throwable {

		try {
			String Email_test = driver.findElement(SignupObject.Downloaded).getText();
			wait.implictywait(driver);
			String Expected_Cta = "Download this presentation";
			Assert.assertEquals(Expected_Cta, Email_test);
			wait.implictywait(driver);
			Thread.sleep(1000);
		} catch (NoSuchElementException er) {

		}
	}

}

