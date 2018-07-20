FROM java:8
ADD /hobbit-service-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "/hobbit-service-0.0.1-SNAPSHOT.jar"]