-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: employeemanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `userattendence`
--

DROP TABLE IF EXISTS `userattendence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userattendence` (
  `fname` varchar(20) DEFAULT NULL,
  `lname` varchar(20) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `position` varchar(30) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userattendence`
--

LOCK TABLES `userattendence` WRITE;
/*!40000 ALTER TABLE `userattendence` DISABLE KEYS */;
INSERT INTO `userattendence` VALUES ('sumit','Maharjan','basundhara','Manager','Present'),('aashish','shrestha','chamati','Cook','Present'),('sumit','Maharjan','basundhara','Manager','Absent'),('sumit','Maharjan','basundhara','Manager','Present'),('Rojen','Dangol','chamati','Disigner','Present'),('sumit','Maharjan','basundhara','Manager','Present'),('Rojen','Dangol','chamati','Disigner','Present'),('Hari','Thapa','balaju','Crafter','Present'),('Hari','Thapa','balaju','Crafter','Present'),('Hari','Thapa','balaju','Crafter','Present'),('Hari','Thapa','balaju','Crafter','Present'),('Hari','Thapa','balaju','Crafter','Present'),('Hari','Thapa','balaju','Crafter','Present'),('Raju','Limbu','Thamel','Crafter','Present'),('Hari','Shrestha','basundhara','Crafter','Present'),('Raju','Gurung','thamel','Crafter','Present'),('Raju','Gurung','thamel','Crafter','Present'),('Raju','Gurung','thamel','Crafter','Present'),('Raju','Gurung','thamel','Crafter','Present'),('Ajay','Tamang','basundhara','Crafter','Present'),('Ajay','Tamang','basundhara','Crafter','Present'),('Ajay','Tamang','basundhara','Crafter','Present'),('Ajay','Tamang','basundhara','Crafter','Present'),('Ajay','Tamang','basundhara','Crafter','Present'),('Ajay','Tamang','basundhara','Crafter','Present'),('Rojen','Dangol','chamati','Disigner','Present');
/*!40000 ALTER TABLE `userattendence` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-29 14:12:09
