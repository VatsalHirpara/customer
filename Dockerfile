FROM openjdk:11.0-jre

WORKDIR /tmp

COPY target/customer-0.0.1-SNAPSHOT.jar /tmp/customer-0.0.1-SNAPSHOT.jar
