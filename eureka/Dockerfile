FROM adoptopenjdk/openjdk17:jdk-17.0.2-slim
WORKDIR /opt
COPY target/*.jar /opt/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]