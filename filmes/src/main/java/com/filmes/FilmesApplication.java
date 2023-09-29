package com.filmes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmesApplication.class, args);
	}
	@Bean
	CommandLineRunner criarfilmes(FilmeRepository rp){
		return args -> {
			rp.deleteAll();

			Filme patrulhaCanina =new Filme("Patrulha Canina","Filme da patrulha canina é muito legal para assistir com a familia",100);
			Filme barbie = new Filme("Barbie", "Filme para assistir com todo mundo", 120);
			Filme velozesFuriosos = new Filme("Velozes e Furiosos","É um filme de carro muito legal de alta velocidade",300);
			Filme pequenosEspioes = new Filme("Pequenos Espioes 4","Filme de espionagem com crianças",150);
			Filme kungFuPanda = new Filme("Kung Fu Panda","Filme de Kung Fu com panda",180);
			Filme carroselDois = new Filme("Carossel 2", "Sumiço de maria joaquina",80);
			Filme sherek = new Filme("Shrek","Filme de muita diversão",100);

			rp.save(patrulhaCanina);
			rp.save(barbie);
			rp.save(velozesFuriosos);
			rp.save(pequenosEspioes);
			rp.save(kungFuPanda);
			rp.save(carroselDois);
			rp.save(sherek);

		};
	}
}
