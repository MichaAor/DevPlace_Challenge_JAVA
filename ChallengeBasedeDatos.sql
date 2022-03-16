create database Challenge

use Challenge 

drop table empleado
create table Empleado(	
ID_EMPLEADO INT primary key auto_increment,
NOMBRE VARCHAR(30),
APELLIDO VARCHAR(30),
TELEFONO VARCHAR(30),
EMAIL VARCHAR(80),
PUESTO VARCHAR(30),
SALARIO FLOAT check (SALARIO > 70000),
ANTIGUEDAD INT check (ANTIGUEDAD > 10 AND  ANTIGUEDAD < 15));

/*MUNICIPALIDAD VARCHAR (30)
constraint fk_Municipalidad foreign key(MUNICIPALIDAD) references Municipalidad(NOMBRE)*/


create table Municipalidad(
NOMBRE VARCHAR(40) primary key
);
