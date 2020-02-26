create database motor

use motor

create table motor (
id int IDENTITY(1,1) PRIMARY KEY,
mesin varchar(100) NOT NULL, 
brand varchar(100),
name varchar(100),
types varchar(100),
manufacture date NULL,
color varchar(100),
jumlah int
)

select *from motor

drop table motor

create table ambil (
id int IDENTITY(1,1) PRIMARY KEY,
id_motor int,
jumlah_motor int,
taking date null
)


select * from ambil

drop table ambil

create trigger insert_data_ambil
on ambil after insert
as
update motor set motor.jumlah = motor.jumlah-inserted.jumlah_motor
from inserted where motor.id = inserted.id_motor

create table bahan (
id int IDENTITY(1,1) PRIMARY KEY,
bahan varchar(30),
nomor_bahan varchar(30),
types varchar(30),
jumlah int,
manufacture date NULL,
expired date NULL
)


create table creates (
id int IDENTITY(1,1) PRIMARY KEY,
id_bahan int,
jumlah_create int,
taking date NULL
)


create trigger insert_data_creates
on creates after insert
as
update bahan set bahan.jumlah = bahan.jumlah-inserted.jumlah_create
from inserted where bahan.id = inserted.id_bahan



