package hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * When running with dockers in user-defined network, container uses service 
 */
@FeignClient(name = "greeting-service", url = "${GREETING_URI:http://localhost:8081}")
public interface GreetingServerProxy {

    @GetMapping("/server/greeting")
    String greeting();
}
