package com.example.scheduled.shedlock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShcedlockApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShcedlockApplication.class, args);
	}

}
