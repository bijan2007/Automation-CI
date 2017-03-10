# Automation-CI
<b>This is a test automation framework which uses the following concepts/tools to automate pages on the binary site:</b>
- Selenium Webdriver
- Page Object Model
- JAVA
- TestNG
- Maven for Project Build
- Travis CI for continuous integration
- Headless Browser Testing

<b>Currently the following tests are covered for Binary site:</b>
- Login and Logout
- Login with Incorrect Passsword
- Set Financial Assessment
- Validate fields in Financial Assessment form

<b>Running the tests:</b>
Project can be cloned/downloaded from github url https://github.com/bijan2007/Automation-CI.git.
Each test will be automatically triggered by Travis CI upon each code push to the repository and build status can be viewed at the below url: https://travis-ci.org/bijan2007/Automation-CI/builds

<b>Browsers:</b>
Currently tests are running against Chrome Headless Browser - xvfb (X Virtual Framebuffer) provided by Travis CI
