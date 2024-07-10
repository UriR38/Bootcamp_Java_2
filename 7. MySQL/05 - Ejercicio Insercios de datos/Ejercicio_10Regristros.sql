CREATE DATABASE IF NOT EXISTS testBaseDD2;
USE testBaseDD2;

CREATE TABLE Genre (
    idGenre INT AUTO_INCREMENT PRIMARY KEY,
    Genre VARCHAR(255)
);

CREATE TABLE Album (
    idAlbum INT AUTO_INCREMENT PRIMARY KEY,
    albumName VARCHAR(255),
    dateReleased DATETIME
);

CREATE TABLE Artist (
    artistId INT AUTO_INCREMENT PRIMARY KEY,
    artistName VARCHAR(255)
);

INSERT INTO Genre (Genre) VALUES ('Pop');
INSERT INTO Genre (Genre) VALUES ('Rock');
INSERT INTO Genre (Genre) VALUES ('Hip Hop');
INSERT INTO Genre (Genre) VALUES ('Electronic');
INSERT INTO Genre (Genre) VALUES ('Jazz');
INSERT INTO Genre (Genre) VALUES ('Classical');
INSERT INTO Genre (Genre) VALUES ('Country');
INSERT INTO Genre (Genre) VALUES ('Reggae');
INSERT INTO Genre (Genre) VALUES ('Blues');
INSERT INTO Genre (Genre) VALUES ('Latin');

INSERT INTO Album (albumName, dateReleased) VALUES ('Thriller', '1982-11-30 00:00:00');
INSERT INTO Album (albumName, dateReleased) VALUES ('Back in Black', '1980-07-25 00:00:00');
INSERT INTO Album (albumName, dateReleased) VALUES ('The Dark Side of the Moon', '1973-03-01 00:00:00');
INSERT INTO Album (albumName, dateReleased) VALUES ('The Bodyguard', '1992-11-17 00:00:00');
INSERT INTO Album (albumName, dateReleased) VALUES ('Rumours', '1977-02-04 00:00:00');
INSERT INTO Album (albumName, dateReleased) VALUES ('21', '2011-01-24 00:00:00');
INSERT INTO Album (albumName, dateReleased) VALUES ('Born in the U.S.A.', '1984-06-04 00:00:00');
INSERT INTO Album (albumName, dateReleased) VALUES ('Hotel California', '1976-12-08 00:00:00');
INSERT INTO Album (albumName, dateReleased) VALUES ('Abbey Road', '1969-09-26 00:00:00');
INSERT INTO Album (albumName, dateReleased) VALUES ('Come Away With Me', '2002-02-26 00:00:00');

INSERT INTO Artist (artistName) VALUES ('Michael Jackson');
INSERT INTO Artist (artistName) VALUES ('AC/DC');
INSERT INTO Artist (artistName) VALUES ('Pink Floyd');
INSERT INTO Artist (artistName) VALUES ('Whitney Houston');
INSERT INTO Artist (artistName) VALUES ('Fleetwood Mac');
INSERT INTO Artist (artistName) VALUES ('Adele');
INSERT INTO Artist (artistName) VALUES ('Bruce Springsteen');
INSERT INTO Artist (artistName) VALUES ('Eagles');
INSERT INTO Artist (artistName) VALUES ('The Beatles');
INSERT INTO Artist (artistName) VALUES ('Norah Jones');

SELECT * FROM Genre;
SELECT * FROM Album;
SELECT * FROM Artist;
