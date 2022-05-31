package com.nology.cloudproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @GetMapping("/message")
    public String getMessage() {
        return "This is a silly message";
    }
}
