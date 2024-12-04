package com.example.ConfigServer.Config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class EnvConfig {

    @PostConstruct
    public void init() {
        Dotenv dotenv = Dotenv.configure().load();
        System.setProperty("GIT_USERNAME", dotenv.get("GIT_USERNAME"));
        System.setProperty("CONFIG_SERVER_DIR_PASSWORD", dotenv.get("CONFIG_SERVER_DIR_PASSWORD"));
    }
}
