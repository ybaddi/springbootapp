package com.example.fm6;

import com.example.fm6.dao.PersonneDao;
import com.example.fm6.models.Personne;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbooappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbooappApplication.class, args);
	}
	
	public CommandLineRunner insertData(PersonneDao pd) {
		return (args)->{
			pd.save(new Personne("baddi", "youssef",26));
			pd.save(new Personne("adil", "youssef",26));
			pd.save(new Personne("karim", "youssef",26));
		};
	}

}
