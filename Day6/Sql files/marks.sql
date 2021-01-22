CREATE TABLE `marks`
 (
  `period` int NOT NULL,
 
 `english` int DEFAULT NULL,
  
`maths` int DEFAULT NULL,
 
 `social` int DEFAULT NULL,
  
`id` int DEFAULT NULL,
 
 PRIMARY KEY (`period`),
 
 KEY `id_idx` (`id`),
  
CONSTRAINT `id` FOREIGN KEY (`id`) REFERENCES `students` (`id`)
) 
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




INSERT INTO `education`.`marks`
(`period`,
`english`,
`maths`,
`social`,
`id`)

VALUES
(113,25,17,20,1),

(114,20,10,10,1),

(115,28,30,19,2),

(116,20,10,20,2),

(117,30,30,30,3),

(118,20,20,30,3),

(119,20,15,25,4),

(120,10,20,15,4);




SELECT id, english, maths, social, english+maths+social  AS totalmarks 
FROM marks;