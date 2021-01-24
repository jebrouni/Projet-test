package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.enteties.Produit;
@EnableJpaRepositories
@SpringBootApplication
public class ProjetTestApplication  implements CommandLineRunner{
@Autowired
private ProduitRepository produitRepository;
@Autowired
private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(ProjetTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Produit.class);
	produitRepository.save(new Produit(null,"LC TELE",2989,3));
	produitRepository.save(new Produit(null,"Televesion",300,3));
	produitRepository.save(new Produit(null,"Ordinateur",399,5));
	produitRepository.findAll().forEach(p->{
		System.out.println(p.toString());
	});
		
	}

}
