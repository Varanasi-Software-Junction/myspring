package com.example.myspring;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages={"com.example.myspring"})
public class MyspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringApplication.class, args);
	}


	@GetMapping("/hello")

	public String sayHello(@RequestParam(value = "name", defaultValue = "Popat") String name,@RequestParam(value = "address", defaultValue = "Chiraigaon") String address) {
		return String.format("Hello %s from %s", name,address);



	}
}
