# Project Title: Spring Color App

This project is a Spring Boot application that changes the random color displayed on the homepage along with its name. 

## Features
- Generates a random color each time the homepage is accessed.
- Displays the color name and a visual representation of the color.

## Project Structure
```
spring-color-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── colorapp
│   │   │               ├── ColorApplication.java
│   │   │               ├── controller
│   │   │               │   └── ColorController.java 
│   │   │               └── service
│   │   │                   └── ColorService.java
│   │   └── resources
│   │       ├── static
│   │       │   └── css
│   │       │       └── style.css
│   │       └── templates
│   │           └── index.html
├── pom.xml
└── README.md
```

## Getting Started
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/spring-color-app.git
   ```
2. Navigate to the project directory:
   ```sh
   cd spring-color-app
   ```
3. Run the application using Maven:
   ```sh
   mvn spring-boot:run
   ```
4. Open your web browser and go to `http://localhost:8080` to see the application in action.

## Dependencies
- Spring Boot
- Spring Web

## License
This project is licensed under the MIT License.