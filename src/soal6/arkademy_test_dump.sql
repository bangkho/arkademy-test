/*
 Navicat Premium Data Transfer

 Source Server         : Local
 Source Server Type    : MySQL
 Source Server Version : 100132
 Source Host           : localhost:3306
 Source Schema         : arkademy_test

 Target Server Type    : MySQL
 Target Server Version : 100132
 File Encoding         : 65001

 Date: 26/01/2019 10:01:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product_categories
-- ----------------------------
DROP TABLE IF EXISTS `product_categories`;
CREATE TABLE `product_categories`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `created_date` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product_categories
-- ----------------------------
INSERT INTO `product_categories` VALUES (1, 'Peralatan Mandi', '2019-01-26 09:48:58');
INSERT INTO `product_categories` VALUES (2, 'Minuman Kemasan', '2019-01-26 09:49:12');
INSERT INTO `product_categories` VALUES (3, 'Produk Susu', '2019-01-26 09:49:23');

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `category_id` int(11) NOT NULL,
  `created_date` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `category_index`(`category_id`) USING BTREE,
  CONSTRAINT `category_fk` FOREIGN KEY (`category_id`) REFERENCES `product_categories` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES (1, 'Sabun Mandi', 1, '2019-01-26 09:56:13');
INSERT INTO `products` VALUES (2, 'Minuman Cola', 2, '2019-01-26 09:57:48');
INSERT INTO `products` VALUES (3, 'Prenagon Gold', 3, '2019-01-26 09:58:21');
INSERT INTO `products` VALUES (4, 'Aquaa', 2, '2019-01-26 09:58:31');
INSERT INTO `products` VALUES (5, 'The Botol', 2, '2019-01-26 09:58:38');
INSERT INTO `products` VALUES (6, 'Shampo', 1, '2019-01-26 09:58:59');

SET FOREIGN_KEY_CHECKS = 1;
