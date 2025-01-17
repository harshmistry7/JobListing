package com.harsh.joblisting;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobListingApplication {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Job Listing API")
                        .version("1.0")
                        .description("API documentation for Job Listing Application")
                        );
    }

    public static void main(String[] args) {
        SpringApplication.run(JobListingApplication.class, args);
    }
}
