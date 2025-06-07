FROM openjdk:17
COPY target/jenkinstestapp-0.0.1-SNAPSHOT.jar jenapp.jar
ENTRYPOINT ["java","-jar","/jenapp.jar"]