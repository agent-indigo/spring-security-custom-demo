FROM eclipse-temurin:21
COPY target/*.jar ./spring-security-custom-demo.jar
EXPOSE 8080
CMD ["java", "-jar", "spring-security-custom-demo.jar"]