# AUT_REST_Reqres_page

## General Information
This project is about the automation API(REST) of the https://reqres.in site
***
## Requirements
- Java 1.8.0
- JDK 17
- Gradle 6.8.3
***
## Installation
```
gradle build
```
## Project structure
Screenplay design pattern using serenity REST

- SetupConfiguration: initial configuration
```
src/test/java/stepdefinitions/SetupConfiguration.java
```
- Feature : Test scenario using Gherkin language with cucumber
```
  src/test/resources/features/users_api.feature
```
- Runners : Classes used to run the test scenarios 
```
src/test/java/runners/Runner.java
```
## Run Test
The user create, update, delete and getting data from some endpoints
```
gradle :clean :test --tests "runners.Runner" :aggregate
```
***
## SO
- Windows 10
- Windows 11
