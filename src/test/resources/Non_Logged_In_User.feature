@Non_Logged_In_User
Feature: Non logged In user try to Download
Scenario: Non logged In user try to Download

Given user is already on PDP Page MD viii
Then User click on Download button to download the product viii
Then user is redirected to Login page viii
Then user login with correct details viii
Then user will be redirected to same pdp page viii
Then user download the product viii
Then user logout from website viii
