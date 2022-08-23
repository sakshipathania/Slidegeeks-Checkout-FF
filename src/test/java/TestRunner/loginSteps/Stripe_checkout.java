package TestRunner.loginSteps;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestRunner.SetupClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stripe_checkout extends SetupClass {

	WebDriverWait wait = new WebDriverWait(driver, 50);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("^user is already on Website Home Page CO$")
	public void user_is_already_on_Website_Home_Page_CO() throws Throwable {
		driver.get(AppURL);
		ClearBrowserCache();
		Thread.sleep(1000);

		Thread.sleep(3000);
		WebElement login_signup_btn = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='signupclass']")));
		Thread.sleep(1000);
		login_signup_btn.click();
		Thread.sleep(4000);

		WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#register_name")));
		// Thread.sleep(3000);
		name.sendKeys("Automated Program");
		// Thread.sleep(3000);

		// Generate Random Email Address
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();

		System.out.println(generatedString);

		String signup_email = generatedString;
		String full_email = "selenium.testing." + generatedString + "@gmail.com";
		System.out.println(full_email);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		WebElement new_email = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#register_email")));
		new_email.clear();
		Thread.sleep(3000);
		new_email.sendKeys(full_email);
		Thread.sleep(3000);

		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#register_password")));
		password.clear();
		Thread.sleep(3000);
		password.sendKeys("Geeks@123");
		Thread.sleep(3000);

		WebElement confirm_passwoed = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#register_password2")));
		Thread.sleep(3000);
		confirm_passwoed.sendKeys("Geeks@123");
		Thread.sleep(3000);

		WebElement captcha = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#captchtext")));
		Thread.sleep(3000);
		captcha.sendKeys("Y3Tt6bfwI");
		Thread.sleep(3000);

		WebElement register_btn = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pg-register-button-new")));
		Thread.sleep(3000);
		register_btn.click();
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text1 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text1_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);

		Thread.sleep(6000);
		System.out.println("user is on pricing page --> " + driver.getTitle());
		String actualTitle = "Monthly";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Monthly";
		Thread.sleep(2000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(2000);
		js.executeScript("alert('Text Monthly is present and correct');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text2 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text2_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);
		// Thread.sleep(3000);
		// String actualTitle = "$49.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// String expectedTitle = "$49.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// Assert.assertEquals(expectedTitle, actualTitle);
		// Thread.sleep(2000);
		WebElement price = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='Individual']//em[contains(text(),'$49.99')]")));

		js.executeScript("arguments[0].scrollIntoView();", price);
		String monthlyPrice = price.getText();

		System.out.println("monthlyPrice  = " + monthlyPrice);
		Assert.assertTrue("monthlyPrice does not matched", monthlyPrice.contentEquals("$49.99"));
		js.executeScript("alert('Text $49.99 is present and correct');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text3 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text3_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);

		// Thread.sleep(3000);
		String actualTitle = "Semi Annual";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Semi Annual";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		js.executeScript("alert('Text Semi Annual is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text4 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text4_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);

		// Thread.sleep(3000);
		// String actualTitle = "$149.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// String expectedTitle = "$149.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// Assert.assertEquals(expectedTitle, actualTitle);
		// Thread.sleep(2000);
		WebElement semiAnnual1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='Individual']//em[contains(text(),'$149.99')]")));
		js.executeScript("arguments[0].scrollIntoView();", semiAnnual1);
		String semiAnnual = semiAnnual1.getText();

		System.out.println("semiAnnual  = " + semiAnnual);
		Assert.assertTrue("semiAnnual Price does not matched", semiAnnual.contentEquals("$149.99"));
		js.executeScript("alert('Text $149.99 is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text5 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text5_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);

		// Thread.sleep(3000);
		String actualTitle = "Annual";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Annual";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		js.executeScript("alert('Text Annual is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text6 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text6_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);

		// Thread.sleep(3000);
		// String actualTitle = "$249.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// String expectedTitle = "$249.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// Assert.assertEquals(expectedTitle, actualTitle);
		// Thread.sleep(2000);
		WebElement Annual1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='Individual']//em[contains(text(),'$249.99')]")));
		js.executeScript("arguments[0].scrollIntoView();", Annual1);
		String Annual = Annual1.getText();

		System.out.println("Annual  = " + Annual);
		Assert.assertTrue("Annual price does not matched", Annual.contentEquals("$249.99"));
		js.executeScript("alert('Text $249.99 is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text7 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text7_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);

		// Thread.sleep(3000);
		String actualTitle = "Annual + Custom Design";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Annual + Custom Design";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		// wait.implictywait(driver);
		Thread.sleep(1000);
		js.executeScript("alert('Text Annual + Custom Design is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text8 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text8_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);

		// Thread.sleep(3000);
		// String actualTitle = "$299.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// String expectedTitle = "$299.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// Assert.assertEquals(expectedTitle, actualTitle);
		WebElement annualCustom1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='Individual']//em[contains(text(),'$299.99')]")));
		js.executeScript("arguments[0].scrollIntoView();", annualCustom1);
		String annualCustom = annualCustom1.getText();

		System.out.println("annualCustom  = " + annualCustom);
		Assert.assertTrue("annualCustom price does not matched", annualCustom.contentEquals("$299.99"));
		js.executeScript("alert('Text $299.99 is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
		// Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text9 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text9_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);

		WebElement Business_Team = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//button[@onclick=\"if (!window.__cfRLUnblockHandlers) return false; pricingbutton(event, 'Business')\"]")));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Business_Team);
		Thread.sleep(1000);
		Business_Team.click();
		Thread.sleep(1000);

		String actualTitle = "Annual 4 User License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Annual 4 User License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		js.executeScript("alert('Text Annual 4 User License is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text10 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text10_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// hread.sleep(4000);
		// WebElement Business_Team =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[2]")));
		// Thread.sleep(2000);
		// Business_Team.click();
		// Thread.sleep(3000);

		// String actualTitle = "$599.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// String expectedTitle = "$599.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// Assert.assertEquals(expectedTitle, actualTitle);
		WebElement Annual_4_User_License1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='Business']//em[contains(text(),'$599.99')]")));
		js.executeScript("arguments[0].scrollIntoView();", Annual_4_User_License1);
		String Annual_4_User_License = Annual_4_User_License1.getText();

		System.out.println("Annual_4_User_License  = " + Annual_4_User_License);
		Assert.assertTrue("Business||Annual_4_User_License price does not matched",
				Annual_4_User_License.contentEquals("$599.99"));
		Thread.sleep(1000);
		js.executeScript("alert('Text $599.99 is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text11 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text11_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);
		// WebElement Business_Team =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[2]")));
		// Thread.sleep(2000);
		// Business_Team.click();
		// Thread.sleep(3000);

		String actualTitle = "Annual 20 User License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Annual 20 User License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		js.executeScript("alert('Text Annual 20 User License is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text12 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text12_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);
		// WebElement Business_Team =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[2]")));
		// Thread.sleep(2000);
		// Business_Team.click();
		// Thread.sleep(3000);

		// String actualTitle = "$1599.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// String expectedTitle = "$1599.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// Assert.assertEquals(expectedTitle, actualTitle);
		// Thread.sleep(2000);
		WebElement Annual_20_User_License1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='Business']//em[contains(text(),'$1,599.99')]")));
		js.executeScript("arguments[0].scrollIntoView();", Annual_20_User_License1);
		String Annual_20_User_License = Annual_20_User_License1.getText();

		System.out.println("Annual_20_User_License = " + Annual_20_User_License);
		Assert.assertTrue("Business||Annual_20_User_License price does not matched",
				Annual_20_User_License.contentEquals("$1,599.99"));
		js.executeScript("alert('Text $1599.99 is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(1000);
	}

	@Then("^user is redirected to pricing page and check the text13 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text13_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);
		// WebElement Business_Team =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[2]")));
		// Thread.sleep(2000);
		// Business_Team.click();
		// Thread.sleep(3000);

		String actualTitle = "Annual Company Wide Unlimited User License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Annual Company Wide Unlimited User License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		js.executeScript("alert('Text Annual Company Wide Unlimited User License is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text14 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text14_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);
		// WebElement Business_Team =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[2]")));
		// Thread.sleep(2000);
		// Business_Team.click();
		// Thread.sleep(3000);

		// String actualTitle = "$2999.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// String expectedTitle = "$2999.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// Assert.assertEquals(expectedTitle, actualTitle);
		// Thread.sleep(2000);
		WebElement Annual_Company_Wide_Unlimited_User_License1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='Business']//em[contains(text(),'$2,999.99')]")));
		js.executeScript("arguments[0].scrollIntoView();", Annual_Company_Wide_Unlimited_User_License1);
		String Annual_Company_Wide_Unlimited_User_License = Annual_Company_Wide_Unlimited_User_License1.getText();

		System.out
				.println("Annual_Company_Wide_Unlimited_User_License = " + Annual_Company_Wide_Unlimited_User_License);
		Assert.assertTrue("Business||Annual_Company_Wide_Unlimited_User_License price does not matched",
				Annual_Company_Wide_Unlimited_User_License.contentEquals("$2,999.99"));
		js.executeScript("alert('Text $2999.99 is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text15 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text15_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);
		WebElement Education = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//button[@onclick=\"if (!window.__cfRLUnblockHandlers) return false; pricingbutton(event, 'Education')\"]")));
		js.executeScript("arguments[0].scrollIntoView();", Education);
		Thread.sleep(1000);
		Education.click();
		Thread.sleep(1000);

		String actualTitle = "Annual 15 User Education License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Annual 15 User Education License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		js.executeScript("alert('Text Annual 15 User Education License is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text16 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text16_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);
		// WebElement Education =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[3]")));

		// Thread.sleep(1000);
		// Education.click();
		// Thread.sleep(3000);

		// String actualTitle = "$999.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// String expectedTitle = "$999.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		WebElement Annual_15_User_Education_License1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='Education']//em[contains(text(),'$999.99')]")));
		js.executeScript("arguments[0].scrollIntoView();", Annual_15_User_Education_License1);
		Thread.sleep(1000);
		String Annual_15_User_Education_License = Annual_15_User_Education_License1.getText();

		System.out.println("Annual_15_User_Education_License = " + Annual_15_User_Education_License);
		Assert.assertTrue("Education||Annual_15_User_Education_License",
				Annual_15_User_Education_License.contentEquals("$999.99"));
		js.executeScript("alert('Text $999.99 is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text17 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text17_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);
		// WebElement Education =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[3]")));
		// Thread.sleep(2000);
		// Education.click();
		// Thread.sleep(3000);

		String actualTitle = "Annual UNLIMITED User Institute Wide License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Annual UNLIMITED User Institute Wide License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		js.executeScript("alert('Text Annual UNLIMITED User Institute Wide Licenseis present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text18 (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_check_the_text18_CO(int arg1) throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);
		// WebElement Education =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[3]")));
		// Thread.sleep(2000);
		// Education.click();
		// Thread.sleep(3000);

		// String actualTitle = "$1999.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// String expectedTitle = "$1999.99";
		// Thread.sleep(1000);
		// wait.implictywait(driver);
		// Assert.assertEquals(expectedTitle, actualTitle);
		// Thread.sleep(2000);
		WebElement Annual_UNLIMITED_User_Institute_Wide_License1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='Education']//em[contains(text(),'$1,999.99')]")));
		js.executeScript("arguments[0].scrollIntoView();", Annual_UNLIMITED_User_Institute_Wide_License1);
		String Annual_UNLIMITED_User_Institute_Wide_License = Annual_UNLIMITED_User_Institute_Wide_License1.getText();

		System.out.println(
				"Annual_UNLIMITED_User_Institute_Wide_License = " + Annual_UNLIMITED_User_Institute_Wide_License);
		Assert.assertTrue("Education||Annual_UNLIMITED_User_Institute_Wide_License",
				Annual_UNLIMITED_User_Institute_Wide_License.contentEquals("$1,999.99"));
		js.executeScript("alert('Text $1999.99 is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and choose a plan to pay (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_choose_a_plan_to_pay_CO(int arg1) throws Throwable {
		// choose a plan
		// driver.get("https://www.slidegeeks.com/subscriptions");
		WebElement individual = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='defaultOpen']")));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", individual);
		individual.click();
		WebElement Subscribe_btn = driver.findElement(By.xpath(
				"//div[@id='Individual']//form[@name='hikashop_product_form_99148_hikashop_category_information_menu_117']//span[contains(text(),'Join now')]"));
		js.executeScript("arguments[0].scrollIntoView();", Subscribe_btn);
		Thread.sleep(2000);
		Subscribe_btn.click();

	}

	/*
	 * @Then("^user is redirected to checkout page (\\d+)CO$") public void
	 * user_is_redirected_to_checkout_page_CO(int arg1) throws Throwable {
	 * Thread.sleep(6000); WebElement Continue = driver.findElement(By.xpath(
	 * "//*[@id='pg-checkout-shipping-info']/div[1]/div/div/div/div[2]/button"));
	 * js.executeScript("arguments[0].scrollIntoView();",Continue);
	 * Thread.sleep(1000); Continue.click(); }
	 */

	@Then("^user proceed to pay with (\\d+)CO (\\d+)CO$")
	public void user_proceed_to_pay_with_CO_CO(int arg1, int arg2) throws InterruptedException {

		try {
			Thread.sleep(2000);
			// select stripe option
			// WebElement co_btn =
			// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pg-checkout-billing-payment-form
			// > div > div:nth-child(1) > label")));
			WebElement cp_btn = driver.findElement(By.xpath("//label[@for='payment_radio_1_2__stripe_2']"));

			Thread.sleep(2000);
			// Thread.sleep(2000);
			cp_btn.click();
			Thread.sleep(5000);
		} catch (NoSuchElementException popup) {
		}

		// place order button
		try {

			WebElement place_order_btn = driver.findElement(By.cssSelector("#hikabtn_checkout_next"));
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView();", place_order_btn);
			// js.executeScript("arguments[0].click();", place_order_btn);
			Thread.sleep(1000);
			place_order_btn.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException popup) {
		}
	}

	@Then("^CO page appears and user navigates back to my account (\\d+)CO$")
	public void CO_page_appears_and_user_navigates_back_to_my_account_CO(int arg1) throws Throwable {
		String stripe_page_title = driver.getTitle();
		Thread.sleep(3000);
		System.out.println("Title of the Page is --> " + stripe_page_title);

		String page_title = "SlideTeam Geeks Inc";

		if (page_title.equalsIgnoreCase(stripe_page_title)) {
			System.out.println(" user is on the Stripe page");
			log.info("USER IS ON THE STRIPE PAGE");
		} else {
			System.out.println("user is on the wrong page");
			log.info("USER IS ON THE WRONG PAGE");
		}

		Thread.sleep(3000);
		WebElement Stripe_email = driver.findElement(By.cssSelector("#email"));
		Thread.sleep(2000);
		Stripe_email.sendKeys("slidetech.qa@gmail.com");
		Thread.sleep(2000);
		WebElement Stripe_back = driver.findElement(By.cssSelector(
				"#root > div > div > div.App-Overview > header > div > div > a > div > div > div.Header-backArrowContainer > svg"));
		Thread.sleep(2000);
		Stripe_back.click();
		Thread.sleep(2000);
		/*
		 * if (wait.until(ExpectedConditions.alertIsPresent()) != null) { Alert alert =
		 * driver.switchTo().alert(); System.out.println(alert.getText());
		 * alert.accept(); } else { System.out.println("Alert not exists"); }
		 */
		Thread.sleep(5000);

	}

	@Then("^user signout the account (\\d+)CO$")
	public void user_signout_the_account_CO(int arg1) throws Throwable {
		Thread.sleep(3000);
		System.out.println("Title of the Page is --> " + driver.getTitle());
		WebElement Account = driver.findElement(By.xpath("//a[normalize-space()='Account']"));
		Thread.sleep(2000);
		Account.click();
		Thread.sleep(2000);
		WebElement Delete_Account = driver
				.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[2]/div/ul/li[6]/a"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", Delete_Account);
		Thread.sleep(2000);
		Delete_Account.click();
		Thread.sleep(2000);
		WebElement Delete_Account_reason = driver.findElement(By.cssSelector("#only-free-download-product"));
		Thread.sleep(2000);
		Delete_Account_reason.click();
		Thread.sleep(2000);
		WebElement Delete_Profile = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[3]/button[1]"));
		Thread.sleep(2000);
		Delete_Profile.click();
		Thread.sleep(1000);
		WebElement No_Delete = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[3]/button[2]"));
		Thread.sleep(1000);
		No_Delete.click();

		Thread.sleep(30000);
		String verifyDeleteAccountMessage = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='alert-message login-sucesmsg']")))
				.getText();
		System.out.println("verifyText1 = " + verifyDeleteAccountMessage);
		Thread.sleep(7000);
		Assert.assertTrue("Your account is not deleted",
				verifyDeleteAccountMessage.contentEquals("Your Account has been deleted successfully."));

	}
}
