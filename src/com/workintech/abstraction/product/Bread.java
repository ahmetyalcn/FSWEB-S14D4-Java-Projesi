package com.workintech.abstraction.product;

public class Bread extends ProductForSale{

    private String size;
    public Bread(String type, double price, String description, String size) {
        super(type, price, description);
        this.size = size;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Size: "+size+"\n");
        builder.append("********************"+"\n");
        System.out.println(result + builder);
    }
}
