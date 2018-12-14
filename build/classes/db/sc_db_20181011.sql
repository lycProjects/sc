/*
SQLyog v10.2 
MySQL - 5.7.19-log : Database - sc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sc` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sc`;

/*Table structure for table `sc_absence` */

DROP TABLE IF EXISTS `sc_absence`;

CREATE TABLE `sc_absence` (
  `ab_id` int(50) NOT NULL AUTO_INCREMENT,
  `ab_name` varchar(50) NOT NULL,
  `ab_team` int(50) DEFAULT NULL,
  `ab_time` int(50) NOT NULL,
  PRIMARY KEY (`ab_id`),
  KEY `absence_ofk_1` (`ab_team`),
  CONSTRAINT `absence_ofk_1` FOREIGN KEY (`ab_team`) REFERENCES `sc_teammapping` (`tmm_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `sc_absence` */

LOCK TABLES `sc_absence` WRITE;

insert  into `sc_absence`(`ab_id`,`ab_name`,`ab_team`,`ab_time`) values (1,'王帅兵',2,3),(2,'刘继童',2,4),(3,'李勇超',2,3);

UNLOCK TABLES;

/*Table structure for table `sc_application` */

DROP TABLE IF EXISTS `sc_application`;

CREATE TABLE `sc_application` (
  `ap_id` int(50) NOT NULL AUTO_INCREMENT,
  `ap_state` int(50) NOT NULL,
  `ap_statename` varchar(50) NOT NULL,
  `ap_projectid` int(50) DEFAULT NULL,
  `ap_projectname` varchar(50) DEFAULT NULL,
  `ap_teamid` int(50) DEFAULT NULL,
  `ap_teamname` varchar(50) DEFAULT NULL,
  `ap_time` varchar(50) DEFAULT NULL,
  `ap_reason` varchar(255) NOT NULL,
  `ap_handletime` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ap_id`),
  KEY `application_ofk_1` (`ap_projectid`),
  KEY `application_ofk_2` (`ap_projectname`),
  KEY `application_ofk_3` (`ap_teamid`),
  KEY `application_ofk_4` (`ap_teamname`),
  CONSTRAINT `application_ofk_1` FOREIGN KEY (`ap_projectid`) REFERENCES `sc_issusdproject` (`ip_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `application_ofk_2` FOREIGN KEY (`ap_projectname`) REFERENCES `sc_issusdproject` (`ip_projectname`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `application_ofk_3` FOREIGN KEY (`ap_teamid`) REFERENCES `sc_teammapping` (`tmm_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `application_ofk_4` FOREIGN KEY (`ap_teamname`) REFERENCES `sc_teammapping` (`tmm_name`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sc_application` */

LOCK TABLES `sc_application` WRITE;

UNLOCK TABLES;

/*Table structure for table `sc_demo` */

DROP TABLE IF EXISTS `sc_demo`;

CREATE TABLE `sc_demo` (
  `de_id` int(50) NOT NULL AUTO_INCREMENT,
  `de_teamid` int(50) DEFAULT NULL,
  `de_teamname` varchar(50) DEFAULT NULL,
  `de_projectname` varchar(50) DEFAULT NULL,
  `de_titileid` int(50) DEFAULT NULL,
  `de_pictureaddress` varchar(255) DEFAULT NULL,
  `de_projectteacher` varchar(50) DEFAULT NULL,
  `de_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`de_id`),
  KEY `demo_ofk_1` (`de_teamid`),
  KEY `demo_ofk_2` (`de_teamname`),
  KEY `demo_ofk_3` (`de_titileid`),
  CONSTRAINT `demo_ofk_1` FOREIGN KEY (`de_teamid`) REFERENCES `sc_teammapping` (`tmm_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `demo_ofk_2` FOREIGN KEY (`de_teamname`) REFERENCES `sc_teammapping` (`tmm_name`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `demo_ofk_3` FOREIGN KEY (`de_titileid`) REFERENCES `sc_title` (`ti_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sc_demo` */

LOCK TABLES `sc_demo` WRITE;

UNLOCK TABLES;

/*Table structure for table `sc_enterprise` */

DROP TABLE IF EXISTS `sc_enterprise`;

CREATE TABLE `sc_enterprise` (
  `en_id` int(50) NOT NULL AUTO_INCREMENT,
  `en_name` varchar(50) NOT NULL,
  `en_briefintroduction` varchar(255) NOT NULL,
  `en_phone` varchar(50) NOT NULL,
  `en_recruitment` varchar(255) NOT NULL,
  `en_picture` varchar(255) NOT NULL,
  PRIMARY KEY (`en_id`,`en_name`),
  KEY `en_name` (`en_name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `sc_enterprise` */

LOCK TABLES `sc_enterprise` WRITE;

insert  into `sc_enterprise`(`en_id`,`en_name`,`en_briefintroduction`,`en_phone`,`en_recruitment`,`en_picture`) values (1,'青云','一家以web开发为主流的综合性企业','18866668888','积极向上，敢于创新，诚信笃实','demo/project01;demo/peoject02'),(2,'奇酷','一个以VR创作为核心的企业','16688886666','博学多才，求实创新','addressp1;address/p2'),(3,'达人达己','java大数据python人工智能云计算','15577678979','敢想敢做','lalal/1;lalal/2;lalal/3');

UNLOCK TABLES;

/*Table structure for table `sc_equip` */

DROP TABLE IF EXISTS `sc_equip`;

CREATE TABLE `sc_equip` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `eq_name` varchar(50) NOT NULL DEFAULT '',
  `eq_unit` varchar(50) NOT NULL DEFAULT '',
  `eq_amout` int(50) NOT NULL,
  `eq_note` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

/*Data for the table `sc_equip` */

LOCK TABLES `sc_equip` WRITE;

insert  into `sc_equip`(`id`,`eq_name`,`eq_unit`,`eq_amout`,`eq_note`) values (30,'平板','台',10,''),(38,'平板','台',1,''),(39,'平板','个',60,''),(43,'手绘板','个',1,''),(47,'手绘板','个',60,''),(49,'手绘板','个',1,''),(50,'打印机','台',10,''),(51,'打印机','台',1,'');

UNLOCK TABLES;

/*Table structure for table `sc_equipborrow` */

DROP TABLE IF EXISTS `sc_equipborrow`;

CREATE TABLE `sc_equipborrow` (
  `eqb_id` int(50) NOT NULL AUTO_INCREMENT,
  `eqb_team` int(50) DEFAULT NULL,
  `eqb_zfour` int(50) DEFAULT NULL,
  `eqb_oneg` int(50) DEFAULT NULL,
  `eqb_twog` int(50) DEFAULT NULL,
  `eqb_fourg` int(50) DEFAULT NULL,
  PRIMARY KEY (`eqb_id`),
  KEY `equipborrow_ofk_1` (`eqb_team`),
  CONSTRAINT `equipborrow_ofk_1` FOREIGN KEY (`eqb_team`) REFERENCES `sc_teammapping` (`tmm_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

/*Data for the table `sc_equipborrow` */

LOCK TABLES `sc_equipborrow` WRITE;

insert  into `sc_equipborrow`(`eqb_id`,`eqb_team`,`eqb_zfour`,`eqb_oneg`,`eqb_twog`,`eqb_fourg`) values (2,2,2,2,3,1),(5,5,2,2,0,0),(7,7,2,1,0,0),(16,2,NULL,NULL,NULL,NULL),(17,7,NULL,NULL,NULL,NULL),(18,5,NULL,NULL,NULL,NULL),(22,5,NULL,NULL,NULL,NULL),(24,5,NULL,NULL,NULL,NULL),(28,6,2,2,2,1),(29,2,1,1,1,NULL),(30,5,2,2,2,1),(31,6,1,2,2,1),(32,2,1,2,2,1),(33,2,1,1,2,1);

UNLOCK TABLES;

/*Table structure for table `sc_issusdproject` */

DROP TABLE IF EXISTS `sc_issusdproject`;

CREATE TABLE `sc_issusdproject` (
  `ip_id` int(50) NOT NULL AUTO_INCREMENT,
  `en_id` int(50) DEFAULT NULL,
  `ti_id` int(50) DEFAULT NULL,
  `en_name` varchar(50) DEFAULT NULL,
  `ip_projectname` varchar(50) NOT NULL,
  `ip_briefintroduction` varchar(255) NOT NULL,
  `en_projectstate` int(50) NOT NULL,
  `en_statename` varchar(50) NOT NULL,
  `en_issusdtime` varchar(50) NOT NULL,
  `en_projectover` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ip_id`,`ip_projectname`),
  KEY `issusproject_ofk_1` (`en_id`),
  KEY `issusproject_ofk_2` (`en_name`),
  KEY `issusproject_ofk_3` (`ti_id`),
  KEY `ip_projectname` (`ip_projectname`),
  CONSTRAINT `issusproject_ofk_1` FOREIGN KEY (`en_id`) REFERENCES `sc_enterprise` (`en_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `issusproject_ofk_2` FOREIGN KEY (`en_name`) REFERENCES `sc_enterprise` (`en_name`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `issusproject_ofk_3` FOREIGN KEY (`ti_id`) REFERENCES `sc_title` (`ti_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sc_issusdproject` */

LOCK TABLES `sc_issusdproject` WRITE;

UNLOCK TABLES;

/*Table structure for table `sc_jlrule` */

DROP TABLE IF EXISTS `sc_jlrule`;

CREATE TABLE `sc_jlrule` (
  `jl_id` int(50) NOT NULL AUTO_INCREMENT,
  `jl_team` int(50) DEFAULT NULL,
  `jl_recode` varchar(50) DEFAULT NULL,
  `jl_time` date DEFAULT NULL,
  PRIMARY KEY (`jl_id`),
  KEY `jlrule_ofk_1` (`jl_team`),
  CONSTRAINT `jlrule_ofk_1` FOREIGN KEY (`jl_team`) REFERENCES `sc_teammapping` (`tmm_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `sc_jlrule` */

LOCK TABLES `sc_jlrule` WRITE;

insert  into `sc_jlrule`(`jl_id`,`jl_team`,`jl_recode`,`jl_time`) values (1,6,'穿拖鞋','2018-03-21'),(2,7,'穿拖鞋','2018-08-29'),(3,6,'吃零食','2018-03-23');

UNLOCK TABLES;

/*Table structure for table `sc_leave` */

DROP TABLE IF EXISTS `sc_leave`;

CREATE TABLE `sc_leave` (
  `le_id` int(50) NOT NULL AUTO_INCREMENT,
  `le_name` varchar(50) NOT NULL,
  `le_team` int(50) DEFAULT NULL,
  `le_time` int(50) NOT NULL,
  PRIMARY KEY (`le_id`),
  KEY `leave_ofk_1` (`le_team`),
  CONSTRAINT `leave_ofk_1` FOREIGN KEY (`le_team`) REFERENCES `sc_teammapping` (`tmm_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `sc_leave` */

LOCK TABLES `sc_leave` WRITE;

insert  into `sc_leave`(`le_id`,`le_name`,`le_team`,`le_time`) values (1,'刘继童',2,3),(2,'赵意可',2,4),(3,'王帅兵',2,3),(5,'李四',1,5);

UNLOCK TABLES;

/*Table structure for table `sc_login` */

DROP TABLE IF EXISTS `sc_login`;

CREATE TABLE `sc_login` (
  `lo_id` int(50) NOT NULL AUTO_INCREMENT COMMENT '主鍵',
  `lo_username` varchar(255) NOT NULL COMMENT '用户姓名',
  `lo_password` varchar(255) NOT NULL COMMENT '密码',
  `lo_role` int(50) NOT NULL,
  `lo_team` int(50) NOT NULL,
  PRIMARY KEY (`lo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `sc_login` */

LOCK TABLES `sc_login` WRITE;

insert  into `sc_login`(`lo_id`,`lo_username`,`lo_password`,`lo_role`,`lo_team`) values (1,'admin','admin',1,0),(2,'liyongchao','liyongchao',1,0),(3,'liujitong','liujitong',1,0),(4,'qingyun','qingyun',2,1),(5,'liyongchao','liyongchao',3,2),(6,'li','li',4,0);

UNLOCK TABLES;

/*Table structure for table `sc_news_category` */

DROP TABLE IF EXISTS `sc_news_category`;

CREATE TABLE `sc_news_category` (
  `newscate_id` int(10) NOT NULL AUTO_INCREMENT,
  `newscate_title` varchar(50) NOT NULL,
  `newscate_brief` varchar(200) DEFAULT NULL,
  `newscate_mark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`newscate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `sc_news_category` */

LOCK TABLES `sc_news_category` WRITE;

insert  into `sc_news_category`(`newscate_id`,`newscate_title`,`newscate_brief`,`newscate_mark`) values (1,'公告','包含公告','show_news_index'),(2,'团队介绍','包含了团队介绍的新闻','normal'),(3,'热点新闻','新闻首页 默认新闻类别','show_news_index'),(4,'最热最火新闻','新闻首页 最热最火新闻 源新闻类别','normal');

UNLOCK TABLES;

/*Table structure for table `sc_news_new` */

DROP TABLE IF EXISTS `sc_news_new`;

CREATE TABLE `sc_news_new` (
  `newsnew_id` int(10) NOT NULL AUTO_INCREMENT,
  `newsnew_title` varchar(100) NOT NULL,
  `newsnew_brief` varchar(500) DEFAULT NULL,
  `newsnew_authorName` varchar(100) DEFAULT NULL,
  `newsnew_htmlUri` varchar(200) NOT NULL,
  `newsnew_pubTime` varchar(100) NOT NULL,
  `newscate_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`newsnew_id`),
  KEY `sc_news_new_ofk_1` (`newscate_id`),
  CONSTRAINT `sc_news_new_ofk_1` FOREIGN KEY (`newscate_id`) REFERENCES `sc_news_category` (`newscate_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `sc_news_new` */

LOCK TABLES `sc_news_new` WRITE;

insert  into `sc_news_new`(`newsnew_id`,`newsnew_title`,`newsnew_brief`,`newsnew_authorName`,`newsnew_htmlUri`,`newsnew_pubTime`,`newscate_id`) values (3,'【公告】双创管理系统简介','平顶山学院计算机学院(软件学院)创新创业中心始建于2016年...','管理员','/DataFile/news/20180926054446898422/htmlContent.html','2018-09-26 17:57:45',1),(4,'【公告】系统测试正式开始','双创管理系统自今日起，开始进入测试阶段。欢迎大家测试，并提供...','管理员','/DataFile/news/20180926054701561769/htmlContent.html','2018-09-26 17:57:52',1),(5,'【重要公告】本系统已进入正式使用阶段','经过 T-group 团队日日夜夜的努力创作，本系统终于在...','管理员','/DataFile/news/20180926055129673360/htmlContent.html','2018-09-26 19:23:00',1),(6,'我校学生荣获全国软件信息技术大赛总决赛一等奖','近日，第九届“蓝桥杯”全国软件和信息技术专业人才大赛（以下简...','新闻快递员','/DataFile/news/20180926060300276194/htmlContent.html','2018-09-26 18:09:11',3),(7,'我校获批“河南省‘三全育人’综合改革试点高校”','近日，中共河南省委高校工委、河南省教育厅下发文件，公布了河南...','新闻快递员','/DataFile/news/2018092606043120589/htmlContent.html','2018-09-26 18:08:53',3),(8,'平顶山市教育局、市卫生计生委、市体育局与我校签署战略合作协议','7月2日上午，我校与平顶山市教育局、平顶山市卫生与计划生育委...','新闻快递员','/DataFile/news/20180926060617735633/htmlContent.html','2018-09-26 18:10:20',3),(9,'习近平致信祝贺中央电视台建台暨新中国电视事业诞生60周年','习近平致信祝贺中央电视台建台暨新中国电视事业诞生60周年强...','新闻快递员','/DataFile/news/20180926061249433517/htmlContent.html','2018-09-26 18:12:49',4),(10,'中国始终与世界同行——六部门相关负责人解读《关于中美经贸摩擦的事实与中方立场》白皮书','这是9月25日拍摄的《关于中美经贸摩擦的事实与中方立场》白...','新闻快递员','/DataFile/news/20180926061438827432/htmlContent.html','2018-09-26 18:14:38',4),(11,'“中国天眼”FAST两岁了！已发现44颗新脉冲星，有望明年验收开放','“中国天眼”FAST两岁了！来源：中国科学院国家天文台假期...','新闻快递员','/DataFile/news/20180926061643435172/htmlContent.html','2018-09-26 18:16:43',4),(12,'《延禧攻略》在台受捧 国台办：任何“去中国化”都割裂不了中华文化','【环球网综合报道】大陆宫廷剧《延禧攻略》受到台湾观众欢迎，...','新闻快递员','/DataFile/news/20180926061730094166/htmlContent.html','2018-09-26 18:17:30',4),(13,'习近平感慨北大荒的沧桑巨变“了不起”','25日下午，正在黑龙江省考察的习近平总书记来到七星...','新闻快递员','/DataFile/news/20180926062047513422/htmlContent.html','2018-09-26 18:20:47',4),(14,'贝克汉姆第一次登上长城！秒变“标准游客”拍照留念','贝克汉姆与小朋友合影9月22日上午，贝克汉姆更新社交网站动...','新闻快递员','/DataFile/news/20180926062159589448/htmlContent.html','2018-09-26 18:21:59',4),(16,'ACM算法公关部','ACM算法攻关部提倡并实施“发展有规划,学习有目标,交流...','团队管理员','/DataFile/news/20180927030643986498/htmlContent.html','2018-09-27 15:06:43',2),(17,'T-group团队','T-group团队专注网站技术研究开发。团队有摄影、PS、...','团队管理员','/DataFile/news/20180927030743853109/htmlContent.html','2018-09-27 15:07:43',2),(18,'服务器端开发及测试工作室','社团以服务器端后台开发为重点，以简单的前端技术为支...','团队管理员','/DataFile/news/20180927030838398695/htmlContent.html','2018-09-27 15:08:38',2),(19,'恒创VR工作室','恒创VR工作室，成立于2017年，由平顶山学院计算...','团队管理员','/DataFile/news/20180927030939972682/htmlContent.html','2018-09-27 15:09:39',2),(20,'青云技术服务工作室','青云技术服务工作室是河南青云信息技术有限公司在校孵化团队。...','团队管理员','/DataFile/news/20180927031025560893/htmlContent.html','2018-09-27 15:10:25',2),(21,'网络攻防技术训练营团队','网络安全攻防技术训练营创团队以网络安全技术研究与应用为基础...','团队管理员','/DataFile/news/2018092703134659785/htmlContent.html','2018-09-27 15:13:46',2),(22,'你猜工作室','你猜工作室是一个专为学习和制作UI交互设计而组成的创新团队。...','团队管理员','/DataFile/news/20180927031501522930/htmlContent.html','2018-09-27 16:39:45',2),(23,'向量工作室','向量工作室是一个致力于java、Android、数据库技术...','团队管理员','/DataFile/news/20180927031548163500/htmlContent.html','2018-09-27 16:38:58',2);

UNLOCK TABLES;

/*Table structure for table `sc_roles` */

DROP TABLE IF EXISTS `sc_roles`;

CREATE TABLE `sc_roles` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `sc_roles` */

LOCK TABLES `sc_roles` WRITE;

insert  into `sc_roles`(`id`,`role`,`description`) values (1,'管理员','拥有至高无上的权利'),(2,'企业人员','查看各团队信息、发布内容的权限'),(3,'团队负责人','具有添加、审核、发布、删除内容的权利'),(4,'团队成员','修改密码、下载等权利');

UNLOCK TABLES;

/*Table structure for table `sc_student` */

DROP TABLE IF EXISTS `sc_student`;

CREATE TABLE `sc_student` (
  `st_id` int(50) NOT NULL AUTO_INCREMENT,
  `st_team` int(50) DEFAULT NULL,
  `st_number` int(50) NOT NULL,
  `st_name` varchar(50) NOT NULL,
  `st_sex` varchar(50) NOT NULL,
  `st_class` varchar(50) NOT NULL,
  `st_phone` varchar(50) NOT NULL,
  `st_IDcard` varchar(50) NOT NULL,
  `st_teacher` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`st_id`),
  KEY `student_ofk_1` (`st_teacher`),
  KEY `student_ofk_2` (`st_team`),
  CONSTRAINT `student_ofk_1` FOREIGN KEY (`st_teacher`) REFERENCES `sc_teacher` (`te_name`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `student_ofk_2` FOREIGN KEY (`st_team`) REFERENCES `sc_teammapping` (`tmm_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `sc_student` */

LOCK TABLES `sc_student` WRITE;

insert  into `sc_student`(`st_id`,`st_team`,`st_number`,`st_name`,`st_sex`,`st_class`,`st_phone`,`st_IDcard`,`st_teacher`) values (1,2,161210128,'王帅兵','男','16计科一班','15036887638','412426199890789078','郑浩'),(2,2,161530254,'石腾飞','男','16软件工程','14933344423','12323653443577','郑浩'),(3,3,121912822,'李明明','男','16游戏开发','12564978736','145761216786146','郑浩');

UNLOCK TABLES;

/*Table structure for table `sc_summary` */

DROP TABLE IF EXISTS `sc_summary`;

CREATE TABLE `sc_summary` (
  `su_id` int(50) NOT NULL AUTO_INCREMENT,
  `su_team` int(50) DEFAULT NULL,
  `su_absence` int(50) DEFAULT NULL,
  `su_weisheng` int(50) DEFAULT NULL,
  `su_jilv` int(50) DEFAULT NULL,
  `su_total` int(50) NOT NULL,
  `su_order` int(50) NOT NULL,
  PRIMARY KEY (`su_id`),
  KEY `summary_ofk_1` (`su_team`),
  CONSTRAINT `summary_ofk_1` FOREIGN KEY (`su_team`) REFERENCES `sc_teammapping` (`tmm_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `sc_summary` */

LOCK TABLES `sc_summary` WRITE;

insert  into `sc_summary`(`su_id`,`su_team`,`su_absence`,`su_weisheng`,`su_jilv`,`su_total`,`su_order`) values (1,2,3,3,1,7,4),(2,4,2,1,2,5,3),(3,8,4,2,3,9,7),(4,5,3,3,2,8,6);

UNLOCK TABLES;

/*Table structure for table `sc_teacher` */

DROP TABLE IF EXISTS `sc_teacher`;

CREATE TABLE `sc_teacher` (
  `te_id` int(50) NOT NULL AUTO_INCREMENT,
  `te_name` varchar(50) NOT NULL,
  `te_unit` varchar(50) NOT NULL,
  `te_phone` varchar(50) NOT NULL,
  `te_position` varchar(50) NOT NULL,
  `te_IDcard` varchar(50) NOT NULL,
  PRIMARY KEY (`te_id`),
  KEY `te_name` (`te_name`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `sc_teacher` */

LOCK TABLES `sc_teacher` WRITE;

insert  into `sc_teacher`(`te_id`,`te_name`,`te_unit`,`te_phone`,`te_position`,`te_IDcard`) values (14,'郑浩','T-group','1243','123','123'),(15,'郑浩','T-Group工作室','123456','讲师','41212738645123876'),(16,'郑浩','T-Group工作室','123456','讲师','41212738645123876');

UNLOCK TABLES;

/*Table structure for table `sc_teammapping` */

DROP TABLE IF EXISTS `sc_teammapping`;

CREATE TABLE `sc_teammapping` (
  `tmm_id` int(50) NOT NULL AUTO_INCREMENT,
  `tmm_name` varchar(50) NOT NULL,
  `en_id` int(50) DEFAULT NULL,
  PRIMARY KEY (`tmm_id`,`tmm_name`),
  KEY `tmm_id` (`tmm_id`),
  KEY `tmm_name` (`tmm_name`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `sc_teammapping` */

LOCK TABLES `sc_teammapping` WRITE;

insert  into `sc_teammapping`(`tmm_id`,`tmm_name`,`en_id`) values (1,'青云技术服务工作室',1),(2,'T-Group工作室',NULL),(3,'网络安全攻防技术训练营',NULL),(4,'服务器工作室',NULL),(5,'ACM算法公关部',NULL),(6,'向量工作室',NULL),(7,'你猜工作室',NULL),(8,'恒创VR工作室',NULL);

UNLOCK TABLES;

/*Table structure for table `sc_title` */

DROP TABLE IF EXISTS `sc_title`;

CREATE TABLE `sc_title` (
  `ti_id` int(50) NOT NULL AUTO_INCREMENT,
  `ti_type` int(50) NOT NULL,
  `ti_mentionedabove` varchar(50) NOT NULL,
  `ti_auther` varchar(50) DEFAULT NULL,
  `ti_autherid` int(50) DEFAULT NULL,
  `ti_addressurl` varchar(255) DEFAULT NULL,
  `ti_releasetime` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ti_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `sc_title` */

LOCK TABLES `sc_title` WRITE;

insert  into `sc_title`(`ti_id`,`ti_type`,`ti_mentionedabove`,`ti_auther`,`ti_autherid`,`ti_addressurl`,`ti_releasetime`) values (1,1,'发布公司','青云',1,'project1/demo','2018/9/25'),(2,2,'创作团队','T-Group',2,'project2/demo','2018/9/25');

UNLOCK TABLES;

/*Table structure for table `sc_wsrule` */

DROP TABLE IF EXISTS `sc_wsrule`;

CREATE TABLE `sc_wsrule` (
  `ws_id` int(50) NOT NULL AUTO_INCREMENT,
  `ws_team` int(50) DEFAULT NULL,
  `ws_recode` varchar(50) NOT NULL,
  `ws_time` date NOT NULL,
  PRIMARY KEY (`ws_id`),
  KEY `wsrule_ofk_1` (`ws_team`),
  CONSTRAINT `wsrule_ofk_1` FOREIGN KEY (`ws_team`) REFERENCES `sc_teammapping` (`tmm_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `sc_wsrule` */

LOCK TABLES `sc_wsrule` WRITE;

insert  into `sc_wsrule`(`ws_id`,`ws_team`,`ws_recode`,`ws_time`) values (1,2,'未倒垃圾','2018-08-29'),(2,5,'地面不干净','2018-08-29'),(3,6,'未倒垃圾','2018-09-05'),(4,6,'地面不干净','2018-09-05'),(5,1,'','2018-09-24');

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
