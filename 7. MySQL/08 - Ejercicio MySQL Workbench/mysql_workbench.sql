-- DROP TABLE IF EXISTS address;
-- DROP TABLE IF EXISTS city;
-- DROP TABLE IF EXISTS country;
CREATE TABLE IF NOT EXISTS country (
    country_id SMALLINT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(50) NOT NULL,
    last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS city (
    city_id SMALLINT PRIMARY KEY AUTO_INCREMENT,
    city VARCHAR(50) NOT NULL,
    country_id SMALLINT NOT NULL,
    last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (country_id)
        REFERENCES country (country_id)
);

CREATE TABLE IF NOT EXISTS address (
    address_id SMALLINT PRIMARY KEY AUTO_INCREMENT,
    address VARCHAR(50) NOT NULL,
    district VARCHAR(20) NOT NULL,
    city_id SMALLINT NOT NULL,
    postal_code VARCHAR(10) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    location VARCHAR(20) NOT NULL,
    last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (city_id)
        REFERENCES city (city_id)
);

-- Insertar registros en la tabla 'country'
INSERT INTO country (country) VALUES
('Country1'), ('Country2'), ('Country3'), ('Country4'), ('Country5'),
('Country6'), ('Country7'), ('Country8'), ('Country9'), ('Country10'),
('Country11'), ('Country12'), ('Country13'), ('Country14'), ('Country15'),
('Country16'), ('Country17'), ('Country18'), ('Country19'), ('Country20');

-- Insertar registros en la tabla 'city'
INSERT INTO city (city, country_id) VALUES
('City1', 1), ('City2', 2), ('City3', 3), ('City4', 4), ('City5', 5),
('City6', 6), ('City7', 7), ('City8', 8), ('City9', 9), ('City10', 10),
('City11', 11), ('City12', 12), ('City13', 13), ('City14', 14), ('City15', 15),
('City16', 16), ('City17', 17), ('City18', 18), ('City19', 19), ('City20', 20);

-- Insertar registros en la tabla 'address'
INSERT INTO address (address, district, city_id, postal_code, phone, location) VALUES
('Address1', 'District1', 1, '10001', '111-1111', 'Location1'),
('Address2', 'District2', 2, '10002', '222-2222', 'Location2'),
('Address3', 'District3', 3, '10003', '333-3333', 'Location3'),
('Address4', 'District4', 4, '10004', '444-4444', 'Location4'),
('Address5', 'District5', 5, '10005', '555-5555', 'Location5'),
('Address6', 'District6', 6, '10006', '666-6666', 'Location6'),
('Address7', 'District7', 7, '10007', '777-7777', 'Location7'),
('Address8', 'District8', 8, '10008', '888-8888', 'Location8'),
('Address9', 'District9', 9, '10009', '999-9999', 'Location9'),
('Address10', 'District10', 10, '10010', '101-0101', 'Location10'),
('Address11', 'District11', 11, '10011', '111-0111', 'Location11'),
('Address12', 'District12', 12, '10012', '121-0121', 'Location12'),
('Address13', 'District13', 13, '10013', '131-0131', 'Location13'),
('Address14', 'District14', 14, '10014', '141-0141', 'Location14'),
('Address15', 'District15', 15, '10015', '151-0151', 'Location15'),
('Address16', 'District16', 16, '10016', '161-0161', 'Location16'),
('Address17', 'District17', 17, '10017', '171-0171', 'Location17'),
('Address18', 'District18', 18, '10018', '181-0181', 'Location18'),
('Address19', 'District19', 19, '10019', '191-0191', 'Location19'),
('Address20', 'District20', 20, '10020', '201-0201', 'Location20');

SELECT 
    a.address, c.city, co.country
FROM
    address a
        INNER JOIN
    city c ON a.city_id = c.city_id
        INNER JOIN
    country co ON c.country_id = co.country_id;

