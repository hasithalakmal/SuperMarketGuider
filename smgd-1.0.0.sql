CREATE DATABASE  IF NOT EXISTS `SMG` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `SMG`;
-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: SMG
-- ------------------------------------------------------
-- Server version	5.7.17-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `MAIN_CATEGORY`
--

DROP TABLE IF EXISTS `MAIN_CATEGORY`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MAIN_CATEGORY` (
  `MAIN_CATEGORY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MAIN_CATEGORY_NAME` varchar(250) NOT NULL,
  `MAIN_CATEGORY_DESCRIPTION` varchar(250) DEFAULT NULL,
  `MAIN_CATEGORY_IMAGE_URL` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`MAIN_CATEGORY_ID`),
  UNIQUE KEY `MAIN_CATEGORY_ID_UNIQUE` (`MAIN_CATEGORY_ID`),
  UNIQUE KEY `MAIN_CATEGORY_NAME_UNIQUE` (`MAIN_CATEGORY_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MAIN_CATEGORY`
--

LOCK TABLES `MAIN_CATEGORY` WRITE;
/*!40000 ALTER TABLE `MAIN_CATEGORY` DISABLE KEYS */;
INSERT INTO `MAIN_CATEGORY` VALUES (1,'House Hold','House Hold Items','mc_house_hold_image.jpg'),(2,'Liqure','Liqure','mc_liqure.jpg'),(3,'Grocery','Grocery','mc_grocery.jpg'),(4,'Baverages','Baverages','mc_baverages.jpg'),(5,'Frozen Foods','Frozen Foods','mc_frozen_foods.jpg'),(6,'Chilled','Chilled','mc_chilled.jpg'),(7,'Vegetables','Vegetables','mc_vegetables.jpg'),(8,'Fish and Meat','Fish and Meat','mc_meat.jpg'),(9,'Home Ware','Home Ware','mc_home_ware.jpg'),(10,'Fruits','Fruits','mc_fruits.jpg');
/*!40000 ALTER TABLE `MAIN_CATEGORY` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MAP`
--

DROP TABLE IF EXISTS `MAP`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MAP` (
  `MAP_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MAP_NAME` varchar(250) NOT NULL,
  `MAP_URL` varchar(250) NOT NULL,
  PRIMARY KEY (`MAP_ID`),
  UNIQUE KEY `MAP_ID_UNIQUE` (`MAP_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MAP`
--

LOCK TABLES `MAP` WRITE;
/*!40000 ALTER TABLE `MAP` DISABLE KEYS */;
INSERT INTO `MAP` VALUES (1,'sc_biscuits','map_sc_biscuits.jpg'),(2,'sc_noodels','map_sc_noodels.jpg'),(3,'sc_flour','map_sc_flour.jpg'),(4,'sc_eggs','map_sc_eggs.jpg'),(5,'sc_beer','map_sc_beer.jpg'),(6,'sc_spirits','map_sc_spirits.jpg'),(7,'sc_wines','map_sc_wines.jpg'),(8,'pro_OREO_CRÈME_BISCUITS','map_sc_biscuits.jpg'),(9,'pro_MUNCHEE_SNACKS_CRACKER_260G','map_pro_MUNCHEE_SNACKS_CRACKER_260G.jpg'),(10,'pro_HAPPY_HEN_BROWN_EGG_EXTRA_LARGE_10S','map_pro_HAPPY_HEN_BROWN_EGG_EXTRA_LARGE_10S.jpg');
/*!40000 ALTER TABLE `MAP` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PRODUCT`
--

