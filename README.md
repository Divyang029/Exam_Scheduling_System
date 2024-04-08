# Exam Scheduling System

The Exam Scheduling System is a Spring Boot REST API project designed to manage and schedule exams for students, faculty, exam rooms, and supervisors. This API allows you to schedule and organize exams, allocate students to specific exam sessions, assign supervisors to exam rooms, and manage the overall exam timetable.

## Entities

The system includes the following entities:

- **Student**: Represents a student who will be taking exams.
- **Faculty**: Represents the faculty or department responsible for conducting exams.
- **Exam**: Represents a specific exam session with details such as subject, date, time, and assigned room.
- **Room**: Represents an exam room where exams are conducted.
- **Supervisor**: Represents a supervisor assigned to oversee an exam session in a specific room.

## Functionality

The Exam Scheduling System provides the following functionality:

- **Create, Read, Update, Delete (CRUD) Operations**:
  - CRUD operations are available for managing students, faculties, exams, rooms, and supervisors.

- **Exam Scheduling**:
  - Assign students to specific exam sessions.
  - Allocate exam rooms for each session.
  - Assign supervisors to oversee exam sessions.

- **Timetable Generation**:
  - Generate exam timetables based on scheduled exams, rooms, and supervisors.

## Technologies Used

- **Java**: Programming language used to develop the Spring Boot application.
- **Spring Boot**: Framework for building Java-based enterprise applications.
- **Hibernate**: Object-relational mapping (ORM) framework for interacting with databases.
- **Spring Web**: Enables building web applications including RESTful APIs.
- **Postman**: Use Postman to interact with the REST API endpoints using JSON payloads.

## Getting Started

To run the Exam Scheduling System locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Exam_Scheduling_System.git
