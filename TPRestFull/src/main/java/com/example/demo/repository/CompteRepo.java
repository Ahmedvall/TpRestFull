package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Compte;

@RepositoryRestResource
public interface CompteRepo extends JpaRepository<Compte, Long> {

}
