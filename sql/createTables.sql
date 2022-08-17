CREATE DATABASE IF NOT EXISTS tradePortfolio;
use tradePortfolio;
create table users (email_address varchar(50) primary key,user_name varchar(50),funds double);

CREATE TABLE stocks (stock_symbol varchar(50) primary key, stock_name varchar(50),
                    stock_price double
);

CREATE TABLE stock_orders (order_id int primary key auto_increment,
		            order_status int not null,
                    num_of_shares int,
                    stock_symbol varchar(50),
                    user_email varchar(50),
                    FOREIGN KEY (stock_symbol) REFERENCES stocks(stock_symbol),
                    FOREIGN KEY (user_email) REFERENCES users(email_address)

);



insert into users values('abc@gmail.com','Jane Doe',25000.99);


insert into stocks values ('AAPL', 'apple', 265.26);
insert into stocks values ('AMZN', 'amazon', 2022.10);
insert into stocks values ('GOOGL', 'google', 1918.45);
insert into stocks values ('MSFT', 'microsoft', 157.14);



insert into stock_orders values (1, 0, 1, 'AAPL', 'abc@gmail.com');
insert into stock_orders values (2, 0, 3, 'AAPL', 'abc@gmail.com');
insert into stock_orders values (3, 1, 2, 'AAPL', 'abc@gmail.com');
insert into stock_orders values (4, 1, 1, 'MSFT', 'abc@gmail.com');
