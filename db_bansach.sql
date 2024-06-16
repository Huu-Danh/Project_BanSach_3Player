-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2024 at 04:14 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_bansach`
--

-- --------------------------------------------------------

--
-- Table structure for table `chi_tiet_hd`
--

CREATE TABLE `chi_tiet_hd` (
  `maCTHD` int(11) NOT NULL,
  `maSach` int(11) NOT NULL,
  `maHD` int(11) NOT NULL,
  `soluong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `chi_tiet_hd`
--

INSERT INTO `chi_tiet_hd` (`maCTHD`, `maSach`, `maHD`, `soluong`) VALUES
(48, 12, 317215146, 123),
(49, 1, 317215146, 123),
(50, 12, 198391428, 123),
(51, 1, 198391428, 123),
(52, 12, 839934145, 123),
(53, 1, 839934145, 123),
(54, 12, 1231166029, 123),
(55, 1, 1231166029, 123),
(56, 12, 563759059, 122222222),
(57, 1, 563759059, 122222222),
(58, 1, 515752635, 1),
(59, 2, 515752635, 1),
(60, 1, 2082856244, 1),
(61, 1, 111396767, 1),
(62, 2, 111396767, 1),
(63, 1, 585928828, 2),
(64, 2, 585928828, 2),
(65, 1, 1919756485, 2),
(66, 2, 1919756485, 2),
(67, 1, 748998416, 1),
(68, 2, 748998416, 1),
(69, 1, 532500143, 1),
(70, 2, 532500143, 1),
(71, 1, 767936362, 1),
(72, 2, 767936362, 1),
(73, 1, 1272534262, 1),
(74, 2, 1272534262, 1),
(75, 1, 605390410, 2),
(76, 2, 605390410, 2),
(77, 1, 1909574066, 1),
(78, 2, 1909574066, 1),
(79, 1, 1447602389, 2),
(80, 2, 1447602389, 2),
(81, 1, 482030311, 1),
(82, 1, 443505785, 1),
(83, 2, 443505785, 1),
(84, 1, 1944895275, 1),
(85, 1, 1076275670, 1),
(86, 1, 864059351, 3),
(87, 1, 1846229883, 1),
(88, 1, 665182406, 1),
(89, 1, 874974371, 2),
(90, 2, 1946162774, 2),
(91, 1, 1946162774, 1),
(92, 1, 1237795021, 2),
(93, 2, 1237795021, 2),
(94, 1, 1000402460, 2),
(95, 12, 1000402460, 2),
(96, 12, 95803991, 1),
(97, 1, 95803991, 1),
(98, 1, 1895576331, 2),
(99, 3, 1272442362, 2),
(100, 3, 541617792, 2),
(101, 1, 1090294211, 2),
(102, 1, 750211021, 1),
(103, 2, 1061943237, 3),
(104, 1, 1061943237, 3);

-- --------------------------------------------------------

--
-- Table structure for table `hoa_don`
--

