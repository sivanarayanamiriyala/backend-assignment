# Janitri Backend Assignment

## Overview
This project is a backend system for a company that monitors patients' heart rate data. It is built using Spring Boot and provides RESTful APIs for user management, patient management, and heart rate data management.

## Features
- User Registration and Login
- Patient Management
- Heart Rate Management
- Secure and efficient data handling
- Robust error handling and data validation

## Assumptions and Decisions
- No authentication/authorization protocols are used. Simple email and password matching is implemented for login.
- The heart rate monitoring device is assumed to provide integer values representing the heart rate.
- H2 in-memory database is used for simplicity and ease of testing.

## Technologies Used
- **Spring Boot** for creating the REST API.
- **Hibernate** as the ORM tool.
- **H2 Database** for in-memory persistence.
- **Maven** for dependency management.

## How to Set Up and Run the Project

### Prerequisites
- Java 17 or above
- Maven
- Eclipse IDE (or any IDE supporting Maven)

### Steps to Set Up

1. **Clone the repository**:
   ```bash
   git clone https://github.com/sivanarayanamiriyala/janitriassignment

#### Understanding API Calls

you can use Postman API to understand the request and responses

### API Setup

User APIs
Register User
URL: /users/register
Method: POST
Request Body:

json
Copy code
{
  "email": "example@example.com",
  "password": "password123"
}
Response: Returns the registered user details.

Login User
URL: /users/login
Method: POST
Request Parameters:

email: The user's email.
password: The user's password. Response: Returns the user details if the email and password match.

Patient APIs
Add Patient
URL: /patients/add
Method: POST
Request Body:

json
Copy code
{
  "name": "John Doe",
  "age": 45
}
Response: Returns the added patient details.

Retrieve Patient
URL: /patients/{id}
Method: GET
Path Variable:

id: The patient ID.
Response: Returns the patient details.
Heart Rate APIs
Record Heart Rate
URL: /heartrate/record
Method: POST
Request Body:

json
Copy code
{
  "patientId": 1,
  "heartRate": 75
}
Response: Returns the recorded heart rate data.

Retrieve Heart Rate
URL: /heartrate/{patientId}
Method: GET
Path Variable:

patientId: The patient's ID.
Response: Returns the heart rate data of the specified patient.
