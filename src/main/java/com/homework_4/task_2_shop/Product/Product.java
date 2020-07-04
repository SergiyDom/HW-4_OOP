package com.homework_4.task_2_shop.Product;

import com.homework_4.task_2_shop.Service.AgeRastriction;
import com.homework_4.task_2_shop.Service.Buyable;

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