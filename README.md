# Notes Application

## Overview
The Notes Application is a simple RESTful API built with Spring Boot, designed to manage notes efficiently. It allows users to create, retrieve, update, and delete notes while ensuring data persistence with PostgreSQL. The application is fully containerized using Docker for easy deployment.

## Features
- REST API for CRUD operations on notes
- Spring Boot with Spring Data JPA for data management
- PostgreSQL as the database
- Dockerized application for seamless deployment

## Docker Images
| Image | Description |
|--------|------------|
| `devops_img` | Runs the Spring Boot application and exposes API endpoints on port `8080`. Uses an embedded Tomcat server. |
| `postgres` | PostgreSQL database container for storing notes data, exposing port `5432`. |

## API Endpoints

| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/api/v1/notes` | Retrieve all notes. |
| GET | `/api/v1/notes/{id}` | Retrieve a single note by ID. |
| POST | `/api/v1/notes/` | Create a new note. |
| PUT | `/api/v1/notes/{id}` | Update an existing note by ID. |
| DELETE | `/api/v1/notes/{id}` | Delete a note by ID. |

## Running with Docker
To build and run the application with Docker:

1. **Build the Docker image:**
   ```sh
   docker build -t devops_img .
   ```
2. **Run the application container:**
   ```sh
   docker run -d -p 8090:8090 --name=dev_con devops_img

   ```
3. **Run the PostgreSQL database container:**
   ```sh
   docker run --name postgres-db -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=notesdb -p 5432:5432 -d postgres
   ```
## Access the Application
API Base URL: http://localhost:8090/api/v1/notes
## Conclusion
This application provides a robust and scalable solution for managing notes, leveraging Spring Boot and Docker for efficient development and deployment.

