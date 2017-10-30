/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : restaurantreservation

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2017-10-27 15:00:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `feedbacks`
-- ----------------------------
DROP TABLE IF EXISTS `feedbacks`;
CREATE TABLE `feedbacks` (
  `feedbackID` int(11) NOT NULL AUTO_INCREMENT,
  `reservationID` int(11) NOT NULL,
  `feedback` text NOT NULL,
  PRIMARY KEY (`feedbackID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of feedbacks
-- ----------------------------

-- ----------------------------
-- Table structure for `menus`
-- ----------------------------
DROP TABLE IF EXISTS `menus`;
CREATE TABLE `menus` (
  `menuID` int(11) NOT NULL AUTO_INCREMENT,
  `restaurantID` int(11) NOT NULL,
  `description` text NOT NULL,
  `discount` double DEFAULT NULL,
  PRIMARY KEY (`menuID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menus
-- ----------------------------
INSERT INTO `menus` VALUES ('1', '1', 'Kebab meals: Any Kebab, chips& Can of soft drink', '0.2');
INSERT INTO `menus` VALUES ('2', '1', 'Fish Amritsari meals', '0.3');
INSERT INTO `menus` VALUES ('3', '2', 'Double Cheeseburger Meal', '0.2');
INSERT INTO `menus` VALUES ('4', '2', 'Student deals', '0.2');
INSERT INTO `menus` VALUES ('5', '2', 'Student Party deals', '0.3');
INSERT INTO `menus` VALUES ('6', '3', '10\" Limerick Special', '0.1');
INSERT INTO `menus` VALUES ('7', '3', '10\" Pizza Meal', '0.2');
INSERT INTO `menus` VALUES ('8', '3', '16\" Pizza &Kebab Meal', '0.3');
INSERT INTO `menus` VALUES ('9', '4', 'Mid Week Madness', '0.3');
INSERT INTO `menus` VALUES ('10', '4', 'JOE\'S Family Special', '0.2');
INSERT INTO `menus` VALUES ('11', '4', 'Hawaiian Pizza', '0.1');
INSERT INTO `menus` VALUES ('12', '5', '9\" Pizza Meal Deal', '0.1');
INSERT INTO `menus` VALUES ('13', '5', '12\" Pizza Meal Deal', '0.3');
INSERT INTO `menus` VALUES ('14', '6', 'Tuesday Meal', '0.2');
INSERT INTO `menus` VALUES ('15', '6', 'Family Meal', '0.1');
INSERT INTO `menus` VALUES ('16', '6', 'Spring chicken rolls&chips', '0.3');
INSERT INTO `menus` VALUES ('17', '7', 'Special Deal A', '0.2');
INSERT INTO `menus` VALUES ('18', '7', 'Special evening menu', '0.2');

-- ----------------------------
-- Table structure for `reservations`
-- ----------------------------
DROP TABLE IF EXISTS `reservations`;
CREATE TABLE `reservations` (
  `reservationID` int(11) NOT NULL AUTO_INCREMENT,
  `userID` int(11) NOT NULL,
  `restaurantID` int(11) NOT NULL,
  `reserve_date` datetime NOT NULL,
  `consume_date` datetime NOT NULL,
  `numOfPeople` int(11) NOT NULL,
  `reservation_feedbackID` int(11) NOT NULL,
  `paid` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`reservationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reservations
-- ----------------------------

-- ----------------------------
-- Table structure for `restaurants`
-- ----------------------------
DROP TABLE IF EXISTS `restaurants`;
CREATE TABLE `restaurants` (
  `restaurant_ID` int(11) NOT NULL AUTO_INCREMENT,
  `restaurant_name` varchar(255) NOT NULL,
  `restaurant_typeID` int(255) NOT NULL,
  `description` text,
  `tables` int(11) NOT NULL,
  PRIMARY KEY (`restaurant_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of restaurants
-- ----------------------------
INSERT INTO `restaurants` VALUES ('1', 'Achari Indian Restaurant', '1', 'Special meals everyday!', '20');
INSERT INTO `restaurants` VALUES ('2', 'Hello Pizza&Grill', '2', 'Wonderful takeaway serves sush as chicken and donner wraps, and also regularly has special deals for your every order!', '15');
INSERT INTO `restaurants` VALUES ('3', 'Jet\'s Pizza', '2', 'Delightful takeaway servers a wide range of pizza and chipper food options!', '18');
INSERT INTO `restaurants` VALUES ('4', 'Joe\'s Takeaway', '4', 'Our takeway is 100% IRISH OWNED!', '25');
INSERT INTO `restaurants` VALUES ('5', 'MrAirs Fish&Chips', '4', 'International takeaway servers a wide range of dishes!', '17');
INSERT INTO `restaurants` VALUES ('6', 'Pagoda Castletroy', '3', 'Delightful Chinese takeaway serves a wide range of all Chinese dishes!', '22');
INSERT INTO `restaurants` VALUES ('7', 'Asian Fusion Takeaway', '3', 'FREE Prawn crackers on oders over $20', '18');

-- ----------------------------
-- Table structure for `restaurant_type`
-- ----------------------------
DROP TABLE IF EXISTS `restaurant_type`;
CREATE TABLE `restaurant_type` (
  `restaurant_typeID` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) NOT NULL,
  PRIMARY KEY (`restaurant_typeID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of restaurant_type
-- ----------------------------
INSERT INTO `restaurant_type` VALUES ('1', 'Indian');
INSERT INTO `restaurant_type` VALUES ('2', 'Pizza');
INSERT INTO `restaurant_type` VALUES ('3', 'Chinese');
INSERT INTO `restaurant_type` VALUES ('4', 'Traditional chipper');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `usertype` int(11) NOT NULL,
  `bankCardNo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'Anna', '1234', '1', null);
INSERT INTO `users` VALUES ('2', 'Sunny', '2586', '2', null);
INSERT INTO `users` VALUES ('3', 'Ben', '4793', '3', '4586159752312264');
INSERT INTO `users` VALUES ('4', 'Alice', '7739', '3', '1576359812036645');

-- ----------------------------
-- Table structure for `user_restaurant`
-- ----------------------------
DROP TABLE IF EXISTS `user_restaurant`;
CREATE TABLE `user_restaurant` (
  `userID` int(11) NOT NULL,
  `restaurantID` int(11) NOT NULL,
  `count` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`userID`,`restaurantID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_restaurant
-- ----------------------------
