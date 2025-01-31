FROM openjdk:21-oracle
COPY target/*.jar Devops.jar
EXPOSE 8091
ENTRYPOINT ["java","-jar","Devops.jar"]