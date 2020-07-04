package com.shop.Product;

import com.shop.AgeRastriction;
import com.shop.Buyable;

public abstract class Product implements Buyable {
    protected String name;
    protected double price;
    protected int quantity;
    protected AgeRastriction ageRestriction;

    @Override
    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void isAvailable() throws Exception {
        if (this.quantity <= 0) {
            throw new Exception("Is out of stock");
        }
    }

    public AgeRastriction getAgeRestriction() {
        return ageRestriction;
    }

    public void setQuantity() {
        this.quantity -= 1;
    }
}