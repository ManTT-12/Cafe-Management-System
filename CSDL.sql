CREATE TABLE ProductTbl
(
	PId INT PRIMARY KEY not null,
	PName VARCHAR(30),
	Category varchar(40),
	price int
);
create table BillTbl
(
	BId int primary key not null,
	Seller varchar(30),
	BDate varchar(30),
	BQty int,
	Total int
);
create table account
(
	id int primary key not null,
	username varchar(30),
	password varchar(30)
)
drop table BillTbl
DROP TABLE ProductTbl

select * from ProductTbl;
select * from account;

insert into account values
(
	1,"mantang","Man123";
	2,"nhuhao","nhuhao321";
)