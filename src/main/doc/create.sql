CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sex` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `is_del` int(11) DEFAULT NULL,
  `create_time` varchar(100) DEFAULT NULL,
  `update_time` varchar(100) DEFAULT NULL,
  `mobile` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8