# Artist API - Dropwizard Solution

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Dropwizard](https://img.shields.io/badge/Dropwizard-1.3.16-4DC71F?style=flat-square)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)
![Last Commit](https://img.shields.io/github/last-commit/danielcregg/artistAPI-dropwizard-soln?style=flat-square)

A RESTful API for managing music artist data, built with the [Dropwizard](https://www.dropwizard.io/) Java microservice framework. This project is the solution to a Distributed Systems lab exercise that demonstrates how to build a REST API using JAX-RS annotations, Jackson JSON serialisation, and the Dropwizard application lifecycle.

> **Note:** This repository is a fork of [john-french/artistAPI-dropwizard-soln](https://github.com/john-french/artistAPI-dropwizard-soln).

## Features

- RESTful endpoint to retrieve a list of artists (`GET /artists`)
- JSON serialisation/deserialisation with Jackson
- Dropwizard health check integration
- Configurable server port via YAML configuration
- Fat JAR packaging with Maven Shade plugin

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/artists` | Retrieve all artists |

### Artist Schema

| Field | Type | Description |
|-------|------|-------------|
| `artistId` | `integer` | Unique identifier for the artist |
| `artistName` | `string` | Name of the artist |
| `artistGenre` | `string` | Genre of the artist |
| `albumsRecorded` | `integer` | Number of albums recorded |

## Prerequisites

- Java 7 or higher
- [Apache Maven](https://maven.apache.org/) 3.x

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/danielcregg/artistAPI-dropwizard-soln.git
   cd artistAPI-dropwizard-soln/restAPI-dropwizard
   ```

2. **Build the project:**
   ```bash
   mvn package
   ```

3. **Run the server:**
   ```bash
   java -jar target/restAPI-dropwizard-lab-1.0-SNAPSHOT.jar server src/main/resources/artistApiConfig.yaml
   ```

4. **Test the API:**
   ```bash
   curl http://localhost:8000/artists
   ```

   Expected response:
   ```json
   [{"artistId":1,"artistName":"The GZA","artistGenre":"HipHop","albumsRecorded":2}]
   ```

## Project Structure

```
restAPI-dropwizard/
├── pom.xml                                        # Maven build configuration
├── src/main/java/ie/gmit/ds/
│   ├── Artist.java                                # Artist POJO with Jackson annotations
│   ├── ArtistApiApplication.java                  # Dropwizard application entry point
│   ├── ArtistApiConfig.java                       # Dropwizard configuration class
│   ├── ArtistApiResource.java                     # JAX-RS resource (REST endpoints)
│   └── ExampleHealthCheck.java                    # Dropwizard health check
└── src/main/resources/
    └── artistApiConfig.yaml                       # Server configuration (port 8000)
```

## Configuration

The server is configured via `artistApiConfig.yaml`. By default, it listens on port **8000**. You can modify this file to change the port or add additional Dropwizard configuration options.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
