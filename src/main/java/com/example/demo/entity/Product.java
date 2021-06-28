package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ProdID;
    String ProdName;
    String Description;
    Long DateOfManf;
    Double Price;
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Sale sale;

    public Product(String prodName, String description, Long dateOfManf, Double price) {
        ProdName = prodName;
        Description = description;
        DateOfManf = dateOfManf;
        Price = price;
    }
}
