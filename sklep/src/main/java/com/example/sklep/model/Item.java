package com.example.sklep.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
public class Item {

    private  String name;
    private BigDecimal price;

    private String imgURL;
    public Item(String name, BigDecimal price, String imgURL) {
        this.name = name;
        this.price = price;
        this.imgURL = imgURL;
    }
}
