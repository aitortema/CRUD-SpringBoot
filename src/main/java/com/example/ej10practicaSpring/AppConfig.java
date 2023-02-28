package com.example.ej10practicaSpring;

import com.example.ej10practicaSpring.controlador.NotasControlador;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public NotasControlador notasControlador() {
        return new NotasControlador();
    }
}
