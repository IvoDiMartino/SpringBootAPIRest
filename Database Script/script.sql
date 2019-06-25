/*
SQLyog Community Edition- MySQL GUI v8.05 
MySQL - 5.5.5-10.3.16-MariaDB : Database - supermercado
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`supermarket` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `supermarket`;

/*Table structure for table `clients` */

DROP TABLE IF EXISTS `clients`;

CREATE TABLE `clients` (
  `ClientID` int(255) NOT NULL,
  `First_Name` varchar(41) NOT NULL,
  `Last_Name` varchar(36) NOT NULL,
  `Phone` int(10) NOT NULL,
  `Cell_Phone` int(10) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Email` varchar(255) NOT NULL,
  PRIMARY KEY (`ClientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `clients` */

insert  into `clients`(`ClientID`,`FirstName`,`LastName`,`Phone`,`CellPhone`,`Address`,`Gender`,`Password`,`Email`) values (1,'Alex','De Assis',123456789,987654321,'Siempreviva 1234','Male','Password123','prueba@hotmail.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
