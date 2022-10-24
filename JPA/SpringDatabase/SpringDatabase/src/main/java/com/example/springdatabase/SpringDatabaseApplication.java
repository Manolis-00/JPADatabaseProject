package com.example.springdatabase;

import com.example.springdatabase.repositories.ContinentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDatabaseApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ContinentRepository repository) {
        return (args -> {
            System.out.println(repository.findContinentsByContinent_id(3));
        });
    }
}
