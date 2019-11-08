package hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greeting-service")
public interface GreetingServerProxy {

    @GetMapping("/server/greeting")
    String greeting();
}
