FROM openjdk
WORKDIR usr/lib
ADD ./target/C13-S1-PC-0.0.1-SNAPSHOT.jar /usr/lib/C13-S1-PC-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","C13-S1-PC-0.0.1-SNAPSHOT.jar"]