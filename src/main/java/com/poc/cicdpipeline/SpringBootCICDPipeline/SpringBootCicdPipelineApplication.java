package com.poc.cicdpipeline.SpringBootCICDPipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootCicdPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCicdPipelineApplication.class, args);
	}

}
