package me.nicolaferraro.springboot2fmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableScheduling
public class SpringBoot2FmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2FmpApplication.class, args);
	}

	@Component
	public static class SayHello {

		@Scheduled(fixedDelay = 5000)
		public void print() {
			System.out.println("Hello World!");
		}

	}
}
