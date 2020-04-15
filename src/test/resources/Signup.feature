@signupTest 
Feature: signup Test On Web Application 
@signupTest_1 
Scenario: 
	Given Navigates to website url. 
	Then Click on Most Downloaded link.
	Then Select a product items. 
	Then Click on Download this presentation link. 
	Then Click on Create an Account CTA. 
	Then Enter Email Address as "<Email Address>".
	Then Enter First Name as "<First Name>". 
	Then Enter Last Name as "<Last Name>". 
	Then Enter Password as "<Password>". 
	Then Enter Confirm password as "<Confirm_password>". 
	Then Enter the captcha. 
	Then click on Signup button. 
	Then Verify "<Email AddressVal>" validation message for Email Address. 
	Then Verify "<First NameVal>" validation message for First Name. 
	Then Verify "<Last NameVal>" validation message forLast Name. 
	Then Verify "<PasswordVal>" validation message for Password. 
	Then Verify "<Confirm_passwordVal>" validation message for Confirm_password. 
	Then Verify "<SignUp_val_Msg>" message for all invalid credentials.
	Then Enter Email "<Email Address>". 
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
