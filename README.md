# SpriteCloud API Assignment
A demo project for automating tests of Pet Store API endpoints

# Given:
- https://petstore.swagger.io/
- Required scripting language: Java
- Required testing tool: RestAssured
- CI platform: Jenkins

# Modules under tests:
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

# Local execution
- Install eclipse
- Install JDK 1.8 and Setup JAVA_HOME
- Install MAVEN and Setup M2_HOME
- Create new project by cloning this repo
- Run as Maven Clean Install to install all dependencies
- Right click >> Maven >> Update Project.. >> check force update 
- Run as Maven Testto execute all TCs 

# Remote execution using CI/CD pipeline
- Install Jenkins: https://coralogix.com/blog/how-to-install-and-configure-jenkins-on-the-mac-os/
- Configure Maven project on Jenkins: https://www.toolsqa.com/jenkins/jenkins-maven/
- Build Project to execute all test cases

# Selection Approach:
Based on Exploratory Testing (Experience based testing technique)
For more details: https://www.globalapptesting.com/blog/what-is-exploratory-testing

# Importance
They cover main functions of the website, for example no actions will be done without creating user or login, 
plus invalid login will verify the security breach which is very important and adding new pet is also main feature in the app.

# Future Work
- Add cucumber framework
- Check different reporting libraries
- Use External Data Reader
- Add dependencies on Maven repository (seperate framework layer)

# Link of results in Calliope.pro:


