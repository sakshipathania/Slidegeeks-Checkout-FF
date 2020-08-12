package TestRunner.loginSteps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.IOException;


import TestRunner.SetupClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;


	public class TakeImageStep extends SetupClass {
		@After
		public void tearDown(Scenario scenario) {
		    if (scenario.isFailed()) {	    	
		      log.info("Scenario failed, now taking screenshot");
		      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		      scenario.embed(screenshot, "image/png");
			  
			    try {
				    FileUtils.copyFile(src, new File("C:/Failed test cases/error.png"));
				}
			    catch (IOException e)
                               {
                            System.out.println(e.getMessage());
 
                             }
		    }
		}
	}

