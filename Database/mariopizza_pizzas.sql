-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: mariopizza
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pizzas`
--

DROP TABLE IF EXISTS `pizzas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pizzas` (
  `pizza_id` int(11) NOT NULL,
  `pizza_name` varchar(255) NOT NULL,
  `ingredients` varchar(255) NOT NULL,
  `price` double(11,2) NOT NULL,
  PRIMARY KEY (`pizza_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pizzas`
--

LOCK TABLES `pizzas` WRITE;
/*!40000 ALTER TABLE `pizzas` DISABLE KEYS */;
INSERT INTO `pizzas` VALUES (1,'Vesuvio','tomatsauce, ost, skinke og oregano',57.00),(2,'Amerikaner','tomatsauce, ost, oksefars og oregano',53.00),(3,'Cacciatore','tomatsauce, ost, pepperoni og oregano',57.00),(4,'Carbona','tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano',63.00),(5,'Dennis','tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano',65.00),(6,'Bertil','tomatsauce, ost, bacon og oregano',57.00),(7,'Silvia','tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano',61.00),(8,'Victoria','tomatsauce, ost, skinke, ananas, champignon, løg og oregano',61.00),(9,'Toronfo','tomatsauce, ost, skinke, bacon, kebab, chili og oregano',61.00),(10,'Capricciosa','tomatsauce, ost, skinke, champignon og oregano',61.00),(11,'Hawai','tomatsauce, ost, skinke, ananas og oregano',61.00),(12,'Le Blissola','tomatsauce, ost, skinke, rejer og oregano',61.00),(13,'Venezia','tomatsauce, ost, skinke, bacon og oregano',61.00),(14,'Mafia','tomatsauce, ost, pepperoni, bacon, løg og oregano',61.00);
/*!40000 ALTER TABLE `pizzas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-13 15:41:42
