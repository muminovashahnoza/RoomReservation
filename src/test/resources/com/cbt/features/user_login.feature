Feature: Login 

Scenario: 
	Given user is on the sign in page 
	When user enters <email> and <password> 
	And user goes to my self infotmation 
	Then system should display account information 
		| name | role | team | batch | campus |
		|<name>|<role>|<team>|<batch>|<campus>|
		
		