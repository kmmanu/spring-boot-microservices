package hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "greeting-service")
@FeignClient(name = "api-gateway-server")  // zuul service name
public interface GreetingServiceProxy {

//    @GetMapping("/greeting")
    @GetMapping("/greeting-service/greeting")   // For zuul, pass the service name in the URL
    String greeting();
}
