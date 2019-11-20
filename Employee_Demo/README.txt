AUTHOR : Subramanyam.V

Pre requisites:
_______________
Minimum version JDK 1.8(if you don't have JDK then get the latest version from the Oracle site).
MongoDB, Maven plugins, Spring Boot plugins.

Creating Project:
------------------
01) Choosen Project type is Spring Starter Project

02) Project type is Maven Project

03) Selected DepeDependices Devtools, mongodb and Clicked Finish to create project

04) created package named with com.example.demo.model. Inside here Created a Employee.class and added all the fields inside here like getter and setter methods.

05) created package named with com.example.demo.repository. Inside here Created a EmployeeRepository interface and extended with mongorepository and added all customized queries in the file.

06) created package named with com.example.demo.resource. Inside here Created a EmployeeController.class and created methods for url requests functopnality and for every method is Mapped with a request.

07)In application.properties file  added all the configurations like dbhost, port number and database name

Execution Flow:
---------------
01) Run the file EmployeeDemoApplication.java which is available in the package com.example.demo Run the file as Java Application. It'll run the complete application and throws errors if it's there.

02) Hit the http://localhost:8080/service/allemployees api from browser/ postman. Once hitted it'll trigger the EmployeeController.java which is available in com.example.demo.source package. It'll hit getAllEmployees (the api which is matched) method and it'll return the complete collection data.

03) Hit the api http://localhost:8080/service/employeeByCity/Hyderabad
from the browser/ postman it'll trigger the EmployeeController.java which is available in com.example.demo.source package. It'll hit getEmployeeByCity method and it'll call findByCity method in EmployeeRepository file which is available in com.example.demo.repository package, snd it'll send response back.


APIS :
------
01) http://localhost:8080/service/allemployees
The above URL fetching all the data from collection. It'll call the method getAllEmployees method in EmployeeController and it'll return data.
input  : No extra request parameters
output : JSON Data for Employees

02) http://localhost:8080/service/employeeByCity
The Above URL fetching the collection data based on entered city wise. It'll call the method findByCity in EmployeeRepository from the method	getEmployeeByCity in EmployeeController
input  : /{city_name}	Ex: /Hyderabad
output : JSON Data for Employees

03) http://localhost:8080/service/employeeByAge
The Above URL fetching the collection data based on entered Age.It'll call the method findByAge in EmployeeRepository from the method getEmployeeByAge in EmployeeController
input  : /{age}		Ex: /24
output : JSON Data for Employees

04) http://localhost:8080/service/emp-city-age
The Above URL fetching the collection data based on entered Age.It'll call the method findByAge in EmployeeRepository from the method getEmployeeByAge in EmployeeController
input  : /{city_name},{age}		Ex: /Bangalore,25 (Order is mandatory)
output : JSON Data for Employees


MongoDB Operations :
--------------------
01) Connect to the database
02) Create database name as SpringBoot_Employee
03) Create collection name as employee inside the SpringBoot_Em	ployee collection.
04) Collection Object Fields : 
	_id			: Auto Generated field
	emp_name	: Employee Name 
	emp_id		: Employee ID
	emp_city	: Employee City
	emp_age		: Employee Age
05) Populated data by using random data with the python script file named with data_for_spring_boot.py

Release Notes (v1.0):
--------------------
01) New Spring Boot Project created
02) New mongodb created and added some data
03) Integrated both mongodb and spring boot project
04) APIs created for fetching all collection data, citywise serach, age wise search, city and age wise search
	http://localhost:8080/service/allemployees
	http://localhost:8080/service/employeeByCity
	http://localhost:8080/service/employeeByAge
	http://localhost:8080/service/emp-city-age
