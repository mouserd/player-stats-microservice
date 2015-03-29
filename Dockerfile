FROM aflmedia/debian-jre8:latest
MAINTAINER david.mouser@gmail.com

EXPOSE 8081

ADD build/player-stats-microservice.jar /data/player-stats-microservice.jar
CMD java -jar /data/player-stats-microservice.jar
