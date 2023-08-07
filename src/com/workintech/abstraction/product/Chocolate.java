package com.workintech.abstraction.product;

public class Chocolate extends ProductForSale{

    private String color;
    public Chocolate(String type, double price, String description, String color) {
        super(type, price, description);
        this.color = color;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Color: "+color+"\n");
        builder.append("********************"+"\n");
        System.out.println(result + builder);
    }
}
