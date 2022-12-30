/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_ja
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:8889
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 28/12/2022 16:52:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
INSERT INTO `crud_message_board` VALUES (1, 'asdf', 'wersfdvc', '23sdf', 'xxx', '2022-11-17 17:02:57', '2022-11-22 17:03:01');
INSERT INTO `crud_message_board` VALUES (2, 'asdf2222', 'wersfdvc2222', '23sdf222', 'xxx', '2022-11-17 17:02:57', '2022-11-22 17:03:01');
INSERT INTO `crud_message_board` VALUES (3, 'hello', 'de le rent ta', 'chuxin', 'january', '2021-05-17 02:02:57', '2022-01-17 11:02:57');
INSERT INTO `crud_message_board` VALUES (4, '世界杯worldcup', 'C罗:若葡萄牙世界杯夺冠我原地退役', '普京', 'february', '2022-11-09 13:59:38', '2022-11-19 13:59:45');
INSERT INTO `crud_message_board` VALUES (5, 'hello帖子名', 'de le rent ta', 'chuxin', 'january', '2021-05-17 02:02:57', '2022-01-17 11:02:57');
INSERT INTO `crud_message_board` VALUES (6, '大国之争', 'aaaad等等', 'gfhdfgh', 'november', '2022-11-11 11:11:11', '2022-11-18 14:28:47');
INSERT INTO `crud_message_board` VALUES (8, '大国之争22', 'aaaad等等', 'gfhdfgh', 'november', '2022-11-11 11:11:11', '2022-12-01 18:25:38');
INSERT INTO `crud_message_board` VALUES (9, '大国之争22', '我的新帖子', 'louis', 'november', '2022-11-11 11:11:11', '2022-12-01 18:25:48');
INSERT INTO `crud_message_board` VALUES (10, '大国之争22', '我的新帖子', 'louis', 'november', '2022-11-11 11:11:11', '2022-12-09 17:44:41');
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

SET FOREIGN_KEY_CHECKS = 1;
