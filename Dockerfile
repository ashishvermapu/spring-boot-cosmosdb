FROM openjdk:11
COPY ./target/demo.jar demo.jar
RUN chmod 744 demo.jar
COPY start.sh start.sh
RUN chmod 777 start.sh
EXPOSE 8080
ENTRYPOINT ./start.sh
