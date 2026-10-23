-- Sample database from the Chapter 12 slides (testDB / students).
-- Run with: mysql -uroot -p < setup_testDB.sql
CREATE DATABASE IF NOT EXISTS testDB;
USE testDB;

DROP TABLE IF EXISTS students;
CREATE TABLE students (
    id   INT PRIMARY KEY,
    name VARCHAR(40),
    age  INT
);

INSERT INTO students (id, name, age) VALUES
    (1, 'Alice', 20),
    (2, 'Bob',   22),
    (3, 'Cindy', 21);
