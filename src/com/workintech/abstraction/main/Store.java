package com.workintech.abstraction.main;

import com.workintech.abstraction.product.Bread;
import com.workintech.abstraction.product.Chocolate;
import com.workintech.abstraction.product.Coke;
import com.workintech.abstraction.product.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] product = new ProductForSale[5];
        product[0] = new Coke("Drink",40,"cold drink", "Coca Cola");
        product[1] = new Bread("Bakery",10,"food", "small");
        product[2] = new Chocolate("Snack",15,"snack", "brown");
        listProducts(product);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product: products){
            if (product!=null){
                product.showDetails();
            }
        }
    }
}