create database db_coffee

use db_coffee

create table db_coffee_akun(
id_akun int IDENTITY (1,1) primary key NOT NULL,
nama varchar (200) NOT NULL,
email varchar(200) NOT NULL,
password_akun varchar (6) NOT NULL,
);


select * from db_coffee_akun


UPDATE db_coffee_akun
SET nama = 'Alfred Schmidt', email= 'Frankfurt@gmail.com', password_akun= 'azura'
WHERE id_akun = 2;

create table db_coffee_admin(
id_admin int identity(1,1) primary key not null,
username varchar(200),
password_admin varchar(6)
);

select * from db_coffee_admin

create table db_coffee_detail(
ID_Coffee int IDENTITY (6251,1) primary key,
Coffee_Name varchar(200) not null ,
Stock int,
Price bigint ,
Expired date
);

UPDATE db_coffee_detail
SET coffee_name = 'Alfred Schmidt', Stock= '2', Price= '2222',Expired = '01/01/2013'
WHERE id_coffee = 6251;

DELETE FROM db_coffee_detail WHERE id_coffee=6251;

select * from db_coffee_detail

create table tbTransaction(
ID_Transaction int IDENTITY (123456,1) primary key,
ID_Customer varchar(200) not null,
Customer_Name varchar(200) not null,
Coffee_Name varchar(120) not null,
Coffee_Price int not null,
Qty int,
Total_Price int,
Date_Of_Purchase date null
);


select * from tbTransaction

drop table db_coffee_detail
drop table db_coffee_akun


