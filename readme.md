# portfolio

A project portfolio with a machine learning algorithm to predict user interaction.
Submit codes to change wheter to train, predict or display preditions.
Admin page for adding, changing and removing codes.

## How to build a unsecure spring mvc app

### Usage

- Run the application and use postman with the base URI http://localhost:8080/portfolio
- Use the following urls to invoke the admin controller methods to set usable codes and their 
  behaviour, where code is any string and the other paramaters are either 'true' or 'false':
    * `/admin/create/{code}/{train}/{predict}/{view}/{admin}`: creates a new code, run as
     POST method.
    * `/admin/update/{code}/{train}/{predict}/{view}/{admin}`: updates the code with
    the new behaviour or creates a new code if it didn't exist, run as PUT method.
    * `/admin/codes`: returns all codes, run as GET method.
    * `/admin/delete/{code}`: deletes a code, run as DELETE method.
- Go to http://localhost:8080/portfolio in your browser and click around.

### Build and run

#### Prerequisites

- Java 8
- Maven 3
- MongoDB 3.4
- I use Tomcat plus 8.5, but it should work on any server.

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run on your server.
