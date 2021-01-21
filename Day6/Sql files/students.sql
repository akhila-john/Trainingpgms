CREATE TABLE `students` (
  
`id` int NOT NULL,
 
 `name` varchar(45) DEFAULT NULL,

  `gender` char(1) DEFAULT NULL,
 
 `stream` varchar(45) DEFAULT NULL,
 
 `mark` int DEFAULT NULL,
 
 PRIMARY KEY (`id`)
) 
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




INSERT INTO `education`.`students`
(`id`,
`name`,
`gender`,
`stream`,
`mark`)

VALUES
(1,'A','M','science',102),

(2,'B','F','commerce',127),

(3,'C','M','science',160),

(4,'F','F','commerce',105);

