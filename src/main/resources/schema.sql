create table category(
    categoryid INT PRIMARY KEY AUTO_INCREMENT,
    name varchar(255),
    description varchar(255)
);

create table product(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name varchar(255),
    description varchar(255),
    price double,
    id INT,
    FOREIGN KEY (categoryid) REFERENCES category(categoryid)
);

