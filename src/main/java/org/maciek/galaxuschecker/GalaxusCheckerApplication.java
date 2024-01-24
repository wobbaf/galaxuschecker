package org.maciek.galaxuschecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GalaxusCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalaxusCheckerApplication.class, args);
	}

}
