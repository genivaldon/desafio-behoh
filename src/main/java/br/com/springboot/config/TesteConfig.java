package br.com.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.springboot.service.DBService;

@Configuration
@Profile("test")
public class TesteConfig {
  
    @Autowired
    private DBService dbService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String strategy;

    @Bean
    public boolean instanciaBaseDeDados() {
        if (strategy.equals("create")) {
            this.dbService.instanciaBaseDeDados();
        }
        return false;
    }
}
