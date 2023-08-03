-- Create Student table
CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    Email VARCHAR(255),
    PhoneNumber VARCHAR(255),
    Address VARCHAR(255),
    DateOfBirth DATE,
    Gender VARCHAR(255),
    EnrollmentDate DATE,
    GraduationDate DATE
);

-- Create Course table
CREATE TABLE Course (
    CourseID INT PRIMARY KEY,
    CourseName VARCHAR(255),
    Description VARCHAR(255),
    CreditHours INT,
    Department VARCHAR(255),
    Prerequisites VARCHAR(255),
    Maximum_Mark INT
);

-- Create Enrollment table
CREATE TABLE Enrollment (
    EnrollmentID INT PRIMARY KEY,
    StudentID INT,
    CourseID INT,
    EnrollmentDate DATE,
    Grade DECIMAL(3,2),
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID)
);

-- Create Professor table
CREATE TABLE Professor (
    ProfessorID INT PRIMARY KEY,
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    Email VARCHAR(255),
    PhoneNumber VARCHAR(255),
    Address VARCHAR(255),
    HireDate DATE,
    Department VARCHAR(255)
);

-- Create Department table
CREATE TABLE Department (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(255),
    Address VARCHAR(255),
    PhoneNumber VARCHAR(255),
    Email VARCHAR(255)
);

CREATE TABLE Result (
    Result_ID INT PRIMARY KEY,
    Student_ID INT,
    Course_ID INT,
    Grade VARCHAR(3),
    Total_Marks DECIMAL(4,2),
    Percentage DECIMAL(4,2),
    FOREIGN KEY (Student_ID) REFERENCES Student(Student_ID),
    FOREIGN KEY (Course_ID) REFERENCES Course(Course_ID)
);


-- Create Mark table
CREATE TABLE Mark (
    MarkID INT PRIMARY KEY,
    StudentID INT,
    CourseID INT,
    Question_Number INT,
    Mark INT,
    Maximum_Mark INT,
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID)
);

-- Create a trigger to validate the entered mark against the maximum mark in the course table
CREATE TRIGGER validate_mark
BEFORE INSERT ON Mark
FOR EACH ROW
BEGIN
    IF NEW.Mark > (SELECT Maximum_Mark FROM Course WHERE CourseID = NEW.CourseID) THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Entered mark exceeds the maximum mark for the course';
    END IF;
END;

ALTER TABLE Mark
ADD Question_Number INT;

ALTER TABLE Mark
ADD CONSTRAINT question_number_check
CHECK (Question_Number BETWEEN 1 AND 6);

-- Create a trigger to validate the entered question number
CREATE TRIGGER validate_question
BEFORE INSERT ON Mark
FOR EACH ROW
BEGIN
    IF NEW.Question_Number > 6 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Entered question number exceeds the maximum number of questions';
    END IF;
END;

--   /** Used for error messages. */
--     public static final int  ERROR_MESSAGE = 0;
--     /** Used for information messages. */
--     public static final int  INFORMATION_MESSAGE = 1;
--     /** Used for warning messages. */
--     public static final int  WARNING_MESSAGE = 2;
--     /** Used for questions. */
--     public static final int  QUESTION_MESSAGE = 3;
--     /** No icon is used. */
--     public static final int   PLAIN_MESSAGE = -1;