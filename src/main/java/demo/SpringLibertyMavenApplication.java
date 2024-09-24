package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLibertyMavenApplication {

	public static void main(String[] args) {
        System.out.println("Arguments array = " + java.util.Arrays.toString(args));
		SpringApplication.run(SpringLibertyMavenApplication.class, args);
	}

}
