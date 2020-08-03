-- MySQL dump 10.13  Distrib 8.0.20, for Linux (x86_64)
--
-- Host: localhost    Database: sample
-- ------------------------------------------------------
-- Server version	8.0.20-0ubuntu0.20.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Branch`
--

DROP TABLE IF EXISTS `Branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Branch` (
  `branchName` varchar(45) NOT NULL,
  `branch_Id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`branchName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Branch`
--

LOCK TABLES `Branch` WRITE;
/*!40000 ALTER TABLE `Branch` DISABLE KEYS */;
INSERT INTO `Branch` VALUES ('CSE','CS16');
/*!40000 ALTER TABLE `Branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BranchSubjects`
--

DROP TABLE IF EXISTS `BranchSubjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `BranchSubjects` (
  `BranchId` varchar(10) DEFAULT NULL,
  `SubjectsID` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BranchSubjects`
--

LOCK TABLES `BranchSubjects` WRITE;
/*!40000 ALTER TABLE `BranchSubjects` DISABLE KEYS */;
INSERT INTO `BranchSubjects` VALUES ('CS16','CS43'),('CS16','CS82'),('CS16','CS86'),('CS16','MA22');
/*!40000 ALTER TABLE `BranchSubjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Exams`
--

DROP TABLE IF EXISTS `Exams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Exams` (
  `Type` varchar(45) DEFAULT NULL,
  `Date` date NOT NULL,
  `Branch_ID` varchar(11) DEFAULT NULL,
  `SubjectId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Exams`
--

LOCK TABLES `Exams` WRITE;
/*!40000 ALTER TABLE `Exams` DISABLE KEYS */;
INSERT INTO `Exams` VALUES ('PRE_FINALS','2022-06-16','CS16','CS43'),('PRE_FINALS','2022-06-17','CS16','CS82'),('PRE_FINALS','2022-06-18','CS16','CS86'),('PRE_FINALS','2022-06-19','CS16','MA22');
/*!40000 ALTER TABLE `Exams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Student`
--

DROP TABLE IF EXISTS `Student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Student` (
  `Name` varchar(45) NOT NULL,
  `BranchID` varchar(45) DEFAULT NULL,
  `ID_NO` varchar(45) NOT NULL,
  `Section` varchar(45) DEFAULT NULL,
  `Roll_no` int DEFAULT NULL,
  PRIMARY KEY (`ID_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Student`
--

LOCK TABLES `Student` WRITE;
/*!40000 ALTER TABLE `Student` DISABLE KEYS */;
INSERT INTO `Student` VALUES ('sai ganesh','ise','1ms19is100','i',100),('PRANAV M','CS16','CSE092','I',89),('PRANAY ANDRA','CS16','CSE093','I',90),('Ishaq','ISE','ISE105','I',105);
/*!40000 ALTER TABLE `Student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Subjects`
--

DROP TABLE IF EXISTS `Subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Subjects` (
  `SubjectId` varchar(45) NOT NULL,
  `SubjectName` varchar(45) NOT NULL,
  PRIMARY KEY (`SubjectName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Subjects`
--

LOCK TABLES `Subjects` WRITE;
/*!40000 ALTER TABLE `Subjects` DISABLE KEYS */;
INSERT INTO `Subjects` VALUES ('EE89','AC/DC'),('EE56','Arduino'),('IS13','C-Programming'),('EC47','Cboard'),('IS67','CPP'),('IS09','HTML CSS'),('CS86','Java'),('MA22','Math'),('CS43','Python'),('EC64','RPi'),('CS82','SQL'),('EE34','Three phase'),('EC73','Transistors');
/*!40000 ALTER TABLE `Subjects` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-23  9:24:20
