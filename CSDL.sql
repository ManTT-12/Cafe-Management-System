create database CafeDB

use CafeDB
go

create table category
(
	id int primary key not null,
	cateName varchar(40) not null
)
go

insert into category (id, cateName) values
(1, 'Match'),
(2, 'Coffee'),
(3, 'Latte'),
(4, 'Socola'),
(5, 'Milk tea');

CREATE TABLE product
(
	id INT PRIMARY KEY not null,
	name VARCHAR(30),
	category_id int foreign key references category(id),
	price int
);
go

insert into product (id, name, category_id, price) values
(1, 'Match latte',1,10),
(2, 'Hot Socola',4,20),
(3, 'Milk tea boba',5,25),
(4, 'Coffee vanilla',2,13);

create table account
(
	id int primary key not null,
	username varchar(30),
	password varchar(30),
)
go

insert into account (id, username, password) values
(1,'admin1','man123'),
(2,'admin2','nhuhao321');

create table bill
(
	id int primary key not null,
	seller varchar(30),
	pName varchar(30),
	bDate varchar(30),
	bQty int,
	total int
);

DROP TABLE product
drop table account
drop table category
drop table bill

select a.id, a.name, b.id, b.cateName, a.price
from product a join category b on a.category_id = b.id

select * from account;
select * from category;
select * from bill;

select a.id, a.seller, b.id, b.name, a.bDate, a.bQty, a.total
from bill a join product b on a.pName = b.name

insert into bill values
(1, 'user1','Match latte','',6,60);