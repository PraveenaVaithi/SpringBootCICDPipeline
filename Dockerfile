FROM openjdk:18
EXPOSE 8086
ADD target/dockerimage.jar dockerimage.jar
ENTRYPOINT ["java","-jar","/dockerimage.jar"]