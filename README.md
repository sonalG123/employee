1) I have used H2 data base which is also called in memory database.
2) I have defined the primary key which will be autoincrement and also would be not null. 
3) I have used JPA (java persistance api) for database CRUD Operation.
4) I have created the rest Controller , Entity class and Repository which will make Crud operation over database.
5) And I have also used native query to find Employee based on give criteria (min, max age and gender).
6) The database username and password would be "admin" and "admin"

7) please find below the request url. 

1) POST : localhost:8080/employee
   BODY : {
	"empName" : "heena",
	"empAge" : 28,
	"empGender" : "female"
	}

2) GET : localhost:8080/list?minAge=28&maxAge=28&gender=female


8) please find below the connection property which i have used in order to make database connectivity.

spring.datasource.url=jdbc:h2:mem:testdb </br>
spring.datasource.driverClassName=org.h2.Driver </br>
spring.datasource.username=admin </br> 
spring.datasource.password=admin </br>
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect </br>

spring.h2.console.enabled=true </br>
spring.h2.console.path=/h2-console </br>

spring.jpa.hibernate.ddl-auto = update </br>
spring.jpa.show-sql=true </br>

9) List down the couple of dependencies which are being use.
 1) Spring Data JPA.
 2) Junit for testing.
 3) H2 Database (In memory DB).
 4) Spring Web.

