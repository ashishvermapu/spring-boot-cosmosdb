package com.example.demo;

import com.example.demo.data.AttUserRepository;
import com.example.demo.model.AttUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(AttUserRepository attUserRepository){
		return (args) -> {
			attUserRepository.save(new AttUser("av035p", "Ashish", "Verma", "av035p@att.com"));
		};
	}
}
