FROM openjdk:8-jdk-alpine
VOLUME /tmp
VOLUME /logs
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
EXPOSE 8082
ENTRYPOINT ["java","-cp","app:app/lib/*","hello.EurekaClientApplication"]

