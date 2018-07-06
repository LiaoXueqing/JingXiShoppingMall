CREATE TABLE if not exists product (
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar(255) DEFAULT NULL,
  description varchar(255) DEFAULT NULL,
  price int
) ENGINE=InnoDB DEFAULT CHARSET=utf8