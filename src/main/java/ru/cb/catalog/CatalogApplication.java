package ru.cb.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.cb.catalog.config.JpaConfig;

@SpringBootApplication
public class CatalogApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CatalogApplication.class, args);
		SpringApplication.run(new Class<?>[] {CatalogApplication.class, JpaConfig.class}, args);
	}
}
