use sizukadb;
DROP TABLE IF EXISTS `IY_ADMIN_USER`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `USER`
(
  `id`          INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `firstName`   VARCHAR(30)  NOT NULL,
  `lastName`    VARCHAR(30)  NOT NULL,
  `birthDay`    VARCHAR(30)  NOT NULL,
  `sex`         VARCHAR(30)  NOT NULL,
  `religion`    VARCHAR(30)  NOT NULL,
  `nationality` VARCHAR(30)  NOT NULL,
  `corporate`   VARCHAR(30)  NOT NULL,
  `insert_time` DATETIME     NOT NULL,
  `update_time` DATETIME     NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 82
  DEFAULT CHARSET = utf8;
/* SQL Error (1064): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ') ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8' at line 13 */
/* Affected rows: 0  Found rows: 0  Warnings: 1  Duration for 3 of 4 queries: 0.015 sec. */
