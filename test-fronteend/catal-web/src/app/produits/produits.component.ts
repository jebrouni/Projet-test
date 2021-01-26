import { HttpClient, HttpClientModule } from '@angular/common/http';

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-produits',
  templateUrl: './produits.component.html',
  styleUrls: ['./produits.component.css']
})
export class ProduitsComponent implements OnInit {
produits:any;
  constructor(private httpClient:HttpClient) { }//http://localhost:8080/produits

  ngOnInit(): void {

  }
  onGetProduct(){
    this.httpClient
    .get("http://localhost:8080/produits")
    .subscribe(data=>{
      this.produits=data;

    },err=>{console.log(err);
    })
  }
}
