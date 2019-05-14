-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 14, 2019 at 06:10 PM
-- Server version: 10.1.39-MariaDB
-- PHP Version: 7.1.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sipijar`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_kemahasiswaan`
--

CREATE TABLE `t_kemahasiswaan` (
  `id` varchar(12) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_kemahasiswaan`
--

INSERT INTO `t_kemahasiswaan` (`id`, `password`, `nama`) VALUES
('123412341234', 'dadang', 'dadang');

-- --------------------------------------------------------

--
-- Table structure for table `t_mahasiswa`
--

CREATE TABLE `t_mahasiswa` (
  `id` varchar(9) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_mahasiswa`
--

INSERT INTO `t_mahasiswa` (`id`, `password`, `nama`) VALUES
('151351055', 'endang', 'Endang Sutarma'),
('151351074', 'fajar', 'Fajar'),
('151351080', 'gilang', 'Gilang Perdana'),
('151351091', 'hendrat', 'Hendrat Hasan');

-- --------------------------------------------------------

--
-- Table structure for table `t_peminjaman`
--

CREATE TABLE `t_peminjaman` (
  `id_peminjaman` int(11) NOT NULL,
  `id_peminjam` int(11) NOT NULL,
  `nama_peminjam` varchar(50) NOT NULL,
  `tgl_post` date DEFAULT NULL,
  `nama_ruangan` varchar(50) NOT NULL,
  `tgl_pinjam` varchar(10) NOT NULL,
  `waktu_pinjam` varchar(10) DEFAULT NULL,
  `kebutuhan_pinjam` text NOT NULL,
  `kapasitas_pinjam` int(11) NOT NULL,
  `status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_peminjaman`
--

INSERT INTO `t_peminjaman` (`id_peminjaman`, `id_peminjam`, `nama_peminjam`, `tgl_post`, `nama_ruangan`, `tgl_pinjam`, `waktu_pinjam`, `kebutuhan_pinjam`, `kapasitas_pinjam`, `status`) VALUES
(7, 151351074, 'Fajar', '2018-12-07', 'Ruang 20', '2018-12-14', '10.00', 'Rapat Tabligh Akbar', 13, 'Disetujui'),
(8, 151351074, 'Fajar', '2018-12-07', 'Ruang 14', '2018-12-15', '11.00', 'Rapat BEM', 14, 'Belum Disetujui'),
(9, 151351074, 'Fajar', '2018-12-22', 'Ruang 7', '25/12/2018', '14.00', 'Kegiatan Belajar Tambahan', 15, 'Belum Disetujui'),
(10, 151351074, 'Fajar', '2018-12-22', 'Ruang 3', '25/12/2018', '09.00', 'Persiapan seminar internasional di kampus kita', 20, 'Disetujui'),
(11, 151351074, 'Fajar', '2018-12-22', 'Ruang 5', '26/12/2018', '10.00', 'Rapat Pengurus BEM', 10, 'Belum Disetujui'),
(12, 151351074, 'Fajar', '2018-12-22', 'Ruang 18', '29/12/2018', '08.00', 'Rapat Himpunan', 15, 'Disetujui'),
(14, 151351055, 'Endang Sutarma', '2018-12-22', 'Ruang 7', '26/12/2018', '13.00', 'Rapat1', 19, 'Disetujui'),
(15, 151351055, 'Endang Sutarma', '2018-12-22', 'Ruang 10', '30/12/2018', '19.00', 'Pengajian', 20, 'Belum Disetujui'),
(16, 151351055, 'Endang Sutarma', '2018-12-22', 'Ruang 11', '31/12/2018', '14.00', 'Rapat2', 20, 'Belum Disetujui'),
(17, 151351055, 'Endang Sutarma', '2018-12-22', 'Ruang 1', '27/12/2018', '09.00', 'Rapat3', 6, 'Disetujui'),
(18, 151351055, 'Endang Sutarma', '2018-12-23', 'Ruang 19', '01/01/2019', '09.00', 'Rapat Persiapan Tabligh Akbar 2019', 20, 'Belum Disetujui'),
(19, 151351074, 'Fajar', '2019-05-14', 'Ruang 3', '15/05/2019', '13.00', 'rapat anggota himpunan Humanika', 25, 'Disetujui');

-- --------------------------------------------------------

--
-- Table structure for table `t_ruangan`
--

CREATE TABLE `t_ruangan` (
  `kd_ruangan` varchar(4) NOT NULL,
  `nama_ruangan` varchar(50) NOT NULL,
  `kapasitas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_ruangan`
--

INSERT INTO `t_ruangan` (`kd_ruangan`, `nama_ruangan`, `kapasitas`) VALUES
('R01', 'Ruang 01', 15),
('R02', 'Ruang 02', 25),
('R03', 'Ruang 03', 20),
('R04', 'Ruang 04', 30),
('R05', 'Ruang 05', 28),
('R06', 'Ruang 06', 17),
('R07', 'Ruang 07', 24),
('R08', 'Ruang 08', 25),
('R09', 'Ruang 09', 20),
('R10', 'Ruang 10', 30),
('R11', 'Ruang 11', 24),
('R14', 'Ruang 14', 35),
('R18', 'Ruang 18', 25),
('R19', 'Ruang 19', 20),
('R20', 'Ruang 20', 30);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_kemahasiswaan`
--
ALTER TABLE `t_kemahasiswaan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `t_mahasiswa`
--
ALTER TABLE `t_mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `t_peminjaman`
--
ALTER TABLE `t_peminjaman`
  ADD PRIMARY KEY (`id_peminjaman`);

--
-- Indexes for table `t_ruangan`
--
ALTER TABLE `t_ruangan`
  ADD PRIMARY KEY (`kd_ruangan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t_peminjaman`
--
ALTER TABLE `t_peminjaman`
  MODIFY `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
