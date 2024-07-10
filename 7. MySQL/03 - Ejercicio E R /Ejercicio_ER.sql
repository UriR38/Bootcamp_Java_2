-- Crear una base de datos
CREATE DATABASE IF NOT EXISTS testBaseDD;

-- Ir a la base de datos
USE testBaseDD;

-- Crear tabla
CREATE TABLE IF NOT EXISTS Ejercicio (
    fecha DATE,
    texto_largo TEXT,
    numero_entero INT,
    numero_decimal DECIMAL(10, 2)
);

SHOW COLUMNS FROM Ejercicio;