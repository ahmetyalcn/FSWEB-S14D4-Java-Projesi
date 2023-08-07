package com.workintech.abstraction.product;

public class Coke extends ProductForSale{
    private String brand;
    public Coke(String type, double price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Brand: "+brand+"\n");
        builder.append("********************"+"\n");
        System.out.println(result + builder);
    }
}
