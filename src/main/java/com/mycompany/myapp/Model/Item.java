/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myapp.Model;

/**
 *
 * @author DELL
 */
public class Item {
    
    private int itemCode;
    private String name;
    private String price;
    private String description;

    public Item() {
    }

    public Item(int itemCode, String name, String price, String description) {
        this.itemCode = itemCode;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    
    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
