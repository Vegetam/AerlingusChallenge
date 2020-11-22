# Maven build container 

FROM maven:3.5.2-jdk-8-alpine AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM openjdk:8-jdk-alpine

#expose port 8080
EXPOSE 8080

#default command
CMD java -jar /data/fm-aerlingus-0.0.1.jar

#copy pokemon to docker image from builder image

COPY --from=maven_build /tmp/target/fm-aerlingus-0.0.1.jar /data/fm-aerlingus-0.0.1.jar