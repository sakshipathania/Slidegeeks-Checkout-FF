@Fbuser_create_new_fb__user 
Feature: create new fbuser. 
Scenario: create the application with facebook user 
	Given Launching the application URL 
	Then Fb user enter a valid email 
	Then Fb user enter valid password 
	Then click on login cta on fb page 
	Then The user is redirected to price page 
	
