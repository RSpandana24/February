Feature: Home Page

Background:  Admin gives the correct LMS portal URL
Given Admin Gives the valid LMS portal URL
Then Admin should land on the LMS poral

#@Tag01
#Scenario: Verify LMS title
#Given Admin is on login Page
#When Admin enter valid data in all field and clicks login button
#Then Admin should see LMS -Learning management system as title
#
#@Tag02
#Scenario: Verify NOT LMS_Test title
#Given Admin is on login Page
#When Admin enter valid data in all field and clicks login button
#Then Admin should NOT see LMS_Test as title
#
#@Tag03
#Scenario: Verify LMS title alignment
#Given Admin is on login Page
#When Admin enter valid data in all field and clicks login button
#Then Admin should see LMS title on the top left corner of page
#
#@Tag04
#Scenario: Validate navigation bar text		
#Given Admin is on login Page	
#When Admin enter valid data in all field and clicks login button	
#Then Admin should see correct spelling in navigation bar text			
#
#@Tag05								
#Scenario: Validate LMS title has correct spelling and space
#Given  Admin is on login Page
#When   Admin enter valid data in all field and clicks login button
#Then   Admin should see correct spelling and space in LMS title		
#
#@Tag06									
#Scenario: Validate alignment for navigation bar	
#Given	  Admin is on login Page	
#When    Admin enter valid data in all field and clicks login button
#Then    Admin should see the navigation bar text on the top right side												
#
#@Tag07
#Scenario: Validate navigation bar order first home
#Given Admin is on login Page
#When Admin enter valid data in all field and clicks login button
#Then Admin should see home in the first place
#
#@Tag08
#Scenario:  Validate navigation bar order second Program		
#Given	 Admin is on login Page
#When	 Admin enter valid data in all field and clicks login button
#Then	 Admin should see program in the Second place															
#
#@Tag09
#Scenario: 	Validate navigation bar order third  batch
#Given	 Admin is on login Page
#When	 Admin enter valid data in all field and clicks login button
#Then	 Admin should see batch in the  third place													
#
#@Tag10
#Scenario: 	Validate navigation bar order fourth  class											
#Given	 Admin is on login Page
#When	 Admin enter valid data in all field and clicks login button
#Then	 Admin should see class in the fourth place	
#
#@Tag11
#Scenario: 	Validate navigation bar order fifth logout							
#Given	 Admin is on login Page	
#When	 Admin enter valid data in all field and clicks login button	
#Then	 Admin should see logout in the fifth place					
#
#@Tag12
#Scenario: Verify pie-chart presence
#Given    Admin is on login Page	
#When Admin enter valid data in all field and clicks login button
#Then Admin shoud see piechart

@Tag13
Scenario: Verify user details
Given Admin is on login Page
When  Admin enter valid data in all field and clicks login button
Then Admin should see welcome message with user name and role

#@Tag14
#Scenario: Verify bar chart
#Given Admin is on login Page
#When Admin enter valid data in all field and clicks login button
#Then Admin should see bar chart for Active and inactive user												

#########done							
#
#Scenario: 	Verify user count	
#Given	 Admin is on login Page
#When	 Admin enter valid data in all field and clicks login button
#Then	 Admin should see user count 
#Note : count includes Active and inactive "													
#
#Scenario:  	Verify staff count	
#Given	 Admin is on login Page
#When	 Admin enter valid data in all field and  clicks login button
#Then	 Admin should see staff count 
#Note : count includes Active and inactive "													
#
#Scenario: 	Verify program count	
#Given	 Admin is on login Page
#When	 Admin enter valid data in all field and  clicks login button
#Then	 Admin should see Program count 
#Note : count includes Active and inactive "											
#
#
#Scenario: 	Verify batch count 	
#Given	 Admin is on login Page
#When	 Admin enter valid data in all field and  clicks login button
#Then	 Admin should see batch  count 
#Note : count includes Active and inactive "											
#
#
#Scenario: Verify staff table pagination
#Given Admin is on login Page
#When Admin enter valid data in all field and clicks login button
#Then Admin should see staff table with pagination icons
#
#Scenario: 	Verify staff table pagination									
#Given	 Admin is on login Page
#When	 Admin enter valid data in all field and clicks login button	
#Then	 Admin should see staff table with pagination icons


#Scenario:  	Verify staff data page split	
#											
#Given	 Admin is on login Page
#When	 Admin enter valid data in all field and clicks login button	
#Then	 Admin should see 5 staff data in a page	
#
#
#Scenario: 	Verify previous page icon disable		
#						
#Given	 Admin is on login Page	
#When 	 Admin enter valid data in all field and clicks login button	
#Then  Admin should see previous page icon disabled
#
#				
#
#
#Scenario: 	Verify first page icon disabled		
#Given	 Admin is on login Page
#When	 Admin enter valid data in all field and clicks login button
#Then	 Admin should see first page icon disabled													

