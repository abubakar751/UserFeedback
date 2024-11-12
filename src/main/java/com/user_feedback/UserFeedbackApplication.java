package com.user_feedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class UserFeedbackApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(UserFeedbackApplication.class, args);
		System.out.println("App is up");
	}
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("http://localhost:3000")

				.allowedMethods("GET", "POST", "PUT", "DELETE")
				.allowCredentials(true);
	}
}
