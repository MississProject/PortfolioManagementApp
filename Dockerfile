FROM openjdk:11
COPY target/PortfolioManagementApp-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]