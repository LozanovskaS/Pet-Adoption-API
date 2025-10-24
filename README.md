# 🐾 Pet Adoption API - Spring Boot Backend

A RESTful API for managing pet adoption services, built with Spring Boot and Java 21. This backend supports pet listings, adoption applications, user management, comments, and image handling.

## ✨ Features

- **Pet Management**: Create, read, update, and delete pet listings
- **Adoption Applications**: Submit and manage adoption applications
- **User Management**: Handle user registration and profiles
- **Comments**: Allow users to comment on pet listings
- **Image Management**: Upload and manage pet images
- **Advanced Filtering**: Search pets by species, breed, and adoption status

## 🛠️ Technologies

- **Java 21**
- **Spring Boot 3.2.5**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Azure App Service** (Deployment)

## 📦 Prerequisites

- Java 21 or higher
- Maven 3.6+
- PostgreSQL 14+
- Git

## 🚀 Installation

### 1. Clone the repository

```bash
git clone https://github.com/LozanovskaS/Pet-Adoption-API.git
cd Pet-Adoption-API
```

### 2. Configure Database

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/petadoption
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### 3. Build the project

```bash
./mvnw clean install
```

### 4. Run the application

```bash
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`

## 📡 API Endpoints

### Pets

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/pet` | Get all pets |
| GET | `/pet/{id}` | Get pet by ID |
| GET | `/pet/species/{species}` | Find pets by species |
| GET | `/pet/breed/{breed}` | Find pets by breed |
| GET | `/pet/status/{status}` | Find pets by status |
| POST | `/pet` | Create new pet |
| PUT | `/pet/{id}` | Update pet |
| DELETE | `/pet/{id}` | Delete pet |

### Adoption Applications

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/AdoptionApp` | Get all applications |
| GET | `/AdoptionApp/{id}` | Get application by ID |
| GET | `/AdoptionApp/status/{status}` | Find by status |
| GET | `/AdoptionApp/pet/{petId}` | Find by pet ID |
| POST | `/AdoptionApp` | Create application |
| PUT | `/AdoptionApp` | Update application |
| DELETE | `/AdoptionApp/{id}` | Delete application |

### Users

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/users` | Get all users |
| GET | `/users/{id}` | Get user by ID |
| GET | `/users/username/{username}` | Find by username |
| GET | `/users/email/{email}` | Find by email |
| GET | `/users/phone/{phone}` | Find by phone |
| GET | `/users/lastName/{lastName}` | Find by last name |
| GET | `/users/address/{address}` | Find by address |
| POST | `/users` | Create user |
| PUT | `/users` | Update user |
| DELETE | `/users/{id}` | Delete user |

### Comments

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/comment` | Get all comments |
| GET | `/comment/{id}` | Get comment by ID |
| GET | `/comment/pet/{petId}` | Find by pet ID |
| POST | `/comment` | Create comment |
| PUT | `/comment` | Update comment |
| DELETE | `/comment/{id}` | Delete comment |

### Images

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/image` | Get all images |
| GET | `/image/{id}` | Get image by ID |
| GET | `/image/pet/{petId}` | Find by pet ID |
| GET | `/image/url/{url}` | Find by URL |
| POST | `/image` | Create image |
| PUT | `/image` | Update image |
| DELETE | `/image/{id}` | Delete image |

## 🗄️ Database Configuration

### For Azure PostgreSQL:

Add these environment variables in Azure App Service Configuration:

```
SPRING_DATASOURCE_URL=jdbc:postgresql://your-server.postgres.database.azure.com:5432/petadoption?sslmode=require
SPRING_DATASOURCE_USERNAME=your-username@your-server
SPRING_DATASOURCE_PASSWORD=your-password
```

## 🏃 Running the Application

### Local Development

```bash
./mvnw spring-boot:run
```

### Production Build

```bash
./mvnw clean package -DskipTests
java -jar target/API-0.0.1-SNAPSHOT.jar
```

## 🌐 Deployment

This application is configured for deployment on **Azure App Service** with **GitHub Actions** for CI/CD.

### Azure Deployment

1. Push code to GitHub
2. Create Azure Web App (Java 21, Linux)
3. Enable GitHub Actions deployment
4. Configure database environment variables
5. Application automatically deploys on push to main branch

**Live API:** `https://pet-adoption-backend-api.azurewebsites.net`

## 🔒 CORS Configuration

Currently configured to allow requests from:
- `http://localhost:4200` (Angular development)
- Configure additional origins in `PetController` or `WebConfig`

## 👥 Contributors

- **LozanovskaS** - Initial work

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📧 Contact

For questions or support, please open an issue in the GitHub repository.

---

**Made with ❤️ for pets looking for their forever homes** 🐶🐱
