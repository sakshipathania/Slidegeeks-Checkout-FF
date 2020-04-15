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

		@Then("^Select on Complete ppts CTA\\.$")
		public void click_most_download() throws InterruptedException {
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(SignupObject.Others));
			
			WebElement Complete= driver.findElement(SignupObject.Others);
			//ac.moveToElement(Complete).build().perform();
			Complete.click();
			Thread.sleep(3000);
			WebElement Complete_Desk=driver.findElement(SignupObject.Complete_desk);
			wait.implictywait(driver);
			Complete_Desk.click();
			//ac.moveToElement(Complete_Desk).build().perform();
			Thread.sleep(1000);
			
		}

		
		@Then("^Click on download link cta\\.$")
		public void click_on_Download_this_presentation_link() throws InterruptedException {
			WebElement download = driver.findElement(SignupObject.Downloaded);
			wait.implictywait(driver);
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

		@Then("^Enter the user email address is registerd as \"([^\"]*)\"\\.$")
		public void user_mail(String email) throws InterruptedException {
			
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			//wait1.until(ExpectedConditions.visibilityOfElementLocated(LoginObject.enter_mail));
			WebElement registerd = driver.findElement(By.cssSelector("#email_address"));
			wait.implictywait(driver);
			registerd.click();
			wait.implictywait(driver);
			registerd.clear();
			wait.implictywait(driver);
			registerd.sendKeys(email);
			wait.implictywait(driver);
		}

		@Then("^Click on submit button\\.$")
		public void enter_user_mail() throws InterruptedException {
			WebElement submit= driver.findElement(LoginObject.Button_submit);
			js.executeScript("arguments[0].click();", submit);
			wait.implictywait(driver);
			Thread.sleep(3000);
		}

		@Then("^Verify \"([^\"]*)\" the validation message\\.$")
		public void password_page(String error) throws InterruptedException {

			WebElement validation = driver.findElement(LoginObject.invalid_error);
			try {
				String invalid_val = driver.findElement(LoginObject.invalid_error).getText();
				wait.implictywait(driver);
				Assert.assertEquals(error, invalid_val);
				Thread.sleep(2000);
			} catch (NoSuchElementException Invalid) {

			}
		}

		@Then("^\"([^\"]*)\" validation message\\.$")
		public void Verify_user_send_email(String text) throws InterruptedException {
			try {
				String user_val = driver.findElement(LoginObject.verify_sucess).getText();
				System.out.println(user_val);
				wait.implictywait(driver);
				Assert.assertEquals(text, user_val);
				Thread.sleep(2000);
			} catch (NoSuchElementException Stest) {

			}
		}

	}
