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
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webApp.PerformAction;

 public class Forgotpassword extends SetupClass  {
	 PerformAction wait = new PerformAction();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Random rad = new Random();
//test changes
		// Open web site URl
		@Given("^To the application URL\\.$")
		public void navigates_to_website_url() throws InterruptedException {
			// Maximize Windows
			driver.get("https://www.slideteam.net");
			Thread.sleep(2000);
			try {
				WebElement application= driver.findElement(SignupObject.close_add);
				application.click();
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

		@Then("^user navigate to complete deck from$")
         public void user_navigate_to_complete_deck_from_account_dashboard_page() throws InterruptedException  {
    
	 driver.get("https://www.slideteam.net/complete-powerpoint-decks-presentations/all-powerpoint-complete-decks.html");
	 Thread.sleep(3000);
	 
	 //WebElement select_product=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)")));
	  //Thread.sleep(2000);   
	 //select_product.click();
	   // Thread.sleep(2000);
	    
            }
		
		@Then("^Click on download link cta\\.$")
		public void click_on_Download_this_presentation_link() throws InterruptedException {
			WebElement download = driver.findElement(By.xpath("//*[@id='clicking']"));
			//wait.implictywait(driver);
			Thread.sleep(2000);
			download.click();
			Thread.sleep(9000);
			
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
					 Thread.sleep(2000);
			}
			else {
				

			System.out.println("chat window does not open");
			}
		}
				catch(NoSuchElementException NCPT) {
					
				}
		}

		@Then("^Click on forgot password link\\.$")
		public void google_create() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(LoginObject.Forgot));
			WebElement forgot= driver.findElement(By.xpath("//*[@id='login-form']/fieldset/div[4]/div[1]/a/span"));
			forgot.click();
			
                        Thread.sleep(2000);
		}

		@Then("^Enter the user email address is registerd as$")
		public void user_mail(String email) throws InterruptedException {
			
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			//wait1.until(ExpectedConditions.visibilityOfElementLocated(LoginObject.enter_mail));
			WebElement registerd = driver.findElement(By.xpath("//*[@id='email_address']"));
			//wait.implictywait(driver);
			Thread.sleep(2000);
			registerd.click();
			//wait.implictywait(driver);
			Thread.sleep(2000);
			registerd.clear();
			//wait.implictywait(driver);
			Thread.sleep(2000);
			registerd.sendKeys(email);
			//wait.implictywait(driver);
			Thread.sleep(2000);
		}

		@Then("^Click on submit button\\.$")
		public void enter_user_mail() throws InterruptedException {
			WebElement submit= driver.findElement(By.xpath("//*[@id='form-validate']/div/button/span"));
			js.executeScript("arguments[0].click();", submit);
			//wait.implictywait(driver);
			Thread.sleep(3000);
		}

		

	}
