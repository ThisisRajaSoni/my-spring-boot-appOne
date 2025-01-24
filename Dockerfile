# Use a base image with Java 17 (or your preferred JDK version)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper (if you use it)
COPY mvnw mvnw.cmd ./

# Copy the pom.xml file
COPY pom.xml .

# Resolve dependencies (this creates a layer in the image cache)
RUN ./mvnw dependency:resolve

# Copy the project source code
COPY src ./src

# Build the application
RUN ./mvnw package -DskipTests

# Copy the packaged JAR file
COPY target/*.jar app.jar

# Expose the port your Spring Boot app uses (default 8080)
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]