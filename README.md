# Spring Boot Microservices

## Step 1  : Create docker images

`mvn clean install dockerfile:build`

## Step 2  : Use Zuul API gateway, Eureka discovery and Feign client to communicate the services running in docker containers.

```
docker network create spring-boot-test
docker container run -p 8761:8761 --network=spring-boot-test --name naming-server kmmanu/service-registry:0.0.2-SNAPSHOT
docker container run -p 8765:8765 --network=spring-boot-test --name api-gateway-server kmmanu/api-gateway:0.0.1-SNAPSHOT
docker container run -p 8081:8081 --network=spring-boot-test --name greeting-service kmmanu/greeting-service:0.0.2-SNAPSHOT
docker container run -p 8082:8082 --network=spring-boot-test --name greeting-client  kmmanu/eureka-client:0.0.3-SNAPSHOT
```

Or use the docker compose :-


```
docker-compose up

```

