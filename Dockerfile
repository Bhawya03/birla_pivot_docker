FROM openjdk:21-oracle
COPY target/*.jar Devops.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","Devops.jar"]