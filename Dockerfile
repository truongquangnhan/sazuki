FROM amazoncorretto:17
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} sizuka.jar
ENTRYPOINT ["java","-jar","/sizuka.jar"]
