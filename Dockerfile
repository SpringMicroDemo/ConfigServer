# Start with the base image for Java
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file to the container (assuming the JAR file is generated in the target directory)
COPY target/*.jar app.jar

# Expose the port that this service will listen on (change according to each service's configuration)
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]