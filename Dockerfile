FROM openjdk:22-jdk
WORKDIR /app
COPY target/history-0.0.1-SNAPSHOT.jar /app/history.jar
ENTRYPOINT ["java", "-jar", "/app/history.jar"]