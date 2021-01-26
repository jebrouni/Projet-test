import { HttpClient, HttpClientModule } from '@angular/common/http';

import { Component, OnInit } from '@angular/core';
import { CatalogueService } from '../services/catalogue.service';

@Component({
  selector: 'app-produits',
  templateUrl: './produits.component.html',
  styleUrls: ['./produits.component.css']
})
export class ProduitsComponent implements OnInit {
produits:any;
  constructor(private catService:CatalogueService) { }//http://localhost:8080/produits

  ngOnInit(): void {

  }
  onGetProduct(){
    // this.httpClient
    // .get("http://localhost:8080/produits")
    // .subscribe(data=>{
    //   this.produits=data;

    // },err=>{console.log(err);
    // })
    this.catService.getProducts()
    .subscribe(data=>{
      this.produits=data;
  
    },err=>{console.log(err);
    });
    
  }
  }

