# portfolio

- Summary

## Use a MongoDB database in a Spring Boot Web Application

### Usage

- Run the application and go on http://localhost:8080/portfolio
- Use the following urls to invoke controllers methods and see the interactions
  with the database:
    * `/user/save?email=[email]&name=[name]`: create a new user with an 
      auto-generated id and email and name as passed values.
    * `/user/delete?id=[id]`: delete the user with the passed id.
    * `/user/get-by-email?email=[email]`: retrieve the id for the user with the
      passed email address.

### Build and run

#### Prerequisites

- Java 8
- Maven 3
- MongoDB 3.4

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.