DROP TABLE IF EXISTS `PRODUCT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PRODUCT` (
  `PRODUCT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PRODUCT_NAME` varchar(250) NOT NULL,
  `PRODUCT_DESCRIPTION` varchar(250) DEFAULT NULL,
  `PRODUCT_PRICE` double DEFAULT NULL,
  `PRODUCT_AVAILABILITY` tinyint(1) DEFAULT NULL,
  `PRODUCT_IMAGE_URL` varchar(250) NOT NULL,
  `PRODUCT_LOCATION` varchar(250) DEFAULT NULL,
  `PRODUCT_MAP_ID` int(11) NOT NULL,
  PRIMARY KEY (`PRODUCT_ID`),
  UNIQUE KEY `PRODUCT_ID_UNIQUE` (`PRODUCT_ID`),
  KEY `fk_PRODUCT_MAP_idx` (`PRODUCT_MAP_ID`),
  CONSTRAINT `fk_PRODUCT_MAP` FOREIGN KEY (`PRODUCT_MAP_ID`) REFERENCES `MAP` (`MAP_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PRODUCT`
--

LOCK TABLES `PRODUCT` WRITE;
/*!40000 ALTER TABLE `PRODUCT` DISABLE KEYS */;
INSERT INTO `PRODUCT` VALUES (1,'OREO CREME BISCUITS ','OREO CREME BISCUITS ',740,1,'pro_OREO_CREME_BISCUITS.jpg','Firts row of the shelf from top.',8),(2,'MUNCHEE SNACKS CRACKER 260G','MUNCHEE SNACKS CRACKER 260G',320,1,'pro_MUNCHEE_SNACKS_CRACKER_260G.jpg','Theird Row of the shelf from top.',9),(3,'HAPPY HEN BROWN EGG EXTRA LARGE 10S','HAPPY HEN BROWN EGG EXTRA LARGE 10S',221,0,'pro_HAPPY_HEN_BROWN_EGG_EXTRA_LARGE_10S.jpg','Second Row if the shelft from top.',10);
/*!40000 ALTER TABLE `PRODUCT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SUB_CATEGORY`
--

DROP TABLE IF EXISTS `SUB_CATEGORY`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SUB_CATEGORY` (
  `SUB_CATEGORY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SUB_CATEGORY_NAME` varchar(250) NOT NULL,
  `SUB_CATEGORY_DESCRIPTION` varchar(250) DEFAULT NULL,
  `MAIN_CATEGORY_ID` int(11) NOT NULL,
  `SUB_CATEGORY_IMAGE_URL` varchar(250) NOT NULL,
  `SUB_CATEGORY_MAP_ID` int(11) NOT NULL,
  PRIMARY KEY (`SUB_CATEGORY_ID`),
  UNIQUE KEY `SUB_CATEGORY_ID_UNIQUE` (`SUB_CATEGORY_ID`),
  KEY `fk_MAIN_CATEGORY_idx` (`MAIN_CATEGORY_ID`),
  KEY `fk_SUB_CATEGORY_MAP_idx` (`SUB_CATEGORY_MAP_ID`),
  CONSTRAINT `fk_MAIN_CATEGORY` FOREIGN KEY (`MAIN_CATEGORY_ID`) REFERENCES `MAIN_CATEGORY` (`MAIN_CATEGORY_ID`),
  CONSTRAINT `fk_SUB_CATEGORY_MAP` FOREIGN KEY (`SUB_CATEGORY_MAP_ID`) REFERENCES `MAP` (`MAP_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SUB_CATEGORY`
--

LOCK TABLES `SUB_CATEGORY` WRITE;
/*!40000 ALTER TABLE `SUB_CATEGORY` DISABLE KEYS */;
INSERT INTO `SUB_CATEGORY` VALUES (1,'Biscuits','Biscuits',3,'sc_biscuits.jpg',1),(2,'Noodels','Noodels',3,'sc_noodels.jpg',2),(3,'Flour','Flour',3,'sc_flour.jpg',3),(4,'Eggs','Eggs',3,'sc_eggs.jpg',4),(5,'Beer','Beer',2,'sc_beer.jpg',5),(6,'Spirits','Spirits',2,'sc_spirits.jpg',6),(7,'Wines','Wines',2,'sc_wines.jpg',7);
/*!40000 ALTER TABLE `SUB_CATEGORY` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SUB_CATEGORY_PRODUCT`
--

DROP TABLE IF EXISTS `SUB_CATEGORY_PRODUCT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SUB_CATEGORY_PRODUCT` (
  `SUB_CATEGORY_ID` int(11) NOT NULL,
  `PRODUCT_ID` int(11) NOT NULL,
  PRIMARY KEY (`SUB_CATEGORY_ID`,`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SUB_CATEGORY_PRODUCT`
--

LOCK TABLES `SUB_CATEGORY_PRODUCT` WRITE;
/*!40000 ALTER TABLE `SUB_CATEGORY_PRODUCT` DISABLE KEYS */;
INSERT INTO `SUB_CATEGORY_PRODUCT` VALUES (1,1),(1,2),(4,3);
/*!40000 ALTER TABLE `SUB_CATEGORY_PRODUCT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'SMG'
--

--
-- Dumping routines for database 'SMG'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-25  0:30:19
