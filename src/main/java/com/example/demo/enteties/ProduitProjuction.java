package com.example.demo.enteties;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="P1",types =Produit.class)

public interface ProduitProjuction {
public double getPrice();
public String getDesiganation();
public int getQuantite();

}
