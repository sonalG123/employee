<b>1) I have used H2 data base which is also called in memory database.
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

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=admin
spring.datasource.password=admin
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.jpa.hibernate.ddl-auto = update
spring.jpa.show-sql=true
</b>
