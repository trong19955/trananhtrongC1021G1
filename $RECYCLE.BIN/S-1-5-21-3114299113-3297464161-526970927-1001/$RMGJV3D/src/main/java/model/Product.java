package model;

import java.util.Map;

public class Product {
//    id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất.
    private int id;
    private String nameProduct;
    private double priceProduct;
    private String descriptionOfTheProduct;
    private String producer;

    public Product() {
    }

    public Product(int id, String nameProduct, double priceProduct, String descriptionOfTheProduct, String producer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.descriptionOfTheProduct = descriptionOfTheProduct;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescriptionOfTheProduct() {
        return descriptionOfTheProduct;
    }

    public void setDescriptionOfTheProduct(String descriptionOfTheProduct) {
        this.descriptionOfTheProduct = descriptionOfTheProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
