FROM openjdk : 11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot.jar
ENTRYPOINT ["java","-jar","/spring-boot.jar"]
