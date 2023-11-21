FROM amazoncorretto:17
ARG WAR_FILE=sport-0.0.1-SNAPSHOT.war
COPY sport-0.0.1-SNAPSHOT.war app.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.war"]