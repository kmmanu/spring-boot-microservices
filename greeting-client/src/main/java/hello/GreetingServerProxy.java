package hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "greeting-service")
@FeignClient(name = "api-gateway-server")  // zuul service name
public interface GreetingServerProxy {

//    @GetMapping("/server/greeting")
    @GetMapping("/greeting-service/server/greeting")   // For zuul, pass the service name in the URL
    String greeting();
}
