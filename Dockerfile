FROM openjdk
EXPOSE 8080
ADD target/springboot-github-new.jar springboot-github-new.jar
ENTRYPOINT ["java", "-jar","/springboot-github-new.jar"]