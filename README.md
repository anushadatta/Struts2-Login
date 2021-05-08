# Apache Struts 2: Login 

Implementing a Java Web App with basic login functionality using MVC framework Apache Struts 2 and mySQL database. 

<img src="login.png">

## Set Up 

### SQL Database

A prerequisite for local deployment of the Java Web Application is to set up the MySQL database to store the application User Model data. Execute the following commands to activate the SQL shell:

```

  ~$ mysql -u root -p
  ~$ (Enter Password):
  ~$ (copy/paste) cz3002.sql

```
Following this, ensure that the SQL script "cz3002.sql" is executed with root privileges to set up the required user authentication data records.

### Local Deployment
Execute the following commands to run the webserver.

```

  ~$ mvn clean             // clean target directory created on previous build
  ~$ mvn jetty:run         // deploy web app at localhost:8080

```

__Java Web App URL:__ http://localhost:8080/LoginStruts2/index.action 

__Login Credentials:__ Username: anushadatta, Password: test123

