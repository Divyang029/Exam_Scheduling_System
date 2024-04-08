-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 26, 2024 at 11:28 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `exam_scheduling_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE `exam` (
  `exam_id` int(11) NOT NULL,
  `exam_date` varchar(255) DEFAULT NULL,
  `exam_duration` int(11) NOT NULL,
  `exam_type` varchar(255) NOT NULL,
  `subject_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `exam`
--

INSERT INTO `exam` (`exam_id`, `exam_date`, `exam_duration`, `exam_type`, `subject_name`) VALUES
(1, '2024-04-01', 75, 'internal', 'CSA'),
(2, '2024-04-02', 75, 'internal', 'DM'),
(3, '2024-04-03', 75, 'internal', 'DAA'),
(4, '2024-04-04', 75, 'internal', 'JT'),
(5, '2024-04-05', 75, 'internal', 'SEPP');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `room_id` int(11) NOT NULL,
  `block_no` varchar(255) NOT NULL,
  `room_capacity` int(11) DEFAULT NULL,
  `room_no` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`room_id`, `block_no`, `room_capacity`, `room_no`) VALUES
(1, 'C', 25, 1),
(2, 'C', 25, 2);

-- --------------------------------------------------------

--
-- Table structure for table `room_exam`
--

CREATE TABLE `room_exam` (
  `room_id` int(11) NOT NULL,
  `exam_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room_exam`
--

INSERT INTO `room_exam` (`room_id`, `exam_id`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `student_id` int(11) NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `roll_no` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`student_id`, `student_name`, `roll_no`) VALUES
(1, 'divyang', 75),
(2, 'parthiv', 76),
(3, 'yug', 77),
(4, 'kishan', 74),
(5, 'jay', 73),
(6, 'krish', 70),
(7, 'akshay', 71),
(8, 'manthan', 72),
(9, 'vrund', 78),
(10, 'jaimin', 79),
(11, 'yash', 80),
(12, 'arohi', 81),
(13, 'khushi', 82),
(14, 'riya', 83),
(15, 'ananya', 84),
(16, 'nisha', 85),
(18, 'kashvi', 69),
(19, 'maunik', 68),
(20, 'kevin', 67),
(21, 'sujal', 66),
(22, 'zenil', 65),
(23, 'smit', 64),
(24, 'arpit', 63),
(25, 'khanjan', 62),
(26, 'aman', 61);

-- --------------------------------------------------------

--
-- Table structure for table `student_exam`
--

CREATE TABLE `student_exam` (
  `student_id` int(11) NOT NULL,
  `exam_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_exam`
--

INSERT INTO `student_exam` (`student_id`, `exam_id`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(3, 1),
(3, 2),
(3, 3),
(3, 4),
(3, 5),
(4, 1),
(4, 2),
(4, 3),
(4, 4),
(4, 5),
(5, 1),
(5, 2),
(5, 3),
(5, 4),
(5, 5),
(7, 1),
(7, 2),
(7, 3),
(7, 4),
(7, 5),
(6, 1),
(6, 2),
(6, 3),
(6, 4),
(6, 5),
(8, 1),
(8, 2),
(8, 3),
(8, 4),
(8, 5),
(9, 1),
(9, 2),
(9, 3),
(9, 4),
(9, 5),
(10, 1),
(10, 2),
(10, 3),
(10, 4),
(10, 5),
(11, 1),
(11, 2),
(11, 3),
(11, 4),
(11, 5),
(12, 1),
(12, 2),
(12, 3),
(12, 4),
(12, 5),
(13, 1),
(13, 2),
(13, 3),
(13, 4),
(13, 5),
(14, 1),
(14, 2),
(14, 3),
(14, 4),
(14, 5),
(15, 1),
(15, 2),
(15, 3),
(15, 4),
(15, 5),
(16, 1),
(16, 2),
(16, 3),
(16, 4),
(16, 5),
(18, 1),
(18, 2),
(18, 3),
(18, 4),
(18, 5),
(19, 1),
(19, 2),
(19, 3),
(19, 4),
(19, 5),
(20, 1),
(20, 2),
(20, 3),
(20, 4),
(20, 5),
(21, 1),
(21, 2),
(21, 3),
(21, 4),
(21, 5),
(22, 1),
(22, 2),
(22, 3),
(22, 4),
(22, 5),
(23, 1),
(23, 2),
(23, 3),
(23, 4),
(23, 5),
(24, 1),
(24, 2),
(24, 3),
(24, 4),
(24, 5),
(25, 1),
(25, 2),
(25, 3),
(25, 4),
(25, 5),
(26, 1),
(26, 2),
(26, 3),
(26, 4),
(26, 5);

-- --------------------------------------------------------

--
-- Table structure for table `student_room`
--

CREATE TABLE `student_room` (
  `student_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_room`
--

INSERT INTO `student_room` (`student_id`, `room_id`) VALUES
(1, 2),
(1, 2),
(1, 2),
(1, 2),
(1, 2),
(2, 1),
(2, 1),
(2, 1),
(2, 1),
(2, 1),
(3, 1),
(3, 1),
(3, 1),
(3, 1),
(3, 1),
(4, 2),
(4, 2),
(4, 2),
(4, 2),
(4, 2),
(5, 2),
(5, 2),
(5, 2),
(5, 2),
(5, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(6, 2),
(6, 2),
(6, 2),
(6, 2),
(6, 2),
(8, 2),
(8, 2),
(8, 2),
(8, 2),
(8, 2),
(9, 1),
(9, 1),
(9, 1),
(9, 1),
(9, 1),
(10, 1),
(10, 1),
(10, 1),
(10, 1),
(10, 1),
(11, 1),
(11, 1),
(11, 1),
(11, 1),
(11, 1),
(12, 1),
(12, 1),
(12, 1),
(12, 1),
(12, 1),
(13, 1),
(13, 1),
(13, 1),
(13, 1),
(13, 1),
(14, 1),
(14, 1),
(14, 1),
(14, 1),
(14, 1),
(15, 1),
(15, 1),
(15, 1),
(15, 1),
(15, 1),
(16, 1),
(16, 1),
(16, 1),
(16, 1),
(16, 1),
(18, 2),
(18, 2),
(18, 2),
(18, 2),
(18, 2),
(19, 2),
(19, 2),
(19, 2),
(19, 2),
(19, 2),
(20, 2),
(20, 2),
(20, 2),
(20, 2),
(20, 2),
(21, 2),
(21, 2),
(21, 2),
(21, 2),
(21, 2),
(22, 2),
(22, 2),
(22, 2),
(22, 2),
(22, 2),
(23, 2),
(23, 2),
(23, 2),
(23, 2),
(23, 2),
(24, 2),
(24, 2),
(24, 2),
(24, 2),
(24, 2),
(25, 2),
(25, 2),
(25, 2),
(25, 2),
(25, 2),
(26, 2),
(26, 2),
(26, 2),
(26, 2),
(26, 2);

-- --------------------------------------------------------

--
-- Table structure for table `supervisor`
--

CREATE TABLE `supervisor` (
  `supervisor_id` int(11) NOT NULL,
  `supervisor_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supervisor`
--

INSERT INTO `supervisor` (`supervisor_id`, `supervisor_name`) VALUES
(1, 'AKG'),
(2, 'SSS'),
(3, 'SDP'),
(4, 'SPS'),
(5, 'JKS');

-- --------------------------------------------------------

--
-- Table structure for table `supervisor_room`
--

CREATE TABLE `supervisor_room` (
  `room_id` int(11) NOT NULL,
  `supervisor_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supervisor_room`
--

INSERT INTO `supervisor_room` (`room_id`, `supervisor_id`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(2, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `exam`
--
ALTER TABLE `exam`
  ADD PRIMARY KEY (`exam_id`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`room_id`);

--
-- Indexes for table `room_exam`
--
ALTER TABLE `room_exam`
  ADD KEY `FK2opjuiy0mqc3csn7divrb9iwy` (`exam_id`),
  ADD KEY `FK9cv90ldx0r8rgcui852cdutiy` (`room_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_id`),
  ADD UNIQUE KEY `UK_rane7utxv14bfxp4wkxesjlsr` (`roll_no`);

--
-- Indexes for table `student_exam`
--
ALTER TABLE `student_exam`
  ADD KEY `FKm3tx9n7w4hpjyu130hp3bueh7` (`exam_id`),
  ADD KEY `FKo8h2f1th1vanl3169pi8vmeuw` (`student_id`);

--
-- Indexes for table `student_room`
--
ALTER TABLE `student_room`
  ADD KEY `FKf5420bxfucsk6d0f51y97m49b` (`room_id`),
  ADD KEY `FK5tw2tovm33y96pk72je04nc3o` (`student_id`);

--
-- Indexes for table `supervisor`
--
ALTER TABLE `supervisor`
  ADD PRIMARY KEY (`supervisor_id`);

--
-- Indexes for table `supervisor_room`
--
ALTER TABLE `supervisor_room`
  ADD KEY `FKjysktlnrc7ohbir2f5vx7xtek` (`supervisor_id`),
  ADD KEY `FK8u7of1ujp08s6b8acui87vict` (`room_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `exam`
--
ALTER TABLE `exam`
  MODIFY `exam_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `room_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `student_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `supervisor`
--
ALTER TABLE `supervisor`
  MODIFY `supervisor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `room_exam`
--
ALTER TABLE `room_exam`
  ADD CONSTRAINT `FK2opjuiy0mqc3csn7divrb9iwy` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`),
  ADD CONSTRAINT `FK9cv90ldx0r8rgcui852cdutiy` FOREIGN KEY (`room_id`) REFERENCES `room` (`room_id`);

--
-- Constraints for table `student_exam`
--
ALTER TABLE `student_exam`
  ADD CONSTRAINT `FKm3tx9n7w4hpjyu130hp3bueh7` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`),
  ADD CONSTRAINT `FKo8h2f1th1vanl3169pi8vmeuw` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`);

--
-- Constraints for table `student_room`
--
ALTER TABLE `student_room`
  ADD CONSTRAINT `FK5tw2tovm33y96pk72je04nc3o` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`),
  ADD CONSTRAINT `FKf5420bxfucsk6d0f51y97m49b` FOREIGN KEY (`room_id`) REFERENCES `room` (`room_id`);

--
-- Constraints for table `supervisor_room`
--
ALTER TABLE `supervisor_room`
  ADD CONSTRAINT `FK8u7of1ujp08s6b8acui87vict` FOREIGN KEY (`room_id`) REFERENCES `room` (`room_id`),
  ADD CONSTRAINT `FKjysktlnrc7ohbir2f5vx7xtek` FOREIGN KEY (`supervisor_id`) REFERENCES `supervisor` (`supervisor_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
