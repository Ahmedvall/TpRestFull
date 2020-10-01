package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Compte;
import com.example.demo.repository.CompteRepo;

@SpringBootApplication
public class TpRestFullApplication implements CommandLineRunner {
	
	@Autowired
	private CompteRepo compteRepo;
	public static void main(String[] args) {
		SpringApplication.run(TpRestFullApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Long id = (long) 1;
		compteRepo.save(new Compte(id ,110.1, new Date(), "type1"));
		compteRepo.save(new Compte(id+1 ,410.1, new Date(), "type1"));
		compteRepo.save(new Compte(id+2 ,8810.1, new Date(), "type1"));
	}

}
