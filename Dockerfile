FROM openjdk:8-alpine
VOLUME /tmp
ADD ./target/backend-springboot-rest-mongodb-starter-0.0.1-SNAPSHOT.jar /backend-springboot-rest-mongodb-starter-0.0.1-SNAPSHOT.jar
RUN sh -c 'touch /backend-springboot-rest-mongodb-starter-0.0.1-SNAPSHOT.jar'
USER 1000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/backend-springboot-rest-mongodb-starter-0.0.1-SNAPSHOT.jar"]