FROM java:9

COPY target/users-1.0.jar user.jar
ENTRYPOINT ["java", "-jar", "user.jar"]

