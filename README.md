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

## Directory Structure

```
├── LoginStruts2
│   ├── LoginStruts2.war
│   ├── cz3002.sql
│   ├── jetty-runner-9.4.7.v20170914.jar
│   ├── pom.xml
│   ├── src
│   │   └── main
│   │       ├── java
│   │       │   ├── Controller
│   │       │   │   ├── LoginController.java
│   │       │   │   └── SQLController.java
│   │       │   └── Model
│   │       │       └── User.java
│   │       ├── resources
│   │       │   ├── log4j2.xml
│   │       │   └── struts.xml
│   │       └── webapp
│   │           ├── WEB-INF
│   │           │   ├── lib
│   │           │   │   ├── javax.servlet-api-3.1.0.jar
│   │           │   │   ├── mysql-connector-java-5.1.49.jar
│   │           │   │   └── mysql-connector-java-8.0.22.jar
│   │           │   └── web.xml
│   │           ├── home.jsp
│   │           └── login.jsp
├── README.md
```

## References
* https://github.com/apache/struts-examples
* https://struts.apache.org/maven-archetypes/
* https://struts.apache.org/maven-archetypes/struts2-archetype-blank.html

