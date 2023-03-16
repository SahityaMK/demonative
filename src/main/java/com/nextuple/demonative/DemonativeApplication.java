package com.nextuple.demonative;

import com.zaxxer.hikari.util.ConcurrentBag;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Statement;

@SpringBootApplication
//@ComponentScan("com.nextuple.demonative.*")
@EnableJpaRepositories("com.nextuple.demonative.repositories")
//@EntityScan("com.nextuple.demonative.*")
@Configuration(proxyBeanMethods = false)
public class DemonativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemonativeApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
