package com.ibm.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApp1 {
@GetMapping("/hello2")
public String Hello()
{
	return "welcome hari";
	
}

}
