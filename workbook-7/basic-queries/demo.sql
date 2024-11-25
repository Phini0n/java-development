DROP DATABASE IF EXISTS School;

CREATE DATABASE School;

USE School;

DROP TABLE IF EXISTS StudentCourses;
DROP TABLE IF EXISTS Students;
DROP TABLE IF EXISTS Courses;

CREATE TABLE Students(
StudentID INT AUTO_INCREMENT PRIMARY KEY,
FirstName VARCHAR(50) NOT NULL,
LastName VARCHAR(50) NOT NULL,
BirthDate DATE,
EnrollmentDate DATE,
Email VARCHAR(100)
);

CREATE TABLE Courses(
CourseID INT AUTO_INCREMENT PRIMARY KEY,
CourseName VARCHAR(100) NOT NULL,
CourseDescription TEXT,
Credits INT NOT NULL
);

CREATE TABLE StudentCourses(
StudentCourseID INT AUTO_INCREMENT PRIMARY KEY,
StudentID INT,
CourseID INT,
EnrollmentDate DATE,
FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);

INSERT INTO Students (FirstName, LastName, BirthDate, EnrollmentDate, Email)
VALUES
('John', 'Doe', '2000-01-15', '2018-09-01', 'john.doe@example.com'),
('Jane', 'Smith', '1999-04-22', '2018-09-01', 'jane.smith@example.com');

INSERT INTO Courses(CourseName, CourseDescription, Credits)
VALUES
('Computer Science', 'Intro', 3),
('Calculus I', 'An introduction to calculus', 4);

INSERT INTO StudentCourses(StudentID, CourseID, EnrollmentDate)
VALUES
(1, 1, '2018-09-19');