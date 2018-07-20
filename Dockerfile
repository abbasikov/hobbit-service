FROM java:8
ADD /webflow-service-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "/webflow-service-0.0.1-SNAPSHOT.jar"]