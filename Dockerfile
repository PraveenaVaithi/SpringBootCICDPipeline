FROM openjdk:18
EXPOSE 8080
ADD target/dockerimage.jar dockerimage.jar
ENTRYPOINT ["java","-jar","/dockerimage.jar"]