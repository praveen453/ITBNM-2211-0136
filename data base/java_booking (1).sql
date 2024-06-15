-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2024 at 06:37 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_booking`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking_details`
--

CREATE TABLE `booking_details` (
  `movie_id` varchar(22) NOT NULL,
  `ticket` int(55) NOT NULL,
  `time` varchar(55) NOT NULL,
  `date` varchar(55) NOT NULL,
  `movie` varchar(55) NOT NULL,
  `location` varchar(55) NOT NULL,
  `price` int(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booking_details`
--

INSERT INTO `booking_details` (`movie_id`, `ticket`, `time`, `date`, `movie`, `location`, `price`) VALUES
('M001', 8, '1.30 pm', '2024-05-21', 'GODZILLA X KONG: THE NEW EMPIRE', 'COLOMBO', 800),
('M002', 4, '1.30 pm', '2024-05-01', 'GODZILLA X KONG: THE NEW EMPIRE', 'KIRIBATHGODA', 400),
('M003', 4, '10.30 am', '2024-05-18', 'FURIOSA: A MAD MAX SAGA', 'GAMPAHA', 400),
('M004', 2, '1.30 pm', '2024-06-04', 'KUNG FU PANDA 4', 'COLOMBO', 200),
('M005', 5, '4.30 pm', '2024-06-14', 'FURIOSA: A MAD MAX SAGA', 'COLOMBO', 500),
('M006', 3, '4.30 pm', '2024-06-08', 'GODZILLA X KONG: THE NEW EMPIRE', 'KIRIBATHGODA', 300),
('M007', 5, '10.30 am', '2024-06-14', 'FURIOSA: A MAD MAX SAGA', 'COLOMBO', 500),
('M008', 6, '4.30 pm', '2024-06-28', 'GHOSTBUSTERS: FROZEN EMPIRE', 'KIRIBATHGODA', 600);

-- --------------------------------------------------------

--
-- Table structure for table `movie_details`
--

CREATE TABLE `movie_details` (
  `movie_id` varchar(22) NOT NULL,
  `movie` varchar(50) NOT NULL,
  `location` varchar(98) NOT NULL,
  `date` varchar(22) NOT NULL,
  `time` varchar(10) NOT NULL,
  `no_of_tickets` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `movie_details`
--

INSERT INTO `movie_details` (`movie_id`, `movie`, `location`, `date`, `time`, `no_of_tickets`) VALUES
('M001', 'GODZILLA X KONG: THE NEW EMPIRE', 'COLOMBO', '2024-05-21', '1.30 pm', 8),
('M002', 'GODZILLA X KONG: THE NEW EMPIRE', 'KIRIBATHGODA', '2024-05-01', '1.30 pm', 4),
('M003', 'FURIOSA: A MAD MAX SAGA', 'GAMPAHA', '2024-05-18', '10.30 am', 4),
('M004', 'KUNG FU PANDA 4', 'COLOMBO', '2024-06-04', '1.30 pm', 2),
('M005', 'FURIOSA: A MAD MAX SAGA', 'COLOMBO', '2024-06-14', '4.30 pm', 5),
('M006', 'GODZILLA X KONG: THE NEW EMPIRE', 'KIRIBATHGODA', '2024-06-08', '4.30 pm', 3),
('M007', 'FURIOSA: A MAD MAX SAGA', 'COLOMBO', '2024-06-14', '10.30 am', 5),
('M008', 'GHOSTBUSTERS: FROZEN EMPIRE', 'KIRIBATHGODA', '2024-06-28', '4.30 pm', 6);

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `name` varchar(55) NOT NULL,
  `email` varchar(55) NOT NULL,
  `mobile_num` int(10) NOT NULL,
  `password` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`name`, `email`, `mobile_num`, `password`) VALUES
('admin', 'admin@gmail.com', 714528555, 123),
('manodya', 'manodya@gmail.com', 714528974, 123),
('nimal', 'nimal@gmail.com', 714562398, 123);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking_details`
--
ALTER TABLE `booking_details`
  ADD PRIMARY KEY (`movie_id`);

--
-- Indexes for table `movie_details`
--
ALTER TABLE `movie_details`
  ADD PRIMARY KEY (`movie_id`);

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
