package com.nisum.ws.utenti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class UtentiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UtentiApplication.class, args);
    }

}
