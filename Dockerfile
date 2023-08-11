FROM maven:3.6.3-jdk-11-slim AS build
COPY . .
RUN mvn clean package -DskipTests


FROM openjdk:11-jre-slim
COPY --from=build /target/*.jar SpringZoomcarJwtApplication.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/SpringZoomcarJwtApplication.jar"]