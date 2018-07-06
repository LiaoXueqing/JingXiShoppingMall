CREATE TABLE if not exists user (
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar(32),
  address varchar(64),
  phone varchar(16),
  role varchar(16)
) ENGINE=InnoDB DEFAULT CHARSET=utf8