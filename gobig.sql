/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : gobig

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2020-04-25 20:31:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `aid` int(5) unsigned NOT NULL AUTO_INCREMENT COMMENT '管理者id',
  `admin_account` varchar(10) NOT NULL DEFAULT '' COMMENT '管理员账号',
  `admin_password` varchar(15) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', '1234');

-- ----------------------------
-- Table structure for admincontent
-- ----------------------------
DROP TABLE IF EXISTS `admincontent`;
CREATE TABLE `admincontent` (
  `aid` int(5) unsigned NOT NULL AUTO_INCREMENT COMMENT '管理者id',
  `roles` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `introduction` varchar(50) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`aid`),
  CONSTRAINT `aid` FOREIGN KEY (`aid`) REFERENCES `admin` (`aid`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admincontent
-- ----------------------------
INSERT INTO `admincontent` VALUES ('1', 'admin', 'I am a super administrator', 'https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif', 'Super Admin');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `cid` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `vid` int(10) unsigned DEFAULT NULL COMMENT '评论视频vid',
  `from_uid` int(5) unsigned DEFAULT NULL COMMENT '评论人vid',
  `from_uid_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'root' COMMENT '评论人昵称',
  `content` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '哈哈哈' COMMENT '评论内容',
  `release_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `like_count` int(8) unsigned NOT NULL DEFAULT '1' COMMENT '点赞数',
  `from_uid_figure` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '/img/telegram.png' COMMENT '评论者头像',
  PRIMARY KEY (`cid`),
  KEY `uid4` (`from_uid`) USING BTREE,
  KEY `vid1` (`vid`) USING BTREE,
  CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`from_uid`) REFERENCES `usercontent` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `comment_ibfk_2` FOREIGN KEY (`vid`) REFERENCES `video` (`vid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', '1', '1', 'root', '哈哈哈23333333', '2020-02-26 20:53:21', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('2', '1', '1', 'root', '哈哈哈2333333333333333', '2020-02-26 20:54:00', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('3', '1', '1', 'root', '哈哈哈233333333333333333', '2020-02-26 20:54:02', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('4', '1', '1', 'root', '哈哈哈232', '2020-02-26 20:54:02', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('5', '1', '1', 'root', '哈哈哈233333333', '2020-02-26 20:54:03', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('6', '1', '1', 'root', '哈哈哈3232323', '2020-02-26 20:54:03', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('7', '1', '1', 'root', '哈哈哈232323', '2020-02-26 20:54:03', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('8', '1', '1', 'root', '哈哈哈2323', '2020-02-26 20:54:04', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('9', '1', '1', 'root', '哈哈哈323', '2020-02-26 20:54:05', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('10', '1', '1', 'root', '哈哈哈232', '2020-02-26 22:50:13', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('11', '1', '1', 'root', '哈哈哈232323232323', '2020-02-26 22:50:18', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('12', '1', '1', 'root', '哈哈哈23', '2020-02-26 22:50:19', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('13', '1', '1', 'root', '哈哈哈232323', '2020-02-26 22:50:19', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('14', '1', '1', 'root', '哈哈哈2323', '2020-02-26 22:50:20', '1', '/img/telegram.png');
INSERT INTO `comment` VALUES ('15', '1', '1', 'root', '哈哈哈23232323', '2020-02-26 22:50:20', '1', '/img/telegram.png');

-- ----------------------------
-- Table structure for sort
-- ----------------------------
DROP TABLE IF EXISTS `sort`;
CREATE TABLE `sort` (
  `id` int(3) unsigned NOT NULL AUTO_INCREMENT,
  `sortName` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sortName` (`sortName`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sort
-- ----------------------------
INSERT INTO `sort` VALUES ('1', '动画');
INSERT INTO `sort` VALUES ('5', '数码');
INSERT INTO `sort` VALUES ('3', '游戏');
INSERT INTO `sort` VALUES ('4', '生活');
INSERT INTO `sort` VALUES ('2', '电影');
INSERT INTO `sort` VALUES ('6', '科技');
INSERT INTO `sort` VALUES ('7', '舞蹈');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', '啊啊');
INSERT INTO `test` VALUES ('2', 'asd');
INSERT INTO `test` VALUES ('3', 'asd');
INSERT INTO `test` VALUES ('4', 'asd');
INSERT INTO `test` VALUES ('5', 'asd');
INSERT INTO `test` VALUES ('6', 'asd');
INSERT INTO `test` VALUES ('7', 'asd');
INSERT INTO `test` VALUES ('8', 'asd');
INSERT INTO `test` VALUES ('9', 'asd');
INSERT INTO `test` VALUES ('10', 'asd');
INSERT INTO `test` VALUES ('11', 'asd');
INSERT INTO `test` VALUES ('12', 'asd');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `userAccount` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pwd` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '1234',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `userName` (`userAccount`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'root', '1234');
INSERT INTO `user` VALUES ('2', 'shihegang', '1234');
INSERT INTO `user` VALUES ('7', '1', '1234');
INSERT INTO `user` VALUES ('8', '2', '1234');
INSERT INTO `user` VALUES ('9', '3', '1234');
INSERT INTO `user` VALUES ('10', '4', '1234');
INSERT INTO `user` VALUES ('11', '5', '1234');
INSERT INTO `user` VALUES ('12', '6', '1234');
INSERT INTO `user` VALUES ('13', '7', '1234');
INSERT INTO `user` VALUES ('14', '8', '1234');
INSERT INTO `user` VALUES ('16', '9', '1234');
INSERT INTO `user` VALUES ('17', '10', '1234');
INSERT INTO `user` VALUES ('18', '11', '1234');
INSERT INTO `user` VALUES ('19', '12', '1234');
INSERT INTO `user` VALUES ('20', '13', '1234');
INSERT INTO `user` VALUES ('21', '14', '1234');
INSERT INTO `user` VALUES ('22', '15', '1234');
INSERT INTO `user` VALUES ('23', '16', '1234');
INSERT INTO `user` VALUES ('24', '17', '1234');
INSERT INTO `user` VALUES ('25', '18', '1234');
INSERT INTO `user` VALUES ('26', '19', '1234');
INSERT INTO `user` VALUES ('27', '20', '1234');
INSERT INTO `user` VALUES ('30', '1123123', '1123123');
INSERT INTO `user` VALUES ('31', '123123', '123123');
INSERT INTO `user` VALUES ('32', 'asdasd', 'asd');
INSERT INTO `user` VALUES ('33', 'dawdd12', 'wqeqwe');
INSERT INTO `user` VALUES ('34', 'asdasd12', 'qwe');
INSERT INTO `user` VALUES ('35', 'asdasd232', 'qweq');
INSERT INTO `user` VALUES ('36', 'asd', 'asd');
INSERT INTO `user` VALUES ('37', 'asdasdfff', 'asdasd');
INSERT INTO `user` VALUES ('38', 'asdxzc', 'asdasd');
INSERT INTO `user` VALUES ('39', 'asdascxzvc', 'asdasd');
INSERT INTO `user` VALUES ('40', '12312sad', 'asdasd');
INSERT INTO `user` VALUES ('41', 'asdasdasd', 'asdasdasd2');
INSERT INTO `user` VALUES ('42', 'zxczxczxc', '12321312');
INSERT INTO `user` VALUES ('43', 'adminqweqweqw', 'asdasdasd');
INSERT INTO `user` VALUES ('44', 'adminaasdasd2', '123123');
INSERT INTO `user` VALUES ('45', 'admin', '1234');
INSERT INTO `user` VALUES ('46', 'root12', '1234');

-- ----------------------------
-- Table structure for usercontent
-- ----------------------------
DROP TABLE IF EXISTS `usercontent`;
CREATE TABLE `usercontent` (
  `uid` int(5) unsigned NOT NULL COMMENT '主键',
  `nick_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'gobig' COMMENT '昵称',
  `gender` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '1' COMMENT '性别',
  `signature` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'gobigtonight' COMMENT '签名',
  `figure` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '/gobig/img/ninja.png' COMMENT '头像',
  `birth_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '出生日期',
  `attention_count` int(8) unsigned NOT NULL DEFAULT '0' COMMENT '关注数',
  `fan_count` int(8) unsigned NOT NULL DEFAULT '0' COMMENT '粉丝数',
  `like_count` int(8) unsigned NOT NULL DEFAULT '0' COMMENT '点赞数',
  `view_count` int(8) unsigned NOT NULL DEFAULT '0' COMMENT '播放数',
  PRIMARY KEY (`uid`),
  KEY `nick_name` (`nick_name`),
  CONSTRAINT `uid1` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usercontent
-- ----------------------------
INSERT INTO `usercontent` VALUES ('1', 'root', '1', 'gobigtonight', '/img/02.jpg', '2020-04-10 20:21:31', '233', '233', '233', '233');
INSERT INTO `usercontent` VALUES ('2', 'root2', '0', 'gobigtonight', '/img/ninja.png', '2020-04-10 20:20:35', '233', '233', '233', '233');
INSERT INTO `usercontent` VALUES ('7', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 15:18:28', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('8', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 15:18:31', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('9', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 15:18:32', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('10', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 15:18:35', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('11', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 15:18:37', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('12', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 15:18:42', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('13', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 15:19:05', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('14', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 15:19:06', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('16', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 15:19:12', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('17', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 15:19:16', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('18', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 20:42:20', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('19', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 20:42:25', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('21', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 20:42:26', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('22', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 20:42:28', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('23', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 20:42:29', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('24', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 20:42:31', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('25', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 20:42:32', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('26', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 20:42:34', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('27', 'gobig', '1', 'gobigtonight', '/gobig/img/ninja.png', '2020-04-08 20:42:35', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('31', '123123', '1', '123123', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '2020-04-10 11:40:02', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('34', 'qweqw', '1', 'qweqwe', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '2020-04-10 11:39:59', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('35', 'qwe', '1', 'qwe', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '2020-04-10 11:39:57', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('36', 'asd', '1', 'asdasd', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '2020-04-10 11:39:55', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('37', 'asdasd', '1', 'asdasd', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '2020-04-10 11:39:53', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('38', '12312', '1', '4124', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '2020-04-10 11:39:51', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('39', 'asdasd', '1', '21312sd12', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '2020-04-10 11:39:49', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('40', 'asdasd', '1', 'asdasd', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '2020-04-10 11:39:47', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('41', '123123', '1', '12321', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '2020-04-10 11:39:44', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('42', '123213', '1', '123213123', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '2020-04-10 11:39:41', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('43', 'asdasda', '1', 'asdasdasd', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '2020-04-10 11:39:36', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('44', '123213', '1', '123123', '/upload/figure/1586489921688_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '1970-01-14 00:00:00', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('45', 'asdasdas', '1', 'asdasdasd', '/upload/figure/1586491541385_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '1970-01-06 00:00:00', '0', '0', '0', '0');
INSERT INTO `usercontent` VALUES ('46', 'asdasd', '1', 'asdasd', '/upload/figure/1586491716570_v2-34dcc59a3639fc89d0d007d4c3363751_720w.jpg', '1970-01-13 00:00:00', '0', '0', '0', '0');

-- ----------------------------
-- Table structure for uservideocollect
-- ----------------------------
DROP TABLE IF EXISTS `uservideocollect`;
CREATE TABLE `uservideocollect` (
  `id` int(8) unsigned NOT NULL AUTO_INCREMENT,
  `uid` int(5) unsigned DEFAULT NULL,
  `vid` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `c_uid` (`uid`),
  KEY `c_vid` (`vid`),
  CONSTRAINT `c_uid` FOREIGN KEY (`uid`) REFERENCES `usercontent` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `c_vid` FOREIGN KEY (`vid`) REFERENCES `video` (`vid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uservideocollect
-- ----------------------------

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `vid` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '评论视频uid',
  `title` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '我是标题，最多两行，最多30个字我是标题' COMMENT '题目',
  `uid` int(5) unsigned NOT NULL DEFAULT '1' COMMENT '作者id',
  `author` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'root' COMMENT '作者昵称',
  `introduction` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '介绍',
  `sort_name` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '动画' COMMENT '分类',
  `release_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '发布时间',
  `view_count` int(8) unsigned DEFAULT '1' COMMENT '观看数',
  `comment_count` int(8) unsigned DEFAULT '1' COMMENT '评论数',
  `collect_count` int(8) unsigned DEFAULT '1' COMMENT '收藏数',
  `pic` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '/img/03.jpg' COMMENT '预览图',
  `video_res` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '/video/1.mp4' COMMENT '视频存储地址',
  `v_score` int(8) unsigned DEFAULT '1' COMMENT '视频得分',
  PRIMARY KEY (`vid`),
  KEY `sort_name` (`sort_name`) USING BTREE,
  KEY `uid2` (`uid`) USING BTREE,
  CONSTRAINT `video_ibfk_1` FOREIGN KEY (`sort_name`) REFERENCES `sort` (`sortname`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `video_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `usercontent` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of video
-- ----------------------------
INSERT INTO `video` VALUES ('1', 'NEWMEDIA宣传视频', '1', 'root', 'rootVideoooooooooooooooooooooooooo', '动画', '2020-04-13 15:34:34', '123', '123', '1123', '/img/03.jpg', '/video/1.mp4', '112300000');
INSERT INTO `video` VALUES ('2', '我是标题，最多两行，最多30个字我是标题', '1', 'root', 'woowowowowoowowowoow', '动画', '2020-03-23 23:04:43', '1', '1', '1', '/img/04.jpg', '/video/2.mp4', '112222222');
INSERT INTO `video` VALUES ('3', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '撒打算打算打算打算打算打算打算打算打算打算打算打算打算', '动画', '2020-03-23 23:05:49', '1', '1', '1', '/upload/videoPic/1586849833100_06.jpg', '/video/3.mp4', '111667865');
INSERT INTO `video` VALUES ('4', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:27:38', '1', '123', '1', '/img/02.jpg', '/video/4.mp4', '112229999');
INSERT INTO `video` VALUES ('5', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:05:30', '1', '1123', '1', '/img/03.jpg', '/video/5.mp4', '111324566');
INSERT INTO `video` VALUES ('6', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:05:24', '1', '123', '1', '/img/05.jpg', '/video/6.mp4', '111313333');
INSERT INTO `video` VALUES ('7', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:05:14', '1', '1312', '1', '/img/02.jpg', '/video/7.mp4', '111111111');
INSERT INTO `video` VALUES ('8', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:07:40', '1', '1123', '1', '/img/05.jpg', '/video/8_模糊版.mp4', '112222227');
INSERT INTO `video` VALUES ('9', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:07:44', '1', '1', '1', '/img/04.jpg', '/video/9_清晰版.mp4', '112222226');
INSERT INTO `video` VALUES ('10', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:08:14', '1', '1123', '1', '/img/01.jpg', '/video/10.mp4', '112222225');
INSERT INTO `video` VALUES ('11', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:07:50', '1', '1', '1', '/img/06.jpg', '/video/11.mp4', '112222224');
INSERT INTO `video` VALUES ('12', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:07:57', '1', '13', '1', '/img/03.jpg', '/video/12.mp4', '112222223');
INSERT INTO `video` VALUES ('23', 'rootVideo', '1', 'root', 'rootVideoooooooooooooooooooooooooo', '动画', '2020-03-23 23:25:25', '123', '12339', '1123', '/img/03.jpg', '/video/4.mp4', '1123');
INSERT INTO `video` VALUES ('24', '我是标题，最多两行，最多30个字我是标题', '1', 'root', 'woowowowowoowowowoow', '动画', '2020-02-26 20:27:58', '1', '19', '1', '/img/04.jpg', '/video/1.mp4', '16');
INSERT INTO `video` VALUES ('25', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:25:26', '1', '13568', '1', '/img/01.jpg', '/video/4.mp4', '1486');
INSERT INTO `video` VALUES ('26', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-26 20:27:53', '1', '13', '1', '/img/02.jpg', '/video/1.mp4', '8');
INSERT INTO `video` VALUES ('27', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:26:16', '1', '1', '1', '/img/03.jpg', '/video/4.mp4', '146486');
INSERT INTO `video` VALUES ('28', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:25:28', '1', '1', '1', '/img/05.jpg', '/video/4.mp4', '1486');
INSERT INTO `video` VALUES ('29', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-26 20:27:58', '1', '154', '1', '/img/02.jpg', '/video/1.mp4', '486');
INSERT INTO `video` VALUES ('30', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:26:12', '1', '1123', '1', '/img/02.jpg', '/video/4.mp4', '148');
INSERT INTO `video` VALUES ('31', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '电影', '2020-03-23 23:26:18', '1', '1543', '1', '/img/02.jpg', '/video/4.mp4', '6');
INSERT INTO `video` VALUES ('32', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '电影', '2020-02-26 17:17:05', '1', '1', '1', '/img/02.jpg', '/video/1.mp4', '48');
INSERT INTO `video` VALUES ('33', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '电影', '2020-03-23 23:25:34', '1', '8', '1', '/img/02.jpg', '/video/4.mp4', '1486');
INSERT INTO `video` VALUES ('34', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '电影', '2020-02-26 20:27:59', '1', '8', '1', '/img/02.jpg', '/video/1.mp4', '6');
INSERT INTO `video` VALUES ('35', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '电影', '2020-03-23 23:25:58', '1', '8', '1', '/img/03.jpg', '/video/4.mp4', '16');
INSERT INTO `video` VALUES ('36', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:25:38', '1', '13', '1', '/img/03.jpg', '/video/4.mp4', '1486');
INSERT INTO `video` VALUES ('37', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-26 20:27:55', '1', '112', '1', '/img/03.jpg', '/video/1.mp4', '48');
INSERT INTO `video` VALUES ('38', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:25:40', '1', '8456', '1', '/img/03.jpg', '/video/4.mp4', '1486486');
INSERT INTO `video` VALUES ('39', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:25:42', '1', '8456', '1', '/img/03.jpg', '/video/4.mp4', '486');
INSERT INTO `video` VALUES ('40', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-26 20:27:59', '1', '123354', '1', '/img/03.jpg', '/video/1.mp4', '186');
INSERT INTO `video` VALUES ('41', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:25:44', '1', '123', '1', '/img/03.jpg', '/video/4.mp4', '148');
INSERT INTO `video` VALUES ('42', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:26:09', '1', '1', '1', '/img/03.jpg', '/video/4.mp4', '6');
INSERT INTO `video` VALUES ('43', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-26 20:28:00', '1', '143', '1', '/img/03.jpg', '/video/1.mp4', '148');
INSERT INTO `video` VALUES ('44', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:25:45', '1', '3123', '1', '/img/03.jpg', '/video/4.mp4', '148');
INSERT INTO `video` VALUES ('45', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-26 20:27:56', '1', '3123', '1', '/img/03.jpg', '/video/1.mp4', '1486');
INSERT INTO `video` VALUES ('46', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-25 11:38:40', '1', '1', '1', '/img/03.jpg', '/video/1.mp4', '668789');
INSERT INTO `video` VALUES ('47', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-25 11:38:42', '1', '1', '1', '/img/03.jpg', '/video/1.mp4', '66');
INSERT INTO `video` VALUES ('48', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:25:55', '1', '345', '1', '/img/03.jpg', '/video/4.mp4', '48');
INSERT INTO `video` VALUES ('49', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:26:01', '1', '1', '1', '/img/03.jpg', '/video/4.mp4', '178978');
INSERT INTO `video` VALUES ('50', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-26 20:28:01', '1', '12', '1', '/img/03.jpg', '/video/1.mp4', '1789');
INSERT INTO `video` VALUES ('51', '12312312312', '1', 'root', '', '动画', '2020-02-25 11:38:46', '1', '1', '1', '/img/03.jpg', '/video/1.mp4', '189');
INSERT INTO `video` VALUES ('52', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:25:48', '1', '1', '1', '/img/03.jpg', '/video/4.mp4', '1');
INSERT INTO `video` VALUES ('53', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-25 11:38:47', '1', '1', '1', '/img/03.jpg', '/video/1.mp4', '1');
INSERT INTO `video` VALUES ('54', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:26:05', '1', '1', '1', '/img/03.jpg', '/video/4.mp4', '1789');
INSERT INTO `video` VALUES ('55', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-25 11:38:48', '1', '1', '1', '/img/03.jpg', '/video/1.mp4', '178978');
INSERT INTO `video` VALUES ('56', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:26:03', '1', '1', '1', '/img/03.jpg', '/video/4.mp4', '17678');
INSERT INTO `video` VALUES ('57', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-25 11:38:50', '1', '1', '1', '/img/03.jpg', '/video/1.mp4', '1');
INSERT INTO `video` VALUES ('58', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-25 11:38:51', '1', '1', '1', '/img/03.jpg', '/video/1.mp4', '1');
INSERT INTO `video` VALUES ('59', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-25 11:38:51', '1', '1', '1', '/img/03.jpg', '/video/1.mp4', '1');
INSERT INTO `video` VALUES ('60', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:25:50', '1', '1', '1', '/img/03.jpg', '/video/4.mp4', '1');
INSERT INTO `video` VALUES ('61', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-25 11:38:52', '1', '1', '1', '/img/03.jpg', '/video/1.mp4', '1');
INSERT INTO `video` VALUES ('62', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:25:52', '1', '1', '1', '/img/03.jpg', '/video/4.mp4', '1');
INSERT INTO `video` VALUES ('63', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-25 11:38:54', '1', '1', '1', '/img/03.jpg', '/video/1.mp4', '1');
INSERT INTO `video` VALUES ('64', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-03-23 23:26:07', '1', '1', '1', '/img/03.jpg', '/video/4.mp4', '1');
INSERT INTO `video` VALUES ('65', '我是标题，最多两行，最多30个字我是标题', '1', 'root', '', '动画', '2020-02-25 11:38:56', '1', '1', '1', '/img/03.jpg', '/video/1.mp4', '1');
INSERT INTO `video` VALUES ('68', '1', '1', 'root', '222', '游戏', '1970-01-19 00:00:00', '0', '0', '0', 'blob:http://localhost:9528/9325f48f-c95e-48e7-89c1-3aad7aa14a8c', 'blob:http://localhost:9528/6865b543-f083-42ec-9cac-3c21f229f513', '0');
INSERT INTO `video` VALUES ('69', '1', '1', 'root', '222', '游戏', '1970-01-19 00:00:00', '0', '0', '0', '/upload/videoPic/1586783992691_01.jpg', '/upload/video/1586783992691_1.mp4', '0');
INSERT INTO `video` VALUES ('70', 'asdasd', '1', 'root', 'asdasd', '数码', '1970-01-05 00:00:00', '0', '0', '0', '/upload/videoPic/1586784046246_404img.png', '/upload/video/1586784046246_1.mp4', '0');
INSERT INTO `video` VALUES ('71', '2313', '1', 'root', 'asdsad', '科技', '1970-01-15 00:00:00', '0', '0', '0', '/upload/videoPic/1586784586477_01.jpg', '/upload/video/1586784586477_1.mp4', '0');
INSERT INTO `video` VALUES ('72', 'asdas', '1', 'root', 'sadasd', '科技', '1970-01-02 00:00:00', '0', '0', '0', '/upload/videoPic/1586784791808_05.jpg', '/upload/video/1586784791808_1.mp4', '0');
INSERT INTO `video` VALUES ('73', '12312', '1', 'root', '1232123', '游戏', '1970-01-12 00:00:00', '0', '0', '0', '/upload/videoPic/1586785319147_01.jpg', '/upload/video/1586785319147_1.mp4', '0');
INSERT INTO `video` VALUES ('74', '啊实打实', '1', 'root', '啊实打实的', '数码', '1970-01-21 00:00:00', '0', '0', '0', '/upload/videoPic/1586785834972_02.jpg', '/upload/video/1586785834972_1.mp4', '0');
INSERT INTO `video` VALUES ('75', '实打实的撒', '1', 'root', '123123', '科技', '2020-04-13 21:55:53', '0', '0', '0', '/upload/videoPic/1586786174199_01.jpg', '/upload/video/1586786174199_1.mp4', '0');
INSERT INTO `video` VALUES ('76', '自行车自行车在线', '1', 'root', '21312', '游戏', '2020-04-13 21:57:06', '0', '0', '0', '/upload/videoPic/1586786248172_06.jpg', '/upload/video/1586786248172_1.mp4', '0');
INSERT INTO `video` VALUES ('77', '洒洒水', '1', 'root', '213123', '科技', '2020-04-13 21:58:40', '0', '0', '0', '/upload/videoPic/1586786342698_01.jpg', '/upload/video/1586786342698_1.mp4', '0');
INSERT INTO `video` VALUES ('78', '12312', '1', 'root', '123123', '游戏', '2020-04-13 22:02:06', '0', '0', '0', '/upload/videoPic/1586786545894_01.jpg', '/upload/video/1586786545894_1.mp4', '0');
INSERT INTO `video` VALUES ('79', '21312', '1', 'root', '123123', '游戏', '2020-04-13 22:02:38', '0', '0', '0', '/upload/videoPic/1586786582335_01.jpg', '/upload/video/1586786582335_1.mp4', '0');
INSERT INTO `video` VALUES ('80', '1', '1', 'root', '213', '舞蹈', '2020-04-13 22:08:06', '0', '0', '0', '/upload/videoPic/1586786936126_01.jpg', '/upload/video/1586786936126_1.mp4', '0');
