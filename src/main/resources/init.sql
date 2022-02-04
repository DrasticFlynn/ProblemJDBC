CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS student;
CREATE TABLE students (id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR (80), surname VARCHAR (100), course_name VARCHAR (100));

INSERT INTO students(name, surname, course_name) VALUES ('Ivan', 'Lavrov', 'Java');
INSERT INTO students(name, surname, course_name) VALUES ('Boris', 'Ostapenko', 'Java');
INSERT INTO students(name, surname, course_name) VALUES ('DimASS', 'Kuzmonov', 'Java');
INSERT INTO students(name, surname, course_name) VALUES ('Suslik', 'Kotaev', 'Java');