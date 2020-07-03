package com.learning.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.learning.api.utils.PasswordUtils;

@SpringBootApplication
public class LearningSpringBootApplication {

	@Value("${pagination.n_items_per_pages}")
	private int nItemsPerPage;
	
	public static void main(String[] args) {
		SpringApplication.run(LearningSpringBootApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String password = "123456";
			
			String encodedPassword1 = PasswordUtils.generate("123456");
			System.out.println("Encoded 1: " + encodedPassword1);
			
			String encodedPassword2 = PasswordUtils.generate("123456");
			System.out.println("Encoded 2: " + encodedPassword2);
			
			System.out.println("----VALIDADE PASSWORDS-----");
			System.out.println("Encoded 1: " + PasswordUtils.verify(password, encodedPassword1));
			System.out.println("Encoded 2: " + PasswordUtils.verify(password, encodedPassword2));
		};
	}

}
