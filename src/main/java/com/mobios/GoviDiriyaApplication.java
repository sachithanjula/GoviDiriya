package com.mobios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GoviDiriyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoviDiriyaApplication.class, args);
	}

}
