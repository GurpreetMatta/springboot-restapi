# springboot-restapi


# Step 1 :- install lombok in intellij
# step 2 :- import maven project in intellij
# step 3 :- create db test in your database
# step 4:- run the following script in db

CREATE TABLE `overviews` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_number` varchar(255),
  `product_category` varchar(255) DEFAULT NULL,
  `product_type` varchar(255) DEFAULT NULL,
  `configuration_type` varchar(255) DEFAULT NULL,
  `imgages` varchar(255) DEFAULT NULL,
  `short_description` varchar(255) DEFAULT NULL,
  `long_description` varchar(1000) DEFAULT NULL,
  `topic` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ;

INSERT INTO `hibernate_sequence` VALUES (118),(118),(118),(118),(118),(118),(118),(118),(118),(118),(118),(118);

CREATE TABLE `key_feature` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255),
  PRIMARY KEY (`id`)
);

CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_number` varchar(255),
  `description` varchar(255),
  PRIMARY KEY (`id`)
);

CREATE TABLE `rule` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `feature` varchar(255),
  `options` varchar(255),
  PRIMARY KEY (`id`)
);


# step 5:- change the db credential in application.properties file
# step 6:- run the TestApplication.java file
# step 7:- open browser and go to link http://localhost:8080/
