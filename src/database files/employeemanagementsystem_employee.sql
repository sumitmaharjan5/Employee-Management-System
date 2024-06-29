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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `fname` varchar(30) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `dob` varchar(30) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `position` varchar(30) DEFAULT NULL,
  `citizen_no` varchar(30) DEFAULT NULL,
  `salary` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `employee_id` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('aashish','shrestha','Feb 18, 2015','chamati','34234234','Cook','23422222','77777','aashish@gmail.com','3661'),('sumit','Maharjan','Feb 8, 2024','basundhara','9857645369','Manager','655565','60000','sumit@gmail.com','9162'),('rijen','dangol','Feb 22, 2024','chamati','333333','Accountant','3434223','60000','rijen@gamil.com','1311'),('Rojen','Dangol','Feb 8, 2007','chamati','535353535','Disigner','2323223','50000','rojen@gmail.com','4796'),('Ram','bahadur','Feb 1, 2002','chetrapati','9058746723','Manager','555555','50000','ram@gmail.com','3935'),('Sita','basnet','Feb 19, 1998','balaju','9876543987','Knitter','3454333','40000','sita@gamil.com','8176'),('Krishna','Limbu','Feb 11, 1994','basundhara','9876543452','Crafter','3444','30000','Krishna@gamil.com','1346'),('Raju','Gurung','Jan 4, 1997','thamel','9874653627','Crafter','4324','30000','raju@gmail.com','2668'),('Ajay','Tamang','Jan 2, 1999','basundhara','9834567823','Crafter','4234','30000','ajay@gmai.com','3339');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-29 14:12:08
