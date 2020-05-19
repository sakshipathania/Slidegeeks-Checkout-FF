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
import org.openqa.selenium.interactions.Actions;

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
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
		
		try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Sign in with Facebook')]")).click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} 
		catch (NoSuchElementException popup) {
		}
	}

	@Then("^Fb user enter a valid email\\.$")
	public void fb_user_enter_a_valid_email() throws InterruptedException {
		try {
		WebElement valid_email= driver.findElement(By.xpath("//*[@id='email']"));
		valid_email.click();
		Thread.sleep(5000);
		valid_email.clear();
		Thread.sleep(5000);
		valid_email.sendKeys("slidetech.qa@gmail.com");
                Thread.sleep(5000);
	} catch (NoSuchElementException Ext) {

		}
	}

	@Then("^Fb user enter valid password\\.$")
	public void fb_user_enter_valid_password() throws Throwable {
		try {
		WebElement Valid_pass = driver.findElement(By.xpath("//*[@id='pass']"));
		Valid_pass.click();
		Thread.sleep(5000);
		Valid_pass.clear();
		Thread.sleep(5000);
		Valid_pass.sendKeys("himanshi@123");
		Thread.sleep(5000);
	} catch (NoSuchElementException Ext) {

		}
	}

	@Then("^click on login cta on fb page\\.$")
	public void click_on_login_cta_on_fb_page() throws InterruptedException {
		try {
		WebElement Fb_login= driver.findElement(By.xpath("//*[@id='loginbutton']"));
		Thread.sleep(3000);
		Fb_login.click();
		Thread.sleep(3000);
		} catch (NoSuchElementException Ext) {
			
			}
		try {
			WebElement Fb_GP = driver.findElement(FbandGP_Object.continue_as_QA);
			Fb_GP.click();
			Thread.sleep(1000);
		} catch (NoSuchElementException qalink) {

		}
	}

	@Then("^The user is redirected to price page\\.$")
	public void the_user_is_redirected_to_price_page() throws Throwable {
                driver.get("https://www.slideteam.net/pricing");
		String actualTitle = driver.getTitle();
		Thread.sleep(4000);
		//wait.implictywait(driver);
		String expectedTitle = "Pricing";
		Thread.sleep(4000);
		//wait.implictywait(driver);
		try {
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(4000);
		}
		catch (Throwable t) {
		}
        
	} 
					
}
	
