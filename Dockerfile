FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/prem-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
