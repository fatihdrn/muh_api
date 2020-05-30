package com.muh_api.muh_api;

import com.muh_api.muh_api.Entity.User;
import com.muh_api.muh_api.Service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MuhApiApplication {

    public static void main(String[] args)  {
        SpringApplication.run(MuhApiApplication.class, args);


    }

}
