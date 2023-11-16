package cz.zentity.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"cz.zentity.demo"})
public class LittleBankerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LittleBankerApplication.class, args);
	}

}
