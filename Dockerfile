FROM openjdk:8u111-jdk-alpine
VOLUME /temp
COPY target/hacka-safra-0.0.1-SNAPSHOT.jar opt/hacka-safra.jar
RUN sh -c 'touch /hacka-safra.jar'
RUN echo "America/Sao_Paulo" > /etc/timezone
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=dev","-jar","/opt/hacka-safra.jar"]
