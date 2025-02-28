package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.boot.repository")  // 👈 указываем пакет с репозиториями
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
