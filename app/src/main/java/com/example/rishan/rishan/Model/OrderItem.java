package com.example.rishan.rishan.Model;

import com.example.rishan.rishan.Model.Order;
import com.example.rishan.rishan.Model.Product;
import com.example.rishan.rishan.Model.User;

/**
 * Created by Rishan on 5/16/2018.
 */

public class OrderItem {

    private Integer id;
    private int quantity;
    private String status;
    private Product product;
    private Order order;
    private User user;

    public OrderItem(Product product) {
        this.product = product;
    }

    public OrderItem() {
    }

    public User getOi_user() {
        return user;
    }

    public void setOi_user(User oi_user) {
        this.user = oi_user;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
