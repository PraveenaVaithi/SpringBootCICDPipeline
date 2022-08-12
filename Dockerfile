FROM openjdk:18
EXPOSE 8086
ADD /home/runner/work/SpringBootCICDPipeline/SpringBootCICDPipeline/target/dockerimage.jar dockerimage.jar
ENTRYPOINT ["java","-jar","/dockerimage.jar"]