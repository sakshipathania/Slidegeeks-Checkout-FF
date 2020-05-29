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

public class Facebook_signin_Unpaid_stepDefinition extends SetupClass {
	PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();

	// Open web site URl
	@Given("^Go to the application URL\\.$")
	public void Go_to_the_application_URL() throws InterruptedException {
		// Maximize Windows
		driver.get("https://www.slideteam.net");
		Thread.sleep(2000);
		try {
			WebElement sign = driver.findElement(SignupObject.close_add);
			sign.click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} catch (NoSuchElementException popup) {
		}

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

	
	@Then("^Click on fblink\\.$")
	public void Click_on_fblink() throws InterruptedException {
		try {
		WebElement FbLink = driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[1]"));
		Thread.sleep(3000);
		FbLink.click();
		Thread.sleep(3000);
	} catch (NoSuchElementException popup) {
		}
	}

	@Then("^Facebook user enter a email as\\.$")
	public void Facebook_user_enter_a_email_as() throws InterruptedException {
		Thread.sleep(3000);
		try {
		WebElement Fbemail = driver.findElement(By.xpath("//*[@id='email']"));
		//wait.implictywait(driver);
		Thread.sleep(3000);
	        Fbemail.click();
		//wait.implictywait(driver);
		Thread.sleep(3000);
		Fbemail.clear();
		//wait.implictywait(driver);
		Thread.sleep(3000);
		Fbemail.sendKeys("amw.vrushali@gmail.com");
		//wait.implictywait(driver);
		Thread.sleep(3000);
		} catch (NoSuchElementException alreadylogged) {

		}
	}
	

	@Then("^Facebook user enter password\\.$")
	public void Facebook_user_enter_password() throws Throwable {
		try {
		WebElement Fpass= driver.findElement(By.xpath("//*[@id='pass']"));
		//wait.implictywait(driver);
		Thread.sleep(3000);
		Fpass.click();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Fpass.clear();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Fpass.sendKeys("vrushali@786");
		Thread.sleep(2000);
		//wait.implictywait(driver);
	} catch (NoSuchElementException alreadpass) {

	}

	}

	@Then("^Login the application\\.$")
	public void Login_the_application() throws Throwable {
		try {
		WebElement Appl= driver.findElement(By.xpath("//*[@id='loginbutton']"));
		//wait.implictywait(driver);
			Thread.sleep(3000);
		Appl.click();
		//wait.implictywait(driver);
		Thread.sleep(3000);
	} catch (NoSuchElementException alredylogin) {

	}

		try {
			WebElement FP= driver.findElement(FbandGP_Object.continue_as_QA);
			FP.click();
			Thread.sleep(3000);
		} catch (NoSuchElementException qalink) {

		}
	}

	@Then("^See that user is redirected to price page\\.$")
	public void See_that_user_is_redirected_to_price_page() throws Throwable {
                driver.get("https://www.slideteam.net/pricing");
		String actualTitle = driver.getTitle();
		//wait.implictywait(driver);
		Thread.sleep(1000);
		String expectedTitle = "Pricing";
		//wait.implictywait(driver);
		Thread.sleep(1000);
		Assert.assertEquals(expectedTitle, actualTitle);
		//wait.implictywait(driver);
		Thread.sleep(1000);
	}

	@Then("^user go to free ppts page fbu$")
	public void user_go_to_free_ppts_page_fbu() throws InterruptedException  {
		Thread.sleep(2000);

		WebElement free_ppt_btn=driver.findElement(By.xpath("//a[contains(.,'Free PPTs')]"));
		Thread.sleep(2000);

	    free_ppt_btn.click();
	}

	@Then("^user download a free ppt fbu$")
	public void user_download_a_free_ppt_fbu() throws InterruptedException  {
	    try {
		//driver.findElement(By.xpath("//a[contains(.,'3d Puzzle Pieces In Line Powerpoint Presentation …')]")).click();
		driver.get("https://www.slideteam.net/2d-pyramid-simple-powerpoint-presentation-slides.html");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#clicking")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2300);
	    }
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	@Then("^user will logout fbu$")
	public void user_will_logout_fbu() throws Throwable {
	   Thread.sleep(3000);
	        try {
	    WebElement my_account =driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.panel.wrapper > div > div > ul > li:nth-child(1) > a"));
	    Thread.sleep(4000);
	   my_account.click();
	    Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
	
		 Thread.sleep(3000);
		 WebElement sign_out = driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.panel.wrapper > div > div > ul > li.authorization-link > a"));
		 Thread.sleep(3000);
		 sign_out.click();
		 Thread.sleep(3000);
		
	}
	catch (Exception e) {
			// TODO: handle exception
		}
	}



}
