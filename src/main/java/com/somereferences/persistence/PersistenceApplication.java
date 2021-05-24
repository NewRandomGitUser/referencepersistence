package com.somereferences.persistence;

import com.somereferences.persistence.onetomany.unidirectional.OneToManyUnidirectionalRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersistenceApplication implements CommandLineRunner {
	private final OneToManyUnidirectionalRunner runner;

	public PersistenceApplication(OneToManyUnidirectionalRunner runner) {
		this.runner = runner;
	}

	public static void main(String[] args) {
		SpringApplication.run(PersistenceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		runner.execute();
	}
}
