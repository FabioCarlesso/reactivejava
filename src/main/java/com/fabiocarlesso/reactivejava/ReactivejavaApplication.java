package com.fabiocarlesso.reactivejava;

import com.fabiocarlesso.reactivejava.config.GreetingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ReactivejavaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ReactivejavaApplication.class, args);
		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		System.out.println(">> message = " + greetingClient.getMessage().block());
	}

}
