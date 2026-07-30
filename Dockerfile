# Use Eclipse Temurin Java 21 Runtime Image
FROM eclipse-temurin:21-jre

# Set working directory inside the container
WORKDIR /app

# Copy the generated JAR file into the container
COPY target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Start the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]