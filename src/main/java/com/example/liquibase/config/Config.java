package com.example.liquibase.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.liquibase.springbootProject.User.User;
import com.example.liquibase.springbootProject.User.UserRepository;

@Configuration
public class Config {

  @Bean
  CommandLineRunner commandLineRunner(UserRepository userRepository) {
    return arg -> {
      User user1 = new User(null, "sammy");
      userRepository.saveAll(List.of(user1));
    };
  }

}
