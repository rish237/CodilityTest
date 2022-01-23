# CodilityTest

UI Automation Framework - 

Features:-
1. Created through Java & Selenium with a maven project.
2. It is based on page object model.
3. It creates report for every run in the reports folder.
4. It created a screenshot if any error occurs in the folder screenshots. 
5. Ability to run on both chrome & firefox.

Test Cases:-

1. Create User and login
2. Do All Background Challenges
3. Got 4000 points for a user.


Instructions to run:-

1. Open the project in any IDE(IntelliJ preferred)

2. Run the mvn verify to load the libraries and run the file testng.xml which has the regression test cases.

3. testngFirefox.xml can be triggered to run one test case in Firefox browser.

4. Check the reports in reports folder.


Api Automation 

Features:-

1. Created the api automation through postman/newman. You need to install postman & then Newman(via Node.js) to run it.
2. The collections(along with environment & data files) are present in postmanScripts folder in the 
UI automation framework.
3. The collections include positive & negative scenarios.

Test Cases:-

1. AddUpdateUser collection includes addition of user, updating of user & checking score for user.
2. User Authentication collection includes creating new user & validating through logging in that user.

Instructions to run:-

1. It can be run by importing the three files into postman and running it.
2. It can be run through Newman via command line. Example tu trigger AddUpdate User scenarios:- newman run AddUpdateViewUser.postman_collection.json -d AddUpdateUserCases.csv -e CovidGame.postman_environment.json -n 2 -r htmlExtra 

This command will create a Newman folder in the source directory and will create a detailed html report.


 
