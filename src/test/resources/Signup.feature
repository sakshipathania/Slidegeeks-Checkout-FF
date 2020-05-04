@signupTest 
Feature: signup Test On Web Application 
@signupTest_1 
Scenario: 
	Given Navigates to website url. 
	Then user will navigate to complete deck from account dashboard page
        Then Click on Download this presentation link
	Then Click on Create an Account CTA. 
	Then Enter Email Address as "<Email Address>".
	Then Enter First Name as "<First Name>". 
	Then Enter Last Name as "<Last Name>". 
	Then Enter Password as "<Password>". 
	Then Enter Confirm password as "<Confirm_password>". 
	Then Enter the captcha. 
	Then click on Signup button. 
	Then After signup see the price page. 
	Then Select price subscription. 
	Then Verify the payment option. 
	Then Enter the coupon code.
	Then Apply the coupon code as given.
	Then Verify the applied coupon code.
	Then Verify the default payment option as paypal.
	Then click on place order button.
	Then Verify the paypal payement process.
	Then Select the payment option as card.
	Then Verify the card payement page.
	Then Navigates to website url home page.
	Then logout the application.
	Then Click on My account link.
	Then Click on delete account link. 
	Then Click on Yes button. 
	Then Verify the delete account confirmation message.
