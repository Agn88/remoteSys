package br.ind.rosseti.remoteSys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableScheduling
public class RemoteSysApplication {


	public static void main(String[] args) {
		SpringApplication.run(RemoteSysApplication.class, args);
	}
	
	

	/*
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
	*/
	
	/*
	@GetMapping("/")
	public String home() {
		return "Home Page";
	}
	*/
}
