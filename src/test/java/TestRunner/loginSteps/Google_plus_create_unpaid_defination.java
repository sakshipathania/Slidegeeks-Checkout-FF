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
	//PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();
        WebDriverWait wait = new WebDriverWait(driver,50);
	// Open web site URl
	@Given("^launch application\\.$")
	public void launch_application() throws InterruptedException {
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

	@Then("^enter a email$")
	public void enter_a_email() throws InterruptedException {
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
	
	@Then("^Go to next page$")
	public void Go_to_next_page() throws InterruptedException {
               try {
		WebElement next= driver.findElement(By.cssSelector("#identifierNext > span:nth-child(3) > span:nth-child(1)"));
		next.click();
		//wait.implictywait(driver);
		Thread.sleep(3000);
	       } catch(NoSuchElementException e) {
	       }
	}

	@Then("^enter password$")
	public void enter_password() throws Throwable {
		try{
		WebElement password= driver.findElement(By.cssSelector(".I0VJ4d > div:nth-child(1) > input:nth-child(1)"));
		password.click();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		password.clear();
		Thread.sleep(1000);
		//wait.implictywait(driver);
		password.sendKeys("Test@1234");
		//wait.implictywait(driver);
		
		Thread.sleep(3000);
	} catch (NoSuchElementException e) {
	       }
	}


	@Then("^Click on next button$")
	public void Click_on_next_button() throws Throwable {
		try {
		WebElement button= driver.findElement(By.cssSelector("#passwordNext > span:nth-child(3)"));
		//wait.implictywait(driver);
		Thread.sleep(1000);
		button.click();
		//wait.implictywait(driver);
		Thread.sleep(10000);
		} catch(NoSuchElementException e) {
	       }
	}

	@Then("^Redirected to price page\\.$")
	public void Redirected_to_price_page() throws Throwable {
                 driver.get("https://www.slideteam.net/pricing");
		//String actualTitle = driver.getTitle();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		//String expectedTitle = "Pricing";
		//wait.implictywait(driver);
		//Thread.sleep(1000);
		//Assert.assertEquals(expectedTitle, actualTitle);
		//wait.implictywait(driver);
                //Thread.sleep(1000);*/
	}

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

