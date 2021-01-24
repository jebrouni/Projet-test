package com.example.demo.enteties;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data  @NoArgsConstructor @AllArgsConstructor @ToString
public class Produit {
@Id @GeneratedValue(strategy= GenerationType.IDENTITY )	
private Long id;
private  String desiganation;
private double price;
private int quantite;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}


public String getDesiganation() {
	return desiganation;
}
public void setDesiganation(String desiganation) {
	this.desiganation = desiganation;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
@Override
public String toString() {
	return "Produit [id=" + id + ", desiganation=" + desiganation + ", price=" + price + ", quantite=" + quantite + "]";
}
public Produit(Long id, String desiganation, double price, int quantite) {
	super();
	this.id = id;
	this.desiganation = desiganation;
	this.price = price;
	this.quantite = quantite;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}


}
