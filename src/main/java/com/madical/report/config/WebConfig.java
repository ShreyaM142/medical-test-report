package com.madical.report.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {

    registry.addMapping("/TestDetails")
      .allowedOrigins("http://medicaltest-env-1.eba-tqwrpxta.us-east-1.elasticbeanstalk.com/TestDetails/")
      .allowedMethods("GET", "POST")
      .allowCredentials(true).maxAge(3600);

  }
}