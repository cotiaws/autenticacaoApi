package br.com.cotiinformatica.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // libera para todos os endpoints da API
                .allowedOrigins("https://agendaweb-epd8cbbvf3fffggt.canadacentral-01.azurewebsites.net") // URL do Angular
                .allowedMethods("GET", "POST", "PUT", "DELETE") // métodos permitidos
                .allowedHeaders("*") // libera todos os headers
                .allowCredentials(true); // se precisar enviar cookies/autenticação
    }
}
