package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entitiy;

public class Product implements Entitiy {
    private int id ;
    private int categoryId ;
    private String name;
    private double unitPrice;
    private double unitInStoc;

    public Product(){}

    public Product(int id, int categoryId, String name, double unitPrice, double unitInStoc) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.unitInStoc = unitInStoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitInStoc() {
        return unitInStoc;
    }

    public void setUnitInStoc(double unitInStoc) {
        this.unitInStoc = unitInStoc;
    }
}
