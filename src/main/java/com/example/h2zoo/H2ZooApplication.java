package com.example.h2zoo;


import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.model.amphibians;
import com.example.h2zoo.repository.AmphibiansRepository;
import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) { ConfigurableApplicationContext configurableApplicationContext =
			SpringApplication.run(H2ZooApplication.class, args);
		ReptileRepository reptileRepository = configurableApplicationContext.getBean(ReptileRepository.class);
		AmphibiansRepository amphibiansRepository = configurableApplicationContext.getBean(AmphibiansRepository.class);
		Reptile kingCobra = new Reptile("Slither", "Snake", "Black & Yellow", "Carnivore");
		Reptile komodoDragon = new Reptile("Dennis", "Lizard", "Brown", "Carnivore");

		reptileRepository.save(kingCobra);
		reptileRepository.save(komodoDragon);

		amphibians Bogart = new amphibians("Bogart", "Frog", "Green", "Carnivore");
		amphibians Kermit = new amphibians("kermit", "Toad", "Yellow", "Herbivore");
		amphibiansRepository.save(Bogart);
		amphibiansRepository.save(Kermit);

	}

}
