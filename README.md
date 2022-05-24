## API Test Automation using RESTAssured

#### Objectives
Develop sample framework which support to develop automation test scripts for API services.

#### Libraries/Frameworks
- Java
- RESTAssured
- TestNG
- Maven
- Log4j
- Extent Reports
- IntelliJ IDEA
- Git

#### API
https://gorest.co.in/public/v2/users

#### Features
- Test cases excel file can be found in testcases directory
- page-object-model design pattern followed
- Test cases are located in src/test/java/apiautomation/TestCases package
- Environment properties are read from src/test/java/resources/url.properties file
- Easy to add test cases: utility methods are implemented.
- Logs are generated using Log4j in logs/restAPI.log file
- Html report generated using ExtentReports in reports/ directory.

#### Automated Test Cases
> 1. Verify user registration with valid request
> 2. Verify user registration with valid request
> 3. Verify user registration with already used email
> 4. Verify user registration with invalid path
> 5. Verify user registration with unauthorized user
> 6. Verify user registration response time

#### Improvement 

1. Will try to add data driven testing capabilities
2. Log improvement
3. Report improvement
4. ...
