create table Product(
    id serial unique not null,
    name char(20) not null,
    price integer check(price >= 0)
);

insert into Product (name, price) values ('Apple', 100);

select * from Product

