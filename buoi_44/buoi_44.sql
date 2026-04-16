-- Thao tác với DB
CREATE DATABASE my_db;
DROP DATABASE my_db;
USE my_db;

-- Thao tác với Table
CREATE TABLE employees (
	employee_id INT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    hire_date DATE
);
DESCRIBE employees;
ALTER TABLE employees ADD email VARCHAR(100);
ALTER TABLE employees RENAME COLUMN email to phone_number;
ALTER TABLE employees MODIFY phone_number TEXT;
ALTER TABLE employees DROP phone_number;
ALTER TABLE employees RENAME TO staffs;
DROP TABLE staffs;

-- Thao tác với dữ liệu
CREATE TABLE students
(
	student_id VARCHAR(255),  -- Mã số sinh viên
	student_name VARCHAR(255),  -- Tên sinh viên
	age INT  -- Tuổi
);
SELECT * FROM students;
INSERT INTO students (student_id, student_name, age) VALUES ('S01', 'A', 29);
INSERT INTO students VALUES ('S02', 'B', 31);
INSERT INTO students VALUES ('S03', 'C');  -- Lỗi
INSERT INTO students (student_id, student_name) VALUES ('S03', 'C');
INSERT INTO students (student_name, student_id) VALUES ('S04', 'D');
INSERT INTO students (student_id, student_name) VALUES ('S05', 'E', 20);  -- Lỗi
INSERT INTO students (student_id, student_name) VALUES ('S05');  -- Lỗi
INSERT INTO students (student_id, student_name, age) VALUES
('S05', 'A', 29),
('S06', 'B', 21),
('S07', 'C', 25);
UPDATE students SET student_id='S04', student_name='D' WHERE student_id='D';
UPDATE students SET student_name='Lê Đào Tấn Thành';
DELETE FROM students;
DELETE FROM students WHERE student_id='S07';
INSERT INTO students (student_id, student_name, age) VALUES
('S01', 'A', 29),
('S02', 'B', 28),
('S03', 'C', 25),
('S04', 'D', 31),
('S05', 'E', 24),
('S06', 'F', 25);
SELECT * FROM students;
SELECT * FROM students WHERE age>25;
SELECT student_id, student_name FROM students;
SELECT student_id AS ma_so_sinh_vien, student_name FROM students;
DROP TABLE students;
CREATE TABLE students
(
	student_id VARCHAR(255),  -- Mã số sinh viên
	student_name VARCHAR(255),  -- Tên sinh viên
	age INT,  -- Tuổi
	PRIMARY KEY (student_id)
);
INSERT INTO students (student_id, student_name, age) VALUES ('S01', 'A', 29);
INSERT INTO students (student_id, student_name, age) VALUES ('S02', 'B', 21);
INSERT INTO students (student_id, student_name, age) VALUES ('S02', 'C', 25);  -- Sai!
DROP TABLE students;
CREATE TABLE students
(
	student_id VARCHAR(255),  -- Mã số sinh viên
	student_name VARCHAR(255),  -- Tên sinh viên
	age INT,  -- Tuổi
	PRIMARY KEY (student_id, student_name)
);
INSERT INTO students (student_id, student_name, age) VALUES ('S01', 'A', 29);
INSERT INTO students (student_id, student_name, age) VALUES ('S02', 'B', 21);
INSERT INTO students (student_id, student_name, age) VALUES ('S02', 'C', 25);
INSERT INTO students (student_id, student_name, age) VALUES ('S03', 'C', 23);
INSERT INTO students (student_id, student_name, age) VALUES ('S03', 'C', 22);  -- Sai!
DROP TABLE students;
CREATE TABLE students
(
	student_id INT AUTO_INCREMENT,  -- Mã số sinh viên
	student_name VARCHAR(255),  -- Tên sinh viên
	age INT,  -- Tuổi
	PRIMARY KEY (student_id)
);
INSERT INTO students (student_name, age) VALUES
('A', 29),
('B', 21),
('C', 25);
INSERT INTO students (student_id, student_name, age) VALUE (100, 'D', 20);

















