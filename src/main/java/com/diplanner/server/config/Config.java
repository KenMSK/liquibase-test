package com.diplanner.server.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.diplanner.server.application.User.UserRepository;

@Configuration
public class Config {

  @Bean
  CommandLineRunner commandLineRunner(UserRepository userRepository) {
    return arg -> {
    };
  }

}
