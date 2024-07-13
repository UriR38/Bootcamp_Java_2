CREATE DATABASE IF NOT EXISTS restaurante;
USE restaurante;

CREATE TABLE IF NOT EXISTS salesman (
    SALESMAN_ID NUMERIC(5),
    NAME VARCHAR(30),
    CITY VARCHAR(15),
    COMMISSION DECIMAL(5 , 2 ),
    PRIMARY KEY (SALESMAN_ID)
);

CREATE TABLE IF NOT EXISTS orders (
    ORD_NO NUMERIC(5),
    PURCH_AMT DECIMAL(8 , 2 ),
    ORD_DATE DATE,
    CUSTOMER_ID NUMERIC(5),
    SALESMAN_ID NUMERIC(5),
    PRIMARY KEY (ORD_NO),
    FOREIGN KEY (CUSTOMER_ID)
        REFERENCES customer (CUSTOMER_ID),
    FOREIGN KEY (SALESMAN_ID)
        REFERENCES salesman (SALESMAN_ID)
);
CREATE TABLE IF NOT EXISTS customer (
    CUSTOMER_ID NUMERIC(5),
    CUST_NAME VARCHAR(30),
    CITY VARCHAR(15),
    GRADE NUMERIC(3),
    PRIMARY KEY (CUSTOMER_ID)
);

INSERT INTO salesman VALUES (1001, 'James Hoog', 'New York', 0.15);
INSERT INTO salesman VALUES (1002, 'Nail Knite', 'Paris', 0.13);
INSERT INTO salesman VALUES (1003, 'Pit Alex', 'London', 0.11);
INSERT INTO salesman VALUES (1004, 'Mc Lyon', 'Paris', 0.14);
INSERT INTO salesman VALUES (1005, 'Paul Adam', 'Rome', 0.13);
INSERT INTO salesman VALUES (1006, 'Lauren Bisk', 'New York', 0.12);
INSERT INTO salesman VALUES (1007, 'Guillermo Fern', 'Madrid', 0.15);
INSERT INTO salesman VALUES (1008, 'Sanchez Noriega', 'Miami', 0.13);
INSERT INTO salesman VALUES (1009, 'Micheal Lawson', 'London', 0.14);
INSERT INTO salesman VALUES (1010, 'Amber Johnny', 'Paris', 0.12);

INSERT INTO customer VALUES (5001, 'Holmes Inc.', 'London', 2);
INSERT INTO customer VALUES (5002, 'Micheal Corp.', 'New York', 2);
INSERT INTO customer VALUES (5003, 'Albertson LLC', 'San Jose', 3);
INSERT INTO customer VALUES (5004, 'Tesla Motors', 'San Francisco', 5);
INSERT INTO customer VALUES (5005, 'Starbucks', 'Seattle', 4);
INSERT INTO customer VALUES (5006, 'Amazon Inc.', 'Texas', 5);
INSERT INTO customer VALUES (5007, 'Ford Motors', 'Michigan', 4);
INSERT INTO customer VALUES (5008, 'General Electric', 'Boston', 3);
INSERT INTO customer VALUES (5009, 'Apple Inc.', 'California', 5);
INSERT INTO customer VALUES (5010, 'Microsoft Corp.', 'Washington', 5);

INSERT INTO orders VALUES (70001, 150.50, '2022-07-10', 5001, 1001);
INSERT INTO orders VALUES (70002, 2500.00, '2022-07-11', 5002, 1002);
INSERT INTO orders VALUES (70003, 500.00, '2022-07-12', 5003, 1003);
INSERT INTO orders VALUES (70004, 2000.00, '2022-07-13', 5004, 1004);
INSERT INTO orders VALUES (70005, 1200.00, '2022-07-14', 5005, 1005);
INSERT INTO orders VALUES (70006, 250.00, '2022-07-15', 5006, 1006);
INSERT INTO orders VALUES (70007, 1800.00, '2022-07-16', 5007, 1007);
INSERT INTO orders VALUES (70008, 2400.00, '2022-07-17', 5008, 1008);
INSERT INTO orders VALUES (70009, 450.00, '2022-07-18', 5009, 1009);
INSERT INTO orders VALUES (70010, 3300.00, '2022-07-19', 5010, 1010);

SELECT 
    COUNT(*)
FROM
    orders;
SELECT 
    CUST_NAME
FROM
    customer
GROUP BY CUST_NAME
HAVING COUNT(CUST_NAME) = 1;
SELECT 
    s.SALESMAN_ID, s.NAME, SUM(o.PURCH_AMT) AS Total_Sales
FROM
    salesman s
        JOIN
    orders o ON s.SALESMAN_ID = o.SALESMAN_ID
GROUP BY s.SALESMAN_ID , s.NAME
ORDER BY Total_Sales DESC;
SELECT 
    *
FROM
    customer
ORDER BY CUSTOMER_ID
LIMIT 5;
SELECT 
    *
FROM
    orders
ORDER BY PURCH_AMT ASC
LIMIT 1;
SELECT 
    *
FROM
    orders
ORDER BY PURCH_AMT DESC
LIMIT 1;






