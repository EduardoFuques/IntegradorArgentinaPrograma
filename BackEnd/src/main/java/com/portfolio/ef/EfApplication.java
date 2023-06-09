package com.portfolio.ef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class EfApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfApplication.class, args);
	}
        
        @Configuration
	public class WebMvcConfig implements WebMvcConfigurer {

	    @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/*")
	            .allowedOrigins("*")
	            .allowedMethods("GET", "POST", "PUT", "DELETE");
	    }
	}

}
