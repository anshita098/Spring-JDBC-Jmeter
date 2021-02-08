# Spring-JDBC-Jmeter

A simple web-based application with CRUD operation using Spring MVC Framework which 
can handle crud inside its controller.

1. Table (Number) is created in MySQL database having "id" and "pointer"(inital value 0) field with type integer.
2. numList API increments pointer by 1, updates pointer in database and displays current value on browser.
3. Jmeter Test plan calls numList API 5000 times parallely with ramp-up period of 500 seconds with updates the value of pointer from 0 to 5000 and displays on browser.
   
