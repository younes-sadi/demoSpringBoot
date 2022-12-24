FROM openjdk:19
EXPOSE 8080
ADD target/alproject.jar alproject.jar
ENTRYPOINT ["java","-jar","/alproject.jar"]