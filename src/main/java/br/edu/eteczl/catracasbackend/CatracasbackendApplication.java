package br.edu.eteczl.catracasbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CatracasbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatracasbackendApplication.class, args);
	}
	
	@GetMapping("/ra")
	public String hello(@RequestParam(value="ra", defaultValue="") String ra) {
		return String.format("Seu RA é: %s", ra);
	}
}
