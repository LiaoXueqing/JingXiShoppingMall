CREATE TABLE if not exists Order_Item (
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  order_status varchar(36),
  user_id int(11),
  product_id int(11),
  purchase_count int(11),
  total_money int(11),
  create_time varchar(128)
) ENGINE=InnoDB DEFAULT CHARSET=utf8