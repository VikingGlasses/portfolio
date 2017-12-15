# portfolio

A project portfolio with a machine learning algorithm to predict user interaction.
Submit codes to change wheter to train, predict or display preditions.
Admin page for adding, changing and removing codes.

## How to build a unsecure spring mvc app

### Usage

- Run the application and use postman with the base URI http://localhost:8080/portfolio
- Use the following urls to invoke the admin controller methods to set usable codes and their 
  behaviour, where code is any string and the other paramaters are either 'true' or 'false':
    * `/admin/create/{code}/{train}/{predict}/{view}/{admin}`: creates a new code
    * `/admin/update/{code}/{train}/{predict}/{view}/{admin}`: updates the code with the new
    behaviour or creates a new code if it didn't exist.
    * `/admin/codes`: GET method returns all codes.
    * `/admin/delete/{code}`: deletes a code.
- Submit a code to change behaviour with:
    * `/submit/code/{code}`: change behaviour to match the codes.
- Submit a machine learning request with:
    * `/ml/{name}`: submits a training/prediction request.

### Build and run

#### Prerequisites

- Java 8
- Maven 3
- MongoDB 3.4
- I use Tomcat plus 8.5, but it should work on any server.

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run on your server.
