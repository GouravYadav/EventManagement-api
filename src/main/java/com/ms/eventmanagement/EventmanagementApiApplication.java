package com.ms.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses= {EventmanagementApiApplication.class,Jsr310Converters.class})
public class EventmanagementApiApplication extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EventmanagementApiApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(EventmanagementApiApplication.class, args);
	}
}
