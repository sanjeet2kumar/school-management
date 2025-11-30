INSERT INTO students (first_name, last_name, email, grade)
VALUES ('Ramesh', 'Kumar', 'ramesh.kumar@example.com', '10'),
       ('Alice', 'Smith', 'alice.smith@example.com', '9');
INSERT INTO teachers (first_name, last_name, email, subject) VALUES ('Anita', 'Sharma', 'anita.sharma@example.com', 'Math');
INSERT INTO teachers (first_name, last_name, email, subject) VALUES ('Rahul', 'Verma', 'rahul.verma@example.com', 'Science');

INSERT INTO courses (name, description) VALUES ('Math', 'Mathematics course');
INSERT INTO courses (name, description) VALUES ('Science', 'Science course');

INSERT INTO class_assignments (teacher_id, course_id, class_name) VALUES (1, 1, '10A');
INSERT INTO class_assignments (teacher_id, course_id, class_name) VALUES (2, 2, '9B');
