package com.example.Ouardia;

import lombok.Builder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.Ouardia.entities.Product;
import com.example.Ouardia.repsitory.ProductRepsitory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OuardiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OuardiaApplication.class, args);
	}

	@Bean
	public CommandLineRunner start(ProductRepsitory productRepository){
		return args ->{
			productRepository.save(Product.builder()
							.name("compute")
							.price(5400)
							.quantity(12)
					        .build());
			productRepository.save(Product.builder()
							.name("printe")
							.price(4900)
							.quantity(11)
					.build());
			productRepository.save(Product.builder()
					.name("Smart phone")
					.price(1200)
					.quantity(33)
					.build());
productRepository.findAll().forEach(p -> {System.out.println(p.toString());
});
		};
	}



}
