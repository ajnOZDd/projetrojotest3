FROM amazoncorretto:17
ARG WAR_FILE=sport-0.0.1-SNAPSHOT.war
COPY ${WAR_FILE} app.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.war"]