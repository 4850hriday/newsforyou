# Use an official OpenJDK runtime as a parent image
FROM openjdk:8-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file into the container at /app
COPY build/libs/newsforyou-0.0.1-SNAPSHOT.jar newsforyou.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "newsforyou.jar"]