CREATE TABLE `hoa_don` (
  `maHD` int(11) NOT NULL,
  `maTT` int(11) NOT NULL,
  `ngayBanSach` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hoa_don`
--

INSERT INTO `hoa_don` (`maHD`, `maTT`, `ngayBanSach`) VALUES
(95803991, 1, 'Thu Jun 13 19:50:17 ICT 2024'),
(111396767, 1, 'Thu Jun 13 19:18:51 ICT 2024'),
(198391428, 1, 'Thu Jun 13 13:48:39 ICT 2024'),
(317215146, 1, 'Thu Jun 13 13:46:41 ICT 2024'),
(443505785, 1, 'Thu Jun 13 19:34:11 ICT 2024'),
(482030311, 1, 'Thu Jun 13 19:33:37 ICT 2024'),
(515752635, 1, 'Thu Jun 13 19:16:24 ICT 2024'),
(532500143, 1, 'Thu Jun 13 19:25:11 ICT 2024'),
(541617792, 1, 'Thu Jun 13 19:58:38 ICT 2024'),
(563759059, 1, 'Thu Jun 13 13:52:35 ICT 2024'),
(585928828, 1, 'Thu Jun 13 19:19:55 ICT 2024'),
(605390410, 1, 'Thu Jun 13 19:29:00 ICT 2024'),
(665182406, 1, 'Thu Jun 13 19:41:01 ICT 2024'),
(748998416, 1, 'Thu Jun 13 19:23:58 ICT 2024'),
(750211021, 1, 'Thu Jun 13 20:00:19 ICT 2024'),
(767936362, 1, 'Thu Jun 13 19:26:12 ICT 2024'),
(839934145, 1, 'Thu Jun 13 13:49:43 ICT 2024'),
(864059351, 1, 'Thu Jun 13 19:39:00 ICT 2024'),
(874974371, 1, 'Thu Jun 13 19:42:04 ICT 2024'),
(1000402460, 1, 'Thu Jun 13 19:49:17 ICT 2024'),
(1061943237, 1, 'Thu Jun 13 20:02:38 ICT 2024'),
(1076275670, 1, 'Thu Jun 13 19:37:26 ICT 2024'),
(1090294211, 1, 'Thu Jun 13 19:59:42 ICT 2024'),
(1231166029, 1, 'Thu Jun 13 13:51:31 ICT 2024'),
(1237795021, 1, 'Thu Jun 13 19:45:08 ICT 2024'),
(1272442362, 1, 'Thu Jun 13 19:58:31 ICT 2024'),
(1272534262, 1, 'Thu Jun 13 19:26:34 ICT 2024'),
(1447602389, 1, 'Thu Jun 13 19:32:45 ICT 2024'),
(1846229883, 1, 'Thu Jun 13 19:40:12 ICT 2024'),
(1895576331, 1, 'Thu Jun 13 19:53:04 ICT 2024'),
(1909574066, 1, 'Thu Jun 13 19:31:36 ICT 2024'),
(1919756485, 1, 'Thu Jun 13 19:22:24 ICT 2024'),
(1944895275, 1, 'Thu Jun 13 19:34:44 ICT 2024'),
(1946162774, 1, 'Thu Jun 13 19:43:34 ICT 2024'),
(2082856244, 1, 'Thu Jun 13 19:17:58 ICT 2024');

-- --------------------------------------------------------

--
-- Table structure for table `sach`
--

CREATE TABLE `sach` (
  `maSach` int(11) NOT NULL,
  `theLoai` varchar(255) NOT NULL,
  `tenSach` varchar(255) NOT NULL,
  `gia` int(11) NOT NULL,
  `nhaXB` varchar(255) NOT NULL,
  `namXB` int(11) NOT NULL,
  `tacGia` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sach`
--

INSERT INTO `sach` (`maSach`, `theLoai`, `tenSach`, `gia`, `nhaXB`, `namXB`, `tacGia`) VALUES
(1, 'Tiểu thuyết', 'Cuốn theo chiều gió', 150000, 'NXB Trẻ', 2020, 'Margaret Mitchell'),
(2, 'Tiểu thuyết', 'Chiến tranh và Hòa bình', 180000, 'NXB Văn học', 2018, 'Leo Tolstoy'),
(3, 'Kinh tế', 'Cha giàu cha nghèo', 120000, 'NXB Lao động', 2019, 'Robert Kiyosaki'),
(4, 'Khoa học', 'Lược sử thời gian', 200000, 'NXB Khoa học', 2021, 'Stephen Hawking'),
(5, 'Khoa học', 'Vũ trụ trong vỏ hạt', 220000, 'NXB Khoa học', 2021, 'Stephen Hawking'),
(6, 'Giáo dục', 'Đắc nhân tâm', 100000, 'NXB Tổng hợp', 2020, 'Dale Carnegie'),
(7, 'Giáo dục', 'Quẳng gánh lo đi và vui sống', 110000, 'NXB Trẻ', 2018, 'Dale Carnegie'),
(8, 'Lịch sử', 'Sử Việt - 12 khúc tráng ca', 130000, 'NXB Trẻ', 2019, 'Dương Trung Quốc'),
(9, 'Lịch sử', 'Việt Nam sử lược', 140000, 'NXB Văn học', 2019, 'Trần Trọng Kim'),
(10, 'Tiểu thuyết', 'Bố già', 160000, 'NXB Trẻ', 2020, 'Mario Puzo'),
(11, 'Tiểu thuyết', 'Harry Potter và Hòn đá Phù thủy', 250000, 'NXB Trẻ', 2019, 'J.K. Rowling'),
(12, 'Tiểu thuyết', 'Harry Potter và Phòng chứa Bí mật', 260000, 'NXB Trẻ', 2019, 'J.K. Rowling'),
(13, 'Kinh tế', 'Tư duy nhanh và chậm', 180000, 'NXB Lao động', 2020, 'Daniel Kahneman'),
(14, 'Khoa học', 'Nguồn gốc các loài', 200000, 'NXB Khoa học', 2019, 'Charles Darwin'),
(15, 'Giáo dục', 'Sức mạnh của thói quen', 150000, 'NXB Tổng hợp', 2020, 'Charles Duhigg'),
(16, 'Giáo dục', '7 thói quen của bạn trẻ thành đạt', 130000, 'NXB Trẻ', 2018, 'Sean Covey'),
(17, 'Lịch sử', 'Lịch sử thế giới', 210000, 'NXB Văn học', 2021, 'John Roberts'),
(18, 'Lịch sử', 'Thế giới phẳng', 190000, 'NXB Trẻ', 2020, 'Thomas L. Friedman'),
(19, 'Tiểu thuyết', 'Thiên thần và ác quỷ', 170000, 'NXB Trẻ', 2019, 'Dan Brown'),
(20, 'Tiểu thuyết', 'Mật mã Da Vinci', 180000, 'NXB Trẻ', 2018, 'Dan Brown');

-- --------------------------------------------------------

--
-- Table structure for table `thu_thu`
--

CREATE TABLE `thu_thu` (
  `maTT` int(11) NOT NULL,
  `tenTT` varchar(255) NOT NULL,
  `gioiTinh` int(5) NOT NULL,
  `namSinh` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `thu_thu`
--

INSERT INTO `thu_thu` (`maTT`, `tenTT`, `gioiTinh`, `namSinh`) VALUES
(1, 'Nguyễn Tấn Hữu Danh', 1, 2003);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chi_tiet_hd`
--
ALTER TABLE `chi_tiet_hd`
  ADD PRIMARY KEY (`maCTHD`),
  ADD KEY `fk_chitiethoadon_hoadon` (`maHD`),
  ADD KEY `fk_chitiethoadon_sach` (`maSach`);

--
-- Indexes for table `hoa_don`
--
ALTER TABLE `hoa_don`
  ADD PRIMARY KEY (`maHD`),
  ADD KEY `fk_hoadon_thuthu` (`maTT`);

--
-- Indexes for table `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`maSach`);

--
-- Indexes for table `thu_thu`
--
ALTER TABLE `thu_thu`
  ADD PRIMARY KEY (`maTT`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chi_tiet_hd`
--
ALTER TABLE `chi_tiet_hd`
  MODIFY `maCTHD` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=105;

--
-- AUTO_INCREMENT for table `hoa_don`
--
ALTER TABLE `hoa_don`
  MODIFY `maHD` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2082856245;

--
-- AUTO_INCREMENT for table `sach`
--
ALTER TABLE `sach`
  MODIFY `maSach` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `thu_thu`
--
ALTER TABLE `thu_thu`
  MODIFY `maTT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chi_tiet_hd`
--
ALTER TABLE `chi_tiet_hd`
  ADD CONSTRAINT `fk_chitiethoadon_hoadon` FOREIGN KEY (`maHD`) REFERENCES `hoa_don` (`maHD`),
  ADD CONSTRAINT `fk_chitiethoadon_sach` FOREIGN KEY (`maSach`) REFERENCES `sach` (`maSach`);

--
-- Constraints for table `hoa_don`
--
ALTER TABLE `hoa_don`
  ADD CONSTRAINT `fk_hoadon_thuthu` FOREIGN KEY (`maTT`) REFERENCES `thu_thu` (`maTT`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
