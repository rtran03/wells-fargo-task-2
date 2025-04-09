package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private Float purchasePrice;

    @Column(nullable = false)
    private Integer quantity;

    protected Security() {


    }

    public Security(String name, String category, String purchaseDate, Float purchasePrice, Integer quantity) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public long getSecurityId() { return securityId; }

    public String getName() { return name; }

    public void setName(String name) {this.name = name; }

    public String getCategory() { return category; }

    public void setCategory(String category) {this.category = category; }

    public String getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(String purchaseDate) {this.purchaseDate = purchaseDate; }

    public Float getPurchasePrice() { return purchasePrice; }

    public void setPurchasePrice(Float purchasePrice) {this.purchasePrice = purchasePrice; }

    public Integer getQuantity() { return quantity; }

    public void setQuantity(Integer quantity) {this.quantity = quantity; }
}
