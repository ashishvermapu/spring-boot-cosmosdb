FROM openjdk:8
COPY ./target/maven-demo.jar maven-demo.jar
COPY start.sh start.sh
RUN chmod 777 start.sh
EXPOSE 8080 8080
ENTRYPOINT ./start.sh