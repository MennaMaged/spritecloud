# SpriteCloud API Assignment
This project is to automate API cases of pet store
https://petstore.swagger.io/ 

# Given:
https://petstore.swagger.io/
Required scripting language: Java
Required testing tool: RestAssured
CI platform: Jenkins

# Scenarios to automate:
- User Section:
  - Create User
  - Login scenarios:
    - Login with valid credentials
    - Login with invalid credentials
    - Login with deleted user

- Store Section:
  - Place an order for a pet

- Pet Section:
  - Add new pet
  - Add existing pet

# How to run the tests locally
- Install eclipse
- Install JDK 1.8 and Setup JAVA_HOME
- Install MAVEN and Setup M2_HOME
- Create new project by cloning this repo
- Run as Maven Cleann Install to install all dependencies
- Right click >> Maven >> Update Project.. >> check force update 
- Run as Maven Testto execute all TCs 

# How to run the test in a CI/CD pipeline
- Install Jenkins: https://coralogix.com/blog/how-to-install-and-configure-jenkins-on-the-mac-os/
- Configure Maven project on Jenkins: https://www.toolsqa.com/jenkins/jenkins-maven/
- Build Project to execute all test cases

# Approach of selecting scenarios:
It is based on Exploratory Testing (Experience based testing technique)
For more details: https://www.globalapptesting.com/blog/what-is-exploratory-testing

# Why are they the most important
They cover main functions of the website, for example no actions will be done without creating user or login, 
plus invalid login will verify the security breach which is very important and adding new pet is also main feature in the app.

# Link of results in Calliope.pro:
# What could be the next steps to your project



