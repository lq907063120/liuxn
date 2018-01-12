/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : liuxn

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 11/01/2018 21:09:28
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cmsUser
-- ----------------------------
DROP TABLE IF EXISTS `cmsUser`;
CREATE TABLE `cmsUser` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `vcloginname` varchar(32) COLLATE utf8_croatian_ci DEFAULT NULL,
  `vcloginpwd` varchar(32) COLLATE utf8_croatian_ci DEFAULT NULL,
  `datcreate` timestamp NULL DEFAULT NULL,
  `datlasttime` timestamp NULL DEFAULT NULL,
  `datupdate` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

SET FOREIGN_KEY_CHECKS = 1;