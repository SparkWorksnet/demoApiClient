package net.sparkworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiClientApplication.class, args);
	}
}
