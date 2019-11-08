# Spring Boot Microservices

## Step 1  : Create docker images

`mvn clean install dockerfile:build`

## Step 2  : Use Zuul API gateway, Eureka discovery and Feign client to communicate the services running in docker containers.

```
docker network create spring-boot-test
docker container run -p 8081:8081 --network=spring-boot-test --name greeting-service kmmanu/greeting-service:0.1.1-SNAPSHOT
docker container run -p 8082:8082 --network=spring-boot-test --name --env GREETING_URI=http://greeting-service:8081 greeting-client  kmmanu/eureka-client:0.1.1-SNAPSHOT
```

Or use the docker compose :-
```
docker-compose up

```



`http://localhost:8082/client/greeting`


docker exec -it <greeting_client_container_id>  ping <greeting-service-ip>
docker exec -it <greeting_client_container_id>  ping greeting-service
docker container ls
docker container logs <greeting_client_container_id>
docker container inspect <greeting_client_container_id>
docker network inspect <network-name>