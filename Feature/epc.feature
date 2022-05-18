Feature: EPC Partner 

Background:
    When User Lunch Chrome Browser 
	And User Opens URL "http://3.6.104.4:7002/login" 
	When User Enter username  as "ayazz" and password  as "Ayaz@123" 
	And Click on Login
Scenario Outline: Create New Epc Partner 
	When Click on Epc Partners 
	And Click on Create new Epc Partners 
	When user Enter Epc Name as "<name>" and address as "<address>" 
	And Click on Submit

	
	 Examples: 
	    | name | address |
	    | Testepc | #Hyderabad |