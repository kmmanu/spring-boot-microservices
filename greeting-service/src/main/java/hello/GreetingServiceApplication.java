package hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@EnableDiscoveryClient
@SpringBootApplication
public class GreetingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingServiceApplication.class, args);
    }
}

@RestController
@RequestMapping("server")
@Slf4j
class GreetingServiceController {


    @GetMapping("/greeting")
    public String greeting() {
        log.info("Inside Greet Server: Got call to greet");
        return "Hello world " + LocalDateTime.now();
    }
}
