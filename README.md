# 🍔 Food Delivery API

<p align="center">
  <img src="https://img.shields.io/badge/Java-Backend-orange?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/SpringBoot-Framework-brightgreen?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/REST-API-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Oracle-Database-red?style=for-the-badge&logo=oracle" />
</p>

---

## 📖 Project Overview

Food Delivery API is a backend RESTful web service developed using Spring Boot following Layered Architecture principles.

The project models the core backend operations of a food delivery platform similar to Swiggy or Zomato.

Currently, the project contains a fully functional and tested User Module that handles customer identity management.

---

# 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate ORM
- REST APIs
- Maven
- Oracle Database
- Postman
- Swagger

---

# 🏗️ Architecture Used

The project follows:

- Layered Architecture
- RESTful API Design

---

# 🔄 Layered Architecture Flow

```text
Client Request
   ↓
Controller Layer
   ↓
DTO Layer
   ↓
Service Layer
   ↓
Repository Layer
   ↓
Database
```

---

# ✅ Current Module Completed

## User Module

The User Module acts as the Identity Management Module of the system.

It manages:

- Customer registration
- Customer information retrieval
- Customer account deactivation
- User identity management

The module was developed using DTOs, Service Layer, Repository Layer, Mapper Layer, and  Exception Handling.

---

# 🚀 Features Implemented in User Module

## User Registration

Registers a new customer into the system.

### Functionalities

- Accepts user data using JSON
- Validates unique email
- Stores user details in database
- Returns structured API response

---

## Get User By ID

Fetches customer details using user ID.

---

## Get User By Email

Fetches customer details using email.

---

## Deactivate User

Performs soft delete by deactivating customer account.

---

# 📁 Project Structure

```text
com.fooddelivery
│
├── controller
│     └── UserController
│
├── service
│     ├── UserService
│     └── impl
│           └── UserServiceImpl
│
├── repository
│     └── UserRepository
│
├── entity
│     └── User
│
├── dto
│     ├── UserRequestDTO
│     └── UserResponseDTO
│
├── mapper
│     └── UserMapper
│
├── exception
│     ├── BadRequestException
│     ├── ResourceNotFoundException
│     ├── ErrorResponse
│    
│
└── enums
      └── UserRole
```

---

# 🌐 API Endpoints

## 📝 Register User

```http
POST /api/users/register
```

### Example Request Body

```json
{
  "name": "Ritu Raj",
  "email": "rituxyz@gmail.com",
  "password": "12345",
  "phoneNumber": "1216333110",
  "address": "India"
}
```

### Example Response

```json
{
  "userId": 1,
  "name": "Ritu Raj",
  "email": "rituxyz@gmail.com",
  "phoneNumber": "1216333110",
  "address": "India"
}
```

---

## 🔍 Get User By ID

```http
GET /api/users/{userId}
```

### Example Endpoint

```http
GET http://localhost:8080/api/users/1
```

### Example Response

```json
{
  "userId": 1,
  "name": "Ritu Raj",
  "email": "rituxyz@gmail.com",
  "phoneNumber": "1216333110",
  "address": "India"
}
```

---

## 📧 Get User By Email

```http
GET /api/users/email/{email}
```

### Example Endpoint

```http
GET http://localhost:8080/api/users/email/ritu@gmail.com
```

### Example Response

```json
{
  "userId": 1,
  "name": "Ritu Raj",
  "email": "rituxyz@gmail.com",
  "phoneNumber": "1216333110",
  "address": "India"
}
```

---

## ❌ Deactivate User

```http
PUT /api/users/{userId}/deactivate
```

### Example Endpoint

```http
PUT http://localhost:8080/api/users/1/deactivate
```

### Example Response

```text
User deactivated successfully
```

---

# 👥 User Roles

The system supports role-based user management.

```text
CUSTOMER        → Orders food
ADMIN           → Manages platform
DELIVERY_AGENT  → Delivers orders
```

## CUSTOMER

Represents food ordering customers.

## ADMIN

Represents platform administrators.

## DELIVERY\_AGENT

Represents delivery personnel.

---

# 🧠 Key Backend Concepts Implemented

- RESTful API Development
- Layered Architecture
- DTO Pattern
- Entity Mapping
- Exception Handling
- JPA Repository Pattern
- Hibernate ORM
- Dependency Injection
- JSON Request/Response Handling
- ResponseEntity Usage
- Service Orchestration

---

# ⚠️ Exception Handling

Custom Exceptions:

- BadRequestException
- ResourceNotFoundException
- ErrorResponse

---

# 🧪 Testing

All APIs were tested successfully using Postman.

<p align="center">
  🚀 API Testing Completed Successfully 🚀
</p>

Tested scenarios include:

- Successful user registration
- Duplicate email validation
- Fetching user by ID
- Fetching user by email
- User deactivation
- Exception handling

---

# 📚 Learning Outcomes

This project helped in understanding:

- Real-world backend architecture
- API request-response lifecycle
- DTO and Mapper usage
- Layer separation principles
- Database interaction using JPA
- Exception handling strategies
- REST API development best practices

---

# 👨‍💻 Author

Ritu Raj

Java Full Stack Developer

