CREATE DATABASE IF NOT EXISTS Escuela;
USE Escuela;

CREATE TABLE IF NOT EXISTS Teachers (
    Tid INT AUTO_INCREMENT PRIMARY KEY,
    Tname VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Courses (
    Cid INT AUTO_INCREMENT PRIMARY KEY,
    Cname VARCHAR(50) NOT NULL,
    Tid INT,
    FOREIGN KEY (Tid)
        REFERENCES Teachers (Tid)
);

CREATE TABLE IF NOT EXISTS Students (
    Sid INT AUTO_INCREMENT PRIMARY KEY,
    Sname VARCHAR(50) NOT NULL,
    Sage INT,
    Ssex CHAR(1)
);

CREATE TABLE IF NOT EXISTS SC (
    Sid INT,
    Cid INT,
    score DECIMAL(3 , 2 ),
    PRIMARY KEY (Sid , Cid),
    FOREIGN KEY (Sid)
        REFERENCES Students (Sid),
    FOREIGN KEY (Cid)
        REFERENCES Courses (Cid)
);

INSERT INTO Teachers (Tname) VALUES ('Profesor A'), ('Profesor B');

INSERT INTO Courses (Cname, Tid) VALUES ('Matemáticas', 1), ('Historia', 2);

INSERT INTO Students (Sname, Sage, Ssex) VALUES ('Estudiante 1', 20, 'M'), ('Estudiante 2', 22, 'F');

INSERT INTO SC (Sid, Cid, score) VALUES (1, 1, 8.5), (1, 2, 7.0), (2, 1, 6.5);

SELECT 
    t.Tname AS Profesor, s.Sname AS Estudiante, c.Cname AS Curso
FROM
    Teachers t
        JOIN
    Courses c ON t.Tid = c.Tid
        JOIN
    SC sc ON c.Cid = sc.Cid
        JOIN
    Students s ON sc.Sid = s.Sid
WHERE
    t.Tid = 1 

SELECT 
    t.Tname AS Profesor, COUNT(c.Cid) AS Total_Cursos
FROM
    Teachers t
        JOIN
    Courses c ON t.Tid = c.Tid
WHERE
    t.Tid = 1
GROUP BY t.Tname

SELECT 
    s.Sname AS Estudiante, COUNT(sc.Cid) AS Total_Cursos
FROM
    Students s
        JOIN
    SC sc ON s.Sid = sc.Sid
WHERE
    s.Sid = 1
GROUP BY s.Sname
