package br.ind.rosseti.remoteSys;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import br.ind.rosseti.remoteSys.repositories.UserLoginRepository;

@SpringBootApplication
@RestController
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
