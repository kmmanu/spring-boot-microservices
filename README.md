# Spring Boot Microservices

## Step 1  : Use Feign client to communicate  the services running in docker containers

```
docker network create spring-boot-test
docker container run -p 8081:8081 --network=spring-boot-test --name greeting-service kmmanu/greeting-service:latest
docker container run -p 8082:8082 --network=spring-boot-test --name greeting-client --env GREETING_URI=http://greeting-service:8081 kmmanu/eureka-client:latest
```

Or use the docker compose :-


```
docker-compose up

```

