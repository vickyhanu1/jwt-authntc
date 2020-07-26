package com.jwt.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DummyApiController {

	@RequestMapping("/dummy")  
    public String home(java.security.Principal user) {
		return "Hello";  
        
    }
}
