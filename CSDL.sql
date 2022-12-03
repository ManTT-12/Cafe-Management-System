create database CafeDB

use CafeDB
go

create table category
(
	id int primary key not null,
	cateName varchar(40) not null
)
go

CREATE TABLE ProductTbl
(
	PId INT PRIMARY KEY not null,
	PName VARCHAR(30),
	Category_id int foreign key references category(id),
	price int
);
create table account
(
	id int primary key not null,
	username varchar(30),
	password varchar(30),
	level int
)
create table BillTbl
(
	BId int primary key not null,
	Seller varchar(30),
	BDate varchar(30),
	BQty int,
	Total int
);

drop table BillTbl
DROP TABLE ProductTbl
drop table account

select * from ProductTbl;
select * from account;
select * from category;

insert into account (id, username, password, level) values
(1,'admin1','man123',0),
(2,'admin2','nhuhao321',0);