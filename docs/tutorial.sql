/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.4.6-MariaDB : Database - tutorial
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tutorial` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `tutorial`;

/*Table structure for table `detalleplato` */

DROP TABLE IF EXISTS `detalleplato`;

CREATE TABLE `detalleplato` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `articulo` varchar(255) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `detalle_plato_plato` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKea1rfbbm82lsbbqn0npev8oda` (`detalle_plato_plato`),
  CONSTRAINT `FKea1rfbbm82lsbbqn0npev8oda` FOREIGN KEY (`detalle_plato_plato`) REFERENCES `plato` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `detalleplato` */

insert  into `detalleplato`(`id`,`articulo`,`cantidad`,`detalle_plato_plato`) values (13,'salsa',1,3),(14,'aceituna',20,3);

/*Table structure for table `plato` */

DROP TABLE IF EXISTS `plato`;

CREATE TABLE `plato` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `denominacion` varchar(255) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `precio_venta` float DEFAULT NULL,
  `tiempo_preparacion` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `plato` */

insert  into `plato`(`id`,`denominacion`,`imagen`,`precio_venta`,`tiempo_preparacion`) values (3,'Pizza Especial','url',300,15);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
