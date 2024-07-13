START TRANSACTION;
INSERT INTO Students (Sname, Sage, Ssex) VALUES ('Mar Romero', 26, 'F');

ROLLBACK;
SELECT * FROM Students;

START TRANSACTION;
INSERT INTO Students (Sname, Sage, Ssex) VALUES ('Oriol Rodriguez', 26, 'M');

COMMIT;
SELECT * FROM Students;
