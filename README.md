# 📦 Item Management REST API (Spring Boot)

## Project Overview

This project is a **simple Java Spring Boot RESTful API** for managing a collection of items (similar to products in an e-commerce application like Flipkart).

The application uses **in-memory storage (ArrayList)** and provides REST APIs to add items and retrieve them.  
It is created for **learning, assignments, and demonstration purposes**.

---

## Technologies Used

- Java 17+
- Spring Boot
- Maven
- RESTful APIs
- In-memory data storage (ArrayList)

---

## How to Run the Application

### Prerequisites

- Java 17 or above installed
- Any Java IDE (IntelliJ IDEA / Eclipse / VS Code)

---

### Run Using IDE (Recommended)

1. Open the project in your IDE
2. Locate `ApiTaskApplication.java`
3. Click **Run**
4. The application will start on port **8080**

---

## Base URL

```
http://localhost:8080
```

---

## 📌 API Endpoints

### 1️ Add a New Item

**Endpoint**

```
POST /api/items
```

**Description**  
Adds a new item to the in-memory list after validating input fields.

**Request Body (JSON)**

```json
{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 65000
}
```

**Validation Rules**

- `name` must not be null or empty
- `price` must be greater than 0

**Success Response**

```
201 CREATED
```

---

### 2️ Get a Single Item by ID

**Endpoint**

```
GET /api/items/{id}
```

**Description**  
Retrieves a single item using its unique ID.

**Example**

```
GET /api/items/1
```

**Responses**

- `200 OK` – Item found
- `404 NOT FOUND` – Item not found

---

### 3️ Get All Items

**Endpoint**

```
GET /api/items
```

**Description**  
Returns all items currently stored in the in-memory list.

**Response Example**

```json
[
  {
    "id": 1,
    "name": "Laptop",
    "description": "Gaming Laptop",
    "price": 65000
  },
  {
    "id": 2,
    "name": "Smartphone",
    "description": "5G Android phone",
    "price": 30000
  }
]
```

**Success Response**

```
200 OK
```

---

## Important Implementation Details

- Items are stored using an **ArrayList (in-memory storage)**
- Data is **not persistent** and will be lost when the application restarts
- Item IDs are **auto-generated**
- Input validation is handled in the controller
- RESTful principles are followed using proper HTTP methods and URLs

---

## Limitations

- No database integration
- No authentication or authorization
- Suitable only for learning and demo purposes

---

## Author

**Name:** Tejas Mohare

---

## Requirement Satisfaction Checklist

RESTful API endpoints implemented  
 Add item API  
 Get item by ID API  
 Get all items API  
 Input validation included

---
