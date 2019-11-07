package hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}

@RestController
@RequestMapping("/client")
@Slf4j
class GreetingClientController {

    @Autowired
    private GreetingServerProxy greetingServiceProxy;

    @GetMapping("/greeting")
    public String greeting() {
        log.info("Inside Greeting Client. Getting greeting from greeting service");
        return greetingServiceProxy.greeting();
    }
}
