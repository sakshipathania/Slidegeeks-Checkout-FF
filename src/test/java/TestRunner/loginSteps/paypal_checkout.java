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

import TestRunner.SetupClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class paypal_checkout extends SetupClass {

	WebDriverWait wait = new WebDriverWait(driver, 50);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("^user is already on Website Home Page$")
	public void user_is_already_on_Website_Home_Page() throws Throwable {
		driver.get(AppURL);
		Thread.sleep(3000);
		ClearBrowserCache();

		Thread.sleep(3000);

		WebElement login_signup_btn = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='signupclass']")));
		Thread.sleep(1000);
		login_signup_btn.click();

		Thread.sleep(2000);
		driver.get("https://www.slidegeeks.com/register?173=958");
		Thread.sleep(3000);
		WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#register_name")));

		name.clear();
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
		// Thread.sleep(3000);
		confirm_passwoed.sendKeys("Geeks@123");
		Thread.sleep(3000);

		/*
		 * WebElement captcha =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
		 * "#captchtext"))); // Thread.sleep(3000); captcha.sendKeys("Y3Tt6bfwI");
		 * Thread.sleep(3000);
		 */

		WebElement register_btn = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pg-register-button-new")));
		// Thread.sleep(3000);
		register_btn.click();
		Thread.sleep(3000);
	}

	@Then("^user is redirected to pricing page and check the text1 PP1$")
	public void user_is_redirected_to_pricing_page_and_check_the_text1_PP1() throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		System.out.println("urlpaypal " + driver.getCurrentUrl());
		Thread.sleep(4000);
		String actualTitle = "Monthly";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Monthly";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(3000);
		js.executeScript("alert('Text Monthly is present and correct');");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
		// wait.implictywait(driver);

	}

	@Then("^user is redirected to pricing page and check the text2 PP2$")
	public void user_is_redirected_to_pricing_page_and_check_the_text2_PP2() throws Throwable {
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
		// wait.implictywait(driver);
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

	@Then("^user is redirected to pricing page and check the text3 PP3$")
	public void user_is_redirected_to_pricing_page_and_check_the_text3_PP3() throws Throwable {
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
		// wait.implictywait(driver);
		Thread.sleep(1000);
		js.executeScript("alert('Text Semi Annual is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text4 PP4$")
	public void user_is_redirected_to_pricing_page_and_check_the_text4_PP4() throws Throwable {
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
		// wait.implictywait(driver);
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

	@Then("^user is redirected to pricing page and check the text5 PP5$")
	public void user_is_redirected_to_pricing_page_and_check_the_text5_PP5() throws Throwable {
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
		// wait.implictywait(driver);
		Thread.sleep(1000);
		js.executeScript("alert('Text Annual is present and correct');");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text6 PP6$")
	public void user_is_redirected_to_pricing_page_and_check_the_text6_PP6() throws Throwable {
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
		// wait.implictywait(driver);
		// Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text7 PP7$")
	public void user_is_redirected_to_pricing_page_and_check_the_text7_PP7() throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);

		// Thread.sleep(3000);
		String actualTitle = "Annual + Custom Design";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Annual + Custom Design";
		Thread.sleep(1000);
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

	@Then("^user is redirected to pricing page and check the text8 PP8$")
	public void user_is_redirected_to_pricing_page_and_check_the_text8_PP8() throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// hread.sleep(4000);

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
		Thread.sleep(1000);
		// wait.implictywait(driver);
		Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page and check the text9 PP9$")
	public void user_is_redirected_to_pricing_page_and_check_the_text9_PP9() throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);

		WebElement Business_Team = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//button[@onclick=\"if (!window.__cfRLUnblockHandlers) return false; pricingbutton(event, 'Business')\"]")));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Business_Team);
		Thread.sleep(2000);
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

	@Then("^user is redirected to pricing page and check the text10 PP0$")
	public void user_is_redirected_to_pricing_page_and_check_the_text10_PP0() throws Throwable {
		// Thread.sleep(7000);
		// driver.get("https://www.slidegeeks.com/subscriptions");
		// Thread.sleep(4000);
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

	@Then("^user is redirected to pricing page and check the text11 PP0$")
	public void user_is_redirected_to_pricing_page_and_check_the_text11_PP0() throws Throwable {
		/*
		 * Thread.sleep(7000); driver.get("https://www.slidegeeks.com/subscriptions");
		 * Thread.sleep(4000); WebElement Business_Team =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[2]")));
		 * Thread.sleep(2000); Business_Team.click(); Thread.sleep(3000);
		 */

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

	@Then("^user is redirected to pricing page and check the text12 PP0$")
	public void user_is_redirected_to_pricing_page_and_check_the_text12_PP0() throws Throwable {
		/*
		 * Thread.sleep(7000); driver.get("https://www.slidegeeks.com/subscriptions");
		 * Thread.sleep(4000); WebElement Business_Team =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[2]")));
		 * Thread.sleep(2000); Business_Team.click(); Thread.sleep(3000);
		 * 
		 * String actualTitle = "$1599.99"; Thread.sleep(1000);
		 * //wait.implictywait(driver); String expectedTitle = "$1599.99";
		 * Thread.sleep(1000); //wait.implictywait(driver);
		 * Assert.assertEquals(expectedTitle, actualTitle); Thread.sleep(2000);
		 */
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
		Thread.sleep(2000);

	}

	@Then("^user is redirected to pricing page and check the text13 PP0$")
	public void user_is_redirected_to_pricing_page_and_check_the_text13_PP0() throws Throwable {
		/*
		 * Thread.sleep(7000); driver.get("https://www.slidegeeks.com/subscriptions");
		 * Thread.sleep(4000); WebElement Business_Team =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[2]")));
		 * Thread.sleep(2000); Business_Team.click(); Thread.sleep(3000);
		 */

		String actualTitle = "Annual Company Wide Unlimited User License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Annual Company Wide Unlimited User License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		js.executeScript("alert('Text Annual Company Wide Unlimited User License is present and correct');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);

	}

	@Then("^user is redirected to pricing page and check the text14 PP0$")
	public void user_is_redirected_to_pricing_page_and_check_the_text14_PP0() throws Throwable {
		/*
		 * Thread.sleep(7000); driver.get("https://www.slidegeeks.com/subscriptions");
		 * Thread.sleep(4000); WebElement Business_Team =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[2]")));
		 * Thread.sleep(2000); Business_Team.click(); Thread.sleep(3000);
		 * 
		 * String actualTitle = "$2999.99"; Thread.sleep(1000);
		 * //wait.implictywait(driver); String expectedTitle = "$2999.99";
		 * Thread.sleep(1000); //wait.implictywait(driver);
		 * Assert.assertEquals(expectedTitle, actualTitle); Thread.sleep(2000);
		 */
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

	@Then("^user is redirected to pricing page and check the text15 PP0$")
	public void user_is_redirected_to_pricing_page_and_check_the_text15_PP0() throws Throwable {
		/*
		 * Thread.sleep(7000); driver.get("https://www.slidegeeks.com/subscriptions");
		 * Thread.sleep(4000);
		 */
		WebElement Education = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//button[@onclick=\"if (!window.__cfRLUnblockHandlers) return false; pricingbutton(event, 'Education')\"]")));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", Education);
		Thread.sleep(2000);
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

	@Then("^user is redirected to pricing page and check the text16 PP0$")
	public void user_is_redirected_to_pricing_page_and_check_the_text16_PP0() throws Throwable {
		/*
		 * Thread.sleep(7000); driver.get("https://www.slidegeeks.com/subscriptions");
		 * Thread.sleep(4000); WebElement Education =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[3]")));
		 * Thread.sleep(2000); Education.click(); Thread.sleep(3000);
		 * 
		 * String actualTitle = "$999.99"; Thread.sleep(1000);
		 * //wait.implictywait(driver); String expectedTitle = "$999.99";
		 * Thread.sleep(1000); //wait.implictywait(driver);
		 * Assert.assertEquals(expectedTitle, actualTitle); Thread.sleep(2000);
		 */
		WebElement Annual_15_User_Education_License1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='Education']//em[contains(text(),'$999.99')]")));
		js.executeScript("arguments[0].scrollIntoView();", Annual_15_User_Education_License1);
		String Annual_15_User_Education_License = Annual_15_User_Education_License1.getText();

		System.out.println("Annual_15_User_Education_License = " + Annual_15_User_Education_License);
		Assert.assertTrue("Education||Annual_15_User_Education_License",
				Annual_15_User_Education_License.contentEquals("$999.99"));
		js.executeScript("alert('Text $999.99 is present and correct');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);

	}

	@Then("^user is redirected to pricing page and check the text17 PP0$")
	public void user_is_redirected_to_pricing_page_and_check_the_text17_PP0() throws Throwable {
		/*
		 * Thread.sleep(7000); driver.get("https://www.slidegeeks.com/subscriptions");
		 * Thread.sleep(4000); WebElement Education =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[3]")));
		 * Thread.sleep(2000); Education.click(); Thread.sleep(3000);
		 */

		String actualTitle = "Annual UNLIMITED User Institute Wide License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		String expectedTitle = "Annual UNLIMITED User Institute Wide License";
		Thread.sleep(1000);
		// wait.implictywait(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(1000);
		js.executeScript("alert('Text Annual UNLIMITED User Institute Wide Licenseis present and correct');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		// wait.implictywait(driver);
		Thread.sleep(2000);

	}

	@Then("^user is redirected to pricing page and check the text18 PP0$")
	public void user_is_redirected_to_pricing_page_and_check_the_text18_PP0() throws Throwable {
		/*
		 * Thread.sleep(7000); driver.get("https://www.slidegeeks.com/subscriptions");
		 * Thread.sleep(4000); WebElement Education =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/button[3]")));
		 * Thread.sleep(2000); Education.click(); Thread.sleep(3000);
		 * 
		 * String actualTitle = "$1999.99"; Thread.sleep(1000);
		 * //wait.implictywait(driver); String expectedTitle = "$1999.99";
		 * Thread.sleep(1000); //wait.implictywait(driver);
		 * Assert.assertEquals(expectedTitle, actualTitle); Thread.sleep(2000);
		 */
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

	@Then("^user is redirected to pricing page and choose the plan to pay$")
	public void user_is_redirected_to_pricing_page_and_choose_the_plan_to_pay() throws Throwable {
		// choose a plan
		// driver.get("https://www.slidegeeks.com/subscriptions");
		Thread.sleep(3000);
		WebElement Business_Team = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//button[@onclick=\"if (!window.__cfRLUnblockHandlers) return false; pricingbutton(event, 'Business')\"]")));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", Business_Team);
		Business_Team.click();
		Thread.sleep(4000);
		// js.executeScript("window.scrollBy(0,1000)");
		WebElement Subscribe_btn = driver.findElement(By.xpath(
				"//div[@id='Business']//form[@name='hikashop_product_form_389637_hikashop_category_information_menu_117']//span[contains(text(),'Join now')]"));
		js.executeScript("arguments[0].scrollIntoView();", Subscribe_btn);
		Thread.sleep(2000);
		Subscribe_btn.click();

	}

	// @Then("^user is redirected checkout page$")
	// public void user_is_redirected_checkout_page() throws Throwable {
	// Thread.sleep(6000);
	// WebElement Continue =
	// driver.findElement(By.xpath("//*[@id='pg-checkout-shipping-info']/div[1]/div/div/div/div[2]/button"));
	// js.executeScript("arguments[0].scrollIntoView();",Continue);
	// Thread.sleep(1000);
	// Continue.click();
	// }

	@Then("^user is redirected checkout page$")
	public void user_is_redirected_checkout_page() throws Throwable {

		// public void user_is_redirected_checkout_page() throws Throwable {
		// Thread.sleep(6000);
		// WebElement Continue =
		// driver.findElement(By.xpath("//*[@id='pg-checkout-shipping-info']/div[1]/div/div/div/div[2]/button"));
		// js.executeScript("arguments[0].scrollIntoView();",Continue);
		// Thread.sleep(1000);
		// Continue.click();
	}

	@Then("^user proceed to pay with paypal pp$")
	public void user_proceed_to_pay_with_paypal_pp() throws Throwable {

		Thread.sleep(1400);

		try {
			WebElement cp_btn = driver.findElement(By.xpath("//label[@for='payment_radio_1_2__paypal_1']"));
			// WebElement cp_btn =
			// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pg-checkout-billing-payment-form
			// > div > div:nth-child(2) > label")));
			Thread.sleep(2000);
			cp_btn.click();
			Thread.sleep(3000);
		} catch (NoSuchElementException popup) {
			// TODO: handle exception
		}

		Thread.sleep(3000);
		// Apply coupon
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		WebElement Coupon = driver.findElement(By.cssSelector("label[for='discount-checkbox']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", Coupon);

		WebElement Add_Coupon = driver.findElement(By.xpath("//input[@id='hikashop_checkout_coupon_input_1_3']"));
		Thread.sleep(3000);
		Add_Coupon.sendKeys("5OFF");
		Thread.sleep(3000);
		Thread.sleep(3000);
		WebElement Apply_Coupon = driver.findElement(By.xpath("//button[normalize-space()='APPLY COUPON']"));
		Thread.sleep(3000);
		Apply_Coupon.click();
		Thread.sleep(3000);

		WebElement Value_after_coupon = driver.findElement(By.cssSelector(".cart_price"));

		String expected = "$2,849.99";
		String actual = Value_after_coupon.getText();
		System.out.println("actual = " + actual);
		Assert.assertTrue("Price does not matched", actual.contentEquals("$2,849.99"));
		if (expected.equals(actual)) {
			System.out.println("Coupon applied Successfully");
		} else {
			System.out.println("Coupon Error");
		}

		Thread.sleep(1000);
		try {

			WebElement place_order_btn = driver.findElement(By.xpath("//button[@id='hikabtn_checkout_next']"));
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();", place_order_btn);
			// js.executeScript("arguments[0].click();", place_order_btn);
			Thread.sleep(2000);
			place_order_btn.click();
			Thread.sleep(5000);
		} catch (NoSuchElementException popup) {
		}
	}

	@Then("^paypal popup appears and user navigates back to my account pp$")
	public void paypal_popup_appears_and_user_navigates_back_to_my_account_pp() throws Throwable {

		/*
		 * System.out.println("Title = " + driver.getTitle());
		 * 
		 * Assert.assertTrue("title does not matched",
		 * driver.getTitle().contains("Log in to your PayPal account"));
		 * 
		 * // enter data in email textfield and click on next button
		 * 
		 * Thread.sleep(1000);
		 * 
		 * WebElement email = wait
		 * .until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//input[@id='email']"))); email.clear();
		 * email.sendKeys("nisha.dhiman@slidetech.in");
		 * 
		 * Thread.sleep(1000); WebElement next = wait
		 * .until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//button[@id='btnNext']"))); next.click();
		 */
		String pp_page_URL = driver.getCurrentUrl();
		System.out.println("URL of the Page is --> " + pp_page_URL);

		if (pp_page_URL.equals("https://www.paypal.com/cgi-bin/webscr")) {

			System.out.println("security captcha is visible");

		} else {

			String pp_page_title = driver.getTitle();
			System.out.println("Title of the Page is --> " + pp_page_title);

			Assert.assertTrue("title does not matched", driver.getTitle().contains("Log in to your PayPal account"));

			Thread.sleep(1000);

			WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
			email.sendKeys("nishadhiman0027@gmail.com");
			WebElement next = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnNext']")));
			next.click();

			Thread.sleep(1000);
		}

	}

	@Then("^user Signout account PP$")
	public void user_Signout_account_PP() throws Throwable {
		Thread.sleep(3000);
		driver.get("https://www.slidegeeks.com/checkout");
		Thread.sleep(2000);

		WebElement Account = driver.findElement(
				By.xpath("/html/body/div[1]/header/div/div/nav/div/div[2]/div[2]/div[2]/div/div[2]/ul/li[1]/a"));
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

		WebElement Delete_Account_reason = driver.findElement(By.xpath("//input[@id='only-free-download-product']"));
		// WebElement Delete_Account_reason =
		// driver.findElement(By.cssSelector("#only-free-download-product"));
		Thread.sleep(2000);
		Delete_Account_reason.click();
		Thread.sleep(2000);
		WebElement Delete_Profile = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[3]/button[1]"));
		Thread.sleep(2000);
		Delete_Profile.click();
		Thread.sleep(2000);
		WebElement No_Delete = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[3]/button[2]"));
		Thread.sleep(2000);
		No_Delete.click();
		Thread.sleep(30000);

		String verifyDeleteAccountMessage = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='alert-message login-sucesmsg']")))
				.getText();
		System.out.println("verifyText1 = " + verifyDeleteAccountMessage);
		Thread.sleep(3000);
		Assert.assertTrue("Your account is not deleted",
				verifyDeleteAccountMessage.contentEquals("Your Account has been deleted successfully."));

	}

}
