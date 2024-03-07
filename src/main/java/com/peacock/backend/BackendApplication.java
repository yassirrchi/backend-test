package com.peacock.backend;

import com.peacock.backend.entities.User;
import com.peacock.backend.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.nio.CharBuffer;

@SpringBootApplication

public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Bean
	CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder){
		return args -> {

		User user=new User();
		user.setEmail("yassir@gmail.com");
		user.setPassword(passwordEncoder.encode("123"));
		userRepository.save(user);

		};
	}

}
