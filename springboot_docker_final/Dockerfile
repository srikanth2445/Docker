FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/springboot_docker_final.jar /home/siddu/Desktop/dockerImages/app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /home/siddu/Desktop/dockerImages/app.jar