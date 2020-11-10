package br.com.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
@ComponentScan({ "br.com.hackathon.*" })
public class HackaSafraApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackaSafraApplication.class, args);
	}

}
