package com.example.scheduled.shcedlock;

import com.example.scheduled.shcedlock.job.ScheduleTask;
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
