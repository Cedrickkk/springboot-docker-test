FROM eclipse-temurin:17.0.17_10-jdk-ubi9-minimal
LABEL authors="hulaanmo"
ADD target/springboot-docker-test.jar springboot-docker-test.jar
ENTRYPOINT ["java","-jar","springboot-docker-test.jar"]