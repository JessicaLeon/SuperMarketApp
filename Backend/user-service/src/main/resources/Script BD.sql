create database Supermarket;

use Supermarket;

CREATE TABLE User (
id int NOT NULL AUTO_INCREMENT,
username VARCHAR(20) NOT NULL,
password VARCHAR(20) NOT NULL,
email VARCHAR(20),
name VARCHAR(20),
lastname VARCHAR(20),
role VARCHAR(20)  NOT NULL,
creation_day DATE  NOT NULL,
PRIMARY KEY (id));

Insert into User values (1, "johnsmith", "1234", "john@gmail.com", "John", "Smith", "Admin",current_date());

Insert into User values (2, "raul", "1234", "john@gmail.com", "John", "Smith", "Viewer",current_date());

Insert into User values (3, "martha", "1234", "john@gmail.com", "John", "Smith", "Viewer",current_date());

Select * from User;