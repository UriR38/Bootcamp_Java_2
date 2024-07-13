SELECT Title
FROM Movies;

SELECT Director
FROM Movies;

SELECT Title, Director
FROM Movies;

SELECT Title, Director
FROM Movies;

SELECT *
FROM Movies;

SELECT *
FROM Movies
WHERE Id = 6;

SELECT *
FROM Movies
WHERE Year BETWEEN 2000 AND 2010;

SELECT *
FROM Movies
WHERE Year NOT BETWEEN 2000 AND 2010;

SELECT *
FROM Movies
WHERE Id BETWEEN 1 AND 5;

SELECT *
FROM Movies
WHERE Title LIKE "%Toy Story%";

SELECT *
FROM Movies
WHERE Director = "John Lasseter";

SELECT *
FROM Movies
WHERE Director != "John Lasseter";

SELECT *
FROM Movies
WHERE Title LIKE "%WALL%";

SELECT DISTINCT Director
FROM Movies
ORDER BY Director;

SELECT *
FROM Movies
ORDER BY Year DESC
LIMIT 4;

SELECT *
FROM Movies
ORDER BY Title ASC
LIMIT 5;

SELECT *
FROM Movies
ORDER BY Title ASC
LIMIT 5
OFFSET 5;

SELECT *
FROM North_american_cities
WHERE Country LIKE "Canada";

SELECT *
FROM North_american_cities
WHERE Country = "United States"
ORDER BY Latitude DESC;

SELECT *
FROM North_american_cities
WHERE Longitude < -87.69
ORDER BY Longitude ASC;

SELECT *
FROM North_american_cities
WHERE Country LIKE "Mexico"
ORDER BY Population DESC
LIMIT 2;

SELECT *
FROM North_american_cities
WHERE Country LIKE "United States"
ORDER BY Population DESC
LIMIT 2
OFFSET 2;

SELECT Title, International_sales, Domestic_sales
FROM Movies JOIN Boxoffice
ON Id=Movie_id;

SELECT Title, International_sales, Domestic_sales
FROM Movies JOIN Boxoffice
ON Id=Movie_id
WHERE International_sales > Domestic_sales;

SELECT Title, Rating
FROM Movies JOIN Boxoffice
ON Id=Movie_id
ORDER BY Rating DESC;

SELECT DISTINCT Building
FROM Employees
LEFT JOIN Buildings ON Building=Building_name
WHERE Years_employed NOT NULL;

SELECT *
FROM Buildings;

SELECT DISTINCT Building_name, Role 
FROM Buildings 
LEFT JOIN employees ON building_name = building;

SELECT *
FROM Employees
LEFT JOIN Buildings
ON Building_name = Building
WHERE Building IS NULL;

SELECT 
    *
FROM
    Buildings
        LEFT JOIN
    Employees ON Building_name = Building
WHERE
    Building IS NULL;

SELECT Title, (Domestic_sales + International_sales)/1000000 AS Total_Sales_Millions
FROM Movies
LEFT JOIN Boxoffice ON Id=Movie_Id;

SELECT Title, Rating*10 as Percent
FROM Movies
LEFT JOIN Boxoffice ON Id=Movie_Id;

SELECT Title, Year
FROM Movies
LEFT JOIN Boxoffice ON Id=Movie_Id
WHERE Year % 2 = 0;

SELECT MAX(Years_employed)
FROM Employees;

SELECT Role, AVG(Years_Employed) 
FROM Employees
GROUP BY Role;

SELECT Building, SUM(Years_Employed) 
FROM Employees
GROUP BY Building;

SELECT Role, COUNT(*) AS Number_of_Artists
FROM Employees
WHERE Role = "Artist";

SELECT Role, COUNT(*)
FROM Employees
GROUP BY Role;

SELECT Role, SUM(Years_Employed)
FROM Employees
GROUP BY Role
HAVING Role = "Engineer";

SELECT *, COUNT(Title)
FROM Movies
GROUP BY Director;

SELECT Director, sum(Domestic_sales + International_Sales) as Total_Sales
FROM Movies
LEFT JOIN Boxoffice ON Id = Movie_ID
GROUP BY Director;

INSERT INTO Movies
VALUES (4, "Toy Story 4", "John Lasseter", 2017, 123);

INSERT INTO Boxoffice
VALUES (4, 8.7, 340000000, 270000000);

UPDATE Movies
SET Director = "John Lasseter"
WHERE Id = 2;

UPDATE Movies
SET Year = "1999"
WHERE Id = 3;

UPDATE Movies
SET Title = "Toy Story 3", Director = "Lee Unkrich"
WHERE Id = 11;

DELETE FROM Movies
WHERE Year < 2005;

DELETE FROM Movies
WHERE Director = "Andrew Stanton";

CREATE TABLE Database (
    Name TEXT,
    Version FLOAT,
    Download_Count INTEGER);

ALTER TABLE Movies
ADD COLUMN Aspect_ratio FLOAT DEFAULT 3;

ALTER TABLE Movies
ADD COLUMN Language TEXT DEFAULT "English";

DROP TABLE Movies;

DROP TABLE BoxOffice;
