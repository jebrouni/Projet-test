package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.enteties.Produit;

@RestController
public class ProduitRestService {
	@Autowired
	private ProduitRepository produitRepository;
	@GetMapping(value="/listproduits")
	public List<Produit> listProduits(){
		return  produitRepository.findAll();
	}
	@GetMapping(value="/listproduits/{id}")
	public Produit listProduits(@PathVariable(name="id")Long id){
		return  produitRepository.findById(id).get();
	}
	@PutMapping(value="/listproduits/{id}")
	public Produit update(@PathVariable(name="id")Long id,@RequestBody Produit p) {
		p.setId(id);
		return produitRepository.save(p);
	}
	@PutMapping(value="/listproduits")
	public Produit save(@RequestBody Produit p) {
		
		return produitRepository.save(p);
	}
	@DeleteMapping(value="/listproduits/{id}")
	public   void delete(@PathVariable(name="id")Long id) {
		
		 produitRepository.deleteById(id);;
	}

	


}
