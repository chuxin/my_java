/*
 Navicat Premium Dump SQL

 Source Server         : new_localhost
 Source Server Type    : MySQL
 Source Server Version : 50739 (5.7.39)
 Source Host           : localhost:3306
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 50739 (5.7.39)
 File Encoding         : 65001

 Date: 01/01/2025 16:06:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `total` decimal(10,0) DEFAULT NULL COMMENT '总额度',
  `used` decimal(10,0) DEFAULT NULL COMMENT '已用余额',
  `residue` decimal(10,0) DEFAULT '0' COMMENT '剩余可用额度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
BEGIN;
INSERT INTO `account` (`id`, `user_id`, `total`, `used`, `residue`) VALUES (1, 1, 1000, 600, 400);
COMMIT;

-- ----------------------------
-- Table structure for crud_message_board
-- ----------------------------
DROP TABLE IF EXISTS `crud_message_board`;
CREATE TABLE `crud_message_board` (
  `m_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `author` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of crud_message_board
-- ----------------------------
BEGIN;
INSERT INTO `crud_message_board` (`m_id`, `title`, `content`, `author`, `category`, `create_time`, `updateTime`) VALUES (1, 'asdf', 'wersfdvc', '23sdf', 'xxx', '2022-11-17 17:02:57', '2022-11-22 17:03:01');
INSERT INTO `crud_message_board` (`m_id`, `title`, `content`, `author`, `category`, `create_time`, `updateTime`) VALUES (2, 'asdf2222', 'wersfdvc2222', '23sdf222', 'xxx', '2022-11-17 17:02:57', '2022-11-22 17:03:01');
INSERT INTO `crud_message_board` (`m_id`, `title`, `content`, `author`, `category`, `create_time`, `updateTime`) VALUES (3, 'hello', 'de le rent ta', 'chuxin', 'january', '2021-05-17 02:02:57', '2022-01-17 11:02:57');
INSERT INTO `crud_message_board` (`m_id`, `title`, `content`, `author`, `category`, `create_time`, `updateTime`) VALUES (4, '世界杯worldcup', 'C罗:若葡萄牙世界杯夺冠我原地退役', '普京', 'february', '2022-11-09 13:59:38', '2022-11-19 13:59:45');
INSERT INTO `crud_message_board` (`m_id`, `title`, `content`, `author`, `category`, `create_time`, `updateTime`) VALUES (5, 'hello帖子名', 'de le rent ta', 'chuxin', 'january', '2021-05-17 02:02:57', '2022-01-17 11:02:57');
INSERT INTO `crud_message_board` (`m_id`, `title`, `content`, `author`, `category`, `create_time`, `updateTime`) VALUES (6, '大国之争', 'aaaad等等', 'gfhdfgh', 'november', '2022-11-11 11:11:11', '2022-11-18 14:28:47');
INSERT INTO `crud_message_board` (`m_id`, `title`, `content`, `author`, `category`, `create_time`, `updateTime`) VALUES (8, '大国之争22', 'aaaad等等', 'gfhdfgh', 'november', '2022-11-11 11:11:11', '2022-12-01 18:25:38');
INSERT INTO `crud_message_board` (`m_id`, `title`, `content`, `author`, `category`, `create_time`, `updateTime`) VALUES (9, '大国之争22', '我的新帖子', 'louis', 'november', '2022-11-11 11:11:11', '2022-12-01 18:25:48');
INSERT INTO `crud_message_board` (`m_id`, `title`, `content`, `author`, `category`, `create_time`, `updateTime`) VALUES (10, '大国之争22', '我的新帖子', 'louis', 'november', '2022-11-11 11:11:11', '2022-12-09 17:44:41');
COMMIT;

-- ----------------------------
-- Table structure for crud_users
-- ----------------------------
DROP TABLE IF EXISTS `crud_users`;
CREATE TABLE `crud_users` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `passwd` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of crud_users
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for my_user
-- ----------------------------
DROP TABLE IF EXISTS `my_user`;
CREATE TABLE `my_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户 ID',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `status` varchar(255) DEFAULT NULL COMMENT '用户状态',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of my_user
-- ----------------------------
BEGIN;
INSERT INTO `my_user` (`user_id`, `user_name`, `status`) VALUES (1, '小张', '在线');
INSERT INTO `my_user` (`user_id`, `user_name`, `status`) VALUES (2, '小明', '在线');
INSERT INTO `my_user` (`user_id`, `user_name`, `status`) VALUES (3, '小龙', '离线');
INSERT INTO `my_user` (`user_id`, `user_name`, `status`) VALUES (4, '小林', '在线');
INSERT INTO `my_user` (`user_id`, `user_name`, `status`) VALUES (5, '小李', '在线');
COMMIT;

-- ----------------------------
-- Table structure for order22
-- ----------------------------
DROP TABLE IF EXISTS `order22`;
CREATE TABLE `order22` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(200) NOT NULL,
  `user_id` varchar(200) NOT NULL COMMENT '用户id',
  `product_id` varchar(200) NOT NULL COMMENT '产品id',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `money` decimal(11,0) DEFAULT NULL COMMENT '金额',
  `status` int(11) DEFAULT NULL COMMENT '订单状态：0：创建中；1：已完结',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order22
-- ----------------------------
BEGIN;
INSERT INTO `order22` (`id`, `order_id`, `user_id`, `product_id`, `count`, `money`, `status`) VALUES (1, '1-1-20220427204153782', '1', '1', 30, 600, 1);
COMMIT;

-- ----------------------------
-- Table structure for storage
-- ----------------------------
DROP TABLE IF EXISTS `storage`;
CREATE TABLE `storage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) DEFAULT NULL COMMENT '产品id',
  `total` int(11) DEFAULT NULL COMMENT '总库存',
  `used` int(11) DEFAULT NULL COMMENT '已用库存',
  `residue` int(11) DEFAULT NULL COMMENT '剩余库存',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of storage
-- ----------------------------
BEGIN;
INSERT INTO `storage` (`id`, `product_id`, `total`, `used`, `residue`) VALUES (1, 1, 100, 30, 70);
COMMIT;

-- ----------------------------
-- Table structure for studentdemo
-- ----------------------------
DROP TABLE IF EXISTS `studentdemo`;
CREATE TABLE `studentdemo` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of studentdemo
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for testtesttest
-- ----------------------------
DROP TABLE IF EXISTS `testtesttest`;
CREATE TABLE `testtesttest` (
  `aaaa` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `bbbb` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of testtesttest
-- ----------------------------
BEGIN;
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('014aaa72c9ab3d97', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('014aaa72c9ab3d97', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('01585082e38d436d', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('031ac399f795cb87', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('03c82978cefeffb5', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('03c82978cefeffb5', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('03c82978cefeffb5', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('05788141e60a1d0b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('05788141e60a1d0b', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('05b105a1c36a4828', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('05b105a1c36a4828', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('065b55f721babb33', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('065b55f721babb33', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('065b55f721babb33', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('065b55f721babb33', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('076208dca3693d39', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('07b328404623d8c0', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('088056f7a38263e4', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('0cf124ff917b687f', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('0df203aeb69fcdd4', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('0df203aeb69fcdd4', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('0e19b0e179d4db33', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('0e994642584fc7c1', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('0e994642584fc7c1', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('0e994642584fc7c1', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('0f4afd69350000a1', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('0f4afd69350000a1', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('0fdced3aa2ad00e3', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('0fdced3aa2ad00e3', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('116bf8b54529cf49', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('116bf8b54529cf49', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('15e9103b6d3973b3', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('15e9103b6d3973b3', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1653951657a46124', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1653951657a46124', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1653951657a46124', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1653951657a46124', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1717050912cffae5', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1752ec5bafaef46d', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1752ec5bafaef46d', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('183ff44b4b919c5e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1b33cf1a24fb8acd', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1c08f3ba8a8a5145', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1c08f3ba8a8a5145', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1c08f3ba8a8a5145', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1c987bacc6d87fd3', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1ce5ad1b6984926b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1ce5ad1b6984926b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1e97762c4d773190', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('1e97762c4d773190', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('215dc58ace26ed9b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('215dc58ace26ed9b', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('215dc58ace26ed9b', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('215dc58ace26ed9b', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('215dc58ace26ed9b', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2234eef293ee336d', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2234eef293ee336d', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('23abbd1d9acfb51e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('26385a79da4c5fdd', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('290e61c1d9109686', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('290e61c1d9109686', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2ae5344963beedd0', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2b66e6fe4142fe82', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2b66e6fe4142fe82', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2b66e6fe4142fe82', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2b66e6fe4142fe82', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2ca746c1723fc8c2', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2ca746c1723fc8c2', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2cb41db876db17aa', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2cb41db876db17aa', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2cb41db876db17aa', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2cd2e136f86ac5f7', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2d082dc964a4d1c2', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2d082dc964a4d1c2', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2e4484e719799b5e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2e4484e719799b5e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2e4484e719799b5e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2e4c61a44244bb3d', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('2e4c61a44244bb3d', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3150a26bed3a9212', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3150a26bed3a9212', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('31bdb633a2ff581a', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('334e82924168a653', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('334e82924168a653', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('334e82924168a653', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('334e82924168a653', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('353194cdc8b1683b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('353194cdc8b1683b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('36070cd2e88d6c36', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('36070cd2e88d6c36', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('371ba1d0eb194b5a', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('37a1a26460c783c8', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('37a1a26460c783c8', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('37a1a26460c783c8', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3922aa1bb5740e9c', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3bd04f1ed8470c0f', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3bd04f1ed8470c0f', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3bf7c12a6c588eb2', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3bf7c12a6c588eb2', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3c01a45c58d03e01', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3c81d32184ee4971', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3c840ef83bc90351', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3e745a9a6e165626', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3e745a9a6e165626', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('3e745a9a6e165626', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('402e9a7ba1d68b19', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('402e9a7ba1d68b19', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('402e9a7ba1d68b19', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('402e9a7ba1d68b19', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('41a33afcbb1347cf', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('41a33afcbb1347cf', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('428b34c03a70ba2e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('428b34c03a70ba2e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('428b34c03a70ba2e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('428b34c03a70ba2e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('42df92680fecc267', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('42df92680fecc267', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('432552fa7ef64702', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('432552fa7ef64702', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('4326f2aafd61655b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('434d34576588139e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('434d34576588139e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('48890d0fcc42449b', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('499e0b0982c8a76e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('499e0b0982c8a76e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('4cf0481496940127', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('4ef35033f6586468', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('4f11a021f241b1b6', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('4f11a021f241b1b6', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('4f11a021f241b1b6', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('4f11a021f241b1b6', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('4fdcff3cfbd129ee', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('519f647c9bc8f0be', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('51f503ea22a0d89a', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('51f503ea22a0d89a', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('52409c8c2452d78d', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('52409c8c2452d78d', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('52409c8c2452d78d', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('52d96f8dbc7f5ecd', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('52d96f8dbc7f5ecd', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('52d96f8dbc7f5ecd', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('54833b7de7ec08ff', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('54833b7de7ec08ff', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('5501fc668948dfa4', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('5501fc668948dfa4', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('56f7c034b6be2502', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('56f7c034b6be2502', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('5d3cfb76a1e04709', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('5d3cfb76a1e04709', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('5d3cfb76a1e04709', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('5dfde2a89bca3add', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('5e99f3e890721387', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('5e99f3e890721387', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('5ff27a50742bdca5', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('5ff27a50742bdca5', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('60da919cb3d2d9a9', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('60da919cb3d2d9a9', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('63831a14986c1b26', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('638e757d9820ac48', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('638e757d9820ac48', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('63fb6b3137381001', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('64d781c2515d7a16', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('65dec45a75a5ffc1', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('65dec45a75a5ffc1', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6747248eca8b9d92', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6747248eca8b9d92', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('68dcc0babc413eaf', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('68dcc0babc413eaf', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('68fa805165d746c5', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('68fa805165d746c5', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('68fa805165d746c5', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('69eeec6224341eb0', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6cabce6e47871e5e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6cabce6e47871e5e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6cabce6e47871e5e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6cabce6e47871e5e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6e75d940b4f2afbd', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('6ed3fcd2d101cbbf', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('70bae79bcb9e4907', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('70bae79bcb9e4907', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('70df4860f0a771d7', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('70df4860f0a771d7', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('71a1abc1e0c0a16b', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('71a1abc1e0c0a16b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('73741f33996e3b11', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('754c33f6f77e74f9', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('754c33f6f77e74f9', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('764e85b6ee2006c3', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('76ad1fcb0ff8b0ec', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('76ad1fcb0ff8b0ec', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('77e58ab3730a4746', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('78b863e86720104d', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('7933dfcfa72d1d0b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('7a2e8e4dd40c7a07', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('7c034c2cb248c9a3', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('7c034c2cb248c9a3', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('7ec671d892bc3770', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('7ec671d892bc3770', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('83082637a88fc1e5', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('83082637a88fc1e5', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('84f86a251c9a1521', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('852a1dfd372acad8', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('852a1dfd372acad8', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('871023fa34b5ab98', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('871023fa34b5ab98', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('87740b6ba1f7dcc2', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('8945be896ced6774', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('8945be896ced6774', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('8af946f5e3b97be7', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('8af946f5e3b97be7', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('8b9787a408c3df27', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('8d90cf3459918ccd', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('8d90cf3459918ccd', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('8eb9a7eb00cb0662', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('8eb9a7eb00cb0662', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('8f0a78dd5c60a8eb', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('9059cc6fd95505ce', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('9591dd2241472402', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('9661ddd7438aa8d8', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('9855cdb8e9ad1da4', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('9855cdb8e9ad1da4', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('98c883d681d9d34c', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('98de7c63679e094d', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('98de7c63679e094d', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('9ccf9b48162aea22', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('9ccf9b48162aea22', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('9dc0e37c8f72b4f1', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('9dc0e37c8f72b4f1', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('9dc0e37c8f72b4f1', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('9dc0e37c8f72b4f1', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a078511bb9de1bba', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a078511bb9de1bba', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a078511bb9de1bba', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a078511bb9de1bba', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a1944f0dc572de9d', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a1944f0dc572de9d', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a40da04af1b969ba', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a40da04af1b969ba', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a5a23ed8c021b8b4', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a5a23ed8c021b8b4', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a5bdcf8a2239d545', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a5bdcf8a2239d545', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a5bdcf8a2239d545', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a5bdcf8a2239d545', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a5bdcf8a2239d545', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a5bdcf8a2239d545', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a7a6d50556df30b1', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a7b0be206cf7b136', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a81ab2a651789e8c', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('a81ab2a651789e8c', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('aa17d5c8aa119a91', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ab2fb33ca5b8117b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('abc51405e81c9522', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ac1fca96144f769d', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('accd31bc7bcd5d22', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('acce275e7d9caa6a', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ad46a47108096c91', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ad46a47108096c91', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b086635ac1aa7c5e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b086635ac1aa7c5e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b3d97b645c99467e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b3d97b645c99467e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b41850388770d4b1', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b41850388770d4b1', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b599e95ccbd8dcc7', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b599e95ccbd8dcc7', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b599e95ccbd8dcc7', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b599e95ccbd8dcc7', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b5e7ec86c52940a0', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b5e7ec86c52940a0', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('b5e7ec86c52940a0', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('be194299f608861e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('be194299f608861e', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('bec5e37f82939b4c', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('bec5e37f82939b4c', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('bf8c40d41fe4be88', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c076b86a411571b3', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c076b86a411571b3', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c076b86a411571b3', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c17e4ca6c9ed1e8b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c17e4ca6c9ed1e8b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c1b42f74e9a4a46b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c1e9795c6859bf86', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c28624737efd9e82', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c2a507802e6ca4ad', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c8842b12a0c00f4d', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c8c4650e6f284fa9', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('c8c4650e6f284fa9', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ca988c2443aa99ec', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ca988c2443aa99ec', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('caaf78fb12054668', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('caaf78fb12054668', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('caaf78fb12054668', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('caaf78fb12054668', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('cd637982ebe71fdc', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('cd637982ebe71fdc', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ce9934e995441a07', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ce9934e995441a07', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d0b38d93e71a4925', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d0e724b85c5371a0', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d18a342a75bbf42e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d18a342a75bbf42e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d18a342a75bbf42e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d18a342a75bbf42e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d18a342a75bbf42e', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d2ae2e7610bab442', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d2dee8e7902e530c', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d2dee8e7902e530c', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d2dee8e7902e530c', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d3e3c1cabea135b8', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d3e3c1cabea135b8', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d3e3c1cabea135b8', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d46765e1a6fca612', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('d4c78b52c2191b44', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('dac6c11f6a1749c9', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('dac6c11f6a1749c9', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('dc7261dba5012e54', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('dcc658eaef0388b7', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('dcc658eaef0388b7', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('e03dce4ac026290b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('e03dce4ac026290b', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('e03dce4ac026290b', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('e03dce4ac026290b', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('e111318d98d765c4', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('e1af173b958ad39b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('e1fec25e3d65a065', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('e1fec25e3d65a065', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('e353b326d4053cfe', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ea4d579c3a6724e4', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ea4d579c3a6724e4', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('eaee5e15dd724790', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ebf2d7b5b0f330af', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('eea2a573e52ecd5a', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('eea2a573e52ecd5a', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f16cdfdaeb80543f', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f16cdfdaeb80543f', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f189d7faa3a70550', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f287a914555e4bda', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f3b1bd76f0ce2e7a', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f40557de2ad53b0c', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f40557de2ad53b0c', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f40557de2ad53b0c', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f5a5c954527537f3', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f75d31cb7d233196', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f75d31cb7d233196', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f75d31cb7d233196', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f75d31cb7d233196', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f7bd268cbd1b2416', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f7bd268cbd1b2416', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f7bd268cbd1b2416', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f8437ba7e208ad3a', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f8437ba7e208ad3a', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f8437ba7e208ad3a', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f86a0949cf6f5efc', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f87003914c56f87b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('f87003914c56f87b', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('fa1aee3356575809', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('fa1aee3356575809', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('fcdb70089c19fed0', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('fcdb70089c19fed0', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('fd2db56da5a509d9', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ff670f7d14ead000', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ff670f7d14ead000', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ff670f7d14ead000', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ff670f7d14ead000', 'SUCCESS');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('ffede88b081d0809', 'FAIL');
INSERT INTO `testtesttest` (`aaaa`, `bbbb`) VALUES ('stevehkeston_hid', 'FAIL');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户 ID',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `status` varchar(255) DEFAULT NULL COMMENT '用户状态',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for website
-- ----------------------------
DROP TABLE IF EXISTS `website`;
CREATE TABLE `website` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT '',
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT '',
  `age` int(11) DEFAULT '0',
  `country` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT '',
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of website
-- ----------------------------
BEGIN;
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
