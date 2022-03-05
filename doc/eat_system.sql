/*
 Navicat Premium Data Transfer

 Source Server         : localhost_mysql
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : eat_system

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 05/03/2022 19:46:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_collect
-- ----------------------------
DROP TABLE IF EXISTS `tb_collect`;
CREATE TABLE `tb_collect`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户主键',
  `food_id` int(11) NOT NULL COMMENT '食物主键',
  `create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_name`(`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_collect
-- ----------------------------
INSERT INTO `tb_collect` VALUES (1, 2, 1, '2022-01-30 16:09:29');
INSERT INTO `tb_collect` VALUES (3, 2, 1, '2022-01-30 16:11:30');
INSERT INTO `tb_collect` VALUES (4, 2, 1, '2022-01-30 16:18:09');
INSERT INTO `tb_collect` VALUES (5, 2, 1, '2022-01-30 16:55:39');
INSERT INTO `tb_collect` VALUES (6, 2, 1, '2022-01-30 16:57:02');
INSERT INTO `tb_collect` VALUES (7, 2, 1, '2022-01-30 16:57:09');
INSERT INTO `tb_collect` VALUES (8, 2, 1, '2022-01-30 16:58:53');
INSERT INTO `tb_collect` VALUES (9, 2, 1, '2022-01-30 18:25:50');
INSERT INTO `tb_collect` VALUES (10, 2, 1, '2022-02-01 16:47:17');
INSERT INTO `tb_collect` VALUES (11, 2, 1, '2022-02-01 16:47:23');
INSERT INTO `tb_collect` VALUES (12, 2, 5, '2022-02-01 16:47:27');

-- ----------------------------
-- Table structure for tb_comment
-- ----------------------------
DROP TABLE IF EXISTS `tb_comment`;
CREATE TABLE `tb_comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_id` int(11) NOT NULL COMMENT '用户主键',
  `food_id` int(11) NOT NULL COMMENT '食物主键',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `avatar_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_name`(`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_comment
-- ----------------------------
INSERT INTO `tb_comment` VALUES (1, '北京烤鸭，果木炭火烤制，色泽红润，肉质肥而不腻。', 2, 1, '2022-01-30 17:23:08', '张三', 'https://thirdwx.qlogo.cn/mmopen/vi_32/6e98Diah8ykFAicM209B9gpxOQpia4fibMQjhndc22OJ3ZsAjpj0iaBF2MHS3KnK8RmFEOkbPcxYbKmEzjlKsIjuDPg/132');
INSERT INTO `tb_comment` VALUES (2, '北京烤鸭，真吉尔好吃，大家都来吃哇！！', 2, 1, '2022-01-31 15:46:24', '张三', 'https://thirdwx.qlogo.cn/mmopen/vi_32/6e98Diah8ykFAicM209B9gpxOQpia4fibMQjhndc22OJ3ZsAjpj0iaBF2MHS3KnK8RmFEOkbPcxYbKmEzjlKsIjuDPg/132');
INSERT INTO `tb_comment` VALUES (3, 'avatar_url 是固定费规范的', 2, 1, '2022-01-31 15:47:51', '张三', 'https://thirdwx.qlogo.cn/mmopen/vi_32/6e98Diah8ykFAicM209B9gpxOQpia4fibMQjhndc22OJ3ZsAjpj0iaBF2MHS3KnK8RmFEOkbPcxYbKmEzjlKsIjuDPg/132');
INSERT INTO `tb_comment` VALUES (4, '回复@张三: 的覆盖和对方', 2, 1, '2022-01-31 15:48:36', '张三', 'https://thirdwx.qlogo.cn/mmopen/vi_32/6e98Diah8ykFAicM209B9gpxOQpia4fibMQjhndc22OJ3ZsAjpj0iaBF2MHS3KnK8RmFEOkbPcxYbKmEzjlKsIjuDPg/132');
INSERT INTO `tb_comment` VALUES (5, '点返回键风光大嫁洋河股份', 2, 1, '2022-01-31 15:57:26', '张三', 'https://thirdwx.qlogo.cn/mmopen/vi_32/6e98Diah8ykFAicM209B9gpxOQpia4fibMQjhndc22OJ3ZsAjpj0iaBF2MHS3KnK8RmFEOkbPcxYbKmEzjlKsIjuDPg/132');
INSERT INTO `tb_comment` VALUES (6, 'he然后人体', 2, 5, '2022-01-31 16:44:39', '张三', 'https://thirdwx.qlogo.cn/mmopen/vi_32/6e98Diah8ykFAicM209B9gpxOQpia4fibMQjhndc22OJ3ZsAjpj0iaBF2MHS3KnK8RmFEOkbPcxYbKmEzjlKsIjuDPg/132');

-- ----------------------------
-- Table structure for tb_food
-- ----------------------------
DROP TABLE IF EXISTS `tb_food`;
CREATE TABLE `tb_food`  (
  `food_id` int(11) NOT NULL AUTO_INCREMENT,
  `food_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `food_cal` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `taste` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `location` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `recorde` int(11) NULL DEFAULT NULL,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `user_id` int(11) NOT NULL COMMENT '创建用户主键',
  `img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '食物图片',
  `info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '食物描述',
  `canteen` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '食堂',
  `like_count` int(10) UNSIGNED ZEROFILL NOT NULL COMMENT '点赞数',
  `collect_count` int(10) UNSIGNED ZEROFILL NOT NULL COMMENT '收藏数',
  `comment_count` int(10) UNSIGNED ZEROFILL NOT NULL COMMENT '评论数',
  PRIMARY KEY (`food_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_food
-- ----------------------------
INSERT INTO `tb_food` VALUES (1, '羊肉粉', '100KJ', '酸、甜', '二食堂一楼', NULL, '2021-05-08 13:04:45', 1, 'https://inews.gtimg.com/newsapp_bt/0/14017146688/1000', '北京烤鸭，果木炭火烤制，色泽红润，肉质肥而不腻。', '仙炙轩餐厅', 0000000002, 0000000002, 0000000000);
INSERT INTO `tb_food` VALUES (2, '马玉涛麻辣烫', '200KJ', '清汤、辣', '二食堂二楼', NULL, '2021-05-08 13:06:24', 1, 'https://inews.gtimg.com/newsapp_bt/0/14017146688/1000', '北京烤鸭，果木炭火烤制，色泽红润，肉质肥而不腻。', '上雅餐厅', 0000000015, 0000000000, 0000000000);
INSERT INTO `tb_food` VALUES (3, '羊肉粉', '100KJ', '酸、甜', '二食堂一楼', NULL, '2021-05-08 13:04:45', 1, 'https://inews.gtimg.com/newsapp_bt/0/14017146688/1000', '北京烤鸭，果木炭火烤制，色泽红润，肉质肥而不腻。', '食悦阁', 0000000000, 0000000000, 0000000000);
INSERT INTO `tb_food` VALUES (4, '羊肉粉', '100KJ', '酸、甜', '二食堂一楼', NULL, '2021-05-08 13:04:45', 1, 'https://inews.gtimg.com/newsapp_bt/0/14017146688/1000', '北京烤鸭，果木炭火烤制，色泽红润，肉质肥而不腻。', '上雅餐厅', 0000000000, 0000000000, 0000000000);
INSERT INTO `tb_food` VALUES (5, '马玉涛麻辣烫', '200KJ', '清汤、辣', '二食堂二楼', NULL, '2021-05-08 13:06:24', 1, 'https://inews.gtimg.com/newsapp_bt/0/14017146688/1000', '北京烤鸭，果木炭火烤制，色泽红润，肉质肥而不腻。', '仙炙轩餐厅', 0000000001, 0000000001, 0000000000);
INSERT INTO `tb_food` VALUES (6, '马玉涛麻辣烫', '200KJ', '清汤、辣', '二食堂二楼', NULL, '2021-05-08 13:06:24', 1, 'https://inews.gtimg.com/newsapp_bt/0/14017146688/1000', '北京烤鸭，果木炭火烤制，色泽红润，肉质肥而不腻。', '食悦阁', 0000000000, 0000000000, 0000000000);

-- ----------------------------
-- Table structure for tb_like
-- ----------------------------
DROP TABLE IF EXISTS `tb_like`;
CREATE TABLE `tb_like`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `food_id` int(11) NULL DEFAULT NULL,
  `ltime` datetime(0) NULL DEFAULT NULL,
  `lcount` int(11) NULL DEFAULT NULL,
  `comment_id` int(11) NULL DEFAULT NULL COMMENT '评论ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_like
-- ----------------------------
INSERT INTO `tb_like` VALUES (1, 1, NULL, '2022-01-30 16:26:00', 0, 2);
INSERT INTO `tb_like` VALUES (2, 2, 1, '2022-01-30 16:26:56', 0, NULL);
INSERT INTO `tb_like` VALUES (3, 2, 1, '2022-01-30 16:58:56', 0, NULL);
INSERT INTO `tb_like` VALUES (4, 2, 1, '2022-01-30 17:19:25', 0, NULL);
INSERT INTO `tb_like` VALUES (5, 2, 1, '2022-01-30 18:25:53', 0, NULL);
INSERT INTO `tb_like` VALUES (6, 2, NULL, '2022-01-31 14:34:36', 0, 1);
INSERT INTO `tb_like` VALUES (7, 2, NULL, '2022-01-31 15:57:39', 0, 5);
INSERT INTO `tb_like` VALUES (8, 2, 5, '2022-01-31 17:03:33', 0, NULL);
INSERT INTO `tb_like` VALUES (9, 2, 1, '2022-02-01 16:47:14', 0, NULL);
INSERT INTO `tb_like` VALUES (10, 2, 1, '2022-02-01 16:47:21', 0, NULL);
INSERT INTO `tb_like` VALUES (11, 2, 5, '2022-02-01 16:47:27', 0, NULL);
INSERT INTO `tb_like` VALUES (12, 2, 2, '2022-02-01 16:48:25', 0, NULL);
INSERT INTO `tb_like` VALUES (13, 2, 2, '2022-02-01 17:02:02', 0, NULL);
INSERT INTO `tb_like` VALUES (14, 2, 2, '2022-02-01 17:02:02', 0, NULL);
INSERT INTO `tb_like` VALUES (15, 2, 2, '2022-02-01 17:02:02', 0, NULL);
INSERT INTO `tb_like` VALUES (16, 2, 2, '2022-02-01 17:02:02', 0, NULL);
INSERT INTO `tb_like` VALUES (17, 2, 2, '2022-02-01 17:02:02', 0, NULL);
INSERT INTO `tb_like` VALUES (18, 2, 2, '2022-02-01 17:02:03', 0, NULL);
INSERT INTO `tb_like` VALUES (19, 2, 2, '2022-02-01 17:02:03', 0, NULL);
INSERT INTO `tb_like` VALUES (20, 2, 2, '2022-02-01 17:02:03', 0, NULL);
INSERT INTO `tb_like` VALUES (21, 2, 2, '2022-02-01 17:02:03', 0, NULL);
INSERT INTO `tb_like` VALUES (22, 2, 2, '2022-02-01 17:02:03', 0, NULL);
INSERT INTO `tb_like` VALUES (23, 2, 2, '2022-02-01 17:02:03', 0, NULL);
INSERT INTO `tb_like` VALUES (24, 2, 2, '2022-02-01 17:02:03', 0, NULL);
INSERT INTO `tb_like` VALUES (25, 2, 2, '2022-02-01 17:02:07', 0, NULL);
INSERT INTO `tb_like` VALUES (26, 2, 2, '2022-02-01 17:02:10', 0, NULL);

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `login_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `pwd` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `sex` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `identity` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tel` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `state` int(11) NOT NULL,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `wx_nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE,
  INDEX `user_name`(`user_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, '王丽', 'wangli', 'abcdef', '女', '学生', '17723409875', 0, '2021-05-08 13:00:28', NULL);
INSERT INTO `tb_user` VALUES (2, '张三', 'zhangsan', '123456', '男', '管理员', '13875909988', 0, '2021-05-08 12:56:24', 'ylcoder');
INSERT INTO `tb_user` VALUES (3, '李四', 'lisi', '123467', '男', '学生', '13908710034', 0, '2021-05-08 12:59:26', NULL);

SET FOREIGN_KEY_CHECKS = 1;
