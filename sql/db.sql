CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '客户名称',
  `contact` varchar(255) DEFAULT NULL COMMENT '联系人',
  `telephone` varchar(255) DEFAULT NULL COMMENT '电话号码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱地址',
  `remark` text COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


INSERT INTO 'customer' values (1,'customer1','jack','13500001111','jack@gmail.com',null);
INSERT INTO 'customer' values (2,'customer2','rosse','13500001111','rose@qq.com',null);