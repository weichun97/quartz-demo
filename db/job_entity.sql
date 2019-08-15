DROP TABLE IF EXISTS `job_entity`;
CREATE TABLE `job_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `group` varchar(255) DEFAULT NULL,
  `cron` varchar(255) DEFAULT NULL,
  `parameter` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `vm_param` varchar(255) DEFAULT NULL,
  `jar_path` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;