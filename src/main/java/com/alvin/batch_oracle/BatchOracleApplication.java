package com.alvin.batch_oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.alvin.batch_oracle.student")
public class BatchOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchOracleApplication.class, args);
	}

}
