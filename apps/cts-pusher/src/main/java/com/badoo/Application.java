package com.badoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by krash on 17.04.19.
 */

@SpringBootApplication
public class Application {

    @Autowired
    public SparkConfig config;

    public static void main(String... argv) {
        SpringApplication.run(Application.class, argv);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext context) {
        return args -> {
            System.out.println("APP VERSION IS: " + config.appVersion);
        };
    }

}
