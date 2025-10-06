
FROM maven: AS builder

WORKDIR /CMSSystem

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM intelliJ

WORKDIR /CMSSystem

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]