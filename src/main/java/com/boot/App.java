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

// SQL запрос добавление ролей
//INSERT INTO t_role(id, name)
//VALUES (1, 'ROLE_USER'), (2, 'ROLE_ADMIN');

//SQL запрос добавление роли админа
//INSERT INTO t_user_roles(user_id, roles_id)
//VALUES (1, 2);