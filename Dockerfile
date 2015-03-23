FROM exiled/debian-jre8:latest
MAINTAINER david.mouser@gmail.com

#RUN apt-get update
#RUN apt-get upgrade -y

RUN apt-get -y install mysql-server
EXPOSE 3306
CMD ["/usr/bin/mysqld_safe"]

EXPOSE 8081
ADD build/player-stats-microservice.jar /data/player-stats-microservice.jar
CMD java -jar /data/player-stats-microservice.jar
