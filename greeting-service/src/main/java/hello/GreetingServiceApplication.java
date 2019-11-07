package hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

//@EnableDiscoveryClient
@SpringBootApplication
public class GreetingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingServiceApplication.class, args);
    }
}

@RestController
@Slf4j
class GreetingServiceController {


    @GetMapping("/greeting")
    public String greeting() {
        log.info("Got call to greet");
        return "Hello world " + LocalDateTime.now();
    }
}
