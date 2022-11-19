package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventHandling19112022Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EventHandling19112022Application.class, args);
		//context.start();
		
		//context.stop();
	}

}
