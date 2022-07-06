package com.ecanteen;

import com.ecanteen.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({LiquibaseProperties.class,ApplicationProperties.class})
public class ECanteenApp {

    public static void main(String[] args) {
        SpringApplication.run(ECanteenApp.class, args);
    }
}
