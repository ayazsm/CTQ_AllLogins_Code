Feature: Login 

Scenario: Admin login scenario 
	When User Lunch Chrome Browser 
	And User Opens URL "http://3.6.104.4:7002/login" 
	When User Enter username  as "ayazz" and password  as "Ayaz@123" 
	And Click on Login 
	Then Page Title Should Be "Dashboard | Eagleye Admin" 
	When User click on Logout link 
	And Close Browser 
	
Scenario: Epc Quality login scenario 
	When User Lunch Chrome Browser 
	And User Opens URL "http://3.6.104.4:7002/login" 
	When User Enter username  as "raju" and password  as "Ayaz@1234" 
	And Click on Login 
	Then Page Title Should Be "Dashboard | Eagleye Admin" 
	When User click on Logout link 
	And Close Browser


Scenario: SPTL Quality Login scenario 
	When User Lunch Chrome Browser 
	And User Opens URL "http://3.6.104.4:7002/login" 
	When User Enter username  as "ayazsptlquality" and password  as "Ayaz@123" 
	And Click on Login 
	Then Page Title Should Be "Dashboard | Eagleye Admin" 
	When User click on Logout link 
	And Close Browser

Scenario: Project Manager Login scenario 
	When User Lunch Chrome Browser 
	And User Opens URL "http://3.6.104.4:7002/login" 
	When User Enter username  as "ayazprojectmanager" and password  as "Ayaz@123" 
	And Click on Login 
	Then Page Title Should Be "Dashboard | Eagleye Admin" 
	When User click on Logout link 
	And Close Browser
	
Scenario: Admin login scenario Failed
	When User Lunch Chrome Browser 
	And User Opens URL "http://3.6.104.4:7002/login" 
	When User Enter username  as "ayazzzz" and password  as "Ayaz@123" 
	And Click on Login 
	Then Page Title Should Be "Dashboard | Eagleye Admin" 
	When User click on Logout link 
	And Close Browser 	
		