@forgotTest 
Feature: Verify the forgot password. 
Scenario Outline: Test the forgot password. 
	Given To the application URL. 
	Then  Select on Complete ppts CTA. 
	Then Select as a Project Scoping Powerpoint. 
	Then Click on download link cta. 
	Then Click on forgot password link. 
	Then Enter the user email address is registerd as "<Email Address>". 
	Then Click on submit button. 
	Then Verify "<Email AddressVal>" the validation message. 
	Then "<password SendVal>" validation message.
	
