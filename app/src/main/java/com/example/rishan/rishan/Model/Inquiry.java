package com.example.rishan.rishan.Model;

import com.example.rishan.rishan.Model.Product;
import com.example.rishan.rishan.Model.User;

public class Inquiry {


    private int rid;
     private String review;
     private String date;


    Product prod_id;


    User user;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Product getProd_id() {
        return prod_id;
    }

    public void setProd_id(Product prod_id) {
        this.prod_id = prod_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
