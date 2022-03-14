package com.example.lab4a;

public class Item {
    private int id;
    private String productName;
    private String provided;

    public Item(int id, String productName, String provided) {
        this.id = id;
        this.productName = productName;
        this.provided = provided;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProvided() {
        return provided;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }
}
