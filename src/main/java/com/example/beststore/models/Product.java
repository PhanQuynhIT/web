package com.example.beststore.models;


import jakarta.persistence.*;


import java.util.Date;


@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String brand;
    private String category;
    private double price;


    @Column(columnDefinition = "TEXT")
    private String description;
    private Date createdAt;
    private String imageFilename;


    //và các getter/setter của các thuộc tính

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
