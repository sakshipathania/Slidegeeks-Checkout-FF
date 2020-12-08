package SetupClass.StepDefinition;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;

import SetupClass.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Non_Logged_In_User extends SetupClass {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	JavascriptExecutor js = (JavascriptExecutor) driver;
       
       @Given("^user is already on PDP Page MD viii$")
	public void user_is_already_on_PDP_Page_MD_viii() throws Throwable {
		
		driver.get("https://www.slidegeeks.com/business/product/business-professionals-standing-together-powerpoint-template");
		Thread.sleep(2000);
	    
	}

	@Then("^User click on Download button to download the product viii$")
	public void user_click_on_Download_button_to_download_the_product_viii() throws Throwable {
	    
		WebElement download_btn_pdp_fp = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div.afterBody.product-page-wrapper > div.main_wrapper.product-page > div.innermain_content > section.product_content > div > div > div.right-col > div > div:nth-child(1) > div > div.pg-product-addtocart.clearfix > div.pg-product-qty-con.pg-product-field > a")));
		js.executeScript("arguments[0].scrollIntoView();",download_btn_pdp_fp);	
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		
		Thread.sleep(2000);
		
		
		
	}

	@Then("^user is redirected to Login page viii$")
	public void user_is_redirected_to_Login_page_viii() throws Throwable {
	   
	}
  
  @Then("^user login with correct details viii$")
	public void user_login_with_correct_details_viii() throws Throwable {
		WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pg-account-action > div > div:nth-child(2) > div > form > div:nth-child(1) > input")));
		Thread.sleep(2000);
		username.sendKeys("Sakshi.pathania@slidetech.in");
		Thread.sleep(2000);
		
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pg-account-action > div > div:nth-child(2) > div > form > div:nth-child(2) > input")));
		Thread.sleep(2000);
		password.sendKeys("Qwerty@1");
		Thread.sleep(2000);
		
		WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pg-account-action > div > div:nth-child(2) > div > form > div.btn-wrapper.login_btn > input")));
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}

	@Then("^user will be redirected to same pdp page viii$")
	public void user_will_be_redirected_to_same_pdp_page_viii() throws Throwable {
	   
	}

	@Then("^user download the product viii$")
	public void user_download_the_product_viii() throws Throwable {
	    
		WebElement download_btn_pdp_fp = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div.afterBody.product-page-wrapper > div.main_wrapper.product-page > div.innermain_content > section.product_content > div > div > div.right-col > div > div:nth-child(1) > div > div.pg-product-addtocart.clearfix > div.pg-product-qty-con.pg-product-field > a")));
		js.executeScript("arguments[0].scrollIntoView();",download_btn_pdp_fp);	
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		
		Thread.sleep(2000);
		
		
	}

	@Then("^user logout from website viii$")
	public void user_logout_from_website_viii() throws Throwable {
	 
		Thread.sleep(1000);
		 WebElement Signout = driver.findElement(By.xpath("//a[@href ='/logout']"));
		Thread.sleep(3000);
		Signout.click();
		
	}
}
