CREATE TABLE if not exists product (
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar(255),
  description varchar(255),
  price int(11)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8