FROM openjdk:8-alpine

COPY target/uberjar/alexandria.jar /alexandria/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/alexandria/app.jar"]
