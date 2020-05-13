package com.example.demo.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins-demo")
public class JenkinsDemoController {

	
	@GetMapping(value= "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getMessage() {
        return "Hello World!";
    }
}
