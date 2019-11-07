package hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greeting-service")
public interface GreetingServiceProxy {
    @GetMapping("/greeting")
    String greeting();
}
