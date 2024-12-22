FROM openjdk:17
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8085
ENV SERVER_PORT=8085
ENTRYPOINT [ "java", "-jar", "app.jar" ]