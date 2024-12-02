# Library-System
## Overview

**IbrarySystem** is a Spring Boot application built to demonstrate the implementation of a library management system. The application leverages Spring Boot's powerful ecosystem, including JPA for data management and PostgreSQL for database storage, to create a scalable and efficient backend solution.

## Features

- RESTful APIs for library management.
- Persistent data storage using PostgreSQL.
- Simplified development experience with Spring Boot DevTools.
- Leveraging Lombok for boilerplate code reduction.

## Technologies Used

- **Java 17**
- **Spring Boot 3.4.0**
- **Spring Data JPA** for ORM and database operations.
- **PostgreSQL** as the database.
- **Lombok** for reducing boilerplate Java code.
- **Maven** for build and dependency management.

## Prerequisites

Ensure the following are installed:

- Java 17 
- Maven 3.6
- PostgreSQL database

1. Create a PostgreSQL database.
2. Update the `application.properties` file with your database connection details:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
## Project Structure

- `src/main/java`: Contains the Java source code.
  - `controller`: REST API endpoints.
  - `service`: Business logic.
  - `repository`: Interfaces for database interaction using JPA.
  - `model`: Entity classes mapping to database tables.
- `src/main/resources`: Configuration files and static resources.
  - `application.properties`: Contains database and application settings.
- `src/test`: Unit and integration tests.

## Dependencies

Key dependencies used in this project are:

- **Spring Boot Starter Data JPA**: For database operations and ORM.
- **Spring Boot Starter Web**: For building REST APIs.
- **PostgreSQL Driver**: To interact with PostgreSQL database.
- **Lombok**: For reducing boilerplate code.
- **Spring Boot DevTools**: For enhancing the development experience.

  ## API Endpoints

The following endpoints are available for managing authors in the library system:

### Base URL
`/library/author`

### Endpoints

1. **Get All Authors**
   - **URL:** `/get-all-authors`
   - **Method:** `GET`
   - **Description:** Retrieves a list of all authors in the system.
   - **Response:** Returns a JSON array of `Author` objects.

2. **Get Author by ID**
   - **URL:** `/get-author-by-id`
   - **Method:** `GET`
   - **Description:** Retrieves the details of an author by their ID.
   - **Query Parameter:**
     - `id` (integer): The ID of the author.
   - **Response:** Returns a JSON object representing the `Author`.

3. **Add a New Author**
   - **URL:** `/add-author`
   - **Method:** `POST`
   - **Description:** Adds a new author to the system.

     - Replace `id` and `name` with actual values.
   - **Response:** Returns the created `Author` object.

4. **Update an Author**
   - **URL:** `/update-author`
   - **Method:** `POST`
   - **Description:** Updates an existing author's details.
     - Replace `id` and `name` with actual values.
   - **Response:** Returns the updated `Author` object.

5. **Delete an Author by ID**
   - **URL:** `/delete-author-by-id`
   - **Method:** `POST`
   - **Description:** Deletes an author by their ID.
   - **Query Parameter:**
     - `id` (integer): The ID of the author to be deleted.
   - **Response:** None.

6. **Delete All Authors**
   - **URL:** `/delete-all-authors`
   - **Method:** `POST`
   - **Description:** Deletes all authors in the system.
   - **Response:** None.

### Data Model


