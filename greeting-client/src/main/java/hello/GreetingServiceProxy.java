package hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greeting-service", url = "${GREETING_URI:http://localhost:8081}")
public interface GreetingServiceProxy {
    @GetMapping("/greeting")
    String greeting();
}
