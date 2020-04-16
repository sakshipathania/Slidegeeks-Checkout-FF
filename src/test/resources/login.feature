@signInTest 
Feature: signin Test On Web Application 
Scenario: 
	Given Open the website url. 
	Then select a product item. 
	Then click on download this presentation link. 
	Then Enter user email address as "<EmailAddress>". 
	Then Insert the Password "<Pass>". 
	Then Click on Login button. 
	Then Verify user "<EmailAddressVal>" validation message for Email Address. 
	Then Verify user "<PassVal>" validation message for Password. 
	Then Verify user "<Signin_error_Msg>" message for all invalid credentials. 
	Then Enter user a email address as. 
	Then Enter password as.  
	Then after login redirect to price page. 
	Then Select any of price subscription. 
	Then Verify the payment option field. 
	Then  See default payment option as paypal. 
	Then  Enter coupon code. 
	Then  Apply cuopon code. 
	Then  Verify applied coupon code offer. 
	Then  click on place order CTA. 
	Then  Verify the paypal payement page. 
	Then  Select payment option as Card. 
	Then Verify card payement page.
