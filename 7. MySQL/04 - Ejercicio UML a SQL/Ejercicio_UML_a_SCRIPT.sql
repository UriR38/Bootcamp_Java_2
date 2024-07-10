CREATE DATABASE IF NOT EXISTS testBaseDD;
USE testBaseDD;

CREATE TABLE Genre (
    idGenre INT PRIMARY KEY,
    Genre VARCHAR(255)
);

CREATE TABLE Album (
    idAlbum INT PRIMARY KEY,
    albumName VARCHAR(255),
    dateReleased DATETIME
);

CREATE TABLE Artist (
    artistId INT PRIMARY KEY,
    artistName VARCHAR(255)
);
