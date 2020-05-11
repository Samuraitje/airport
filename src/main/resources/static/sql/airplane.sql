CREATE DATABASE IF NOT EXISTS `airport_dir`;
USE `airport_dir`;

DROP TABLE IF EXISTS `airplanes`;

CREATE TABLE `airplanes` (
	`airplane_id` int(10) NOT NULL AUTO_INCREMENT,
	`airline` varchar(50) DEFAULT NULL,
	`max_fuel` int(10) DEFAULT NULL,
	`current_fuel` int(10) DEFAULT NULL,
    `airport` varchar(50) DEFAULT NULL,
    PRIMARY KEY (`airplane_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `airplanes` VALUES
	(1, 'KLM', 5, 3, 'Amsterdam'),
	(2, 'Virgin Airways', 5, 5, 'London'),
	(3, 'Scandinavian Airlines', 5, 0, 'Stockholm'),
    (4, 'Lufthansa', 5, 5, 'Berlin'),
    (5, 'Air-France', 5, 4, 'Paris');
    
    
    
