package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestController {

    @GetMapping("/status")
    public String isUp(){
        String response =
                "Service is UP! \n"
                + System.getProperty("os.name") +"\n"
                + System.getProperty("java.version");
        return response;
    }

}
