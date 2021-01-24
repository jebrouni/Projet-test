package com.example.demo.dao;
import java.util.List;
//Projet simple pour acceder sur DB

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.enteties.Produit;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProduitRepository extends 
JpaRepository<Produit,Long>{
	@RestResource(path = "/byDesiganation")
public List<Produit> findProduitByDesiganation(@Param("mc")String des);
	@RestResource(path = "/byDesiganationPage")
	public Page<Produit> findProduitByDesiganation(@Param("mc")String des,Pageable pageable);
}
