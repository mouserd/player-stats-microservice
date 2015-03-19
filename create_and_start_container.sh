#!/bin/sh
docker stop player-stats-service-db 2>&1 >/dev/null
docker rm player-stats-service-db 2>&1 >/dev/null

echo Starting MySQL...
docker run \
  -p 3307:3306 \
  --name player-stats-service-db \
  -e MYSQL_ROOT_PASSWORD=somesecretpassword \
  -e MYSQL_USER=playerstats_user \
  -e MYSQL_PASSWORD=abc123 \
  -e MYSQL_DATABASE=player-stats-service \
  -d mysql

docker stop player-stats-service
docker rm player-stats-service

echo Starting Spring Boot App...
docker run \
  -p 8081:8081 \
  --name player-stats-service \
  --link player-stats-service-db:mysql \
  -e PORT=8081 \
  -e CONFIG_URI=http://192.168.59.103:8888 \
  -e EUREKA_URI=http://192.168.59.103:8761/eureka/ \
  -e DATASOURCE_URL=jdbc:mysql://192.168.59.103:3307/player-stats-service \
  -d player-stats-service
