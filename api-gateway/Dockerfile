# sıfır bir linux makinada hangi işlemleri oluştururum
FROM maven:3.8.3-openjdk-17 as build
WORKDIR /app
COPY . /app/
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk
COPY --from=build /app/target/api-gateway-0.0.1-SNAPSHOT.jar /app/apigateway.jar
CMD java -jar /app/apigateway.jar
