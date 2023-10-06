-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: auction
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `winner`
--

DROP TABLE IF EXISTS `winner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `winner` (
  `Product_Id` varchar(45) NOT NULL,
  `ProductName` varchar(45) NOT NULL,
  `Bidder_Id` varchar(45) NOT NULL,
  `Seller_id` varchar(45) NOT NULL,
  `Bidding_Amount` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `winner`
--

LOCK TABLES `winner` WRITE;
/*!40000 ALTER TABLE `winner` DISABLE KEYS */;
INSERT INTO `winner` VALUES ('E012','Laptop','joel123','Aman12','41000'),('P_01','','joel123','aman12','100000'),('E012','Laptop','joel123','Aman12','45000'),('E012','Laptop','joel123','Aman12','48000'),('E03','Redmi note 12','joel123','Devanand_123','11000'),('E03','Redmi note 12','gaurav987','Devanand_123','12000'),('E012','Laptop','Gyana12','Aman12','49000'),('E03','Redmi note 12','gaurav987','Devanand_123','13000'),('E03','Redmi note 12','Gyana12','Devanand_123','14000'),('E012','Laptop','gaurav987','Aman12','500000'),('S04','Tennis Racket','joel123','Aman12','30000'),('P1','Tiger','Aman12','Aman12','14000'),('T01','Tennis Racket','Aman12','Aman12','3500'),('T01','Tennis Racket','Aman12','Aman12','4000'),('F01','FootBall','Aman12','Aman12','5100'),('J01','Barcelet','Aman12','Aman12','16000'),('R01','Rugby','gaurav987','Aman12','50000'),('E02','Laptop','Aman12','Aman12','56000'),('E03','HeadPhone','kumar123','kumar123','2600'),('E02','Laptop','joel123','Aman12','57000'),('E02','Laptop','Aman12','Aman12','58000'),('E012','Laptop','Dikshant123','Dikshant123','51000'),('E012','Laptop','ravinder123','Dikshant123','52000'),('J01','Barcelet','Aman12','Aman12','17000');
/*!40000 ALTER TABLE `winner` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-06 17:14:39
