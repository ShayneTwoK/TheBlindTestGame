package com.theblindtest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.net.URI;

@SpringBootApplication
public class TheBlindTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheBlindTestApplication.class, args);
	}

	// Controller de test pour vérifier le deploy et l
	@RestController
	public static class HelloWorldController {

		@GetMapping("/hello-world")
		public  String helloWorld(){
			return "Hello World";
		}
	}
}
