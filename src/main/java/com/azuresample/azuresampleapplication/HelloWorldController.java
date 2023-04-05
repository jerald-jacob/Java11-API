package com.azuresample.azuresampleapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jeral
 */
@RestController
@RequestMapping("/check")
public class HelloWorldController {

    @GetMapping("/healthcheck")
    @ResponseBody
    public String getHealth() {
        return "Service up and running";
    }
}
