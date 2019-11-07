# Spring Boot Microservices

## Step 1  : Create docker images

`mvn clean install dockerfile:build`

## Step 2 : Run the greeting server
```
docker network create spring-boot-test
docker container run -p 8081:8081 --network=spring-boot-test --name greeting-service kmmanu/greeting-service:0.1.
0-SNAPSHOT
```

To call the greeting client via gateway :- `curl http://localhost:8081/server/greeting`
