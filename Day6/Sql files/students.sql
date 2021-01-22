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




SELECT marks.english,students.name FROM students INNER JOIN marks ON 
students.id=marks.id WHERE name='A';


SELECT MAX(mark) FROM students;
SELECT name,max(mark) FROM students WHERE mark=(SELECT max(mark)
FROM students);

SELECT id, english, maths, social, english+maths+social  AS totalmarks 
FROM marks;


CREATE VIEW studentsview AS SELECT students.id,students.name,students.gender,
students.mark,students.stream, marks.period, marks.english,marks.maths,marks.social FROM students
INNER JOIN marks ON students.id = marks.id;

SELECT * FROM studentsview;

SELECT * FROM studentsview WHERE stream ='science' ORDER BY name;

SELECT * FROM studentsview WHERE stream = 'science' AND mark>=100 ORDER BY name;



SELECT name,AVG(mark) FROM students WHERE stream ='science';

SELECT name,SUM(english+maths +social) AS sum FROM studentsview GROUP BY name;

SELECT name,SUM(english+maths +social) AS sum FROM studentsview WHERE name ='A';
