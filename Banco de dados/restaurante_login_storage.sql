-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: restaurante_login
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `storage`
--

DROP TABLE IF EXISTS `storage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `storage` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ts2` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `item` varchar(40) DEFAULT NULL,
  `preco` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storage`
--

LOCK TABLES `storage` WRITE;
/*!40000 ALTER TABLE `storage` DISABLE KEYS */;
INSERT INTO `storage` VALUES (1,'2022-06-09 05:00:04','Chop Brahma',15),(2,'2022-06-09 05:00:48','Skol lata',6.99),(3,'2022-06-09 05:06:42','batata frita',7.99),(4,'2022-06-09 05:06:48','X-Bacon',17.5),(5,'2022-06-09 05:06:57','Coca-Cola lata',5.99),(6,'2022-06-09 05:07:05','Salada de Pera',11.29),(7,'2022-06-09 14:25:48','Porção de calabresa',9.99),(8,'2022-06-09 19:02:33','Salada de Pera',11.29),(9,'2022-06-09 19:02:35','Porção de calabresa',9.99),(10,'2022-06-09 19:02:43','Porção de calabresa',9.99),(11,'2022-06-09 19:02:48','Suco de Laranja',4.99),(12,'2022-06-09 19:02:55','Chop Brahma',15),(13,'2022-06-09 19:03:00','Porção de calabresa',9.99),(14,'2022-06-09 19:03:04','Skol lata',6.99),(15,'2022-06-09 21:21:27','X-Bacon',17.5),(16,'2022-06-09 21:21:32','Chop Brahma',15),(17,'2022-06-09 21:32:20','Chop Brahma',15),(18,'2022-06-09 21:32:23','Skol lata',6.99),(19,'2022-06-09 21:32:25','Skol lata',6.99),(20,'2022-06-09 21:32:32','Chop Brahma',15),(21,'2022-06-09 21:32:41','X-Bacon',17.5),(22,'2022-06-09 21:32:43','Salada de Pera',11.29),(23,'2022-06-09 21:44:39','X-Bacon',17.5),(24,'2022-06-09 21:44:40','Suco de Laranja',4.99);
/*!40000 ALTER TABLE `storage` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-09 19:06:44
