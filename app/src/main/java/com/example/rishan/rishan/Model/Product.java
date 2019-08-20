package com.example.rishan.rishan.Model;


import com.orm.SugarRecord;

import java.util.List;
import java.util.Set;


public class Product {

    private int pid;
    private String productName;
    private String quantity;
    private String price;
    private String prodStock;
    private String prod_desc;
    private String prodImage;
    private String status;
    private List<OrderItem> pOrderItems;



    public Product() {
    }

    public Product(int pid, String productName, String quantity, String price, String prodStock, String prodImage, String status, List<OrderItem> pOrderItems) {
        this.pid = pid;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.prodStock = prodStock;
        this.prodImage = prodImage;
        this.status = status;
        this.pOrderItems = pOrderItems;
    }

    public String getProd_desc() {
        return prod_desc;
    }

    public void setProd_desc(String prod_desc) {
        this.prod_desc = prod_desc;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public List<OrderItem> getpOrderItems() {
        return pOrderItems;
    }

    public void setpOrderItems(List<OrderItem> pOrderItems) {
        this.pOrderItems = pOrderItems;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProdStock() {
        return prodStock;
    }

    public void setProdStock(String prodStock) {
        this.prodStock = prodStock;
    }

    public String getProdImage() {
        return prodImage;
    }

    public void setProdImage(String prodImage) {
        this.prodImage = prodImage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
