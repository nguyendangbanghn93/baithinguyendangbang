package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SlNo;
    private int SalesmanID;
    private String SalesmanName;
    private Long DOS;
    @JoinColumn(name = "ProdID")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Product product;
    @Column(insertable = false, updatable = false)
    private int ProdID;

    public Sale(int salesmanID, String salesmanName, Long DOS, Product product) {
        SalesmanID = salesmanID;
        SalesmanName = salesmanName;
        this.DOS = DOS;
        this.product = product;
    }
}
