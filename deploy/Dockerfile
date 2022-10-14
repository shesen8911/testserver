FROM openjdk:17-jdk-slim
WORKDIR /home/java
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","./app.jar"]
EXPOSE 8080